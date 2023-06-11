package esempio.esercizio02;

import java.util.ArrayList;
import java.util.List;

/**
 * This class swaps two words in a sequence, such as two arguments taken from
 * the command line. "Swapping" implies a notion of position, which is not
 * provided by the Set data structure. The most suitable data structure for this
 * task is a List. Like an array, a List has a notion of a sequence of elements
 * indexed starting from zero. A helper function called swap is used to perform
 * the swap operation.
 *
 * The provided command-line arguments should be passed as a single string,
 * e.g., "cane gatto pappagallo canarino cane canarino pescerosso". The swap operation is
 * performed on the list of words by specifying the indices of the words to be
 * swapped.
 *
 * @author michelemazzaa
 */
public class Esempio25_Esercizio_02 {

	/**
	 * Swaps two elements in a given list.
	 *
	 * @param list The list in which the elements are to be swapped.
	 * @param i    The index of the first element to be swapped.
	 * @param j    The index of the second element to be swapped.
	 * @param <T>  The type of elements in the list.
	 */
	static <T> void swap(List<T> list, int i, int j) {
		T temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}

	/**
	 * Swaps two words in a sequence and prints the result.
	 *
	 * @param args The sequence of words to be processed.
	 */
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();

		// Populate the list with the command-line arguments
		for (int i = 0; i < args.length; i++) {
			l.add(args[i]);
		}

		System.out.println(l); // Print the initial list

		swap(l, 2, 3); // Swap the words at indices 2 and 3

		System.out.println(l); // Print the updated list
	}
}
