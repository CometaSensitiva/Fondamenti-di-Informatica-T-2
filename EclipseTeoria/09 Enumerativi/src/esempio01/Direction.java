package esempio01;

/**
 * An enumeration representing cardinal directions, with their corresponding
 * degree values. Each direction has a name and a degree value associated with
 * it.
 * 
 * @author michelemazzaa
 */
public enum Direction {

	/**
	 * The cardinal direction North.
	 */
	NORTH("Nord", 0),

	/**
	 * The cardinal direction South.
	 */
	SOUTH("Sud", 180),

	/**
	 * The cardinal direction East.
	 */
	EAST("Est", 90),

	/**
	 * The cardinal direction West.
	 */
	WEST("Ovest", 270);

	private String value; // the name of the direction
	private int degrees; // the degree value associated with the direction

	/**
	 * Constructor for Direction enum.
	 * 
	 * @param value   the name of the direction
	 * @param degrees the degree value associated with the direction
	 */
	private Direction(String value, int degrees) {
		this.value = value;
		this.degrees = degrees;
	}

	/**
	 * Returns the opposite direction of the current direction.
	 * 
	 * @return the opposite direction of the current direction
	 */
	public Direction getOpposite() {
		switch (this) {
		case NORTH:
			return SOUTH;
		case SOUTH:
			return NORTH;
		case EAST:
			return WEST;
		case WEST:
			return EAST;
		default:
			return null;
		}
	}

	/**
	 * Returns a string representation of the direction.
	 * 
	 * @return a string representation of the direction, in the format: "{direction
	 *         name} a {degree value}°"
	 */
	public String toString() {
		return value + " a " + degrees + "°";
	}
}
