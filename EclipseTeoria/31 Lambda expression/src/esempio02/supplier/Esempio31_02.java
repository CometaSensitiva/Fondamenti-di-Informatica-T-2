package esempio02.supplier;

import java.util.function.*;

/**
 * 
 * Esempio31_02 class is a Java program that demonstrates the usage of lambda
 * expressions
 * 
 * to define DoubleSupplier functions and invoke them to obtain double values.
 * 
 * @author michelemazzaa
 */
public class Esempio31_02 {

	/**
	 * 
	 * The main method is the entry point of the program.
	 * 
	 * It creates two DoubleSupplier functions using lambda expressions,
	 * 
	 * and invokes them to obtain double values.
	 * 
	 * It also prints the results to the console.
	 * 
	 * @param args command-line arguments (not used in this program)
	 */
	public static void main(String[] args) {

		// Writing the lambda expression with explicit return type
		DoubleSupplier f1 = () -> {
			return Math.sqrt(2);
		};

		// Using type inference and shorter lambda expression
		DoubleSupplier f2 = () -> Math.sqrt(2);
		System.out.println("f1: " + f1.getAsDouble());
		System.out.println("f2: " + f2.getAsDouble());

	}
}