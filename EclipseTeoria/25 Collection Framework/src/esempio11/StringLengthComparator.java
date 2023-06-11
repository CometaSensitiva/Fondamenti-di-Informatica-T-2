package esempio11;

import java.util.Comparator;

/**
 * A custom comparator implementation that compares strings based on their
 * length. Strings with shorter length are considered smaller, and strings with
 * longer length are considered greater. If two strings have the same length,
 * they are considered equal.
 * 
 * @author michelemazzaa
 */
public class StringLengthComparator implements Comparator<String> {

	/**
	 * Compares two strings based on their length.
	 * 
	 * @param str1 the first string to compare
	 * @param str2 the second string to compare
	 * @return a negative integer if str1 is shorter than str2, a positive integer
	 *         if str1 is longer than str2, or 0 if they have the same length
	 */
	@Override
	public int compare(String str1, String str2) {
		if (str1.length() < str2.length()) {
			return -1;
		} else if (str1.length() > str2.length()) {
			return 1;
		} else {
			return 0;
		}
	}
}
