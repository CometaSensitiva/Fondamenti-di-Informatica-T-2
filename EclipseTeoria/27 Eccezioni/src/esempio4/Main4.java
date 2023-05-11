package esempio4;

/**
 * This class contains the main method to execute the program. It demonstrates
 * the usage of the `Frazione` class by creating `Frazione` objects and printing
 * their values. It also showcases the exception handling when attempting to
 * create a fraction with a denominator of zero.
 * 
 * @author michelemazzaa
 */
public class Main4 {

	/**
	 * The main method that runs the program. It creates `Frazione` objects with
	 * different numerator and denominator values and prints their values. It also
	 * attempts to create a `Frazione` object with a denominator of zero, which
	 * throws an exception.
	 * 
	 * @param args The command line arguments passed to the program.
	 */
	public static void main(String[] args) {
		Frazione f1 = new Frazione(2, 5);
		System.out.println(f1);
		Frazione f2 = new Frazione(1, 0);
		System.out.println(f2);
	}
}
