/**
 * This class contains test methods for the MyMath class.
 * 
 * @author michelemazzaa
 */
public class MyMathTest {
	/**
	 * The main method that runs the test methods.
	 * 
	 * @param args command line arguments (not used)
	 */
	public static void main(String[] args) {
		testOK();
		testKO();
	}

	/**
	 * Tests the mcd method of the MyMath class with valid inputs.
	 */
	private static void testOK() {
		assert (MyMath.mcd(10, 5) == 5);
		assert (MyMath.mcd(7, 3) == 1);
		assert (MyMath.mcd(21, 49) == 7);
	}

	/**
	 * Tests the mcd method of the MyMath class with invalid inputs.
	 */
	private static void testKO() {
		assert (MyMath.mcd(10, 5) == 4);
	}
}