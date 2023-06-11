package esempio03.consumer;

import java.util.function.*;

/**
 * 
 * Esempio31_03 class is a Java program that demonstrates the usage of lambda
 * expressions
 * 
 * to define Consumer functions and apply them to String values.
 * 
 * It prints the given String values to the console.
 * 
 * @author michelemazzaa
 */
public class Esempio31_03 {

	/**
	 * 
	 * The main method is the entry point of the program. It creates two Consumer
	 * functions using lambda expressions, and applies them to String values. It
	 * also prints the results to the console.
	 * 
	 * @param args command-line arguments (not used in this program)
	 */
	public static void main(String[] args) {
		// Writing the lambda expression with explicit parameter type
		Consumer<String> f1 = (String s) -> {
			System.out.println(s);
		};
		// Using type inference and shorter lambda expression
		Consumer<String> f2 = (s) -> System.out.println(s);
		System.out.println("f1:");
		f1.accept("Ciao");
		System.out.println("f2:");
		f2.accept("Mondo");
	}
}