package esempio.ricerca02;

import java.util.*;


/**
 * A class to demonstrate sorting and retrieval using a map of people.
 * The map is sorted based on the keys in ascending order.
 * Each person is associated with a unique key.
 * 
 * The class utilizes TreeMap for sorting and retrieval operations.
 * 
 * @author michelemazzaa
 */
public class Esempio25_Ricerca_02 {

    public static void main(String args[]) {
        // Create a map of people with unique keys
        Map<String, Persona> l = new TreeMap<>(Map.of(
                "BNNGNEyymddxxxxu", new Persona("Eugenio", "Bennato", "BNNGNEyymddxxxxu"),
                "BNGRRTyymddxxxxu", new Persona("Roberto", "Benigni", "BNGRRTyymddxxxxu"),
                "BNNDRDyymddxxxxu", new Persona("Edoardo", "Bennato", "BNNDRDyymddxxxxu"),
                "VSPBRNyymddxxxxu", new Persona("Bruno", "Vespa", "VSPBRNyymddxxxxu")
        ));

        // Print the entire map
        System.out.println(l);

        // Retrieve a person using a specific key
        System.out.println(l.get("BNGRRTyymddxxxxu"));
    }
}
