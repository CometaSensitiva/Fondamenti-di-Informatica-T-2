/**
 * A class containing the main method to test the Counter class.
 * 
 * @author michelemazzaa
 */
public class CounterMain {

	/**
	 * Tests the Counter class by creating two counters and performing various
	 * operations on them.
	 * 
	 * @param args the command line arguments (not used in this program)
	 */
	public static void main(String[] args) {
		System.out.println("Testing the Counter class...");
		System.out.println();

		Counter c1, c2;
		c1 = new Counter();
		c2 = new Counter(3);

		System.out.println("Counter 1 value: " + c1.getValue());
		System.out.println("Counter 2 value: " + c2.getValue());

		for (int i = 0; i < 3; i++) {
			c1.inc();
			System.out.println("Counter 1 value (after increment): " + c1.getValue());
		}

		System.out.println("Counter 2 value: " + c2.getValue());

		System.out.println("c1 == c2: " + (c1 == c2));
		System.out.println("c1.equals(c2): " + c1.equals(c2));
		System.out.println("c1.getValue() == c2.getValue(): " + (c1.getValue() == c2.getValue()));
	}
}
