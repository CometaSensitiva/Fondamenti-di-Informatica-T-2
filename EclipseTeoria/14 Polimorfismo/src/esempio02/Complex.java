package esempio02;

/*
 * This class represents a complex number with a real part and an imaginary part.
 * 
 * @author michelemazzaa
 */

public class Complex {

	/**
	 * 
	 * The real part of the complex number.
	 */
	private float realPart;
	/**
	 * 
	 * The imaginary part of the complex number.
	 */
	private float imPart;

	/**
	 * 
	 * Returns the real part of the complex number.
	 * 
	 * @return The real part of the complex number.
	 */
	public float getRealPart() {
		return realPart;
	}

	/**
	 * 
	 * Sets the real part of the complex number.
	 * 
	 * @param realPart The new real part to set.
	 */
	protected void setRealPart(float realPart) {
		this.realPart = realPart;
	}

	/**
	 * 
	 * Returns the imaginary part of the complex number.
	 * 
	 * @return The imaginary part of the complex number.
	 */
	public float getImPart() {
		return imPart;
	}

	/**
	 * 
	 * Sets the imaginary part of the complex number.
	 * 
	 * @param imPart The new imaginary part to set.
	 */
	protected void setImPart(float imPart) {
		this.imPart = imPart;
	}

	/**
	 * 
	 * Constructs a new Complex object with the given real and imaginary parts.
	 * 
	 * @param realPart The real part of the complex number.
	 * @param imPart   The imaginary part of the complex number.
	 */
	public Complex(float realPart, float imPart) {
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
	public Complex sum(Complex that) {
		return new Complex(getRealPart() + that.getRealPart(), getImPart() + that.getImPart());
	}

	/**
	 * 
	 * Returns the complex number obtained by subtracting another complex number
	 * from this complex number.
	 * 
	 * @param that The complex number to subtract.
	 * @return The complex number obtained by subtracting the two complex numbers.
	 */
	public Complex sub(Complex that) {
		return new Complex(getRealPart() - that.getRealPart(), getImPart() - that.getImPart());
	}

	/**
	 * 
	 * Returns the complex number obtained by multiplying another complex number to
	 * this complex number.
	 * 
	 * @param that The complex number to multiply.
	 * @return The complex number obtained by multiplying the two complex numbers.
	 */
	public Complex mul(Complex that) {
		return new Complex(getRealPart() * that.getRealPart() - getImPart() * that.getImPart(),
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
	public Complex div(Complex that) {
// Multiply by the complex conjugate of 'that', then divide by the squared module of 'that'
		return mul(cgt(that)).divByFactor(that.squaredModule());
	}

	/**
	 * 
	 * Returns the complex conjugate of this complex number.
	 * 
	 * @param z The complex number to compute the conjugate of.
	 * @return The complex conjugate of this complex number.
	 */
	public Complex cgt(Complex z) {
		return new Complex(getRealPart(), -getImPart());
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
	public Complex divByFactor(float x) {
		return new Complex(getRealPart() / x, getImPart() / x);
	}

	/**
	 * 
	 * Returns the squared module of this complex number.
	 * 
	 * @return The squared module of this complex number.
	 */
	public float squaredModule() {
		return getRealPart() * getRealPart() + getImPart() * getImPart();
	}

	/**
	 * 
	 * Returns a string representation of this complex number.
	 * 
	 * @return A string representation of this complex number.
	 */
	public String toString() {
		return "" + getRealPart() + "+i" + getImPart();
	}
}
