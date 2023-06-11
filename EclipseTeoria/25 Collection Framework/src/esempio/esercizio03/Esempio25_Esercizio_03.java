package esempio.esercizio03;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * This class demonstrates the reversal of command-line arguments. The provided
 * command-line arguments are reversed and printed.
 *
 * The command-line arguments should be passed as a single string, e.g., "cane
 * gatto cane canarino". The arguments are stored in a list, and then the list
 * is iterated in reverse order to print the reversed arguments.
 *
 * Note: The reversal is done by printing the arguments in reverse order, not by
 * modifying the original list.
 *
 * @author michelemazza
 */
public class Esempio25_Esercizio_03 {

	/**
	 * Reverses and prints the command-line arguments.
	 *
	 * @param args The command-line arguments to be reversed.
	 */
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();

		// Populate the list with the command-line arguments
		for (int i = 0; i < args.length; i++) {
			l.add(args[i]);
		}

		System.out.println(String.join(", ", l)); // Print the initial list separated by commas

		// Iterate over the list in reverse order using ListIterator and print the
		// elements
		for (ListIterator<String> i = l.listIterator(l.size()); i.hasPrevious();) {
			System.out.print(i.previous());
			if (i.hasPrevious()) {
				System.out.print(", ");
			}
		}
	}
}
