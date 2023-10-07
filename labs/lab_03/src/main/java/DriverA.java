
public class DriverA {

	public static void main(String[] args) {
		LinkedQueue<String> L1 = new LinkedQueue<String>();
		LinkedQueue<String> L2 = new LinkedQueue<String>();
		LinkedQueue<String> L3 = new LinkedQueue<String>();

		String[] cheer = {"Ole", "Miss", "Rebels!", "Hotty", "Toddy", "Go", "Rebs!"};
		
		for (String s: cheer) {
			L1.enqueue(s);
			L2.enqueue(s);
			L3.enqueue(s);
		}
		
		L3.enqueue("GO");
		L3.enqueue("REBS");
		
		System.out.println("L1 and L2:");
		System.out.println(L1);
		System.out.println("\n\nL3:");
		System.out.println(L3);
		
		if (L1.equals(L2))
			System.out.println("L1 and L2 are equal.");
		else
			System.out.println("L1 and L2 are NOT equal.");
		
		if (L1.equals(L3))
			System.out.println("L1 and L3 are equal.");
		else
			System.out.println("L1 and L3 are NOT equal.");
		
		System.out.println("\nL1 in reverse is: ");
		System.out.println(L1.reverse());
		
		System.out.println("\nL3 in reverse is: ");
		System.out.println(L3.reverse());

	}

}
