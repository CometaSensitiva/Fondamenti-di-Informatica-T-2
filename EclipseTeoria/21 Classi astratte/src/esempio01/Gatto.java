package esempio01;

/**
 * This class represents a Gatto, which is a type of AnimaleTerrestre that moves
 * by jumping.
 * 
 * @author michelemazzaa
 */
public class Gatto extends AnimaleTerrestre {

	/**
	 * Returns a String representing the way this Gatto moves, which is by jumping.
	 *
	 * @return a String representing the way this Gatto moves
	 */
	@Override
	public String siMuove() {
		return "saltando";
	}

}
