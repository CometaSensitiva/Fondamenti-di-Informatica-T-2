package esempio01;
/**
 * A class representing a counter with an integer value.
 * 
 * @author michelemazzaa
 */
public class Counter {

	/** The current value of the counter. */
	private int value;

	/**
	 * Constructs a counter with the specified initial value.
	 * 
	 * @param value the initial value of the counter
	 */
	public Counter(int value) {
		this.value = value;
	}

	/**
	 * Constructs a counter with an initial value of 0.
	 */
	public Counter() {
		this(0);
	}

	/**
	 * Resets the counter value to 0.
	 */
	public void reset() {
		this.value = 0;
	}

	/**
	 * Increments the counter value by 1.
	 */
	public void inc() {
		this.value++;
	}

	/**
	 * Increments the counter value by a specified amount.
	 * 
	 * @param k the amount to increment the counter value by
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
	 * Compares this counter to another counter to determine if they have the same
	 * value.
	 * 
	 * @param that the counter to compare to
	 * @return true if the counters have the same value, false otherwise
	 */
	public boolean equals(Counter that) {
		return this.getValue() == that.getValue();
	}

	@Override
	public String toString() {
		String res = "Counter value: " + value;
		return res;
	}
}
