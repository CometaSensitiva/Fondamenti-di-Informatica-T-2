package esempio03;

import java.awt.Color;

/**
 * The Esempio13_03 class contains the main method for running and testing the Counter1
 * and Counter3 classes.
 *
 * @author michelemazzaa
 */
public class Esempio13_03 {

	/**
	 * The main method instantiates Counter1 and Counter3 objects, increments their
	 * values, and compares them.
	 *
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Counter1 c1 = new Counter1();
		c1.inc();
		c1.inc();
		System.out.println(c1);

		Counter3 c3 = new Counter3(0, Color.GREEN);
		c3.inc();
		c3.inc();
		System.out.println(c3);
		System.out.println(c1.equals(c3));

		Counter3 c4 = new Counter3(0, Color.RED);
		c4.inc();
		c4.inc();
		System.out.println(c4);
		System.out.println(c3.equals(c4));
	}
}
