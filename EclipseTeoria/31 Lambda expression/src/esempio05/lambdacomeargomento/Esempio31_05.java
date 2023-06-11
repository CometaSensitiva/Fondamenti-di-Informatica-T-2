package esempio05.lambdacomeargomento;

import java.util.function.*;

/**
 * 
 * Esempio31_05 class is a Java program that demonstrates the usage of lambda
 * expressions
 * 
 * to define and pass an IntUnaryOperator function as an argument to a method.
 * 
 * It applies the function to an integer value and prints the result.
 * 
 * It also includes a main method to invoke the myCalc method with a lambda
 * expression.
 * 
 * @author michelemazzaa
 */
public class Esempio31_05 {

	/**
	 * 
	 * The myCalc method takes an IntUnaryOperator function as a parameter, applies
	 * it to the integer value 5, and prints the result.
	 * 
	 * @param f the IntUnaryOperator function to be applied
	 */
	public static void myCalc(IntUnaryOperator f) {
		System.out.println(f.applyAsInt(5));
	}

	public static void main(String[] args) {
		myCalc((int x) -> x + 1);
		myCalc((int x) -> x + 3);
	}
}
