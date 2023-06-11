package esempio.esercizio04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * This class counts the occurrences of words, such as command-line arguments.
 * The program creates a map that serves as a table with words as keys and their
 * frequencies as values. Each time a word is encountered, its frequency is
 * updated in the map. The final result includes the number of distinct words
 * and the table of word frequencies.
 *
 * The command-line arguments should be passed as a single string, e.g., "cane
 * gatto cane pesce gatto gatto cane".
 *
 * Note: The map implementation used is HashMap, which does not guarantee a
 * specific order of elements.
 *
 * @author michelemazza
 */
public class Esempio25_Esercizio_04 {

	public static void myPrint(Map<String, Integer> m) {
		Set<String> keys = m.keySet();
		for (String key : keys) {
			System.out.println(key + "\t" + m.get(key));
		}
	}

	public static void myPrint2(Map<String, Integer> m) {
		Set<Map.Entry<String, Integer>> rows = m.entrySet();
		for (Map.Entry<String, Integer> row : rows) {
			System.out.println(row);
		}
	}

	/**
	 * Counts the occurrences of words and prints the result.
	 *
	 * @param args The command-line arguments to be processed.
	 */
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();

		// Iterate over the command-line arguments
		for (int i = 0; i < args.length; i++) {
			Integer freq = m.get(args[i]);
			// Update the frequency of the word in the map
			m.put(args[i], (freq == null ? 1 : freq + 1));
		}

		// Print the number of distinct words
		System.out.println(m.size() + " Distinct Words:");

		// Print the table of word frequencies
		System.out.println(m);

		// Print the table with myPrint
		myPrint(m);

		// Print the table with myPrint2
		myPrint2(m);

	}
}
