package esempio05;

/**
 * 
 * The ImplReal class represents an implementation of the Real interface for
 * representing real numbers.
 * 
 * @author michelemazzaa
 */
public class ImplReal implements Real {

// The real part of the number.
	protected double re;

	/**
	 * 
	 * Constructs a new ImplReal instance with the specified value.
	 * 
	 * @param x the value of the real number
	 */
	public ImplReal(double x) {
		re = x;
	}

	/**
	 * Constructs a new ImplReal object with real part initialized to 0.
	 */
	public ImplReal() {
		re = 0;
	}

	/**
	 * 
	 * Returns the real part of this real number.
	 * 
	 * @return the real part of this real number
	 */
	@Override
	public double getRealPart() {
		return this.re;
	}

	/**
	 * 
	 * Returns the imaginary part of this real number, which is always zero.
	 * 
	 * @return the imaginary part of this real number, which is always zero
	 */
	@Override
	public double getImPart() {
		return 0;
	}

	/**
	 * 
	 * Returns a new Complex instance that is the sum of this real number and the
	 * specified complex number.
	 * 
	 * @param z the complex number to be added
	 * @return a new Complex instance that is the sum of this real number and the
	 *         specified complex number
	 */
	@Override
	public Complex sum(Complex z) {
		return new ImplComplex(re + z.getRealPart(), z.getImPart());
	}

	/**
	 * 
	 * Returns a new Complex instance that is the difference between this real
	 * number and the specified complex number.
	 * 
	 * @param z the complex number to be subtracted
	 * @return a new Complex instance that is the difference between this real
	 *         number and the specified complex number
	 */
	@Override
	public Complex sub(Complex z) {
		return new ImplComplex(re - z.getRealPart(), z.getImPart());
	}

	/**
	 * 
	 * Returns a new Complex instance that is the product of this real number and
	 * the specified complex number.
	 * 
	 * @param z the complex number to be multiplied
	 * @return a new Complex instance that is the product of this real number and
	 *         the specified complex number
	 */
	@Override
	public Complex mul(Complex z) {
		return new ImplComplex(re * z.getRealPart(), re * z.getImPart());
	}

	/**
	 * 
	 * Returns a new Complex instance that is the quotient of this real number and
	 * the specified complex number.
	 * 
	 * @param z the complex number to be divided
	 * @return a new Complex instance that is the quotient of this real number and
	 *         the specified complex number
	 */
	@Override
	public Complex div(Complex z) {
		return new ImplComplex(re / z.getRealPart(), re / z.getImPart());
	}

	/**
	 * 
	 * Returns this complex number, since a real number is always greater than or
	 * equal to itself.
	 * 
	 * @return this complex number
	 */
	public Complex cgt() {
		return this;
	}

	/**
	 * 
	 * Returns this complex number, since a real number is always greater than or
	 * equal to itself.
	 * 
	 * @param z the complex number to be compared
	 * @return this complex number
	 */
	@Override
	public Complex cgt(Complex z) {
		return this;
	}

	/**
	 * 
	 * Returns a new Complex instance that is the quotient of this real number and
	 * the specified factor.
	 * 
	 * @param x the factor to be divided
	 * @return a new Complex instance that is the quotient of this real number and
	 *         the specified factor
	 */
	@Override
	public Complex divByFactor(double x) {
		return new ImplReal(re / x);
	}

	/**
	 * Calculates the squared module of the complex number.
	 * 
	 * @return The squared module of the complex number.
	 */
	@Override
	public double squaredModule() {
		return getRealPart() * getRealPart() + getImPart() * getImPart();
	}

	/**
	 * Returns a new Real number representing the sum of this Real number and
	 * another Real number.
	 * 
	 * @param x The other Real number.
	 * @return A new Real number representing the sum of this Real number and
	 *         another Real number.
	 */
	@Override
	public Real sum(Real x) {
		return new ImplReal(getRealPart() + x.getRealPart());
	}

	/**
	 * Returns a new Real number representing the subtraction of this Real number
	 * and another Real number.
	 * 
	 * @param x The other Real number.
	 * @return A new Real number representing the subtraction of this Real number
	 *         and another Real number.
	 */
	@Override
	public Real sub(Real x) {
		return new ImplReal(getRealPart() - x.getRealPart());
	}

	/**
	 * Returns a new Real number representing the multiplication of this Real number
	 * and another Real number.
	 * 
	 * @param x The other Real number.
	 * @return A new Real number representing the multiplication of this Real number
	 *         and another Real number.
	 */
	@Override
	public Real mul(Real x) {
		return new ImplReal(getRealPart() * x.getRealPart());
	}

	/**
	 * Returns a new Real number representing the division of this Real number by
	 * another Real number.
	 * 
	 * @param x The other Real number.
	 * @return A new Real number representing the division of this Real number by
	 *         another Real number.
	 */
	@Override
	public Real div(Real x) {
		return new ImplReal(getRealPart() / x.getRealPart());

	}

	@Override
	public String toString() {
		return Double.toString(re);
	}
}
