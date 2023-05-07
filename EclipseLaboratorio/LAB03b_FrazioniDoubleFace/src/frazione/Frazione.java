package frazione;

import util.*;

/**
 * The Frazione class represents a fraction with a numerator and denominator.
 * 
 * @author michelemazzaa
 */
public class Frazione {
	private int num;
	private int den;

	/**
	 * Constructs a new Frazione object with the given numerator and denominator.
	 * 
	 * @param num the numerator of the fraction
	 * @param den the denominator of the fraction
	 */
	public Frazione(int num, int den) {
		boolean negativo = num * den < 0;
		this.num = negativo ? -Math.abs(num) : Math.abs(num);
		this.den = Math.abs(den);
	}

	/**
	 * Constructs a new Frazione object with the given numerator and a denominator
	 * of 1.
	 * 
	 * @param num the numerator of the fraction
	 */
	public Frazione(int num) {
		this(num, 1);
	}

	/**
	 * Returns the numerator of this fraction.
	 * 
	 * @return the numerator of this fraction
	 */
	public int getNum() {
		return num;
	}

	/**
	 * Returns the denominator of this fraction.
	 * 
	 * @return the denominator of this fraction
	 */
	public int getDen() {
		return den;
	}

	/**
	 * Returns a new Frazione object that is the simplified version of this
	 * fraction.
	 * 
	 * @return a new Frazione object that is the simplified version of this fraction
	 */
	public Frazione minTerm() {
		if (getNum() == 0)
			return new Frazione(getNum(), getDen());
		int mcd = MyMath.mcd(Math.abs(getNum()), getDen());
		int n = getNum() / mcd;
		int d = getDen() / mcd;
		return new Frazione(n, d);
	}

	/**
	 * Returns true if this fraction is equal to the given fraction.
	 * 
	 * @param f the fraction to compare to
	 * @return true if this fraction is equal to the given fraction
	 */
	public boolean equals(Frazione f) {
		return f.getNum() * getDen() == f.getDen() * getNum();
	}

	/**
	 * Returns a new Frazione object that is the sum of this fraction and the given
	 * fraction.
	 * 
	 * @param f the fraction to add to this fraction
	 * @return a new Frazione object that is the sum of this fraction and the given
	 *         fraction
	 */
	public Frazione sum(Frazione f) {
		if (getDen() == f.getDen()) {
			return new Frazione(getNum() + f.getNum(), getDen()).minTerm();
		} else {
			return this.sumWithMcm(f);
		}
	}

	/**
	 * Returns a new Frazione object that is the sum of this fraction and the given
	 * fraction using their least common multiple.
	 * 
	 * @param f the fraction to add to this fraction
	 * @return a new Frazione object that is the sum of this fraction and the given
	 *         fraction using their least common multiple
	 */
	public Frazione sumWithMcm(Frazione f) {
		int mcm = MyMath.mcm(getDen(), f.getDen());
		int n1 = getNum() * (mcm / getDen());
		int n2 = f.getNum() * (mcm / f.getDen());
		return new Frazione(n1 + n2, mcm).minTerm();
	}

	/**
	 * Returns a new Frazione object that is the difference between this fraction
	 * and the given fraction.
	 * 
	 * @param f the fraction to subtract from this fraction
	 * @return a new Frazione object that is the difference between this fraction
	 *         and the given fraction
	 */
	public Frazione sub(Frazione f) {
		if (getDen() == f.getDen()) {
			return new Frazione(getNum() - f.getNum(), getDen()).minTerm();
		} else {
			int mcm = MyMath.mcm(getDen(), f.getDen());
			int n1 = getNum() * (mcm / getDen());
			int n2 = f.getNum() * (mcm / f.getDen());
			return new Frazione(n1 - n2, mcm).minTerm();
		}
	}

	/**
	 * Returns a new Frazione object that is the product of this fraction and the
	 * given fraction.
	 * 
	 * @param f the fraction to multiply with this fraction
	 * @return a new Frazione object that is the product of this fraction and the
	 *         given fraction
	 */
	public Frazione mul(Frazione f) {
		return new Frazione(getNum() * f.getNum(), getDen() * f.getDen()).minTerm();
	}

	/**
	 * Returns a new Frazione object that is the quotient of this fraction divided
	 * by the given fraction.
	 * 
	 * @param f the fraction to divide this fraction by
	 * @return a new Frazione object that is the quotient of this fraction divided
	 *         by the given fraction
	 */
	public Frazione div(Frazione f) {
		return new Frazione(getNum(), getDen()).mul(f.reciprocal());
	}

	/**
	 * Returns a new Frazione object that is the reciprocal of this fraction.
	 * 
	 * @return a new Frazione object that is the reciprocal of this fraction
	 */
	public Frazione reciprocal() {
		return new Frazione(getDen(), getNum());
	}

	/**
	 * Compares this fraction with the given fraction.
	 * 
	 * @param f the fraction to compare to
	 * @return 0 if this fraction is equal to the given fraction, -1 if this
	 *         fraction is less than the given fraction, 1 if this fraction is
	 *         greater than the given fraction
	 */
	public int compareTo(Frazione f) {
		if (this.getDouble() == f.getDouble())
			return 0;
		else if (this.getDouble() < f.getDouble())
			return -1;
		else
			return 1;
	}

	/**
	 * Returns the decimal value of this fraction.
	 * 
	 * @return the decimal value of this fraction
	 */
	public double getDouble() {
		return (double) getNum() / getDen();
	}

	/**
	 * Sums an array of fractions.
	 * 
	 * @param tutte The array of fractions to sum.
	 * @return The sum of all fractions in the array.
	 */
	public static Frazione sum(Frazione[] tutte) {
		Frazione res = new Frazione(0, 1);
		for (Frazione x : tutte)
			res = res.sum(x);
		return res;
	}

	/**
	 * Multiplies an array of fractions.
	 * 
	 * @param tutte The array of fractions to multiply.
	 * @return The product of all fractions in the array.
	 */
	public static Frazione mul(Frazione[] tutte) {
		Frazione res = new Frazione(1);
		for (Frazione x : tutte)
			res = res.mul(x);
		return res;
	}

	/**
	 * Sums two arrays of fractions element-wise.
	 * 
	 * @param setA The first array of fractions to sum.
	 * @param setB The second array of fractions to sum.
	 * @return An array containing the element-wise sum of setA and setB. Returns
	 *         null if setA and setB have different sizes.
	 */
	public static Frazione[] sum(Frazione[] setA, Frazione[] setB) {
		if (size(setA) != size(setB))
			return null;
		Frazione[] res = new Frazione[size(setB)];
		for (int i = 0; i < res.length; i++)
			res[i] = setA[i].sum(setB[i]);
		return res;
	}

	/**
	 * Multiplies two arrays of fractions element-wise.
	 * 
	 * @param setA The first array of fractions to multiply.
	 * @param setB The second array of fractions to multiply.
	 * @return An array containing the element-wise product of setA and setB.
	 *         Returns null if setA and setB have different sizes.
	 */
	public static Frazione[] mul(Frazione[] setA, Frazione[] setB) {
		if (size(setA) != size(setB))
			return null;
		Frazione[] res = new Frazione[size(setB)];
		for (int i = 0; i < res.length; i++)
			res[i] = setA[i].mul(setB[i]);
		return res;
	}

	/**
	 * Returns the size of an array of fractions, ignoring null elements at the end.
	 * 
	 * @param tutte The array of fractions to get the size of.
	 * @return The size of the array, ignoring null elements at the end.
	 */
	public static int size(Frazione[] tutte) {
		int size = 0;
		for (int i = 0; i < tutte.length; i++) {
			if (tutte[i] == null)
				break;
			size++;
		}
		return size;
	}

	/**
	 * Converts an array of fractions to a string representation.
	 * 
	 * @param tutte The array of fractions to convert to a string.
	 * @return A string representation of the array of fractions in the format
	 *         "[a/b, c/d, ...]" where a/b and c/d are fraction elements in the
	 *         array. Null elements at the end are ignored.
	 */
	public static String convertToString(Frazione[] tutte) {
		String res = "[";
		for (int i = 0; i < tutte.length && tutte[i] != null; i++) {
			res += tutte[i].toString();
			if (i + 1 < tutte.length && tutte[i + 1] != null)
				res += ", ";

		}
		res += "]";
		return res;
	}

	/**
	 * Returns a string representation of this fraction.
	 * 
	 * @return a string representation of this fraction
	 */
	@Override
	public String toString() {
		String str = "";
		int num = getNum();
		int den = getDen();
		str += getDen() == 1 ? num : num + "/" + den;
		return str;
	}

}
