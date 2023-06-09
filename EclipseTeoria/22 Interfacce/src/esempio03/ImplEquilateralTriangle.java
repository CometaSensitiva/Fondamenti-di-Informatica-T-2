package esempio03;

/**
 * Implementation of an equilateral triangle, which is a special case of an
 * isosceles triangle where all sides are equal. This class extends the
 * implementation of {@link ImplIsoscelesTriangle} and implements the
 * {@link EquilateralTriangle} interface.
 * 
 * @see ImplIsoscelesTriangle
 * @see EquilateralTriangle
 * 
 * @author michelemazzaa
 */
public class ImplEquilateralTriangle extends ImplIsoscelesTriangle implements EquilateralTriangle {

	/**
	 * Constructor for an equilateral triangle with a given side length.
	 * 
	 * @param side the length of all sides of the equilateral triangle
	 */
	public ImplEquilateralTriangle(double side) {
		super(side, side);
	}

	/**
	 * Returns the length of the sides of the equilateral triangle.
	 * 
	 * @return the length of the sides of the equilateral triangle
	 */
	public double getSide() {
		return getSide1();
	}

	/**
	 * Returns the height of the equilateral triangle, which is equal to the length
	 * of the altitude from any vertex to the opposite side.
	 * 
	 * @return the height of the equilateral triangle
	 */
	public double getHeight() {
		return getHeight1();
	}

	@Override
	public String getName() {
		return "An Equilateral Triangle";
	}

	/**
	 * Returns a string representation of the equilateral triangle, including its
	 * sides, angles, area, and perimeter.
	 * 
	 * @return a string representation of the equilateral triangle
	 */
	@Override
	public String toString() {
		return String.format(
				"%s [\nsides = %.2f\nangles opposite sides = %.2f°\nheights = %.2f\narea = %.2f\nperimeter = %.2f\n]",
				getName(), getSide(), Math.toDegrees(getAngleOppositeSide3()), getHeight(), getArea(), getPerimeter());
	}

}
