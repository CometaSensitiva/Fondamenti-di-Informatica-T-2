package esempio01;
/**
 * The Contatore3 class provides a simple counter with instance methods for
 * managing its state. This implementation allows the counter to be reset and
 * incremented, and the current value to be retrieved. The counter state is
 * maintained as an instance variable, so each instance of the class has its own
 * counter. Two constructors are provided: one sets the counter to zero, and the
 * other sets the counter to a specific value.
 * 
 * Example usage: Contatore3 c1 = new Contatore3(); // creates a new counter
 * initialized to zero Contatore3 c2 = new Contatore3(5); // creates a new
 * counter initialized to 5
 * 
 * @author michelemazzaa
 */
public class Contatore3 {

	/** The current state of the counter. */
	private int state;

	/**
	 * Creates a new Contatore3 instance with the counter initialized to zero.
	 */
	public Contatore3() {
		state = 0;
	}

	/**
	 * Creates a new Contatore3 instance with the counter initialized to a specific
	 * value.
	 * 
	 * @param v The value to set the counter to.
	 */
	public Contatore3(int v) {
		state = v;
	}

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
