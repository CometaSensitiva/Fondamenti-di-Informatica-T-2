package esempio3;

/**
 * 
 * This interface represents a quadrilateral shape with four sides and four
 * angles.
 * 
 * It extends the Shape interface and provides methods for retrieving properties
 * of the quadrilateral.
 * 
 * @author michelemazzaa
 */
public interface Quadrilateral extends Shape {

	/**
	 * 
	 * Creates a new instance of Quadrilateral with the given side lengths and
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
	public static Quadrilateral of(double a, double b, double c, double d, double angleDAB, double angleABC,
			double angleBCD, double angleCDA) {
		return new ImplQuadrilateral(a, b, c, d, angleDAB, angleABC, angleBCD, angleCDA);
	}

	/**
	 * 
	 * Creates a new instance of a concave Quadrilateral with the given side lengths
	 * and angle.
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
	public static Quadrilateral ofConcave(double a, double b, double c, double d, double angleCDA) {
		return new ImplQuadrilateral(a, b, c, d, angleCDA);
	}

	/**
	 * 
	 * Returns the length of the first side of the quadrilateral.
	 * 
	 * @return the length of the first side of the quadrilateral.
	 */
	public double getSide1();

	/**
	 * 
	 * Returns the length of the second side of the quadrilateral.
	 * 
	 * @return the length of the second side of the quadrilateral.
	 */
	public double getSide2();

	/**
	 * 
	 * Returns the length of the third side of the quadrilateral.
	 * 
	 * @return the length of the third side of the quadrilateral.
	 */
	public double getSide3();

	/**
	 * 
	 * Returns the length of the fourth side of the quadrilateral.
	 * 
	 * @return the length of the fourth side of the quadrilateral.
	 */
	public double getSide4();

	/**
	 * 
	 * Calculates and returns the length of the first diagonal of the quadrilateral.
	 * 
	 * @return The length of the first diagonal of the quadrilateral.
	 */
	public double getDiagonal1();

	/**
	 * 
	 * Calculates and returns the length of the second diagonal of the
	 * quadrilateral.
	 * 
	 * @return The length of the second diagonal of the quadrilateral.
	 */
	public double getDiagonal2();

	/**
	 * 
	 * Returns the measure of angle DAB.
	 * 
	 * @return the measure of angle DAB
	 */
	public double getAngle1();

	/**
	 * 
	 * Returns the measure of angle ABC.
	 * 
	 * @return the measure of angle ABC
	 */
	public double getAngle2();

	/**
	 * 
	 * Returns the measure of angle BCD.
	 * 
	 * @return the measure of angle BCD
	 */
	public double getAngle3();

	/**
	 * 
	 * Returns the measure of angle CDA.
	 * 
	 * @return the measure of angle CDA
	 */
	public double getAngle4();

	/**
	 * 
	 * Checks if the quadrilateral is concave or not.
	 * 
	 * @return true if the quadrilateral is concave, false otherwise.
	 */
	public boolean isConcave();

	/**
	 * 
	 * Checks if the quadrilateral is convex or not.
	 * 
	 * @return true if the quadrilateral is convex, false otherwise.
	 */
	public boolean isConvex();

}
