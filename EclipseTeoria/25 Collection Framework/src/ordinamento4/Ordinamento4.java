package ordinamento4;

import java.util.*;


/**
 * This class demonstrates how to sort an array of Persona objects by converting
 * a List to an array.
 *
 * @author michelemazzaa
 */
public class Ordinamento4 {

    public static void main(String args[]) {

        // Create an immutable List of Persona objects using List.of()
        List<Persona> immutableList = List.of(
                new Persona("Eugenio", "Bennato"),
                new Persona("Roberto", "Benigni"),
                new Persona("Edoardo", "Bennato"),
                new Persona("Bruno", "Vespa")
        );

        // Convert the List to an array of Persona objects
        Persona[] persone = immutableList.toArray(new Persona[0]);

        // Sort the array based on the natural ordering of Persona objects
        Arrays.sort(persone);

        // Print the sorted array to the console
        System.out.println(Arrays.toString(persone));
    }
}