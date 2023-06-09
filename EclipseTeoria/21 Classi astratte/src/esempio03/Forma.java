package esempio03;

/**
 * An abstract class representing a geometric shape.
 * 
 * @author michelemazzaa
 */
public abstract class Forma {

	/**
	 * Calculates the area of the shape.
	 *
	 * @return the area of the shape
	 */
	public abstract double area();

	/**
	 * Calculates the perimeter of the shape.
	 *
	 * @return the perimeter of the shape
	 */
	public abstract double perimetro();

	/**
	 * Gets the name of the shape.
	 *
	 * @return the name of the shape
	 */
	public abstract String nome();

	/**
	 * Returns a string representation of the shape.
	 *
	 * @return a string representation of the shape
	 */
	@Override
	public String toString() {
		return nome() + " di area " + area() + " e perimetro " + perimetro();
	}
}
