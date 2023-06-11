package esempio02;

/**
 * 
 * The Esempio36_02 class demonstrates the decoding of double-precision floating-point
 * numbers.
 * 
 * It contains a main method that creates several double variables and calls the
 * decodeDouble method for each of them.
 * 
 * @author michelemazzaa
 */
public class Esempio36_02 {
	public static void main(String[] args) {
		// Create double variables
		double d1 = 12.0;
		double d2 = 5.875;
		double d3 = -29.1875;
		double d4 = 0.1;
		double d5 = 0.15;
		double d6 = -1 / 3;
		// Call decodeDouble method for each double variable
		decodeDouble(d1);
		decodeDouble(d2);
		decodeDouble(d3);
		decodeDouble(d4);
		decodeDouble(d5);
		decodeDouble(d6);
	}

	/**
	 * 
	 * This method decodes the internal representation of a given double number and
	 * displays its sign, exponent, and mantissa.
	 * 
	 * @param d The double number to be decoded.
	 * 
	 * @author michelemazzaa
	 */
	public static void decodeDouble(double d) {
		System.out.println("Double number: " + d);

		// Convert double to its internal representation as a long
		long internalRep = Double.doubleToLongBits(d);

		// Convert the internal representation to a binary string
		String binString = Long.toBinaryString(internalRep);

		// Pad the binary string with leading zeros to ensure it has a length of 64
		while (binString.length() < 64)
			binString = '0' + binString;

		// Extract and display the sign bit
		System.out.println("Sign: " + binString.charAt(0));

		// Extract and display the exponent bits
		String exponentBits = binString.substring(1, 12);
		int exponent = Integer.valueOf(exponentBits, 2);
		System.out.println("Exponent: " + exponentBits + " (" + exponent + ")");

		// Extract and display the mantissa bits
		String mantissaBits = binString.substring(12, 27) + " " + binString.substring(27, 53);
		System.out.println("Mantissa: " + mantissaBits);
	}
}