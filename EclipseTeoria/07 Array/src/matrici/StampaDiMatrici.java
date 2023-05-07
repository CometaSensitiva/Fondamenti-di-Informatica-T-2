package matrici;

import java.util.Arrays;

/**
 * The StampaDiMatrici class provides a main method for printing a
 * two-dimensional array of integers.
 *
 * @author michelemazzaa
 */
public class StampaDiMatrici {

	/**
	 * The main method prints a two-dimensional array of integers to the console.
	 *
	 * @param args The command-line arguments passed to the program.
	 */
	public static void main(String[] args) {
		// Initialize a two-dimensional array of integers
		int[][] v = { { 2, 3, 4 }, { 3, 4, 5 }, { 5, 6, 7 } };

		// Print the two-dimensional array to the console
		// using the Arrays.deepToString() method, which
		// prints the contents of nested arrays as well.
		System.out.println(Arrays.deepToString(v));
	}
}
