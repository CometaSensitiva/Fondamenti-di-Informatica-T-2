package esempio2;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * The Main2 class demonstrates the use of ArrayList with a specific type, in
 * this case, Counter.
 * 
 * The list enforces the semantic constraint of only allowing objects of the
 * Counter type to be added.
 * 
 * This provides the advantage of compile-time type checking and eliminates the
 * need for explicit casting.
 * 
 * @author michelemazzaa
 */
public class Main2 {

	/**
	 * 
	 * The main method creates an ArrayList specifically for Counter objects.
	 * 
	 * It adds Counter objects to the list and showcases how to access and print the
	 * elements.
	 * 
	 * @param args the command-line arguments
	 */
	public static void main(String[] args) {
		List<Counter> listOfCounter = new ArrayList<>();
		listOfCounter.add(new Counter(11));
		// The following line causes a compilation error: Cannot convert from String to
		// Counter
		// listOfCounter.add("Ciao");
		listOfCounter.add(new Counter(7));

		Counter c0 = listOfCounter.get(0);
		System.out.println(c0);

		Counter c1 = listOfCounter.get(1);
		System.out.println(c1);
	}
}