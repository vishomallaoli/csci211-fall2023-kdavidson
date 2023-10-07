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
		if (list.isEmpty())
			throw new ElementNotFoundException("list");

		T temp = list.get(0);
		list.remove(0);
		return temp;
	}

	@Override
	public T removeLast() {
		if (list.indexOf(list.size()-1) == -1){
			throw new ElementNotFoundException("this UnorderedListArray");
		}
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
		if(list.isEmpty())
			throw new ElementNotFoundException("list");

		return list.get(0);
	}

	@Override
	public T last() {
		if (list.indexOf(list.size()-1) == -1){
			throw new ElementNotFoundException("this UnorderedListArray");
		}
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
