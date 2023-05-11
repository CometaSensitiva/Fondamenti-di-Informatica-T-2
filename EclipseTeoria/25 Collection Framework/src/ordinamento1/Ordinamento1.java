package ordinamento1;

import java.util.*;

/**
 * This class demonstrates how to sort a list of Person objects. It creates an
 * array of Person objects, converts it to a List, sorts the List based on the
 * natural ordering of Person objects, and then prints the sorted List to the
 * console.
 *
 * @author michelemazzaa
 */
public class Ordinamento1 {

	public static void main(String args[]) {
		// Create an array of Person objects
		Persona[] elencoPersone = { 
				new Persona("Eugenio", "Bennato"), 
				new Persona("Roberto", "Benigni"),
				new Persona("Edoardo", "Bennato"), 
				new Persona("Bruno", "Vespa") 
				};

		// Convert the array to a List
		List<Persona> l = Arrays.asList(elencoPersone);

		// Sort the List based on the natural ordering of Person objects
		Collections.sort(l);

		// Print the sorted List to the console
		System.out.println(l);
	}
}