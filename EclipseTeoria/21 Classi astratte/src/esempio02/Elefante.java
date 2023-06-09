package esempio02;

/**
 * This class represents an elephant, which is a type of land animal. It extends
 * the abstract class AnimaleTerrestre and inherits its behavior.
 * 
 * @author michelemazzaa
 */
public class Elefante extends AnimaleTerrestre {

	/**
	 * Constructs a new instance of an elephant with the given name.
	 *
	 * @param s the name of the elephant
	 */
	public Elefante(String s) {
		super(s);
		verso = "fa rum rum"; // set the sound of the elephant
	}

	/**
	 * Returns the movement of the elephant, which is by walking.
	 *
	 * @return the movement of the elephant
	 */
	@Override
	public String siMuove() {
		return "camminando";
	}
}
