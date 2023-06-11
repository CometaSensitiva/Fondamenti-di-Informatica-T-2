package esempio10;

import java.util.Map;
import java.util.TreeMap;


/**
 * This class demonstrates the construction of unmodifiable maps using the
 * `Map.of()` method and TreeMap. It creates and prints unmodifiable maps with
 * predefined key-value pairs using different implementations.
 * 
 * @author michelemazzaa
 */
public class Esempio25_10 {
	public static void main(String[] args) {
		// Create an unmodifiable map using Map.of() method
		Map<String, Integer> m1 = Map.of("Bologna", 395416, "Modena", 189013, "Parma", 200455);
		System.out.println(m1);

		// Create an unmodifiable map using type inference (var) and Map.of() method
		var m2 = Map.of("Bologna", 395416, "Modena", 189013, "Parma", 200455);
		System.out.println(m2);

		// Create a modifiable map using TreeMap and Map.of() method
		Map<String, Integer> m3 = new TreeMap<>(Map.of("Bologna", 395416, "Modena", 189013, "Parma", 200455));
		System.out.println(m3);
	}
}
