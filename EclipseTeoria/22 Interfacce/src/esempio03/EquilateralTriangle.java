package esempio03;

/**
 * The TriangleEquilateral interface represents an equilateral triangle, which
 * is a special case of an {@link IsoscelesTriangle} where all three sides are
 * of equal length.
 * 
 * @see IsoscelesTriangle
 * 
 * @author michelemazzaa
 */
public interface EquilateralTriangle extends IsoscelesTriangle {

	/**
	 * Returns a new instance of the TriangleEquilateral interface with the given
	 * side length.
	 *
	 * @param side The length of all sides of the equilateral triangle
	 * @return A new instance of the TriangleEquilateral interface
	 */
	public static EquilateralTriangle of(double side) {
		return new ImplEquilateralTriangle(side);
	}

	/**
	 * Returns the length of all sides of the equilateral triangle.
	 *
	 * @return The length of all sides of the equilateral triangle
	 */
	public double getSide();

	/**
	 * Returns the height of the equilateral triangle, which is the perpendicular
	 * distance from any vertex to the opposite side.
	 *
	 * @return The height of the equilateral triangle
	 */
	public double getHeight();
}
