package esempio5;

/**
 * 
 * The Main5 class is used to demonstrate the usage of the Real and Complex
 * classes to perform arithmetic operations on real and complex numbers.
 * 
 * @author michelemazzaa
 */
public class Main5 {

	public static void main(String[] args) {

// Initialize the Real and Complex numbers
		Real r1 = Real.of(18.5);
		Real r2 = Real.of(3.14);
		Complex c1 = Complex.of(-16, 0);
		Complex c2 = Complex.of(3, 2);
		Complex c3 = Complex.of(0, -2);

// Perform arithmetic operations on the Real and Complex numbers
		Real r = r1.sum(r2);
		Complex c = c1.sum(c2);

// Print the results of the arithmetic operations
		System.out.println("r1 + r2 = " + r); // The real number 21.64
		System.out.println("c1 + c2 = " + c); // The complex number -13+2i
		System.out.println("c1 + c2 -i = " + c.sub(new ImplComplex(0, 1)));
		c = c.sum(c3);
		System.out.println("c + c3 = " + c); // The complex number -13+0i
		c = r;
		System.out.println("c = r; c = " + c);
	}
}
