package esempio8;

import java.util.Arrays;

/**
 * 
 * The Main8 class contains the main method to test the Counter class and its
 * comparators.
 * 
 * @author michelemazzaa
 */
public class Main8 {

	public static void main(String[] args) {
		Counter[] myCounterArray = { new Counter(110), new Counter(100), new Counter(30), new Counter(50) };

		// Print the initial order of the Counter objects in the array
		System.out.println("Initial order of Counter objects:");
		for (Counter c : myCounterArray)
			System.out.println(c);

		// Sort the Counter objects in ascending order and print the result
		System.out.println("Array sorted in ascending order:");
		Arrays.sort(myCounterArray);
		for (Counter c : myCounterArray)
			System.out.println(c);

		// Sort the Counter objects in descending order and print the result
		System.out.println("Array sorted in descending order:");
		Arrays.sort(myCounterArray, new CounterDescendingComparator());
		for (Counter c : myCounterArray)
			System.out.println(c);

		// Sort the Counter objects based on their value modulo 24 and print the result
		System.out.println("Array sorted based on value modulo 24:");
		Arrays.sort(myCounterArray, new CounterModule24Comparator());
		for (Counter c : myCounterArray)
			System.out.println(c);
	}
}