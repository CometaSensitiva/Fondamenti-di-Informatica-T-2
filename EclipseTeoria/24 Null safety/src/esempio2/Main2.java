package esempio2;

import java.util.OptionalDouble;

/**
 * 
 * The Main2 class demonstrates the usage of OptionalDouble in Java.
 * 
 * It prints the value of an optional aliquota and detrazione, or a default
 * value if they are empty.
 * 
 * @author michelemazzaa
 */
public class Main2 {

	public static void main(String[] args) {
		// Create an optional aliquota with a value of 8.6
		OptionalDouble aliquota = OptionalDouble.of(8.6);

		// Check if aliquota is present
		if (aliquota.isPresent()) {
			System.out.println(aliquota.getAsDouble());
		} else {
			System.out.println("aliquota indefinita");
		}

		// Create an empty optional detrazione
		OptionalDouble detrazione = OptionalDouble.empty();

		// Check if detrazione is present
		if (detrazione.isPresent()) {
			System.out.println(detrazione.getAsDouble());
		} else {
			System.out.println("nessuna detrazione");
		}

		// Print the value of aliquota or a default value of 10.6 if it is empty
		System.out.println(aliquota.orElse(10.6));

		// Print the value of detrazione or a default value of 10.6 if it is empty
		System.out.println(detrazione.orElse(10.6));
	}
}