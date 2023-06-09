package esempio04;

import counter.*;

/**
 * The Esempio07_04 class provides a method to compare two arrays of Counter objects
 * for equality.
 *
 * @author michelemazzaa
 */
public class Esempio07_04 {

	/**
	 * Compares two arrays of Counter objects for equality.
	 *
	 * @param c1 the first array of Counter objects to compare
	 * @param c2 the second array of Counter objects to compare
	 * @return true if the arrays have the same length and the same elements in the
	 *         same order, false otherwise
	 */
	public static boolean idem(Counter[] c1, Counter[] c2) {
		if (c1.length != c2.length)
			return false;
		for (int i = 0; i < c1.length; i++)
			// Counter is an object, so == should not be used as it compares references
			// instead of contents. Therefore, use !c1[i].equals(c2[i]).
			if (!c1[i].equals(c2[i]))
				return false;
		return true;
	}

	/**
	 * Main method to test the idem method with sample arrays of Counter objects.
	 * Prints the result of each comparison to the console.
	 *
	 * @param args command line arguments (unused)
	 */
	public static void main(String[] args) {
		Counter[] v1 = { new Counter(2), new Counter(3), new Counter(4) };
		Counter[] v2 = { new Counter(2), new Counter(3), new Counter(5) };
		Counter[] v3 = { new Counter(2), new Counter(3) };
		Counter[] v4 = { new Counter(2), new Counter(3), new Counter(4) };
		// Case where the arrays have different lengths
		System.out.println(idem(v1, v3));
		// Case where the arrays have the same length but different elements
		System.out.println(idem(v1, v2));
		// Case where the arrays have the same length and elements in the same order
		System.out.println(idem(v1, v4));
		// Case where it's the same array (reflexivity)
		System.out.println(idem(v1, v1));
	}
}
