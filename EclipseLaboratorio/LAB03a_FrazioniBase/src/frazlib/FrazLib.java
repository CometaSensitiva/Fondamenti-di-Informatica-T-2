package frazlib;

import frazione.*;

/**
 * A library class for working with fractions.
 * 
 * @author michelemazzaa
 */
public class FrazLib {
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
}