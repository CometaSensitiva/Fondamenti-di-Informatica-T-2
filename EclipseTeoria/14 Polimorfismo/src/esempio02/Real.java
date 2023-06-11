package esempio02;

/**
 * 
 * This class represents a real number as a special case of a complex number
 * with zero imaginary part.
 * 
 * @author michelemazzaa
 */
public class Real extends Complex {

	/**
	 * 
	 * Constructs a new real number with the specified value.
	 * 
	 * @param x The value of the real number.
	 */
	public Real(float x) {
		super(x, 0);
	}

	/**
	 * 
	 * Returns the sum of this real number and another real number.
	 * 
	 * @param that The other real number to add to this one.
	 * @return The sum of this real number and 'that'.
	 */
	public Real sum(Real that) {
		return new Real(getRealPart() + that.getRealPart());
	}

	/**
	 * 
	 * Returns the difference of this real number and another real number.
	 * 
	 * @param that The other real number to subtract from this one.
	 * @return The difference of this real number and 'that'.
	 */
	public Real sub(Real that) {
		return new Real(getRealPart() - that.getRealPart());
	}

	/**
	 * 
	 * Returns the product of this real number and another real number.
	 * 
	 * @param that The other real number to multiply this one by.
	 * @return The product of this real number and 'that'.
	 */
	public Real mul(Real that) {
		return new Real(getRealPart() * that.getRealPart());
	}

	/**
	 * 
	 * Returns the quotient of this real number and another real number.
	 * 
	 * @param that The other real number to divide this one by.
	 * @return The quotient of this real number and 'that'.
	 */
	public Real div(Real that) {
		return new Real(getRealPart() / that.getRealPart());
	}

	/**
	 * 
	 * Returns a string representation of this real number.
	 * 
	 * @return A string representation of this real number.
	 */
	public String toString() {
		return "" + getRealPart();
	}
}
