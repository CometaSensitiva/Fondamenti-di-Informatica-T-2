package esercizio5;

import java.util.SortedMap;
import java.util.TreeMap;

//cane gatto cane pesce gatto gatto cane

/**
 * This class counts the frequency of words passed as command-line arguments and displays the results.
 * It uses a SortedMap to store the words and their frequencies.
 *
 * @author michelemazzaa
 */
public class Esercizio5 {
    public static void main(String[] args) {
        // Create a SortedMap to store the words and their frequencies
        SortedMap<String, Integer> m = new TreeMap<>();

        // Iterate through the command-line arguments
        for (int i = 0; i < args.length; i++) {
            // Get the current frequency of the word from the map
            Integer freq = m.get(args[i]);
            
            // Update the frequency of the word in the map
            m.put(args[i], (freq == null ? 1 : freq + 1));
        }

        // Print the number of unique words and the map containing the words and their frequencies
        System.out.println(m.size() + " elements");
        System.out.println(m);
    }
}

