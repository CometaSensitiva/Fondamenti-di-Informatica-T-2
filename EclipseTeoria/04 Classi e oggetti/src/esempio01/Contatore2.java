package esempio01;
/**
 * The Contatore2 class provides a simple counter with instance methods for
 * managing its state. This implementation allows the counter to be reset and
 * incremented, and the current value to be retrieved. The counter state is
 * maintained as an instance variable, so each instance of the class has its own
 * counter.
 *
 * @author michelemazzaa
 */
public class Contatore2 {

	/** The current state of the counter. */
	private int state = 0;

	/**
	 * Resets the counter to zero.
	 */
	public void reset() {
		state = 0;
	}

	/**
	 * Increments the counter by one.
	 */
	public void inc() {
		state++;
	}

	/**
	 * Retrieves the current value of the counter.
	 *
	 * @return The current value of the counter.
	 */
	public int getValue() {
		return state;
	}
}
