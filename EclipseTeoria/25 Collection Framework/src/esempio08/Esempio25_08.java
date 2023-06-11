package esempio08;

import java.util.Set;
import java.util.TreeSet;

/**
 * This class demonstrates the construction of unmodifiable sets using the
 * `Set.of()` method and TreeSet. It creates and prints unmodifiable sets with
 * predefined elements using different implementations.
 * 
 * @author michelemazza
 */
public class Esempio25_08 {
	public static void main(String[] args) {
		// Create an unmodifiable set using Set.of() method
		Set<String> s1 = Set.of("Bologna", "Modena", "Parma");
		System.out.println(s1);

		// Create an unmodifiable set using type inference (var) and Set.of() method
		var s2 = Set.of("Ferrara", "Ravenna", "Forlì");
		System.out.println(s2);

		// Create a modifiable set using TreeSet and Set.of() method
		Set<String> s3 = new TreeSet<>(Set.of("Bologna", "Modena", "Parma"));
		System.out.println(s3);
	}
}
