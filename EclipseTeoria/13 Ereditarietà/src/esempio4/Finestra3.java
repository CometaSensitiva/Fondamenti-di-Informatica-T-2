package esempio4;

/**
 * The Finestra3 class is a subclass of Finestra2 and inherits its properties
 * and methods. It overrides the print method to print the string in uppercase
 * format.
 * 
 * @author michelemazzaa
 */
public class Finestra3 extends Finestra2 {

	/**
	 * The serialVersionUID is a universal version identifier for a Serializable
	 * class.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructs a new Finestra3 object with default values.
	 */
	public Finestra3() {
		super();
	}

	/**
	 * Constructs a new Finestra3 object with the given title.
	 * 
	 * @param titolo the title of the window
	 */
	public Finestra3(String titolo) {
		super(titolo);
	}

	/**
	 * Prints the given string in uppercase format by calling the superclass's print
	 * method.
	 * 
	 * @param txt the string to be printed
	 */
	@Override
	public void print(String txt) {
		super.print(txt.toUpperCase());
	}
}
