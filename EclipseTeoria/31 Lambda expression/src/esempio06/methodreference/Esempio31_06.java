package esempio06.methodreference;

import java.util.function.*;

/**
 * 
 * Esempio31_06 class is a Java program that demonstrates the usage of method
 * references.
 * 
 * It defines a print method, and shows different ways to create and use method
 * references.
 * 
 * It also includes a main method to showcase the usage of method references.
 * 
 * The commented code represents an alternative approach that causes conflicts
 * and is commented out.
 * 
 * @author michelemazzaa
 */
public class Esempio31_06 {

	/**
	 * 
	 * The print method takes a String parameter and prints it to the console.
	 * 
	 * @param message the String to be printed
	 */
	public static void print(String message) {
		System.out.println(message);
	}

	/**
	 * 
	 * The main method is the entry point of the program.
	 * 
	 * It demonstrates the usage of method references in different scenarios.
	 * 
	 * It creates a Supplier using a method reference to obtain the length of a
	 * String,
	 * 
	 * and a Consumer using a method reference to the print method.
	 * 
	 * It also prints the results to the console.
	 * 
	 * @param args command-line arguments (not used in this program)
	 */
	public static void main(String[] args) {

		// Function<Integer, String> f1 = Integer::toString; // Conflict: both toString
		// method and toString static function coexist
		String nome = "Alice";
		Supplier<Integer> f2 = nome::length;
		Consumer<String> f3 = Esempio31_06::print;

		// System.out.println("f1:" + f1.apply(42));
		System.out.println(f2.get());
		f3.accept("Hello");
	}
}
