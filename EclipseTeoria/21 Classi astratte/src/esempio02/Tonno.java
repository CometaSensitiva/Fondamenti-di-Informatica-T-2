package esempio02;

/**
 * The Tonno class represents a tuna fish and extends the PesceDiMare class. It
 * provides methods for getting information about the fish, such as its name,
 * sound, movement, and habitat.
 * 
 * @author michelemazzaa
 */
public class Tonno extends PesceDiMare {

	/**
	 * Constructs a Tonno object with the specified name.
	 * 
	 * @param s The name of the tuna fish as a String.
	 */
	public Tonno(String s) {
		super(s);
		verso = "fa blub blub";
	}

	/**
	 * Gets the name of the fish as a tuna fish.
	 * 
	 * @return A String representing the name of the fish as a tuna fish.
	 */
	@Override
	public String nome() {
		return "un tonno";
	}

}
