package esempio03;

/**
 * This class extends the implementation of {@link ImplTriangle}, and represents
 * implementation of a {@link RightTriangle}, which is a type of triangle where
 * one angle is a right angle (90 degrees).
 * 
 * @see ImplTriangle
 * @see RightTriangle
 * 
 * @author michelemazzaa
 */
public class ImplRightTriangle extends ImplTriangle implements RightTriangle {

	/**
	 * Constructs an instance of a right triangle with the given length of the two
	 * sides (legs) and calculates the length of the hypotenuse using the
	 * Pythagorean theorem.
	 * 
	 * @param leg1 the length of the first side (leg) of the right triangle
	 * @param leg2 the length of the second side (leg) of the right triangle
	 */
	public ImplRightTriangle(double leg1, double leg2) {
		super(leg1, leg2, Math.sqrt((leg1 * leg1) + (leg2 * leg2)));
	}

	/**
	 * Returns the length of the minor catete of the rectangular triangle.
	 * 
	 * @return the length of the minor catete of the rectangular triangle.
	 */
	public double getShorterLeg() {
		if (getSide1() < getSide2()) {
			return getSide1();
		} else {
			return getSide2();
		}
	}

	/**
	 * Returns the length of the greater catete of the rectangular triangle.
	 * 
	 * @return the length of the greater catet of the rectangular triangle.
	 */
	public double getLongerLeg() {
		if (getSide1() > getSide2()) {
			return getSide1();
		} else {
			return getSide2();
		}
	}

	/**
	 * Returns the length of the hypotenuse of the right triangle.
	 * 
	 * @return the length of the hypotenuse of the right triangle
	 */
	public double getHypotenuse() {
		return getSide3();
	}

	/**
	 * Returns the name of the right triangle.
	 * 
	 * @return the name of the right triangle
	 */
	@Override
	public String getName() {
		return "A Right Triangle";
	}

	/**
	 * Returns a string representation of the right triangle, including its sides,
	 * angles, area, and perimeter.
	 * 
	 * @return a string representation of the equilateral triangle
	 */
	@Override
	public String toString() {
		return String.format(
				"%s [\nshorter leg = %.2f, longer leg = %.2f, hypotenuse = %.2f\nangle opposite shorter leg = %.2f°, angle opposite longer leg  = %.2f°, angle opposite hypotenuse  = %.2f°\nheight from hypotenuse = %.2f\narea = %.2f\nperimeter = %.2f\n]",
				getName(), getShorterLeg(), getLongerLeg(), getHypotenuse(), Math.toDegrees(getAngleOppositeSide1()),
				Math.toDegrees(getAngleOppositeSide2()), Math.toDegrees(getAngleOppositeSide3()), getHeight3(),
				getArea(), getPerimeter());
	}

}
