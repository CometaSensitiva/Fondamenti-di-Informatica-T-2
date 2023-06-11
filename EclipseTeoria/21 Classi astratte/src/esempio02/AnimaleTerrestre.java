package esempio02;

/**
 * The AnimaleTerrestre class represents a land animal and extends the Animale
 * class. It provides methods for getting information about the animal, such as
 * its name, sound, movement, and habitat.
 * 
 * @author michelemazzaa
 */
public abstract class AnimaleTerrestre extends Animale {

	/**
	 * Constructs an AnimaleTerrestre object with the specified name.
	 * 
	 * @param s The name of the animal as a String.
	 */
	protected AnimaleTerrestre(String s) {
		super(s);
	}

	/**
	 * Gets the habitat of the animal, which is on land.
	 * 
	 * @return A String representing the habitat of the animal.
	 */
	@Override
	public String vive() {
		return "sulla terra ferma";
	}

	/**
	 * Gets the name of the animal as a land animal.
	 * 
	 * @return A String representing the name of the animal as a land animal.
	 */
	@Override
	public String nome() {
		return "un animale terrestre";
	}

}
