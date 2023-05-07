package esempio2;

/**
 * This class represents a counter that can be decremented and extends the
 * Counter1 class. It stores a numerical value that can be modified using the
 * provided methods.
 *
 * @author michelemazzaa
 */
public class Counter2 extends Counter1 {

	/**
	 * Constructs a new Counter2 object with an initial value of 0.
	 */
	public Counter2() {
		super();
	}

	/**
	 * Constructs a new Counter2 object with the specified initial value.
	 *
	 * @param value the initial value of the counter
	 */
	public Counter2(int value) {
		super(value);
	}

	/**
	 * Decrements the counter value by 1.
	 */
	public void dec() {
		value--;
	}
}
