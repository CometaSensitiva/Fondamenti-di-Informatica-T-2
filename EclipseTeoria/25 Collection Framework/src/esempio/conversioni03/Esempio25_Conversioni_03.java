package esempio.conversioni03;

import java.util.*;

/**
 * This class demonstrates the conversion of a List to sets using HashSet and
 * TreeSet implementations. It creates a List of strings and then converts it to
 * sets using HashSet and TreeSet. The sets are then modified by adding
 * elements, and the modified sets are printed to the console.
 *
 * @author michelemazzaa
 */
public class Esempio25_Conversioni_03 {

	public static void main(String[] args) {
		// Create a List of strings
		List<String> l1 = List.of("Pippo", "Pluto", "QuiQuoQua", "Paperino", "Zio Paperone");
		System.out.println(l1);

		// Convert the List to a HashSet
		Set<String> s1 = new HashSet<>(l1);
		System.out.println(s1);

		// Convert the List to a TreeSet
		Set<String> s2 = new TreeSet<>(l1);
		System.out.println(s2);

		// Modify the HashSet by adding an element
		s1.add("Paperoga");
		System.out.println(s1);

		// Modify the TreeSet by adding an element
		s2.add("PaperUga");
		System.out.println(s2);
	}

}
