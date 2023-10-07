import junit.framework.TestCase;
import org.junit.Test;

public class PostfixEvaluatorTest extends TestCase {
    @Test
    public void testEvaluator() {
        PostfixEvaluator evaluator = new PostfixEvaluator();
        assertEquals(11, evaluator.evaluate("5 8 2 - +"));
    }
    @Test
    public void assertThrows() {
        assertThrows(EmptyCollectionException.class, () -> {
            PostfixEvaluator evaluator = new PostfixEvaluator();
            evaluator.evaluate("5 8 2 - +");
        });
    }
}