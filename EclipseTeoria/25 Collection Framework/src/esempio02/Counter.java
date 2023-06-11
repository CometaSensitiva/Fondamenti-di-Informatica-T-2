package esempio02;

import java.util.Objects;

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
	 * 
	 * Computes the hash code for the Counter object.
	 * 
	 * @return The hash code value for the Counter.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(value);
	}

	/**
	 * 
	 * Checks if the Counter object is equal to another object.
	 * 
	 * @param obj The object to compare.
	 * @return True if the Counter is equal to the specified object, false
	 *         otherwise.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Counter))
			return false;
		Counter other = (Counter) obj;
		return value == other.value;
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
		if (getValue() < that.getValue())
			return -1;
		else if (getValue() > that.getValue())
			return 1;
		else
			return 0;
	}
}