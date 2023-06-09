package esempio03;

/**
 * 
 * The Triangle interface represents a geometric {@link Shape} with three sides.
 * 
 * @see Shape
 * 
 * @author michelemazzaa
 */
public interface Triangle extends Shape {

	/**
	 * 
	 * Creates a new instance of Triangle with the given side lengths.
	 * 
	 * @param side1 The length of side 1 as a double.
	 * @param side2 The length of side 2 as a double.
	 * @param side3 The length of side 3 as a double.
	 * @return A new instance of Triangle.
	 */
	public static Triangle of(double side1, double side2, double side3) {
		return new ImplTriangle(side1, side2, side3);
	}

	/**
	 * 
	 * Returns the length of side 1 of the Triangle.
	 * 
	 * @return The length of side 1 as a double.
	 */
	public double getSide1();

	/**
	 * 
	 * Returns the length of side 2 of the Triangle.
	 * 
	 * @return The length of side 2 as a double.
	 */
	public double getSide2();

	/**
	 * 
	 * Returns the length of side 3 of the Triangle.
	 * 
	 * @return The length of side 3 as a double.
	 */
	public double getSide3();

	/**
	 * 
	 * Returns the angle opposite side 1 of the Triangle.
	 * 
	 * @return The angle opposite side 1 as a double.
	 */
	public double getAngleOppositeSide1();

	/**
	 * 
	 * Returns the angle opposite side 2 of the Triangle.
	 * 
	 * @return The angle opposite side 2 as a double.
	 */
	public double getAngleOppositeSide2();

	/**
	 * 
	 * Returns the angle opposite side 3 of the Triangle.
	 * 
	 * @return The angle opposite side 3 as a double.
	 */
	public double getAngleOppositeSide3();

	/**
	 * 
	 * Returns the height of the Triangle corresponding to side 1.
	 * 
	 * @return The height corresponding to side 1 as a double.
	 */
	public double getHeight1();

	/**
	 * 
	 * Returns the height of the Triangle corresponding to side 2.
	 * 
	 * @return The height corresponding to side 2 as a double.
	 */
	public double getHeight2();

	/**
	 * 
	 * Returns the height of the Triangle corresponding to side 3.
	 * 
	 * @return The height corresponding to side 3 as a double.
	 */
	public double getHeight3();
}