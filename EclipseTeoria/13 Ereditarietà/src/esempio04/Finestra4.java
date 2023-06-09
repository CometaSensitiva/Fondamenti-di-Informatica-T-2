package esempio04;

// import java.awt.Font;

/**
 * This class represents a window that extends from the class Finestra2. It
 * provides a constructor with no arguments, and another one that takes a String
 * as a parameter.
 *
 * @author michelemazzaa
 */
public class Finestra4 extends Finestra2 {

	/**
	 * The serialVersionUID is a universal version identifier for a Serializable
	 * class.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructs a new Finestra4 object with no title.
	 */
	public Finestra4() {
		super(); // Calls the superclass constructor with no arguments.
	}

	/**
	 * Constructs a new Finestra4 object with the specified title.
	 *
	 * @param titolo a String that represents the title of the window.
	 */
	public Finestra4(String titolo) {
		super(titolo); // Calls the superclass constructor with the specified title.
		// Note: The commented code below seems to be incomplete and might cause
		// compilation errors.
		// super("Finestra 4" + titolo);
		// ta.setFont(font);
	}
}
