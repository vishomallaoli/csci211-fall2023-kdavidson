import java.sql.Array;
import java.util.Scanner;
import java.util.Stack;

/**
 * Represents an integer evaluator of postfix expressions. Assumes 
 * the operands are constants.
 *
 * @author Java Foundations
 * @version 4.0
 */
public class PostfixEvaluator
{
    private final static char ADD = '+';
    private final static char SUBTRACT = '-';
    private final static char MULTIPLY = '*';
    private final static char DIVIDE = '/';

    private ArrayStack<Integer> arrayStack;

    /**
     * Sets up this evalutor by creating a new stack.
     */
    public PostfixEvaluator()
    {
        arrayStack = new ArrayStack<Integer>();
    }

    /**
     * Evaluates the specified postfix expression. If an operand is
     * encountered, it is pushed onto the stack. If an operator is
     * encountered, two operands are popped, the operation is
     * evaluated, and the result is pushed onto the stack.
     * @param expr string representation of a postfix expression
     * @return value of the given expression
     */
    public int evaluate(String expr)
    {
        int op1, op2, result = 0;
        String token;
        Scanner parser = new Scanner(expr);

        while (parser.hasNext())
        {
            token = parser.next();

            if (isOperator(token))
            {
                op2 = (arrayStack.pop()).intValue();
                op1 = (arrayStack.pop()).intValue();
                result = evaluateSingleOperator(token.charAt(0), op1, op2);
                arrayStack.push(new Integer(result));
            }
            else
                arrayStack.push(new Integer(Integer.parseInt(token)));
        }
        if (arrayStack.size() != 1){
            throw new InvalidPostfixExpressionException(); // throws a new exception.
        }
        return result;
    }

    /**
     * Determines if the specified token is an operator.
     * @param token the token to be evaluated 
     * @return true if token is operator
     */
    private boolean isOperator(String token)
    {
        return ( token.equals("+") || token.equals("-") ||
                 token.equals("*") || token.equals("/") );
    }

    /**
     * Peforms integer evaluation on a single expression consisting of 
     * the specified operator and operands.
     * @param operation operation to be performed
     * @param op1 the first operand
     * @param op2 the second operand
     * @return value of the expression
     */
    private int evaluateSingleOperator(char operation, int op1, int op2)
    {
        int result = 0;

        switch (operation)
        {
            case ADD:
                result = op1 + op2;
                break;
            case SUBTRACT:
                result = op1 - op2;
                break;
            case MULTIPLY:
                result = op1 * op2;
                break;
            case DIVIDE:
                result = op1 / op2;
        }

        return result;
    }
}
