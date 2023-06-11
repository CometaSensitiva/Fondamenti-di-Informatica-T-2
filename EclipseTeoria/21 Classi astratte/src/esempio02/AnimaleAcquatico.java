package esempio02;

/**
 * 
 * The abstract class representing an aquatic animal, extending the base class
 * "Animale".
 * 
 * @author michelemazzaa
 */
public abstract class AnimaleAcquatico extends Animale {

	/**
	 * 
	 * Constructor to initialize the name of the aquatic animal.
	 * 
	 * @param name the name of the aquatic animal.
	 */
	protected AnimaleAcquatico(String name) {
		super(name);
	}

	/**
	 * 
	 * Returns the location where the aquatic animal lives.
	 * 
	 * @return a String representing the location where the aquatic animal lives,
	 *         i.e. "in water".
	 */
	@Override
	public String vive() {
		return "in water";
	}

	/**
	 * 
	 * Returns the name of the aquatic animal.
	 * 
	 * @return a String representing the name of the aquatic animal, i.e. "an
	 *         aquatic animal".
	 */
	@Override
	public String nome() {
		return "an aquatic animal";
	}
}