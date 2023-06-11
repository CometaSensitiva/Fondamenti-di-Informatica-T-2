package esempio.ricerca01;

import java.util.*;

/**
 * A class to demonstrate binary search on a list of people.
 * The list must be modifiable as binary search requires the list to be sorted.
 *
 * @author michelemazzaa
 */
public class Esempio25_Ricerca_01 {

    public static void main(String args[]) {
        // Create a modifiable list of people
        List<Persona> l = new ArrayList<>(List.of(
                new Persona("Eugenio", "Bennato"),
                new Persona("Roberto", "Benigni"),
                new Persona("Edoardo", "Bennato"),
                new Persona("Bruno", "Vespa")
        ));
        
        // Sort the list in ascending order
        Collections.sort(l);

        // Perform binary search on the sorted list
        System.out.println(Collections.binarySearch(l, new Persona("Bruno", "Vespa")));
        System.out.println(Collections.binarySearch(l, new Persona("Bruno", "Ape")));
    }
}
