public class InvalidPostfixExpressionException extends RuntimeException{
    public InvalidPostfixExpressionException()
    {
        super("The stack should have one element when the evaluation is complete.");
    }
}
