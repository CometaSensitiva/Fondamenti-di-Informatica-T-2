package esempio03;

/**
 * 
 * The Esempio36_03 class demonstrates potential issues with floating-point arithmetic
 * precision in two test methods.
 * 
 * It includes the test0 and test1 methods, each illustrating a specific
 * scenario.
 * 
 * Note: The code does not include Javadoc comments since it is a simple
 * demonstration of specific scenarios.
 * 
 * However, the code is appropriately formatted and includes comments to explain
 * its purpose.
 * 
 * @author michelemazzaa
 */
public class Esempio36_03 {
	public static void main(String[] args) {
		test0();
		test1();
	}

	/**
	 * 
	 * This method tests the error of alignment in floating-point arithmetic.
	 * 
	 * It performs addition between two double values and checks if the result is
	 * equal to one of the operands.
	 * 
	 * If the result is equal to the operand, it indicates a loss of precision.
	 * 
	 * In this case, the result of val1 + val2 coincides with val1, indicating a
	 * loss of precision due to the error of alignment.
	 * 
	 * The method prints a message if the condition is true.
	 */
	public static void test0() {
		double val1 = 12345.0; // A 5-digit number
		double val2 = 1e-13; // At the limit: 18 digits

		// Error of alignment: val1 + val2 coincides with val1
		if (val1 + val2 == val1) {
			System.out.println("val1 + val2 == val1 !!");
		}
	}

	/**
	 * 
	 * This method tests the precision issue in representing certain decimal values
	 * as doubles.
	 * 
	 * It initializes two double variables, val1 and val2, with seemingly simple
	 * decimal values.
	 * 
	 * However, printing these values reveals an illusion, as the actual stored
	 * values may differ.
	 * 
	 * It performs an addition operation to calculate the triple of val1 and checks
	 * if it is equal to val2.
	 * 
	 * If the calculated value is not equal to val2, it prints an error message
	 * indicating the difference.
	 */
	public static void test1() {
		double val1 = 0.1; // Appears as 0.1 .. but it's not!
		double val2 = 0.3; // Appears as 0.3 .. but it's not!

		System.out.println(val1); // Prints 0.1 .. but it's an illusion!
		System.out.println(val2); // Prints 0.3 .. but it's an illusion!

		// ... and indeed, the triple of val1 is not equal to val2!
		double d = val1 + val1 + val1; // It's not the triple of val1...

		if (d != val2) {
			System.out.print("ERROR of ");
			System.out.println(d - val2); // Difference of 5.5E-17
		}
	}
}