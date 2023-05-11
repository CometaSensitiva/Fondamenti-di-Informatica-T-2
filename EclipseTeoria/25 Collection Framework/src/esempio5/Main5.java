package esempio5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * This class demonstrates the construction of modifiable lists using different
 * implementations. It creates and populates lists using LinkedList and
 * ArrayList. The lists are then printed to the console.
 * 
 * @author michelemazzaa
 */
public class Main5 {
	public static void main(String[] args) {
		// Create a modifiable list using LinkedList implementation
		List<String> l1 = new LinkedList<>();
		l1.add("Bologna");
		l1.add("Modena");
		l1.add("Parma");
		System.out.println(l1);

		// Create a modifiable list using ArrayList implementation
		List<String> l2 = new ArrayList<>();
		l2.add("Ferrara");
		l2.add("Cesena");
		l2.add("Forlì");
		System.out.println(l2);

		// Create a modifiable list using type inference (var) and ArrayList
		// implementation
		var l3 = new ArrayList<>();
		l3.add("Piacenza");
		l3.add("Cesena");
		l3.add("Reggio");
		System.out.println(l3);
	}
}