
/**
 * This is an example class that demonstrates the calculation of factorials
 * using recursion.
 * 
 * @author michelemazzaa
 */
public class MyMain {

	/**
	 * This method calculates the factorial of a given integer using recursion.
	 * 
	 * @param n The integer for which the factorial is to be calculated.
	 * @return The factorial of the given integer.
	 */
	public static int fact(int n) {
		if (n == 0)
			return 1;
		else
			return n * fact(n - 1);
	}

	/**
	 * This is the main method that tests the fact method by calculating the
	 * factorials of 3, 6 and 8 and printing the results.
	 * 
	 * @param args An array of strings representing the command line arguments.
	 */
	public static void main(String[] args) {
		int fact1 = fact(3);
		System.out.println(fact1 == 6);
		int fact2 = fact(6);
		System.out.println(fact2 == 720);
		int fact3 = fact(8);
		System.out.println(fact3 == 40320);
	}
}
