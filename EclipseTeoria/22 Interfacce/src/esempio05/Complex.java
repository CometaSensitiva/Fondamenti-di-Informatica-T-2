package esempio05;

/**
 * 
 * The Complex interface represents a complex number and provides arithmetic
 * operations for complex numbers.
 * 
 * @author michelemazzaa
 */
public interface Complex {

	/**
	 * 
	 * Returns a new Complex instance with the specified real and imaginary parts.
	 * 
	 * @param realPart the real part of the complex number
	 * @param imPart   the imaginary part of the complex number
	 * @return a new Complex instance with the specified real and imaginary parts
	 */
	public static Complex of(double realPart, double imPart) {
		return new ImplComplex(realPart, imPart);
	}

	/**
	 * Returns a Complex number with the specified real part and 0 as imaginary
	 * part.
	 * 
	 * @param realPart the real part of the Complex number
	 * @return the Complex number with the specified real part
	 */
	public static Complex of(double realPart) {
		return new ImplComplex(realPart);
	}

	/**
	 * Returns a Complex number with 0 as both real and imaginary part.
	 * 
	 * @return the Complex number with 0 as both real and imaginary part
	 */
	public static Complex of() {
		return new ImplComplex();
	}

	/**
	 * 
	 * Returns the real part of this complex number.
	 * 
	 * @return the real part of this complex number
	 */
	public double getRealPart();

	/**
	 * 
	 * Returns the imaginary part of this complex number.
	 * 
	 * @return the imaginary part of this complex number
	 */
	public double getImPart();

	/**
	 * 
	 * Returns a new Complex instance that is the sum of this complex number and the
	 * specified complex number.
	 * 
	 * @param that the complex number to be added
	 * @return a new Complex instance that is the sum of this complex number and the
	 *         specified complex number
	 */
	public Complex sum(Complex that);

	/**
	 * 
	 * Returns a new Complex instance that is the difference between this complex
	 * number and the specified complex number.
	 * 
	 * @param that the complex number to be subtracted
	 * @return a new Complex instance that is the difference between this complex
	 *         number and the specified complex number
	 */
	public Complex sub(Complex that);

	/**
	 * 
	 * Returns a new Complex instance that is the product of this complex number and
	 * the specified complex number.
	 * 
	 * @param that the complex number to be multiplied
	 * @return a new Complex instance that is the product of this complex number and
	 *         the specified complex number
	 */
	public Complex mul(Complex that);

	/**
	 * 
	 * Returns a new Complex instance that is the quotient of this complex number
	 * and the specified complex number.
	 * 
	 * @param that the complex number to be divided
	 * @return a new Complex instance that is the quotient of this complex number
	 *         and the specified complex number
	 */
	public Complex div(Complex that);

	/**
	 * 
	 * Returns a new Complex instance that is the conjugate of this complex number.
	 * 
	 * @return a new Complex instance that is the conjugate of this complex number
	 */
	public Complex cgt(Complex z);

	/**
	 * 
	 * Returns a new Complex instance that is the quotient of this complex number
	 * and the specified factor.
	 * 
	 * @param x the factor to be divided
	 * @return a new Complex instance that is the quotient of this complex number
	 *         and the specified factor
	 */
	public Complex divByFactor(double x);

	/**
	 * 
	 * Returns the squared modulus of this complex number.
	 * 
	 * @return the squared modulus of this complex number
	 */
	public double squaredModule();

	/**
	 * 
	 * Returns a string representation of this complex number.
	 * 
	 * @return a string representation of this complex number
	 */
	public String toString();
}
