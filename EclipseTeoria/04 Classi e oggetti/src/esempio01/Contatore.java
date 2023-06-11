package esempio01;

/**
 * The Contatore class provides a simple counter with static methods for
 * managing its state. This implementation allows the counter to be reset and
 * incremented, and the current value to be retrieved.
 *
 * @author michelemazzaa
 */
public class Contatore {

	/** The current state of the counter. */
	private static int state;

	/**
	 * Resets the counter to zero.
	 */
	public static void reset() {
		state = 0;
	}

	/**
	 * Increments the counter by one.
	 */
	public static void inc() {
		state++;
	}

	/**
	 * Retrieves the current value of the counter.
	 *
	 * @return The current value of the counter.
	 */
	public static int getValue() {
		return state;
	}
}
