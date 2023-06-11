package esempio04;

/**
 * This class provides utility methods for mathematical operations.
 * 
 * @author michelemazzaa
 */
public final class MyMath {

	/**
	 * Calculates the greatest common divisor (GCD) of two integers using the
	 * Euclidean algorithm.
	 * 
	 * @param a the first integer
	 * @param b the second integer
	 * @return the greatest common divisor of a and b
	 */
	public static int mcd(int a, int b) {
		if (b > a) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		int resto;
		do {
			resto = a % b;
			a = b;
			b = resto;
		} while (resto != 0);
		return a;
	}

	/**
	 * Calculates the least common multiple (LCM) of two integers.
	 * 
	 * @param a the first integer
	 * @param b the second integer
	 * @return the least common multiple of a and b
	 */
	public static int mcm(int a, int b) {
		return (a * b) / mcd(a, b);
	}
}