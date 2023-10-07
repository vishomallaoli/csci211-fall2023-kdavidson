public interface UnorderedListADT<T> 
{
    public void addToFront(T element);  
    public void addToRear(T element); 
    public void addAfter(T element, T target);
    public T removeFirst();
    public T removeLast();
    public T remove(T element);
    public T first();
    public T last();
    public boolean contains(T target);
    public boolean isEmpty();
    public int size();
    public String toString();
}
