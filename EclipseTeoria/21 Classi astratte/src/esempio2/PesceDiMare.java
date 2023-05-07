package esempio2;

/**
 * The PesceDiMare class represents a sea fish and extends the AnimaleMarino
 * class. It provides methods for getting information about the fish, such as
 * its name, sound, movement, and habitat.
 * 
 * @author michelemazzaa
 */
public abstract class PesceDiMare extends AnimaleMarino {

	/**
	 * Constructs a PesceDiMare object with the specified name.
	 * 
	 * @param s The name of the fish as a String.
	 */
	public PesceDiMare(String s) {
		super(s);
		verso = "non fa versi";
	}

	/**
	 * Gets the name of the fish as a sea fish.
	 * 
	 * @return A String representing the name of the fish as a sea fish.
	 */
	@Override
	public String nome() {
		return "un pesce di mare";
	}

	/**
	 * Gets the movement of the fish, which is swimming.
	 * 
	 * @return A String representing the movement of the fish.
	 */
	@Override
	public String siMuove() {
		return "nuotando";
	}

}
