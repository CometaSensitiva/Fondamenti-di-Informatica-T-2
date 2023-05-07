package esempio2;

/**
 * The Punto class represents a point in a two-dimensional plane. The class
 * provides methods for getting the x and y coordinates of the point.
 * 
 * @author michelemazzaa
 */
public class Punto {

	// The x and y coordinates of the point
	private double x;
	private double y;

	/**
	 * Constructs and initializes a point with the specified x and y coordinates.
	 * 
	 * @param x the x coordinate of the point
	 * @param y the y coordinate of the point
	 */
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Returns the x coordinate of the point.
	 * 
	 * @return the x coordinate of the point
	 */
	public double getX() {
		return x;
	}

	/**
	 * Returns the y coordinate of the point.
	 * 
	 * @return the y coordinate of the point
	 */
	public double getY() {
		return y;
	}

	/**
	 * Returns a string representation of the point. The string representation is in
	 * the form (x,y), where x and y are the coordinates of the point.
	 * 
	 * @return a string representation of the point
	 */
	@Override
	public String toString() {
		String sPunto = "(" + x + "," + y + ")";
		return sPunto;
	}
}
