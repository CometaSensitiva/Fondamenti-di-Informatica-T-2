package introduzione;

/**
 * This class contains a main method that generates an array of 20 integers and
 * performs some operations on it.
 *
 * @author michelemazzaa
 */
public class EsercizioRiassuntivo {

	/**
	 * Prints all elements of an integer array on a single line, separated by
	 * spaces.
	 *
	 * @param v the integer array to be printed
	 */
	public static void showArray(int[] v) {
		for (int x : v)
			System.out.print(x + " ");
		System.out.println();
	}

	/**
	 * The main method of the class, which generates an array of 20 integers, sorts
	 * it, and performs a binary search on it.
	 *
	 * @param args command line arguments (unused)
	 */
	public static void main(String[] args) {
		int[] v = new int[20];
		// Random number generator
		java.util.Random gen = new java.util.Random();
		for (int i = 0; i < v.length; i++)
			// This generates random numbers between 0 and 30
			v[i] = gen.nextInt(30);
		showArray(v);
		java.util.Arrays.sort(v);
		showArray(v);
		int n = gen.nextInt(30);
		// The binarySearch method returns the index of the element if it is present in
		// the array, or the "insertion point" of the element otherwise
		int pos = java.util.Arrays.binarySearch(v, n);
		System.out.println("Searched for " + n + ": found at index " + pos);
	}
}
