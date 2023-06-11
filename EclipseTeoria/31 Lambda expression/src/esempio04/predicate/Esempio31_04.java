package esempio04.predicate;

import java.util.function.*;

/**
 * 
 * Esempio31_04 class is a Java program that demonstrates the usage of lambda
 * expressions
 * 
 * to define IntPredicate functions and test integer values against a condition.
 * 
 * It determines whether an integer is greater than 5.
 * 
 * @author michelemazzaa
 */
public class Esempio31_04 {

	/**
	 * 
	 * The main method is the entry point of the program. It creates two
	 * IntPredicate functions using lambda expressions, and tests integer values
	 * against the condition. It also prints the results to the console.
	 * 
	 * @param args command-line arguments (not used in this program)
	 */
	public static void main(String[] args) {
		// Writing the lambda expression with explicit return type
		IntPredicate f1 = x -> {
			return x > 5;
		};
		// Using type inference and shorter lambda expression
		IntPredicate f2 = x -> x > 5;
		System.out.println("f1: " + f1.test(5));
		System.out.println("f2: " + f2.test(6));
	}
}