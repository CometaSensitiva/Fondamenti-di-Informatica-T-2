package esempio2;

/**
 * This class represents a shark, which is a type of sea fish. It extends the
 * abstract class PesceDiMare and inherits its behavior.
 * 
 * @author michelemazzaa
 */
public class Squalo extends PesceDiMare {

	/**
	 * Constructs a new instance of a shark with the given name.
	 *
	 * @param s the name of the shark
	 */
	public Squalo(String s) {
		super(s);
		verso = "fa splash splash"; // set the sound of the shark
	}

	/**
	 * Returns the name of the shark.
	 *
	 * @return the name of the shark
	 */
	@Override
	public String nome() {
		return "uno squalo";
	}
}
