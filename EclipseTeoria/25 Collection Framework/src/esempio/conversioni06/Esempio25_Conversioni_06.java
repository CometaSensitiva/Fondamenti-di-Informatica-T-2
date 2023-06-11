package esempio.conversioni06;

import java.util.*;

/**
 * This class demonstrates the conversion of an array to a List. It creates an
 * array of strings and then converts it to a List. The List is then printed to
 * the console.
 *
 * @author michelemazzaa
 */
public class Esempio25_Conversioni_06 {

	public static void main(String[] args) {
		// Create an array of strings
		String[] arr = { "One", "Three", "Ten" };

		System.out.println(String.join(", ", arr)); // Join array elements with commas and print

		// Convert the array to a List using Arrays.asList()
		List<String> list = Arrays.asList(arr);

		System.out.println(list);
	}

}