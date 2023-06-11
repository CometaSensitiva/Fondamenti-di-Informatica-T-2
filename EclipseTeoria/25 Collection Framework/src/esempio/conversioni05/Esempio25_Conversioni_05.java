package esempio.conversioni05;

import java.util.*;

/**
 * This class demonstrates the conversion of a List to an Array. It creates a
 * List of strings and then converts it to an array. The array is then printed
 * to the console.
 *
 * @author michelemazzaa
 */
public class Esempio25_Conversioni_05 {

	public static void main(String[] args) {
		// Create a List of strings
		List<String> l1 = List.of("Pippo", "Pluto", "QuiQuoQua", "Paperino", "Zio Paperone");

		System.out.println(l1);

		// Convert the List to an array
		String[] a1 = l1.toArray(new String[0]);
		// The argument (new String[0]) is used to specify the type of the array to be
		// produced.

		System.out.println(String.join(", ", a1));
	}

}