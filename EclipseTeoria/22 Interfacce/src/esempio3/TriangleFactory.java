package esempio3;

import java.util.Arrays;

/**
 * This interface represents a factory for creating different types of triangles
 * based on the lengths of their sides.
 * 
 * @author michelemazzaa
 */
public interface TriangleFactory {

	/**
	 * Creates a triangle object with the specified side lengths.
	 * 
	 * @param side1 the length of the first side
	 * @param side2 the length of the second side
	 * @param side3 the length of the third side
	 * @return a triangle object
	 * @throws IllegalArgumentException if any of the side lengths is not positive
	 */
	public static Triangle of(double side1, double side2, double side3) {
		if (!isPositive(side1, side2, side3)) {
			throw new IllegalArgumentException("Side lengths must be positive.");
		}

		if (isEquilateral(side1, side2, side3)) {
			return EquilateralTriangle.of(side1);
		}

		double[] sides = { side1, side2, side3 };
		Arrays.sort(sides);

		if (isRightTriangle(sides[0], sides[1], sides[2])) {
			if (isIsosceles(sides[0], sides[1])) {
				return RightIsoscelesTriangle.of(sides[0]);
			}
			return RightTriangle.of(sides[0], sides[1]);
		}

		if (isIsosceles(sides[0], sides[1]) || isIsosceles(sides[1], sides[2])) {
			double base = sides[2];
			double sidesLength = sides[0] == sides[1] ? sides[0] : sides[1];
			return IsoscelesTriangle.of(base, sidesLength);
		}

		return Triangle.of(sides[0], sides[1], sides[2]);
	}

	/**
	 * Verifies that all side lengths are positive.
	 */
	private static boolean isPositive(double side1, double side2, double side3) {
		return side1 > 0 && side2 > 0 && side3 > 0;
	}

	/**
	 * Verifies if the triangle is equilateral.
	 */
	private static boolean isEquilateral(double side1, double side2, double side3) {
		return approxEquals(side1, side2) && approxEquals(side2, side3);
	}

	/**
	 * Verifies if the triangle is a right triangle.
	 */
	private static boolean isRightTriangle(double side1, double side2, double side3) {
		return approxEquals(Math.pow(side1, 2) + Math.pow(side2, 2), Math.pow(side3, 2));
	}

	/**
	 * Verifies if the triangle is isosceles.
	 */
	private static boolean isIsosceles(double side1, double side2) {
		return approxEquals(side1, side2);
	}

	/**
	 * Verifies if two double values are approximately equal, with a tolerance given
	 * by epsilon.
	 */
	private static boolean approxEquals(double a, double b) {
		double epsilon = 0.0001;
		return Math.abs(a - b) < epsilon;
	}
}
