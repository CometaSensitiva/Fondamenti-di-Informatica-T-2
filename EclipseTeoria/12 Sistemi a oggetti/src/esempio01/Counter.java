package esempio01;

/**
 * The Counter class represents a simple counter with an integer value.
 * 
 * @author michelemazzaa
 */
public class Counter {

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
	 * Compares this counter to another counter for equality.
	 *
	 * @param that The other counter to compare to
	 * @return true if this counter has the same value as that, false otherwise
	 */
	public boolean equals(Counter that) {
		return this.getValue() == that.getValue();
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
}