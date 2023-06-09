package esempio02;

/**
 * The Animale class represents an animal and provides methods for getting
 * information about the animal, such as its name, sound, movement, and habitat.
 * 
 * @author michelemazzaa
 */
public abstract class Animale {
	private String mioNome;
	protected String verso;

	/**
	 * Constructs an Animale object with the specified name.
	 * 
	 * @param s The name of the animal as a String.
	 */
	protected Animale(String s) {
		mioNome = s;
	}

	/**
	 * Gets the movement of the animal.
	 * 
	 * @return A String representing the movement of the animal.
	 */
	public abstract String siMuove();

	/**
	 * Gets the habitat of the animal.
	 * 
	 * @return A String representing the habitat of the animal.
	 */
	public abstract String vive();

	/**
	 * Gets the name of the animal.
	 * 
	 * @return A String representing the name of the animal.
	 */
	public abstract String nome();

	/**
	 * Prints out a description of the animal, including its name, sound, movement,
	 * and habitat.
	 */
	public void mostra() {
		System.out.println(mioNome + ", " + nome() + ", " + verso + ", si muove " + siMuove() + " e vive " + vive());
	}
}
