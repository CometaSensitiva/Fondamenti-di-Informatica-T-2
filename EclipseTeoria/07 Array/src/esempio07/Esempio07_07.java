package esempio07;

/**
 * This class contains a main method that sorts and performs a binary search on
 * an array of Strings passed as command line arguments.
 * 
 * Note: the program expects command line arguments to be passed in.
 * 
 * Author: michelemazzaa
 */
public class Esempio07_07 {

	/**
	 * Prints all elements of a String array on a single line, separated by spaces.
	 *
	 * @param v the String array to be printed
	 */
	public static void showArray(String[] v) {
		for (String x : v)
			System.out.print(x + " ");
		System.out.println();
	}

	/**
	 * The main method of the class, which sorts an array of Strings and performs a
	 * binary search on it.
	 * 
	 * @param args command line arguments; the program expects an array of Strings
	 *             to be passed in
	 */
	public static void main(String[] args) {
		showArray(args);
		java.util.Arrays.sort(args);
		showArray(args);
		int pos = java.util.Arrays.binarySearch(args, "Michele");
		System.out.println("Searched for " + "Michele" + ": found at index " + pos);
	}
}
