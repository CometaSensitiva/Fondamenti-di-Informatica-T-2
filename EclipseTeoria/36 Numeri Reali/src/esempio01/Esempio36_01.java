package esempio01;

/**
 * 
 * The Esempio36_01 class is responsible for demonstrating the decoding of
 * floating-point numbers.
 * 
 * It contains a main method that creates several float variables and calls the
 * decodeFloat method for each of them.
 * 
 * @author michelemazzaa
 */
public class Esempio36_01 {
	public static void main(String[] args) {
		// Create float variables
		float f1 = 12.0F;
		float f2 = 5.875F;
		float f3 = -29.1875F;
		float f4 = 0.1F;
		float f5 = 0.15F;
		float f6 = -1 / 3F;
		// Call decodeFloat method for each float variable
		decodeFloat(f1);
		decodeFloat(f2);
		decodeFloat(f3);
		decodeFloat(f4);
		decodeFloat(f5);
		decodeFloat(f6);
	}

	/**
	 * 
	 * This method decodes the internal representation of a given float number and
	 * displays its sign, exponent, and mantissa.
	 * 
	 * @param f The float number to be decoded.
	 * 
	 * @author michelemazzaa
	 */
	public static void decodeFloat(float f) {
		System.out.println("Float number: " + f);

		// Convert float to its internal representation as an integer
		int internalRep = Float.floatToIntBits(f);

		// Convert the internal representation to a binary string
		String binString = Integer.toBinaryString(internalRep);

		// Pad the binary string with leading zeros to ensure it has a length of 32
		while (binString.length() < 32)
			binString = '0' + binString;

		// Extract and display the sign bit
		System.out.println("Sign: " + binString.charAt(0));

		// Extract and display the exponent bits
		String exponentBits = binString.substring(1, 9);
		int exponent = Integer.valueOf(exponentBits, 2);
		System.out.println("Exponent: " + exponentBits + " (" + exponent + ")");

		// Extract and display the mantissa bits
		String mantissaBits = binString.substring(9, 16) + " " + binString.substring(16, 24) + " "
				+ binString.substring(24, 32);
		System.out.println("Mantissa: " + mantissaBits);
	}
}