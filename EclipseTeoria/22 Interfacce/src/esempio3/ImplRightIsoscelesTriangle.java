package esempio3;

/**
 * This class extends the implementation of {@link ImplRightTriangle}, and
 * represents implementation of a {@link RightIsoscelesTriangle}, which is a
 * triangle with two equal sides and a right angle opposite the hypotenuse.
 * 
 * @see ImplRightTriangle
 * @see RightIsoscelesTriangle
 * 
 * @author michelemazzaa
 */
public class ImplRightIsoscelesTriangle extends ImplRightTriangle implements RightIsoscelesTriangle {

	/**
	 * Constructs a right isosceles triangle with the given length for both sides.
	 * 
	 * @param sideLength the length of the sides of the right isosceles triangle
	 */
	public ImplRightIsoscelesTriangle(double sideLength) {
		super(sideLength, sideLength);
	}

	/**
	 * Returns the length of the base of the right isosceles triangle, which is the
	 * same as the length of the first side.
	 * 
	 * @return the length of the base of the right isosceles triangle
	 */
	public double getBase() {
		return getSide1();
	}

	/**
	 * Returns the length of the two equal sides of the right isosceles triangle,
	 * which is the same as the length of the second side.
	 * 
	 * @return the length of the two equal sides of the right isosceles triangle
	 */
	public double getSide() {
		return getSide2();
	}

	/**
	 * Returns the name of the right isosceles triangle.
	 * 
	 * @return the name of the right isosceles triangle
	 */
	@Override
	public String getName() {
		return "A Right Isosceles Triangle";
	}

	/**
	 * Returns a string representation of the right isosceles triangle, including
	 * the lengths of its sides, the measures of its angles, its area, and its
	 * perimeter.
	 * 
	 * @return a string representation of the right isosceles triangle
	 */
	@Override
	public String toString() {
		return String.format(
				"%s [\nequal sides = %.2f, hypotenuse = %.2f\nangles opposite equals sides = %.2f°, angle opposite hypotenuse  = %.2f°\nheight from hypotenuse = %.2f\narea = %.2f\nperimeter = %.2f\n]",
				getName(), getSide(), getHypotenuse(), Math.toDegrees(getAngleOppositeSide1()),
				Math.toDegrees(getAngleOppositeSide3()), getHeight3(), getArea(), getPerimeter());
	}
}
