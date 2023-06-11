package esempio13.sequenzaecomposizione;

import java.util.function.*;

/**
 * 
 * Esempio31_13 class is a Java program that demonstrates the usage of andThen()
 * and compose() methods of the IntUnaryOperator functional interface.
 * 
 * It defines two IntUnaryOperator instances and showcases the application of
 * these methods.
 * 
 * The results are printed to the console.
 * 
 * The IntUnaryOperator functional interface represents an operation on a single
 * int-valued operand that produces an int-valued result.
 * 
 * Note: The implementation of the IntUnaryOperator functional interface is not
 * provided here.
 * 
 * The mulBy3 IntUnaryOperator multiplies the input by 3, while the incBy1
 * IntUnaryOperator increments the input by 1.
 * 
 * The andThen() method combines these two operations by applying mulBy3 first
 * and then incBy1.
 * 
 * The compose() method combines them in reverse order, applying incBy1 first
 * and then mulBy3.
 * 
 * The results of applying these compositions to the input value 4 are printed
 * to the console.
 * 
 * @author michelemazzaa
 */
public class Esempio31_13 {

	public static void main(String[] args) {
		IntUnaryOperator mulBy3 = x -> x * 3;
		IntUnaryOperator incBy1 = x -> x + 1;
		var y = mulBy3.andThen(incBy1).applyAsInt(4); // Result: (3 * 4) + 1 = 13
		var z = mulBy3.compose(incBy1).applyAsInt(4); // Result: 3 * (4 + 1) = 15

		System.out.println(".andThen: " + y);
		System.out.println(".compose: " + z);
	}
}