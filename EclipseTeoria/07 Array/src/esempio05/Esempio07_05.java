package esempio05;

/**
 * The Esempio07_05 class provides examples of using the java.util.Arrays.copyOf
 * method to create new arrays based on existing arrays.
 * 
 * @author michelemazzaa
 */
public class Esempio07_05 {

	/**
	 * Main method to demonstrate the use of java.util.Arrays.copyOf method. Prints
	 * the original and copied arrays to the console, as well as arrays created with
	 * different lengths.
	 *
	 * @param args command line arguments (unused)
	 */
	public static void main(String[] args) {
		int[] v1 = { 1, 2, 3, 4 };
		int[] v2 = java.util.Arrays.copyOf(v1, v1.length);
		int[] v3 = java.util.Arrays.copyOf(v1, v1.length - 2);
		int[] v4 = java.util.Arrays.copyOf(v1, 0);
		int[] v5 = java.util.Arrays.copyOf(v1, v1.length + 2);
		// Print the original array
		for (int x : v1)
			System.out.print(x + " ");
		System.out.println();
		// Print the copied array
		for (int x : v2) {
			System.out.print(x + " ");
		}
		System.out.println();
		// Print the array with two elements removed
		for (int x : v3) {
			System.out.print(x + " ");
		}
		System.out.println();
		// Print the array with zero length
		for (int x : v4) {
			System.out.print(x + " ");
		}
		System.out.println();
		// Print the array with two additional elements
		for (int x : v5) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
}
