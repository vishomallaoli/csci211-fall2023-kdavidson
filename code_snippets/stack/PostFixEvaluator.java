import java.util.Scanner;
import java.util.Stack;
public class PostfixEvaluator {
    private final static char ADD = '+';
    private final static char SUBTRACT = '-';
    private final static char MULTIPLY = '*';
    private final static char DIVIDE = '/';
    private Stack<Integer> stack;

    // constructor
    public PostfixEvaluator() {
        stack = new Stack<Integer>();
    }
    public int evaluate(String expression){
        int operation1, operation2, result = 0;
        String token;
        Scanner parser = new Scanner(expression);

        while(parser.hasNext()){
            token = parser.next();

            if(isOperator(token)){
                operation2 = stack.pop().intValue(); // Integer -> int
                operation1 = stack.pop().intValue();
                result = evaluateSingleOperator(token.charAt(0), operation1, operation2);
                stack.push(result);
            }
            else
                stack.push(Integer.parseInt(token));
        }
        parser.close();
        return result;
    }

    private boolean isOperator(String token) {
        return (token.equals(String.valueOf(ADD)) ||
                token.equals(String.valueOf(SUBTRACT)) ||
                token.equals(String.valueOf(MULTIPLY)) ||
                token.equals(String.valueOf(DIVIDE)));
    }
    private int evaluateSingleOperator(char operation, int operand1, int operand2) {
        switch (operation) {
            case ADD:
                return operand1 + operand2;
            case SUBTRACT:
                return operand1 - operand2;
            case MULTIPLY:
                return operand1 * operand2;
            case DIVIDE:
                if (operand2 != 0) {
                    return operand1 / operand2;
                } else {
                    throw new ArithmeticException("Cannot divide by zero");
                }
            default:
                throw new IllegalArgumentException("Unsupported operator: " + operation);
        }
    }
}
