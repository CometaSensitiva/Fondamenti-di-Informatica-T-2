package esempio07;

/**
 * The Counter class represents a simple counter with an integer value.
 * 
 * @author michelemazzaa
 */
public class Counter implements Comparable<Counter> {

	/**
	 * The current value of the counter.
	 */
	private int value;

	/**
	 * Constructs a new Counter with the specified initial value.
	 * 
	 * @param value the initial value of the counter
	 */
	public Counter(int value) {
		this.value = value;
	}

	/**
	 * Constructs a new Counter with an initial value of 0.
	 */
	public Counter() {
		this(0);
	}

	/**
	 * Resets the value of the counter to 0.
	 */
	public void reset() {
		this.value = 0;
	}

	/**
	 * Increments the value of the counter by 1.
	 */
	public void inc() {
		this.value++;
	}

	/**
	 * Increments the value of the counter by the specified amount.
	 * 
	 * @param k the amount to increment the counter by
	 */
	public void inc(int k) {
		this.value += k;
	}

	/**
	 * Returns the current value of the counter.
	 * 
	 * @return the current value of the counter
	 */
	public int getValue() {
		return this.value;
	}

	/**
	 * Compares obj object to another counter for equality.
	 *
	 * @param obj The other Object to compare to
	 * @return true if obj Object is an instanceof Counter and has the same value as
	 *         that, false otherwise
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Counter c) {
			return this.getValue() == c.getValue();
		}
		return false;
	}

	/**
	 * Returns a string representation of this counter.
	 *
	 * @return A string representation of this counter
	 */
	@Override
	public String toString() {
		String res = "Valore contatore : " + value;
		return res;
	}

	/**
	 * 
	 * Compares this Counter object with the specified Counter object for order.
	 * Returns a negative integer, zero, or a positive integer as this object is
	 * less than, equal to, or greater than the specified object, respectively.
	 * 
	 * @param that the Counter object to be compared
	 * @return a negative integer, zero, or a positive integer as this object is
	 *         less than, equal to, or greater than the specified object,
	 *         respectively
	 */
	public int compareTo(Counter that) {
		// Compares the value of this Counter object with the specified Counter object
		// and returns the result
		if (getValue() < that.getValue())
			return -1;
		else if (getValue() > that.getValue())
			return 1;
		else
			return 0;
	}
}