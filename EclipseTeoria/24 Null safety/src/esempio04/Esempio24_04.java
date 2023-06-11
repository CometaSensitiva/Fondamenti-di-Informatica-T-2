package esempio04;

import java.util.Optional;

/**
 * The Esempio24_04 class demonstrates the usage of Optional in Java.
 * 
 * @author michelemazza
 */
public class Esempio24_04 {

	public static void main(String[] args) {
		String s1 = null;
		String s2 = "Ciao";

		// Creating Optional instances with nullable values
		Optional<String> opt1 = Optional.ofNullable(s1);
		Optional<String> opt2 = Optional.ofNullable(s2);

		// Retrieving values from Optional or providing default values
		String value1 = opt1.orElse("Boh");
		String value2 = opt2.orElse("Bah");

		// Printing the values
		System.out.println(value1);
		System.out.println(value2);
	}
}
