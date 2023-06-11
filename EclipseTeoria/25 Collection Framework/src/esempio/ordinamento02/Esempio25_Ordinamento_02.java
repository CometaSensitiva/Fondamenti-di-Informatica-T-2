package esempio.ordinamento02;

import java.util.*;
/**
 * This class demonstrates how to sort a list of Person objects without
 * explicitly passing through a temporary array.
 *
 * @author michelemazzaa
 */
public class Esempio25_Ordinamento_02 {

    public static void main(String args[]) {

        // Create a List of Person objects directly using Arrays.asList()
        List<Persona> l = Arrays.asList(
                new Persona("Eugenio", "Bennato"),
                new Persona("Roberto", "Benigni"),
                new Persona("Edoardo", "Bennato"),
                new Persona("Bruno", "Vespa")
        );

        // Sort the List based on the natural ordering of Person objects
        Collections.sort(l);

        // Print the sorted List to the console
        System.out.println(l);
    }
}