import java.util.ArrayList;

public class UnorderedListArray<T> implements UnorderedListADT<T> {

	private ArrayList<T> list;
	
	public UnorderedListArray() {
		list = new ArrayList<T>();
	}
	
	@Override
	public void addToFront(T element) {
		list.add(0,element);
	}

	@Override
	public void addToRear(T element) {
		list.add(element);
	}

	@Override
	public void addAfter(T element, T target) {
		if (list.indexOf(target) == -1){
			throw new ElementNotFoundException("this UnorderedListArray");
		}
		int target_index = list.indexOf(target);
		list.add(target_index+1,element);
	}

	@Override
	public T removeFirst() {
		T first_element = list.get(0);
		list.remove(first_element);
		return first_element;
	}

	@Override
	public T removeLast() {
		T last_element = list.get(list.size()-1);
		list.remove(last_element);
		return last_element;
	}

	@Override
	public T remove(T element) {
		if (list.indexOf(element) == -1){
			throw new ElementNotFoundException("this UnorderedListArray");
		}
		list.remove(element);
		return element;

	}

	@Override
	public T first() {
		return list.get(0);
	}

	@Override
	public T last() {
		return list.get(list.size()-1);
	}

	@Override
	public boolean contains(T target) {
		for (T item: list){
			if(item == target){
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		if (list.size() == 0)
			return true;
		return false;
	}

	@Override
	public int size() {
		return list.size();
	}
	
	public String toString() {
		return list.toString();
	}

}
