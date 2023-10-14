import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		// TODO 1.  Timing of sorts
		int max = 50000;
		Integer[] numbers = new Integer[max];
		long startTime,endTime, durationSelection, durationBubble, durationInsertion, durationMerge, durationQuick;
		
		// Test Selection sort
		setRandom(numbers, max);
		startTime = System.currentTimeMillis();
		Sorting.selectionSort(numbers);
		durationSelection = System.currentTimeMillis() - startTime;
		System.out.println("Done with selection sort");
		
		// Test Bubble sort
		setRandom(numbers, max);
		startTime = System.currentTimeMillis();
		Sorting.bubbleSort(numbers);
		durationBubble = System.currentTimeMillis() - startTime;
		System.out.println("Done with bubble sort");

		// Test Insertion sort
		setRandom(numbers, max);
		startTime = System.currentTimeMillis();
		Sorting.selectionSort(numbers);
		durationInsertion = System.currentTimeMillis() - startTime;
		System.out.println("Done with insertion sort");

		// Test Merge sort
		setRandom(numbers, max);
		startTime = System.currentTimeMillis();
		Sorting.mergeSort(numbers);
		durationMerge = System.currentTimeMillis() - startTime;
		System.out.println("Done with merge sort");
		
		// Test Quick sort
		setRandom(numbers, max);
		startTime = System.currentTimeMillis();
		Sorting.quickSort(numbers);
		durationQuick = System.currentTimeMillis() - startTime;
		System.out.println("Done with quick sort");
		
		// Output results
		System.out.printf("Number of milliseconds needed to sort %d Integers:\n", max);
		System.out.println("By Selection Sort: " + durationSelection);		
		System.out.println("By Bubble Sort: " + durationBubble);
		System.out.println("By Insertion Sort: " + durationInsertion);
		System.out.println("By Merge Sort: " + durationMerge);
		System.out.println("By Quicksort: " + durationQuick);


		// TODO 2.  Sorting Objects
		int count = 25;
		Person[] people = new Person[count];
		Person[] peopleUnsorted = new Person[650*count];
		Person[] peopleToSort = new Person[650*count];
		// Read file to populate people array
		try {
			Scanner file = new Scanner(new File("names.txt"));
			for (int i=0; i<count; i++) {
				String line = file.nextLine();
				String[] names = line.split(" ");
				people[i] = new Person(names[0], names[1]);
			}
			// Create an array that is 650 times the original people array
			for(int i = 0; i < (650*count); i+=count) {
				System.arraycopy(people, 0, peopleUnsorted, i, people.length);
			}
			
		}
		catch (FileNotFoundException e) {
			System.out.println("File of names not found.");
			System.exit(0);
		}
		
		// Print original list
		System.out.println("Original List:");
		printList(people);
		
		// Sort the Person objects (last name, then first name)
		Sorting.mergeSort(people);
		
		// Print sorted list
		System.out.println("Sorted List:");
		printList(people);


		// TODO 3. Time test Sorting array of objects

		// Test Selection sort
		System.arraycopy(peopleUnsorted, 0, peopleToSort, 0, peopleUnsorted.length);
		startTime = System.currentTimeMillis();
		Sorting.selectionSort(peopleToSort);
		durationSelection = System.currentTimeMillis() - startTime;
		System.out.println("Done with selection sort");


		// Test Bubble sort
		System.arraycopy(peopleUnsorted, 0, peopleToSort, 0, peopleUnsorted.length);
		startTime = System.currentTimeMillis();
		Sorting.bubbleSort(peopleToSort);
		durationBubble = System.currentTimeMillis() - startTime;
		System.out.println("Done with bubble sort");


		// Test Insertion sort
		System.arraycopy(peopleUnsorted, 0, peopleToSort, 0, peopleUnsorted.length);
		startTime = System.currentTimeMillis();
		Sorting.selectionSort(peopleToSort);
		durationInsertion = System.currentTimeMillis() - startTime;
		System.out.println("Done with insertion sort");
		


		// Test Merge sort
		System.arraycopy(peopleUnsorted, 0, peopleToSort, 0, peopleUnsorted.length);
		startTime = System.currentTimeMillis();
		Sorting.mergeSort(peopleToSort);
		durationMerge = System.currentTimeMillis() - startTime;
		System.out.println("Done with merge sort");

		

		// Test Quick sort
		System.arraycopy(peopleUnsorted, 0, peopleToSort, 0, peopleUnsorted.length);
		startTime = System.currentTimeMillis();
		Sorting.quickSort(numbers);
		durationQuick = System.currentTimeMillis() - startTime;
		System.out.println("Done with quick sort");

		
		// Output results
		System.out.printf("Number of milliseconds needed to sort %d Persons:\n", peopleUnsorted.length);
		System.out.println("By Selection Sort: " + durationSelection);		
		System.out.println("By Bubble Sort: " + durationBubble);
		System.out.println("By Insertion Sort: " + durationInsertion);
		System.out.println("By Merge Sort: " + durationMerge);
		System.out.println("By Quicksort: " + durationQuick);

	}

	// Fill first parameter (array) with max random numbers
	public static void setRandom(Integer[] nums, int max) {
		Random rand = new Random();
		for (int i=0; i<max; i++) {
			nums[i] = rand.nextInt(100000);
		}		
	}

	// Print the Person objects using the default toString method
	public static void printList(Person[] peeps) {
		for (int i=0; i<peeps.length; i++) {
			System.out.println(peeps[i]);
		}
	}

}
