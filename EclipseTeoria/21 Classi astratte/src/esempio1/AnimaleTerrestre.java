package esempio1;

/**
 * This is an abstract class representing a terrestrial animal that moves on
 * land.
 * 
 * @author michelemazzaa
 */
public abstract class AnimaleTerrestre extends Animale {

	/**
	 * This method must be implemented by any concrete subclass to specify how the
	 * animal moves on land.
	 *
	 * @return a string representing the movement of the animal on land
	 */
	public abstract String siMuove();

	/**
	 * This method is implemented from the parent abstract class to specify that the
	 * animal lives on land.
	 *
	 * @return a string representing that the animal lives on land
	 */
	@Override
	public String vive() {
		return "Sulla terra ferma";
	}
}
