package esempio03;

/**
 * This class represents an implementation of an IsoscelesTriangle which is a
 * type of triangle with two equal sides. It extends the {@link ImplTriangle}
 * class and implements the {@link IsoscelesTriangle} interface.
 *
 * @see ImplTriangle
 * @see IsoscelesTriangle
 * 
 * @author michelemazzaa
 */
public class ImplIsoscelesTriangle extends ImplTriangle implements IsoscelesTriangle {

	/**
	 * Constructs an instance of an IsoscelesTriangle with the given base and two
	 * equal sides.
	 *
	 * @param base  The length of the base of the IsoscelesTriangle.
	 * @param sides The length of the two equal sides of the IsoscelesTriangle.
	 */
	public ImplIsoscelesTriangle(double base, double sides) {
		super(base, sides, sides);
	}

	/**
	 * Returns the length of the base of the IsoscelesTriangle.
	 *
	 * @return The length of the base of the IsoscelesTriangle.
	 */
	@Override
	public double getBase() {
		return getSide1();
	}

	/**
	 * Returns the length of the two equal sides of the IsoscelesTriangle.
	 *
	 * @return The length of the two equal sides of the IsoscelesTriangle.
	 */
	@Override
	public double getSide() {
		return getSide2();
	}

	/**
	 * Returns the name of the IsoscelesTriangle.
	 *
	 * @return The name of the IsoscelesTriangle.
	 */
	@Override
	public String getName() {
		return "An Isosceles Triangle";
	}

	/**
	 * Returns a String representation of the IsoscelesTriangle, including the
	 * lengths of its sides, the measures of its angles, its area, and its
	 * perimeter.
	 *
	 * @return A String representation of the IsoscelesTriangle.
	 */
	@Override
	public String toString() {
		return String.format(
				"%s [\nbase = %.2f, sides = %.2f\nangle opposite base = %.2f°, angle opposite sides = %.2f°\nheight from base = %.2f, height from sides = %.2f\narea = %.2f\nperimeter = %.2f\n]",
				getName(), getBase(), getSide(), Math.toDegrees(getAngleOppositeSide1()),
				Math.toDegrees(getAngleOppositeSide3()), getHeight1(), getHeight2(), getArea(), getPerimeter());
	}

}
