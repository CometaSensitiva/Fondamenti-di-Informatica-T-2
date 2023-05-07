package esempio3;

/**
 * 
 * The IsoscelesTriangle interface represents a geometric {@link Triangle} with
 * two equal sides and two equal angles.
 * 
 * @see Triangle
 * 
 * @author michelemazzaa
 */
public interface IsoscelesTriangle extends Triangle {

	/**
	 * 
	 * Creates a new instance of an IsoscelesTriangle with the specified base and
	 * sides.
	 * 
	 * @param base  The length of the base of the IsoscelesTriangle.
	 * @param sides The length of the two equal sides of the IsoscelesTriangle.
	 * @return A new instance of an IsoscelesTriangle with the specified base and
	 *         sides.
	 */
	public static IsoscelesTriangle of(double base, double sides) {
		return new ImplIsoscelesTriangle(base, sides);
	}

	/**
	 * 
	 * Returns the length of the base of this IsoscelesTriangle.
	 * 
	 * @return The length of the base of this IsoscelesTriangle.
	 */
	public double getBase();

	/**
	 * 
	 * Returns the length of the equal sides of this IsoscelesTriangle.
	 * 
	 * @return The length of the equal sides of this IsoscelesTriangle.
	 */
	public double getSide();
}
