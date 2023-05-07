package esempio2;

/**
 * The AnimaleMarino class represents a marine animal and extends the
 * AnimaleAcquatico class. It provides methods for getting information about the
 * animal, such as its name, sound, movement, and habitat.
 * 
 * @author michelemazzaa
 */
public abstract class AnimaleMarino extends AnimaleAcquatico {

	/**
	 * Constructs an AnimaleMarino object with the specified name.
	 * 
	 * @param s The name of the animal as a String.
	 */
	protected AnimaleMarino(String s) {
		super(s);
	}

	/**
	 * Gets the habitat of the animal, which is in the sea.
	 * 
	 * @return A String representing the habitat of the animal.
	 */
	@Override
	public String vive() {
		return "in mare";
	}

	/**
	 * Gets the name of the animal as a marine animal.
	 * 
	 * @return A String representing the name of the animal as a marine animal.
	 */
	@Override
	public String nome() {
		return "un animale marino";
	}

}
