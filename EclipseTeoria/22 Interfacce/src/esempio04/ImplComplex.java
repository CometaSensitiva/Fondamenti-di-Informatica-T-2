package esempio04;

/**
 * This class represents a complex number with a real part and an imaginary
 * part.
 * 
 * @author michelemazzaa
 */

public class ImplComplex implements Complex {

	/**
	 * 
	 * The real part of the complex number.
	 */
	private double realPart;
	/**
	 * 
	 * The imaginary part of the complex number.
	 */
	private double imPart;

	/**
	 * 
	 * Returns the real part of the complex number.
	 * 
	 * @return The real part of the complex number.
	 */
	@Override
	public double getRealPart() {
		return realPart;
	}

	/**
	 * 
	 * Sets the real part of the complex number.
	 * 
	 * @param realPart The new real part to set.
	 */
	protected void setRealPart(Double realPart) {
		this.realPart = realPart;
	}

	/**
	 * 
	 * Returns the imaginary part of the complex number.
	 * 
	 * @return The imaginary part of the complex number.
	 */
	@Override
	public double getImPart() {
		return imPart;
	}

	/**
	 * 
	 * Sets the imaginary part of the complex number.
	 * 
	 * @param imPart The new imaginary part to set.
	 */
	protected void setImPart(double imPart) {
		this.imPart = imPart;
	}

	/**
	 * 
	 * Constructs a new Complex object with the given real and imaginary parts.
	 * 
	 * @param realPart The real part of the complex number.
	 * @param imPart   The imaginary part of the complex number.
	 */
	public ImplComplex(double realPart, double imPart) {
		setRealPart(realPart);
		setImPart(imPart);
	}

	/**
	 * 
	 * Returns the complex number obtained by adding another complex number to this
	 * complex number.
	 * 
	 * @param that The complex number to add.
	 * @return The complex number obtained by adding the two complex numbers.
	 */
	@Override
	public Complex sum(Complex that) {
		return new ImplComplex(getRealPart() + that.getRealPart(), getImPart() + that.getImPart());
	}

	/**
	 * 
	 * Returns the complex number obtained by subtracting another complex number
	 * from this complex number.
	 * 
	 * @param that The complex number to subtract.
	 * @return The complex number obtained by subtracting the two complex numbers.
	 */
	@Override
	public Complex sub(Complex that) {
		return new ImplComplex(getRealPart() - that.getRealPart(), getImPart() - that.getImPart());
	}

	/**
	 * 
	 * Returns the complex number obtained by multiplying another complex number to
	 * this complex number.
	 * 
	 * @param that The complex number to multiply.
	 * @return The complex number obtained by multiplying the two complex numbers.
	 */
	@Override
	public Complex mul(Complex that) {
		return new ImplComplex(getRealPart() * that.getRealPart() - getImPart() * that.getImPart(),
				getImPart() * that.getRealPart() + getRealPart() * that.getImPart());
	}

	/**
	 * 
	 * Returns the complex number obtained by dividing this complex number by
	 * another complex number.
	 * 
	 * @param that The complex number to divide by.
	 * @return The complex number obtained by dividing the two complex numbers.
	 */
	@Override
	public Complex div(Complex that) {
		// Multiply by the complex conjugate of 'that', then divide by the squared
		// module of 'that'
		return mul(cgt(that)).divByFactor(that.squaredModule());
	}

	/**
	 * 
	 * Returns the complex conjugate of this complex number.
	 * 
	 * @param z The complex number to compute the conjugate of.
	 * @return The complex conjugate of this complex number.
	 */
	@Override
	public Complex cgt(Complex z) {
		return new ImplComplex(getRealPart(), -getImPart());
	}

	/**
	 * 
	 * Returns a new complex number obtained by dividing this complex number by a
	 * factor.
	 * 
	 * @param x The factor to divide by.
	 * @return The new complex number obtained by dividing this complex number by
	 *         'x'.
	 */
	@Override
	public Complex divByFactor(double x) {
		return new ImplComplex(getRealPart() / x, getImPart() / x);
	}

	/**
	 * 
	 * Returns the squared module of this complex number.
	 * 
	 * @return The squared module of this complex number.
	 */
	@Override
	public double squaredModule() {
		return getRealPart() * getRealPart() + getImPart() * getImPart();
	}

	/**
	 * 
	 * Returns a string representation of this complex number.
	 * 
	 * @return A string representation of this complex number.
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		double re = getRealPart();
		double im = getImPart();
		if (re != 0) {
			sb.append(re);
		}
		if (im != 0) {
			if (im > 0 && re != 0) {
				sb.append("+");
			}
			if (im == -1) {
				sb.append("-");
			} else if (im != 1) {
				sb.append(im);
			}
			sb.append("i");
		}
		if (sb.length() == 0) {
			sb.append("0");
		}
		return sb.toString();
	}

}
