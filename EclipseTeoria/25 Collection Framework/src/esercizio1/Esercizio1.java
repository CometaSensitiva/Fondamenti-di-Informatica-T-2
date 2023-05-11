package esercizio1;

import java.util.HashSet;
import java.util.Set;

/**
 * This class analyzes a set of words, such as command-line arguments, and
 * performs the following tasks: - Prints all duplicate words - Prints the
 * number of distinct words - Prints the list of distinct words
 *
 * Since the goal is to work with distinct words, i.e., without duplicates, the
 * most suitable data structure is a Set, which guarantees the absence of
 * duplicates. The add() method of Set removes duplicates automatically: if an
 * existing element is attempted to be inserted, it returns false.
 *
 * The provided command-line argument should be passed as a single string, e.g.,
 * "Io sono Io esisto Io parlo".
 *
 * @author michelemazzaa
 */
public class Esercizio1 {
	/**
	 * Analyzes a set of words and performs the specified tasks.
	 *
	 * @param args The set of words to be analyzed.
	 */
	public static void main(String[] args) {
		// Create a HashSet to store distinct words
		Set<String> s = new HashSet<>();

		// Iterate over the words in the command-line arguments
		for (String i : args) {
			// Check if the word is already present in the set
			// If not, add it to the set
			// If the add() method returns false, it means the word is a duplicate
			if (!s.add(i))
				System.out.println("Duplicate Element: " + i);
		}

		// Print the number of distinct words
		System.out.println(s.size() + " Distinct Words:");

		// Print the list of distinct words separated by commas
		System.out.println(String.join(", ", s));
	}
}
