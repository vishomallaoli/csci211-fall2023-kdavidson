import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnorderedListArrayTest {

    @Test
    public void testaddToFront() {
        UnorderedListArray<Integer> evaluator = new UnorderedListArray<Integer>();
        evaluator.addToFront(7);
        evaluator.addToFront(13);
        assertEquals("[13, 7]", evaluator.toString());
    }


    @Test
    public void testaddToRear() {
        UnorderedListArray<Integer> evaluator = new UnorderedListArray<>();
        evaluator.addToRear(1);
        evaluator.addToRear(2);
        evaluator.addToRear(3);
        assertEquals("[1, 2, 3]", evaluator.toString());
    }


    @Test
    public void testaddAfter1() {
        UnorderedListArray<Integer> evaluator = new UnorderedListArray<>();
        evaluator.addToFront(1);
        evaluator.addToRear(2);


        evaluator.addAfter(90, 1);
        assertEquals("[1, 90, 2]", evaluator.toString());
    }

    @Test
    public void testaddAfter2() {
        assertThrows(ElementNotFoundException.class, ()->{
            UnorderedListArray<Integer> evaluator = new UnorderedListArray<Integer>();
            evaluator.addToRear(15);
            evaluator.addAfter(7, 13);
        });
    }

    @Test
    public void removeFirst1() {
        UnorderedListArray<Integer> evaluator = new UnorderedListArray<>();
        evaluator.addToRear(1);
        evaluator.addToRear(2);
        evaluator.addToRear(3);

        evaluator.removeFirst();
        assertEquals("[2, 3]", evaluator.toString());
    }

    @Test
    public void removeFirst2() {
        assertThrows(ElementNotFoundException.class, ()->{
            UnorderedListArray<Integer> evaluator = new UnorderedListArray<Integer>();
            evaluator.removeFirst();
        });
    }

    @Test
    public void removeLast1() {
        UnorderedListArray<Integer> evaluator = new UnorderedListArray<>();
        evaluator.addToRear(1);
        evaluator.addToRear(2);
        evaluator.addToRear(3);

        assertEquals(3, evaluator.removeLast());
    }

    @Test
    public void removeLast2() {
        assertThrows(ElementNotFoundException.class, ()->{
            UnorderedListArray<Integer> evaluator = new UnorderedListArray<Integer>();
            evaluator.removeLast();
        });
    }

    @Test
    public void remove1() {
        UnorderedListArray<Integer> evaluator = new UnorderedListArray<>();
        evaluator.addToRear(1);
        evaluator.addToRear(2);
        evaluator.addToRear(3);

        assertEquals(2, evaluator.remove(2));
    }

    @Test
    public void remove2() {
        assertThrows(ElementNotFoundException.class, ()->{
            UnorderedListArray<Integer> evaluator = new UnorderedListArray<Integer>();
            evaluator.remove(2);
        });
    }

    @Test
    public void first1() {
        UnorderedListArray<Integer> evaluator = new UnorderedListArray<>();
        evaluator.addToRear(1);
        evaluator.addToRear(2);
        evaluator.addToRear(3);
        System.out.println(evaluator.first());
        assertEquals(1, evaluator.first());
    }

    @Test
    public void first2() {
        assertThrows(ElementNotFoundException.class, ()->{
            UnorderedListArray<Integer> evaluator = new UnorderedListArray<Integer>();
            evaluator.first();
        });
    }

    @Test
    public void last1() {
        UnorderedListArray<Integer> evaluator = new UnorderedListArray<>();
        evaluator.addToRear(1);
        evaluator.addToRear(2);
        evaluator.addToRear(3);

        assertEquals(3, evaluator.last());
    }

    @Test
    public void last2() {
        assertThrows(ElementNotFoundException.class, ()->{
            UnorderedListArray<Integer> evaluator = new UnorderedListArray<Integer>();
            evaluator.last();
        });
    }

}