package esempio.ordinamento03;

import java.util.*;

/**
 * This class demonstrates how to sort a list of Person objects by converting an
 * immutable list to a modifiable list using copy.
 *
 * @author michelemazzaa
 */
public class Esempio25_Ordinamento_03 {

    public static void main(String args[]) {

        // Create an immutable List of Person objects using List.of()
        List<Persona> immutableList = List.of(
                new Persona("Eugenio", "Bennato"),
                new Persona("Roberto", "Benigni"),
                new Persona("Edoardo", "Bennato"),
                new Persona("Bruno", "Vespa")
        );

        // Create a modifiable List by copying the elements from the immutableList
        List<Persona> l = new ArrayList<>(immutableList);

        // Sort the List based on the natural ordering of Person objects
        Collections.sort(l);

        // Print the sorted List to the console
        System.out.println(l);
    }
}