package esempio02;

/**
 * The Esempio13_02 class contains the main method that demonstrates the usage of the
 * Counter1 and Counter2 classes.
 * 
 * @author michelemazzaa
 */
public class Esempio13_02 {

	/**
	 * The main method creates instances of Counter1 and Counter2 classes and calls
	 * their methods to increment and decrement the counter values.
	 * 
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		// Create an instance of Counter1 and increment its value twice
		Counter1 c1 = new Counter1();
		c1.inc();
		c1.inc();
		System.out.println(c1);

		// Create an instance of Counter2 and increment its value twice, then decrement
		// it once
		Counter2 c2 = new Counter2();
		c2.inc();
		c2.inc();
		System.out.println(c2);
		c2.dec();
		System.out.println(c2);

		// Create an instance of Counter2 with initial value 15, increment and decrement
		// its value
		Counter2 c3 = new Counter2(15);
		System.out.println(c3);
		c3.inc();
		c3.inc();
		System.out.println(c3);
		c3.dec();
		System.out.println(c3);

		// Assign c2 to c1 (OK) and c1 to c2 (NO)
		c1 = c2; // OK: c2 is also a Counter1
		// c2=c1; // NO: c1 is only a Counter1
	}
}
