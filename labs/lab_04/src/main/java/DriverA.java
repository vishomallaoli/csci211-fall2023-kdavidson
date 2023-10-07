
public class DriverA {

	public static void main(String[] args) {

		UnorderedListArray<Integer> list1 = new UnorderedListArray<Integer>();
		list1.addToFront(7);
		list1.addToRear(9);
		list1.addToFront(13);
		list1.addAfter(21, 7);
		list1.addAfter(6, 9);
		System.out.println(list1);
		System.out.printf("List has %d elements\n", list1.size());
		System.out.println("The first and last elements are: " + list1.first() +
		    " " + list1.last());
		Integer first = list1.removeFirst();
		Integer last = list1.removeLast();
		System.out.println("New list: " + list1);
		try {
			Integer missing = list1.remove(12);
		}
		catch (ElementNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			list1.addAfter(8, first+last);
		}
		catch (ElementNotFoundException e) {
			System.out.println(e.getMessage());
		}
		list1.addAfter(19, 7);
		list1.addAfter(8, 19);
		System.out.println(list1);

	}

}
