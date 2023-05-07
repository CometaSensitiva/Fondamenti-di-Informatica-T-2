package esempio8;

import java.util.Comparator;

/**
 * 
 * The CounterDescendingComparator class implements the Comparator interface to
 * compare Counter objects in descending order based on their value.
 * 
 * @author michelemazzaa
 */
public class CounterDescendingComparator implements Comparator<Counter> {

	/**
	 * 
	 * Compares two Counter objects based on their value in descending order.
	 * 
	 * @param a the first Counter object to compare
	 * @param b the second Counter object to compare
	 * @return 1 if a's value is less than b's value, -1 if a's value is greater
	 *         than b's value, and 0 if they have the same value
	 */
	@Override
	public int compare(Counter a, Counter b) {
		if (a.getValue() < b.getValue())
			return 1;
		if (a.getValue() > b.getValue())
			return -1;
		else
			return 0;
	}
}
