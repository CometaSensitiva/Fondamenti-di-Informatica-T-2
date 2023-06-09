package esempio05;

/**
 * 
 * The Shape interface represents a geometric shape.
 * 
 * @author michelemazzaa
 */
public interface Shape {

	/**
	 * 
	 * Calculates the area of the shape.
	 * 
	 * @return The area of the shape as a double.
	 */
	public double getArea();

	/**
	 * 
	 * Calculates the perimeter of the shape.
	 * 
	 * @return The perimeter of the shape as a double.
	 */
	public double getPerimeter();

	/**
	 * 
	 * Gets the name of the shape.
	 * 
	 * @return The name of the shape as a String.
	 */
	public String getName();

	/**
	 * 
	 * Returns a string representation of the shape.
	 * 
	 * @return A string representation of the shape as a String.
	 */
	public String toString();
}