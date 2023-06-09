package esempio01;

/**
 * The Esempio24_01 class contains a main method that performs various operations with
 * NaN and infinite values.
 *
 * @author michelemazzaa
 */
public class Esempio24_01 {

	public static void main(String[] args) {
		double nan = Double.NaN;
		double plusInf = Double.POSITIVE_INFINITY;
		double minusInf = Double.NEGATIVE_INFINITY;
		double diffPlusInf = plusInf - plusInf;

		// Outputs the result of subtracting positive infinity from positive infinity to
		// the console
		System.out.println(diffPlusInf);

		// Compares the result of subtracting positive infinity from positive infinity
		// with NaN and outputs the
		// result to the console
		System.out.println(diffPlusInf == nan);

		// Checks whether the result of subtracting positive infinity from positive
		// infinity is NaN using the
		// Double.isNaN() method and outputs the result to the console
		System.out.println(Double.isNaN(diffPlusInf));

		// Checks whether NaN is NaN using the Double.isNaN() method and outputs the
		// result to the console
		System.out.println(Double.isNaN(nan));

		// Adds 3.0 to positive infinity and outputs the result to the console
		System.out.println(plusInf + 3.0);

		// Adds 3.0 to negative infinity and outputs the result to the console
		System.out.println(minusInf + 3.0);

		// Divides 7.0 by 0 and outputs the result to the console
		System.out.println(7.0 / 0);

		// Checks whether -7.0 divided by 0 is infinite using the Double.isInfinite()
		// method and outputs the
		// result to the console
		System.out.println(Double.isInfinite(-7.0 / 0));
	}
}
