package esempio05;

/**
 * This class represents a triangle, implementing the {@link Shape} and
 * {@link Triangle} interfaces. It has three sides of double type and three
 * angles of double type, one opposite each side.
 * 
 * @see Shape
 * @see Triangle
 * 
 * @author michelemazzaa
 */
public class ImplTriangle implements Shape, Triangle {

	private double side1; // the length of the first side of the triangle
	private double side2; // the length of the second side of the triangle
	private double side3; // the length of the third side of the triangle
	private double angleOppositeSide1 = -1; // the angle opposite to the first side of the triangle, initialized to -1
	private double angleOppositeSide2 = -1; // the angle opposite to the second side of the triangle, initialized to -1
	private double angleOppositeSide3 = -1; // the angle opposite to the third side of the triangle, initialized to -1

	/**
	 * Constructs a triangle with the specified side lengths, if possible.
	 * 
	 * @param side1 The length of the first side of the triangle.
	 * @param side2 The length of the second side of the triangle.
	 * @param side3 The length of the third side of the triangle.
	 * @throws ImpossibleTriangleException If it's not possible to construct a
	 *                                     triangle with the specified side lengths.
	 * @throws IllegalArgumentException    If any side length is non-positive.
	 * @see ImpossibleTriangleException
	 * @see IllegalArgumentException
	 */
	public ImplTriangle(double side1, double side2, double side3) throws ImpossibleTriangleException {
		if (!(side1 < side2 + side3 && side2 < side1 + side3 && side3 < side1 + side2))
			throw new ImpossibleTriangleException("Cannot construct a triangle with the specified side lengths.");
		if (!(side1 > 0 && side2 > 0 && side3 > 0)) {
			throw new IllegalArgumentException("Cannot construct a triangle with the specified side lengths.");
		}

		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	/**
	 * Returns the length of the first side of the triangle.
	 * 
	 * @return the length of the first side of the triangle.
	 */
	@Override
	public double getSide1() {
		return side1;
	}

	/**
	 * Returns the length of the second side of the triangle.
	 * 
	 * @return the length of the second side of the triangle.
	 */
	@Override
	public double getSide2() {
		return side2;
	}

	/**
	 * Returns the length of the third side of the triangle.
	 * 
	 * @return the length of the third side of the triangle.
	 */
	@Override
	public double getSide3() {
		return side3;
	}

	/**
	 * Calculates and returns the angle opposite to side 1 of the triangle.
	 * 
	 * @return the angle opposite to side 1 of the triangle.
	 */
	@Override
	public double getAngleOppositeSide1() {
		if (angleOppositeSide1 == -1)
			angleOppositeSide1 = (Math
					.acos((-(getSide1() * getSide1()) + (getSide2() * getSide2()) + (getSide3() * getSide3()))
							/ (2 * getSide2() * getSide3())));
		return angleOppositeSide1;
	}

	/**
	 * Calculates and returns the angle opposite to side 2 of the triangle.
	 * 
	 * @return the angle opposite to side 2 of the triangle.
	 */
	@Override
	public double getAngleOppositeSide2() {
		if (angleOppositeSide2 == -1)
			angleOppositeSide2 = Math.PI - (getAngleOppositeSide1() + getAngleOppositeSide3());
		return angleOppositeSide2;

	}

	/**
	 * Calculates and returns the angle opposite to side 3 of the triangle.
	 * 
	 * @return the angle opposite to side 3 of the triangle.
	 */
	@Override
	public double getAngleOppositeSide3() {
		if (angleOppositeSide3 == -1)
			angleOppositeSide3 = (Math
					.acos((-(getSide3() * getSide3()) + (getSide1() * getSide1()) + (getSide2() * getSide2()))
							/ (2 * getSide1() * getSide2())));
		return angleOppositeSide3;
	}

	/**
	 * Calculates and returns the height drawn from the vertex opposite to side 1 of
	 * the triangle.
	 * 
	 * @return the height drawn from the vertex opposite to side 1 of the triangle.
	 */
	@Override
	public double getHeight1() {
		return getSide2() * Math.sin(getAngleOppositeSide3());
	}

	/**
	 * Calculates and returns the height drawn from the vertex opposite to side 2 of
	 * the triangle.
	 * 
	 * @return the height drawn from the vertex opposite to side 2 of the triangle.
	 */
	@Override
	public double getHeight2() {
		return getSide1() * Math.sin(getAngleOppositeSide3());
	}

	/**
	 * Calculates and returns the height drawn from the vertex opposite to side 3 of
	 * the triangle.
	 * 
	 * @return the height drawn from the vertex opposite to side 3 of the triangle.
	 */
	@Override
	public double getHeight3() {
		return getSide2() * Math.sin(getAngleOppositeSide1());
	}

	/**
	 * Calculates and returns the area of the triangle.
	 * 
	 * @return the area of the triangle.
	 */
	@Override
	public double getArea() {
		double s = getPerimeter() / 2;
		return Math.sqrt(s * (s - getSide1()) * (s - getSide2()) * (s - getSide3()));
	}

	/**
	 * Calculates and returns the perimeter of the triangle.
	 * 
	 * @return the perimeter of the triangle.
	 */
	@Override
	public double getPerimeter() {
		return getSide1() + getSide2() + getSide3();
	}

	/**
	 * Returns the name of the triangle.
	 * 
	 * @return the name of the triangle.
	 */
	@Override
	public String getName() {
		return "A Triangle";
	}

	/**
	 * Returns a string representation of the triangle object.
	 *
	 * @return a string representation of the triangle object.
	 */
	@Override
	public String toString() {
		return String.format(
				"%s [\nside1 = %.2f, side2 = %.2f, side3 = %.2f\nangle opposite side1 = %.2f°, angle opposite side2 = %.2f°, angle opposite side3 = %.2f°\nheight from side1 = %.2f, height from side2 = %.2f, height from side3 = %.2f\narea = %.2f\nperimeter = %.2f \n]",
				getName(), getSide1(), getSide2(), getSide3(), Math.toDegrees(getAngleOppositeSide1()),
				Math.toDegrees(getAngleOppositeSide2()), Math.toDegrees(getAngleOppositeSide3()), getHeight1(),
				getHeight2(), getHeight3(), getArea(), getPerimeter());
	}

}
