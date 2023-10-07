import java.util.Arrays;
import java.util.Stack;

/**
 * LinkedQueue represents a linked implementation of a queue.
 * 
 * @author Java Foundations
 * @version 4.0
 */
public class LinkedQueue<T> implements QueueADT<T>
{
    private int count;
    private LinearNode<T> head, tail;

    /**
     * Creates an empty queue.
     */
    public LinkedQueue()
    {
        count = 0;
        head = tail = null;
    }

    /**
     * Adds the specified element to the tail of this queue.
     * @param element the element to be added to the tail of the queue
     */
    public void enqueue(T element)
    {
        LinearNode<T> node = new LinearNode<T>(element);

        if (isEmpty())
            head = node;
        else
            tail.setNext(node);

        tail = node;
        count++;
    }

    /**
     * Removes the element at the head of this queue and returns a
     * reference to it. 
     * @return the element at the head of this queue
     * @throws EmptyCollectionException if the queue is empty
     */
    public T dequeue() throws EmptyCollectionException
    {
        if (isEmpty())
            throw new EmptyCollectionException("queue");

        T result = head.getElement();
        head = head.getNext();
        count--;

        if (isEmpty())
            tail = null;

        return result;
    }
   
    /**
     * Returns a reference to the element at the head of this queue.
     * The element is not removed from the queue.  
     * @return a reference to the first element in this queue
     * @throws EmptyCollectionsException if the queue is empty
     */
    public T first() throws EmptyCollectionException
    {
        if (isEmpty())
        		throw new EmptyCollectionException("Queue is empty");
        return head.getElement();
        
    }

    /**
     * Returns true if this queue is empty and false otherwise. 
     * @return true if this queue is empty 
     */
    public boolean isEmpty()
    {
        return count==0;
    }
 
    /**
     * Returns the number of elements currently in this queue.
     * @return the number of elements in the queue
     */
    public int size()
    {
        return count;
    }

    /**
     * Returns a string representation of this queue. 
     * @return the string representation of the queue
     */
    public String toString()
    {
        StringBuilder s = new StringBuilder("");
        LinearNode<T> current = head;
        while (current != null) {
        		s.append(current.getElement());
        		s.append("\n");
        		current = current.getNext();
        }
        return s.toString();
        
    }
    
    /**
     * Returns true if the list in the parameter has the same length and data elements
     * as "this" Linked Queue.  Returns false otherwise.
     * @return true if the lists are equal
     */
	@Override
	public boolean equals(LinkedQueue<T> list) {
		// Lab exercise 1.  Fill in this method.
        if(this.count != list.size()){
            return false;
        }
        LinearNode<T> thisNode = head;
        LinearNode<T> passedNode = list.head;

        while((thisNode != null) || (passedNode != null)){
            if(thisNode.getElement() != passedNode.getElement()){
                return false;
            }
            thisNode = thisNode.getNext();
            passedNode = passedNode.getNext();
        }

		return true;
	}

	/**
	 * Returns a LinkedQueue that contains the same data elements as "this", but in 
	 * reverse order
	 * @return a LinkedQueue that is the reverse of this queue
	 */
	public LinkedQueue<T> reverse() {
		// Lab exercise 2.  Fill in this method.
        ArrayStack<T> stack = new ArrayStack<>();
        LinkedQueue<T> reversedQueue = new LinkedQueue<>();

        while(!isEmpty()){
            stack.push(dequeue());
        }
        while(!stack.isEmpty()){
            reversedQueue.enqueue(stack.pop());
        }
        this.head = reversedQueue.head;
        this.tail = reversedQueue.tail;
		return reversedQueue;
	}
		
}
