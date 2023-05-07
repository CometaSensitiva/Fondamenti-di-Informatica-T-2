/**
 * The Frazione class represents a fraction, with instance methods for managing
 * its state and performing operations. Fractions are represented by two
 * integers, the numerator and the denominator. The class provides two
 * constructors, one taking two arguments to set both the numerator and the
 * denominator, and another taking a single argument to set only the numerator
 * (with denominator defaulting to 1).
 * 
 * Example usage: Frazione f1 = new Frazione(3, 4); // creates a fraction 3/4
 * Frazione f2 = new Frazione(2); // creates a fraction 2/1 (equivalent to the
 * integer 2)
 * 
 * @author michelemazzaa
 */
public class Frazione {

	/** The numerator of the fraction. */
	private int num;
	/** The denominator of the fraction. */
	private int den;

	/**
	 * Creates a new Frazione instance with the specified numerator and denominator.
	 * 
	 * @param n The numerator of the fraction.
	 * @param d The denominator of the fraction.
	 */
	public Frazione(int n, int d) {
		num = n;
		den = d;
	}

	/**
	 * Creates a new Frazione instance with the specified numerator and a
	 * denominator of 1.
	 * 
	 * @param n The numerator of the fraction.
	 */
	public Frazione(int n) {
		num = n;
		den = 1;
	}

	/**
	 * Initializes the fraction with the specified numerator and denominator. This
	 * method is obsolete since the class provides constructors that can set the
	 * state.
	 * 
	 * @param n The numerator of the fraction.
	 * @param d The denominator of the fraction.
	 */
	public void init(int n, int d) {
		num = n;
		den = d;
	}

	/**
	 * Retrieves the numerator of the fraction.
	 *
	 * @return The numerator of the fraction.
	 */
	public int getNum() {
		return num;
	}

	/**
	 * Retrieves the denominator of the fraction.
	 *
	 * @return The denominator of the fraction.
	 */
	public int getDen() {
		return den;
	}

	/**
	 * Checks whether this fraction is equal to another fraction.
	 *
	 * @param f2 The other fraction to compare to.
	 * @return true if the two fractions are equal, false otherwise.
	 */
	public boolean equals(Frazione f2) {
		if (num == f2.num && den == f2.den) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Returns a new fraction that is reduced to lowest terms.
	 *
	 * @return A new fraction that is reduced to lowest terms.
	 */
	public Frazione minTerm() {
		int mcd = mcd(num, den);
		int reducedNum = num / mcd;
		int reducedDen = den / mcd;
		return new Frazione(reducedNum, reducedDen);
	}

	/**
	 * Private recursive method to find the greatest common divisor of two numbers.
	 *
	 * @param a The first number.
	 * @param b The second number.
	 * @return The greatest common divisor of the two numbers.
	 */
	private int mcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return (mcd(b, a % b));
		}
	}
}
