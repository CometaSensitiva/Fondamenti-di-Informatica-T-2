package esempio4;

/**
 * 
 * The Real interface represents a real number and extends the Complex interface
 * to provide arithmetic operations for real numbers.
 * 
 * @author michelemazzaa
 */
public interface Real extends Complex {

	/**
	 * 
	 * Returns a new Real instance with the specified value.
	 * 
	 * @param x the value of the real number
	 * @return a new Real instance with the specified value
	 */
	public static Real of(double x) {
		return new ImplReal(x);
	}

	/**
	 * 
	 * Returns a new Real instance that is the sum of this real number and the
	 * specified real number.
	 * 
	 * @param x the real number to be added
	 * @return a new Real instance that is the sum of this real number and the
	 *         specified real number
	 */
	public Real sum(Real x);

	/**
	 * 
	 * Returns a new Real instance that is the difference between this real number
	 * and the specified real number.
	 * 
	 * @param x the real number to be subtracted
	 * @return a new Real instance that is the difference between this real number
	 *         and the specified real number
	 */
	public Real sub(Real x);

	/**
	 * 
	 * Returns a new Real instance that is the product of this real number and the
	 * specified real number.
	 * 
	 * @param x the real number to be multiplied
	 * @return a new Real instance that is the product of this real number and the
	 *         specified real number
	 */
	public Real mul(Real x);

	/**
	 * 
	 * Returns a new Real instance that is the quotient of this real number and the
	 * specified real number.
	 * 
	 * @param x the real number to be divided
	 * @return a new Real instance that is the quotient of this real number and the
	 *         specified real number
	 */
	public Real div(Real x);

	/**
	 * 
	 * Returns a string representation of this real number.
	 * 
	 * @return a string representation of this real number
	 */
	public String toString();
}
