package esempio03;

/**
 * The Esempio07_03 class provides a method to compare two integer arrays for
 * equality, and a main method for testing the method.
 * 
 * @author michelemazzaa
 */
public class Esempio07_03 {

	/**
	 * This static method checks if two integer arrays are equal by comparing their
	 * lengths and elements.
	 * 
	 * @param a The first integer array to be compared.
	 * @param b The second integer array to be compared.
	 * @return True if the arrays are equal, false otherwise.
	 */
	public static boolean idem(int[] a, int[] b) {
		if (a.length != b.length) {
			return false;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * The main method creates several integer arrays and uses the idem method to
	 * test their equality.
	 * 
	 * @param args The command line arguments (not used in this method).
	 */
	public static void main(String[] args) {
		// The initialization expressions cause the creation of an array object with the
		// specified contents.
		int[] v1 = { 2, 3, 4 };
		int[] v2 = { 2, 3, 5 };
		int[] v3 = { 2, 3 };
		int[] v4 = { 2, 3, 4 };
		// Case where the arrays have different lengths
		System.out.println(idem(v1, v3));
		// Case where the arrays have the same length but different elements
		System.out.println(idem(v1, v2));
		// Case where the arrays have the same length and same elements
		System.out.println(idem(v1, v4));
		// Case where the arrays are the same object (reflexivity)
		System.out.println(idem(v1, v1));
	}
}
