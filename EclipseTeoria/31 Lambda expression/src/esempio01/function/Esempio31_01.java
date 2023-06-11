package esempio01.function;

import java.util.function.*;

/**
 * 
 * Esempio31_01 class is a Java program that demonstrates the usage of lambda
 * expressions
 * 
 * to define IntUnaryOperator functions and apply them to integer values.
 * 
 * @author michelemazzaa
 */
public class Esempio31_01 {

	/**
	 * 
	 * The main method is the entry point of the program.
	 * 
	 * It creates two IntUnaryOperator functions using lambda expressions,
	 * 
	 * and applies them to integer values.
	 * 
	 * It also prints the results to the console.
	 * 
	 * @param args command-line arguments (not used in this program)
	 */
	public static void main(String[] args) {

		// Writing the lambda expression with explicit return type
		IntUnaryOperator f1 = (int x) -> {
			return x + 3;
		};

		// Using type inference and shorter lambda expression
		IntUnaryOperator f2 = x -> x + 3;
		System.out.println("f1: " + f1.applyAsInt(10));
		System.out.println("f2: " + f2.applyAsInt(11));

	}

}
