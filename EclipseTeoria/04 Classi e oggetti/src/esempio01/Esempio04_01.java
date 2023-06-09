package esempio01;
/**
 * The Esempio04_01 class provides an example of how to use the Contatore and Frazione
 * classes. The main method demonstrates the use of static singleton and dynamic
 * object components of the Contatore class, as well as the use of constructors
 * in the Frazione class.
 *
 * @author michelemazzaa
 */
public class Esempio04_01 {

	/**
	 * The main method runs the example code for the Contatore and Frazione classes.
	 *
	 * @param args The command line arguments (unused).
	 */
	public static void main(String[] args) {

		System.out.println("Main method to test Contatore class");

		// Part 1: Use static singleton components
		System.out.println("Part 1 using Contatore as a static singleton");

		// Reset the counter and increment it
		Contatore.reset();
		Contatore.inc();

		// Variant 1: Check if the counter value is 1
		System.out.println(Contatore.getValue() == 1);

		// Variant 2: Use assert to check if the counter value is 1
		assert Contatore.getValue() == 1 : "The counter value should be 1";

		// Variant 3: Use assert to check if the counter value is 2 (this should fail)
		// Note that the "-ea" flag must be used to enable assertion checking at runtime
		/*
		 * assert Contatore.getValue() == 2 : "The counter value should be 2";
		 */

		// Part 2: Use dynamic object components
		System.out.println("Part 2 using two Contatore objects as dynamic objects");

		int v1, v2;
		Contatore2 c1, c2;

		// Create two Contatore2 objects and reset them
		c1 = new Contatore2();
		c2 = new Contatore2();
		c1.reset();
		c2.reset();

		// Increment the counters
		c1.inc();
		c1.inc();
		c2.inc();

		// Get the counter values
		v1 = c1.getValue();
		v2 = c2.getValue();

		System.out.println("Contatore 1\n" + v1);
		System.out.println("Contatore 2\n" + v2);

		// Test the Frazione class and constructors
		System.out.println("Main method to test Frazione ADT + constructor usage");
		System.lineSeparator();

		Frazione f1, f2, f3;
		f1 = new Frazione(3, 6);
		f2 = new Frazione(5, 15);
		f3 = f2.minTerm();

		System.out.println("Frazione 1 " + f1.getNum() + "/" + f1.getDen());
		System.out.println("Frazione 2 not reduced " + f2.getNum() + "/" + f2.getDen());
		System.out.println("Frazione 2 reduced " + f3.getNum() + "/" + f3.getDen());
	}
}
