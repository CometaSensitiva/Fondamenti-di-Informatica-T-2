package conversioni2;

import java.util.*;

/**
 * This class demonstrates the conversion of an immutable List to a modifiable
 * List using ArrayList. It creates an immutable List of strings and then
 * converts it to a modifiable List using ArrayList. Elements are added to the
 * modifiable List, and the modified List is printed to the console.
 *
 * @author michelemazzaa
 */
public class Conversioni2 {

	public static void main(String[] args) {
		// Create an immutable List of strings
		List<String> l1 = List.of("Pippo", "Pluto", "QuiQuoQua", "Paperino", "Zio Paperone");
		System.out.println(l1);

		// Convert the immutable List to a modifiable List using ArrayList
		List<String> l2 = new ArrayList<>(l1);
		System.out.println(l2);

		// Modify the modifiable List by adding elements
		l2.add("Archimede");
		l2.add("Paperino");
		System.out.println(l2);
	}

}