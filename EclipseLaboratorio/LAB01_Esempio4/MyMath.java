/**
 * This class contains a method for calculating the greatest common divisor
 * (GCD) of two integers.
 * 
 * @author michelemazzaa
 */
public class MyMath {
	/**
	 * Calculates the greatest common divisor (GCD) of two integers using the
	 * Euclidean algorithm.
	 * 
	 * @param a the first integer
	 * @param b the second integer
	 * @return the GCD of a and b
	 */
	public static int mcd(int a, int b) {
		int remainder;
		if (b > a) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		do {
			remainder = a % b;
			a = b;
			b = remainder;
		} while (remainder != 0);
		return a;
	}
}