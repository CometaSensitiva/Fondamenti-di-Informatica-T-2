package esempio01;

/**
 * The Libreria class provides a utility method for comparing two arrays of
 * generic type T.
 * 
 * @author michelemazzaa
 */
public class Libreria {

	/**
	 * Compares two arrays of generic type T to check if they contain the same
	 * elements in the same order.
	 *
	 * @param a the first array of type T to be compared
	 * @param b the second array of type T to be compared
	 * @return true if the two arrays have the same length and the same elements in
	 *         the same order, false otherwise
	 */
	public static <T> boolean idem(T[] a, T[] b) {
		boolean result = true;
		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				if (!a[i].equals(b[i])) {
					result = false;
					break;
				}
			}
		} else {
			result = false;
		}
		return result;
	}
}
