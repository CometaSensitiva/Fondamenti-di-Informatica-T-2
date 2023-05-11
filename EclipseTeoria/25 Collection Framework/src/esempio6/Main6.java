package esempio6;

import java.util.List;

/**
 * This class demonstrates the construction of unmodifiable lists using the
 * `List.of()` method. It creates and prints unmodifiable lists with predefined
 * elements.
 * 
 * @author michelemazzaa
 */
public class Main6 {
	public static void main(String[] args) {
		// Create an unmodifiable list using List.of() method
		List<String> l1 = List.of("Bologna", "Modena", "Parma");
		System.out.println(l1);

		// Create an unmodifiable list using type inference (var) and List.of() method
		var l2 = List.of("Ferrara", "Ravenna", "Forlì");
		System.out.println(l2);
	}
}