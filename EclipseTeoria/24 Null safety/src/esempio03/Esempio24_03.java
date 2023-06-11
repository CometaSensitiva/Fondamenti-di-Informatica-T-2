package esempio03;

import java.util.Optional;

/**
 * 
 * This class contains a main method to demonstrate how to use Optional class in
 * Java.
 * 
 * @author michelemazzaa
 */
public class Esempio24_03 {

	public static void main(String[] args) {
		String nome = null;

		// Creating an Optional object using the ternary operator
		Optional<String> optString1 = (nome == null) ? Optional.empty() : Optional.of(nome);

		// Creating an Optional object using the ofNullable method
		Optional<String> optString2 = Optional.ofNullable(nome);

		// Printing out the Optional objects
		System.out.println(optString1);
		System.out.println(optString2);
	}
}