package esempio4;

import ed.utils.*;

/**
 * The `Finestra2` class extends the `Finestra` class and provides additional
 * methods for printing text and integers.
 *
 * @author michelemazzaa
 */
public class Finestra2 extends Finestra {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructs a new `Finestra2` object with the default constructor of its
	 * superclass.
	 */
	public Finestra2() {
		super();
	}

	/**
	 * Constructs a new `Finestra2` object with the specified title.
	 *
	 * @param titolo the title of the window
	 */
	public Finestra2(String titolo) {
		super(titolo);
	}

	/**
	 * Prints the specified text followed by a newline character.
	 *
	 * @param txt the text to be printed
	 */
	public void println(String txt) {
		print(txt + "\n");
	}

	/**
	 * Prints the specified integer value as a string.
	 *
	 * @param x the integer value to be printed
	 */
	public void print(int x) {
		print("" + x);
	}
}
