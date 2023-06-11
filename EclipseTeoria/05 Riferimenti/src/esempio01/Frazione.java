package esempio01;
/**
 * A class representing a fraction.
 * 
 * Fractions are represented by their numerator and denominator. The denominator
 * is always kept positive and the fraction is reduced to its lowest terms.
 * 
 * @author michelemazzaa
 */
public class Frazione {
	private int num, den;

	/**
	 * Constructs a fraction with the given numerator and denominator.
	 * 
	 * If the denominator is negative, both the numerator and the denominator are
	 * negated. The fraction is then reduced to its lowest terms.
	 * 
	 * @param num the numerator of the fraction
	 * @param den the denominator of the fraction
	 */
	public Frazione(int num, int den) {
		if (den < 0) {
			this.num = -num;
			this.den = -den;
		} else {
			this.num = num;
			this.den = den;
		}
		this.reduceToLowestTerms();
	}

	/**
	 * Constructs a fraction with the given numerator and a denominator of 1.
	 * 
	 * @param num the numerator of the fraction
	 */
	public Frazione(int num) {
		this(num, 1);
	}

	/**
	 * Constructs a fraction equal to 1.
	 */
	public Frazione() {
		this(1, 1);
	}

	/**
	 * Returns the numerator of the fraction.
	 * 
	 * @return the numerator of the fraction
	 */
	public int getNum() {
		return this.num;
	}

	/**
	 * Returns the denominator of the fraction.
	 * 
	 * @return the denominator of the fraction
	 */
	public int getDen() {
		return this.den;
	}

	/**
	 * Returns a new fraction equal to this fraction reduced to lowest terms.
	 * 
	 * @return a new fraction equal to this fraction reduced to lowest terms
	 */
	public Frazione minTerm() {
		int mcd = mcd(this.getNum(), this.getDen());
		int num = this.getNum() / mcd;
		int den = this.getDen() / mcd;
		return new Frazione(num, den);
	}

	/**
	 * Determines whether this fraction is equal to the given fraction.
	 * 
	 * Fractions are considered equal if their cross products are equal.
	 * 
	 * @param that the fraction to compare to this fraction
	 * @return true if the two fractions are equal, false otherwise
	 */
	public boolean equals(Frazione that) {
		return (this.getNum() * that.getDen()) == (that.getNum() * this.getDen());
	}

	/**
	 * Computes the greatest common divisor of two integers using Euclid's
	 * algorithm.
	 * 
	 * This method is used to reduce fractions to lowest terms.
	 * 
	 * @param a the first integer
	 * @param b the second integer
	 * @return the greatest common divisor of a and b
	 */
	private int mcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return mcd(b, a % b);
		}
	}

	/**
	 * Reduces this fraction to its lowest terms.
	 */
	private void reduceToLowestTerms() {
		int mcd = mcd(this.getNum(), this.getDen());
		this.num = this.getNum() / mcd;
		this.den = this.getDen() / mcd;
	}
}
