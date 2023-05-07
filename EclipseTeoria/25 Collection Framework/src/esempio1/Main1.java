package esempio1;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * The Main1 class demonstrates the use of ArrayList with Object type, allowing
 * any type of objects to be added to the list.
 * 
 * However, since the list is treated as a list of Objects, special handling is
 * required when accessing and using the elements.
 * 
 * The class also showcases the attempt to create a list specifically for
 * Counter objects, but violating semantic constraints.
 * 
 * @author michelemazzaa
 */
public class Main1 {

	/**
	 * 
	 * The main method creates two ArrayList instances, one for Objects and one
	 * intended for Counter objects.
	 * 
	 * It adds various elements to each list and demonstrates different scenarios
	 * when accessing and printing the elements.
	 * 
	 * @param args the command-line arguments
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List listOfObject = new ArrayList();
		listOfObject.add(new Counter(10));
		listOfObject.add("Ciao");

		for (Object obj : listOfObject)
			System.out.println(obj);

		List listOfCounter = new ArrayList();
		listOfCounter.add(new Counter(11));
		listOfCounter.add("Ciao");
		listOfCounter.add(new Counter(7));

// The following line causes a compilation error: Incompatible types
// for (Counter u : listOfCounter) System.out.println(u);

		Counter c0 = (Counter) listOfCounter.get(0);
		System.out.println(c0);

		Counter c1 = (Counter) listOfCounter.get(2);
		System.out.println(c1);

		Counter cX = (Counter) listOfCounter.get(1);
		System.out.println(cX);
	}
}
