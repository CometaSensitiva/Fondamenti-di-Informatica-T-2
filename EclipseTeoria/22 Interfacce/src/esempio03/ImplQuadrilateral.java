package esempio03;

/**
 * This class represents a quadrilateral shape with four sides and four angles.
 * It implements both the Quadrilateral and Shape interfaces.
 * 
 * @author michelemazzaa
 */
public class ImplQuadrilateral implements Quadrilateral, Shape {

	// The length of the four sides of the quadrilateral
	public double a, b, c, d;

	// The four angles of the quadrilateral in radians
	public double angleDAB, angleABC, angleBCD, angleCDA;

	/**
	 * Constructs a new ImplQuadrilateral object with the given side lengths and
	 * angles.
	 * 
	 * @param a        the length of side a
	 * @param b        the length of side b
	 * @param c        the length of side c
	 * @param d        the length of side d
	 * @param angleDAB the angle between sides DAB in radians
	 * @param angleABC the angle between sides ABC in radians
	 * @param angleBCD the angle between sides BCD in radians
	 * @param angleCDA the angle between sides CDA in radians
	 * 
	 * @throws IllegalArgumentException if the given parameters do not form a valid
	 *                                  quadrilateral
	 */
	public ImplQuadrilateral(double a, double b, double c, double d, double angleDAB, double angleABC, double angleBCD,
			double angleCDA) throws IllegalArgumentException {

		if (isValidQuadrilateral(a, b, c, d, angleDAB, angleABC, angleBCD, angleCDA)) {
			this.a = a;
			this.b = b;
			this.c = c;
			this.d = d;
			this.angleDAB = angleDAB;
			this.angleABC = angleABC;
			this.angleBCD = angleBCD;
			this.angleCDA = angleCDA;
		} else {
			throw new IllegalArgumentException("Cannot construct a quadrilateral with the specified arguments");
		}
	}

	/**
	 * Constructs a new ImplQuadrilateral object with the given side lengths and an
	 * angle. The remaining angles are computed based on the angle sum property of
	 * quadrilaterals.
	 * 
	 * @param a        the length of side a
	 * @param b        the length of side b
	 * @param c        the length of side c
	 * @param d        the length of side d
	 * @param angleCDA the angle between sides CDA in radians
	 * 
	 * @throws IllegalArgumentException if the given parameters do not form a valid
	 *                                  quadrilateral
	 */
	public ImplQuadrilateral(double a, double b, double c, double d, double angleCDA) throws IllegalArgumentException {

		if (arePositiveSides(a, b, c, d) && isValidTriangleInequality(a, b, c, d) && isValidAngle(angleCDA)) {
			this.a = a;
			this.b = b;
			this.c = c;
			this.d = d;
			this.angleCDA = angleCDA;
			this.angleDAB = getAngle1();
			this.angleABC = getAngle2();
			this.angleBCD = getAngle3();
		} else {
			throw new IllegalArgumentException("Cannot construct a quadrilateral with the specified arguments");
		}
	}

	/**
	 * 
	 * This method checks if an angle is valid for a quadrilateral.
	 * 
	 * @param angleCDA the angle to be checked
	 * @return true if the angle is valid (greater than 0 and less than PI), false
	 *         otherwise
	 */
	public boolean isValidAngle(double angleCDA) {
		return angleCDA > 0 && angleCDA < Math.PI;
	}

	/**
	 * 
	 * This method checks if a set of sides and angles can form a valid
	 * quadrilateral.
	 * 
	 * @param a        the length of the first side
	 * @param b        the length of the second side
	 * @param c        the length of the third side
	 * @param d        the length of the fourth side
	 * @param angleDAB the angle between the first and second sides
	 * @param angleABC the angle between the second and third sides
	 * @param angleBCD the angle between the third and fourth sides
	 * @param angleCDA the angle between the fourth and first sides
	 * @return true if the set of sides and angles can form a valid quadrilateral,
	 *         false otherwise
	 */
	public boolean isValidQuadrilateral(double a, double b, double c, double d, double angleDAB, double angleABC,
			double angleBCD, double angleCDA) {
		return arePositiveSides(a, b, c, d) && isValidTriangleInequality(a, b, c, d)
				&& !areValidAngles(angleDAB, angleABC, angleBCD, angleCDA);
	}

	/**
	 * 
	 * This method checks if all given side lengths are positive.
	 * 
	 * @param a the length of the first side
	 * @param b the length of the second side
	 * @param c the length of the third side
	 * @param d the length of the fourth side
	 * @return true if all side lengths are positive, false otherwise
	 */
	public boolean arePositiveSides(double a, double b, double c, double d) {
		return a > 0 && b > 0 && c > 0 && d > 0;
	}

	/**
	 * 
	 * This method checks if a set of sides can form a valid quadrilateral according
	 * to the triangle inequality.
	 * 
	 * @param a the length of the first side
	 * @param b the length of the second side
	 * @param c the length of the third side
	 * @param d the length of the fourth side
	 * @return true if the set of sides can form a valid quadrilateral, false
	 *         otherwise
	 */
	public boolean isValidTriangleInequality(double a, double b, double c, double d) {
		return a < b + c + d && b < a + c + d && c < a + b + d && d < a + b + c;
	}

	/**
	 * 
	 * This method checks if a set of angles are valid for a quadrilateral.
	 * 
	 * @param angleDAB the angle between the first and second sides
	 * @param angleABC the angle between the second and third sides
	 * @param angleBCD the angle between the third and fourth sides
	 * @param angleCDA the angle between the fourth and first sides
	 * @return true if all angles are valid (less than PI and the sum of all angles
	 *         is less than 2 * PI), false otherwise
	 */
	public boolean areValidAngles(double angleDAB, double angleABC, double angleBCD, double angleCDA) {
		return (angleDAB < Math.PI && angleABC < Math.PI && angleBCD < Math.PI && angleCDA < Math.PI)
				&& (angleDAB + angleABC + angleBCD + angleCDA) < 2 * Math.PI;
	}

	/**
	 * 
	 * Calculates the area of the quadrilateral by dividing it into two triangles.
	 * 
	 * @return the area of the quadrilateral.
	 */
	@Override
	public double getArea() {
		Triangle temp1 = Triangle.of(getSide1(), getSide2(), getDiagonal2());
		Triangle temp2 = Triangle.of(getDiagonal2(), getSide3(), getSide4());
		return (temp1.getArea() + temp2.getArea());
	}

	/**
	 * 
	 * Calculates the perimeter of the quadrilateral by summing up all of its sides.
	 * 
	 * @return the perimeter of the quadrilateral.
	 */
	@Override
	public double getPerimeter() {
		return getSide1() + getSide2() + getSide3() + getSide4();
	}

	/**
	 * 
	 * Returns the name of the shape.
	 * 
	 * @return the name of the shape.
	 */
	@Override
	public String getName() {
		return "A quadrilateral";
	}

	/**
	 * 
	 * Returns the length of the first side of the quadrilateral.
	 * 
	 * @return the length of the first side of the quadrilateral.
	 */
	@Override
	public double getSide1() {
		return a;
	}

	/**
	 * 
	 * Returns the length of the second side of the quadrilateral.
	 * 
	 * @return the length of the second side of the quadrilateral.
	 */
	@Override
	public double getSide2() {
		return b;
	}

	/**
	 * 
	 * Returns the length of the third side of the quadrilateral.
	 * 
	 * @return the length of the third side of the quadrilateral.
	 */
	@Override
	public double getSide3() {
		return c;
	}

	/**
	 * 
	 * Returns the length of the fourth side of the quadrilateral.
	 * 
	 * @return the length of the fourth side of the quadrilateral.
	 */
	@Override
	public double getSide4() {
		return d;
	}

	/**
	 * 
	 * Calculates and returns the length of the first diagonal of the quadrilateral.
	 * 
	 * @return The length of the first diagonal of the quadrilateral.
	 */
	@Override
	public double getDiagonal1() {
		return Math.sqrt((getSide1() * getSide1())
				+ (getSide4() * getSide4() - 2 * (getSide1() * getSide4() * Math.cos(getAngle1()))));
	}

	/**
	 * 
	 * Calculates and returns the length of the second diagonal of the
	 * quadrilateral.
	 * 
	 * @return The length of the second diagonal of the quadrilateral.
	 */
	@Override
	public double getDiagonal2() {
		return Math.sqrt((getSide3() * getSide3())
				+ (getSide4() * getSide4() - 2 * (getSide3() * getSide4() * Math.cos(getAngle4()))));
	}

	/**
	 * 
	 * Calculates and returns the value of the first angle of the quadrilateral. If
	 * the angle value is not initialized, it calculates it and returns it.
	 * 
	 * @return The value of the first angle of the quadrilateral.
	 */
	@Override
	public double getAngle1() {
		if (angleDAB == -1) {
			Triangle temp1 = Triangle.of(getSide1(), getSide2(), getDiagonal2());
			Triangle temp2 = Triangle.of(getDiagonal2(), getSide3(), getSide4());
			angleDAB = temp1.getAngleOppositeSide2() + temp2.getAngleOppositeSide2();
		}
		return angleDAB;
	}

	/**
	 * 
	 * Calculates and returns the value of the second angle of the quadrilateral. If
	 * the angle value is not initialized, it calculates it and returns it.
	 * 
	 * @return The value of the second angle of the quadrilateral.
	 */
	@Override
	public double getAngle2() {
		if (angleABC == -1) {
			Triangle temp = Triangle.of(getSide1(), getSide2(), getDiagonal2());
			angleABC = temp.getAngleOppositeSide3();
		}
		return angleABC;
	}

	/**
	 * 
	 * Calculates and returns the value of the third angle of the quadrilateral. If
	 * the angle value is not initialized, it calculates it and returns it.
	 * 
	 * @return The value of the third angle of the quadrilateral.
	 */
	@Override
	public double getAngle3() {
		if (angleBCD == -1) {
			angleBCD = 2 * Math.PI - (getAngle1() + getAngle2() + getAngle4());
		}
		return angleBCD;
	}

	/**
	 * 
	 * Returns the value of the fourth angle of the quadrilateral.
	 * 
	 * @return The value of the fourth angle of the quadrilateral.
	 */
	@Override
	public double getAngle4() {
		return angleCDA;
	}

	/**
	 * 
	 * Checks if the quadrilateral is concave or not.
	 * 
	 * @return true if the quadrilateral is concave, false otherwise.
	 */
	@Override
	public boolean isConcave() {
		return getAngle1() > Math.PI || getAngle2() > Math.PI || getAngle3() > Math.PI || getAngle4() > Math.PI;
	}

	/**
	 * 
	 * Checks if the quadrilateral is convex or not.
	 * 
	 * @return true if the quadrilateral is convex, false otherwise.
	 */
	@Override
	public boolean isConvex() {
		return getAngle1() < Math.PI && getAngle2() < Math.PI && getAngle3() < Math.PI && getAngle4() < Math.PI;
	}
}
