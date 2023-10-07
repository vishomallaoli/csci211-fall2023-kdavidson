import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

/**
 * Demonstrates the use of a stack to evaluate postfix expressions.
 *
 * @author Java Foundations
 * @version 4.0
 */
public class PostfixTester    
{
    /**
     * Reads and evaluates multiple postfix expressions.
     */
    public static void main(String[] args) throws FileNotFoundException {
        String expression = null, again;
        int result;
        File currentFile = new File("test.txt");
        Scanner in = new Scanner(currentFile);
      
//        do
//        {
//            PostfixEvaluator evaluator = new PostfixEvaluator();
//			System.out.println("Enter a valid post-fix expression one token " +
//							   "at a time with a space between each token (e.g. 5 4 + 3 2 1 - + *)");
//			System.out.println("Each token must be an integer or an operator (+,-,*,/)");
//            expression = in.nextLine();
//
//            result = evaluator.evaluate(expression);
//            System.out.println();
//            System.out.println("That expression equals " + result);
//
//            System.out.print("Evaluate another expression [Y/N]? ");
//            again = in.nextLine();
//            System.out.println();
//        }
//        while (again.equalsIgnoreCase("y"));

        while(in.hasNext()){
            PostfixEvaluator evaluator = new PostfixEvaluator();
            String current = in.nextLine();

            try {
                result = evaluator.evaluate(current);
                System.out.println(current + "  =  " + result);
            } catch (EmptyCollectionException e) {
                System.out.println(e.getMessage());
            } catch (InvalidPostfixExpressionException e){
                System.out.println(e.getMessage());
            }
        }


   }
}
