package esempio3;

/**
 * 
 * This interface represents a right triangle that extends the {@link Triangle}
 * interface.
 * 
 * It provides methods to retrieve the lengths of the two legs and the
 * hypotenuse of the triangle.
 * 
 * @see Triangle
 * 
 * @author michelemazzaa
 */
public interface RightTriangle extends Triangle {

	/**
	 * 
	 * Returns a new instance of {@link RightTriangle} with the specified lengths of
	 * its legs.
	 * 
	 * @param leg1 the length of the first leg
	 * @param leg2 the length of the second leg
	 * @return a new instance of {@link RightTriangle} with the specified leg
	 *         lengths.
	 */
	public static RightTriangle of(double leg1, double leg2) {
		return new ImplRightTriangle(leg1, leg2);
	}

	/**
	 * 
	 * Returns the length of the shorter leg of the right triangle.
	 * 
	 * @return the length of the shorter leg of the right triangle.
	 */
	public double getShorterLeg();

	/**
	 * 
	 * Returns the length of the longer leg of the right triangle.
	 * 
	 * @return the length of the longer leg of the right triangle.
	 */
	public double getLongerLeg();

	/**
	 * 
	 * Returns the length of the hypotenuse of the right triangle.
	 * 
	 * @return the length of the hypotenuse of the right triangle.
	 */
	public double getHypotenuse();
}