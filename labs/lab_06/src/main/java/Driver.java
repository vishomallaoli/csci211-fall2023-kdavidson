// CSCI 211 Lab on Iterators

import java.util.Iterator;
import java.util.LinkedList;

public class Driver {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Iterator<Integer> itr;

        list.add(7);
        list.add(21);
        list.add(10);
        list.add(13);
        list.add(4);

        // TODO 1: use a for-each loop to print the elements of list
        System.out.println("Using for-each");
        for(int item: list){
            System.out.println(item);
        }


        // TODO 2: use the Iterator itr (declared above) to print the elements of the list
        System.out.println("\nUsing an iterator");
        itr = list.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

        // TODO 3: reset itr to use list.descendingIterator() to print the list
        //         in reverse order
        System.out.println("\nUsing a descending iterator");
        itr = list.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // TODO 4: Reset the iterator again and step through.  If the value is even,
        //         use the remove() method on the iterator.
        System.out.println("\nDeleting even values from list: ");
        itr = list.iterator();
        while(itr.hasNext()){
            int item = itr.next();
            if(item % 2 == 0){
                itr.remove();
            }
        }

        // Now reset the iterator and print out the list
        System.out.println("\nPrinting remaining list (should all be odd)");
        itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // TODO 5:  To check out the fail-fast idea, in the above code, just before printing out the list,
        //          call list.add(15), which will
        //          modify the underlying data in the collection.
        //
        //  This should cause a ConcurrentModificationException!
        //
        //  Change the code back (or comment) to remove from the iterator instead of the collection
        //  to remove the error before submitting your class to Blackboard.
        System.out.println("\nPrinting remaining list with concurrent modification");
        itr = list.iterator();
        list.add(15); // fail fast
        while(itr.hasNext()){
            System.out.println(itr.next());
    }

}}