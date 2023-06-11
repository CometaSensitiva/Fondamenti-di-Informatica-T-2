package esempio08;

import java.util.Comparator;

/**
 * 
 * The CounterModule24Comparator class implements the Comparator interface to
 * compare Counter objects based on their value modulo 24.
 * 
 * @author michelemazzaa
 */
public class CounterModule24Comparator implements Comparator<Counter> {

	/**
	 * 
	 * Compares two Counter objects based on their value modulo 24.
	 * 
	 * @param a the first Counter object to compare
	 * @param b the second Counter object to compare
	 * @return -1 if a's value modulo 24 is less than b's value modulo 24, 1 if a's
	 *         value modulo 24 is greater than b's value modulo 24, and 0 if they
	 *         have the same value modulo 24
	 */
	@Override
	public int compare(Counter a, Counter b) {
		if (a.getValue() % 24 < b.getValue() % 24)
			return -1;
		if (a.getValue() % 24 > b.getValue() % 24)
			return 1;
		return 0;
	}
}