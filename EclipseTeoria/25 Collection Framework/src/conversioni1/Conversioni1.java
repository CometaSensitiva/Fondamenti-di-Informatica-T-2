package conversioni1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * This class demonstrates the conversion of a List to Sets using HashSet and
 * TreeSet implementations. It creates a List of strings and then converts it to
 * sets using HashSet and TreeSet. The sets are then printed to the console.
 *
 * @author michelemazzaa
 */
public class Conversioni1 {

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
	}

}
