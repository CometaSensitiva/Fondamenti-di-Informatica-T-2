package esempio07;

import java.util.Arrays;

/**
 * 
 * Main class that contains the main method for testing the Counter class and
 * its methods.
 * 
 * @author michelemazzaa
 */
public class Esempio22_07 {

	public static void main(String[] args) {
		Counter c1 = new Counter(10);
		Counter c2 = new Counter(10);

		System.out.println("c1 vs c2 : " + c1.compareTo(c2));

		System.out.println("c1 == c2 : " + c1.equals(c2));

		c1.inc();
		System.out.println("c1 vs c2 : " + c1.compareTo(c2));

		System.out.println("c2 vs c1 : " + c2.compareTo(c1));

		System.out.println("c1 == c2 : " + c1.equals(c2));
		System.out.println("Array disordinato");
		Counter[] myCounterArray = { new Counter(110), new Counter(100), new Counter(30), new Counter(50) };
		for (Counter c : myCounterArray)
			System.out.println(c);
		Arrays.sort(myCounterArray);
		System.out.println("Array ordinato in senso crescente");
		for (Counter c : myCounterArray)
			System.out.println(c);
	}
}