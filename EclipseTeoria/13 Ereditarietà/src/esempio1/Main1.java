package esempio1;

/**
 * The `Main1` class contains the `main` method which creates instances of
 * `Counter1` and `Counter2` classes to test their functionality.
 * 
 * @author michelemazzaa
 */
public class Main1 {

	/**
	 * The `main` method is the entry point of the Java program.
	 * 
	 * @param args the command-line arguments
	 */
	public static void main(String[] args) {

		// Create a new instance of `Counter1`
		Counter1 c1 = new Counter1();
		c1.inc(); // Increment `c1` by 1
		c1.inc(); // Increment `c1` by 1
		System.out.println(c1); // Print the current value of `c1`

		// Create a new instance of `Counter2`
		Counter2 c2 = new Counter2();
		c2.inc(); // Increment `c2` by 1
		c2.inc(); // Increment `c2` by 1
		System.out.println(c2); // Print the current value of `c2`
		c2.dec(); // Decrement `c2` by 1
		System.out.println(c2); // Print the current value of `c2`

		// Create a new instance of `Counter2` with an initial value of 10
		// This line is commented out to prevent errors since the constructor with
		// parameter is not defined in `Counter2`
		// Counter2 c3= new Counter2(10);
	}
}
