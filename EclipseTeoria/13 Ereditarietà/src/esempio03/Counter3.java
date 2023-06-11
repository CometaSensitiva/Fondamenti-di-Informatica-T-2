package esempio03;

import java.awt.Color;

/**
 * The Counter3 class represents a counter with an integer value and a color. It
 * extends the Counter1 class.
 *
 * @author michelemazzaa
 */
public class Counter3 extends Counter1 {

	private Color color;

	/**
	 * Constructs a counter with a default value of 0 and a default color of BLACK.
	 */
	public Counter3() {
		super();
		color = Color.BLACK;
	}

	/**
	 * Constructs a counter with the specified value and a default color of BLACK.
	 *
	 * @param value the initial value of the counter
	 */
	public Counter3(int value) {
		super(value);
		color = Color.BLACK;
	}

	/**
	 * Constructs a counter with the specified value and color.
	 *
	 * @param value the initial value of the counter
	 * @param color the color of the counter
	 */
	public Counter3(int value, Color color) {
		super(value);
		this.color = color;
	}

	/**
	 * Decreases the value of the counter by 1.
	 */
	public void dec() {
		value--;
	}

	/**
	 * Returns the color of the counter.
	 *
	 * @return the color of the counter
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * Compares this counter with the specified object for equality. Two counters
	 * are equal if they have the same value and color.
	 *
	 * @param that the object to compare to
	 * @return true if this counter and the specified object are equal; false
	 *         otherwise
	 */
	public boolean equals(Object that) {
		if (!(that instanceof Counter3)) {
			return false;
		}
		Counter3 other = (Counter3) that;
		return super.equals(other) && getColor().equals(other.getColor());
	}

	/**
	 * Returns a string representation of the counter, including its value and
	 * color.
	 *
	 * @return a string representation of the counter
	 */
	@Override
	public String toString() {
		return super.toString() + " Counter Color: " + color.toString();
	}
}
