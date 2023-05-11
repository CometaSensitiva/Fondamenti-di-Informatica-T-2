package esempio9;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * This class demonstrates the construction of modifiable maps using HashMap and
 * TreeMap implementations. It creates and populates maps using HashMap and
 * TreeMap. The maps are then printed to the console.
 * 
 * @author michelemazza
 */
public class Main9 {
	public static void main(String[] args) {
		// Create a modifiable map using HashMap implementation
		Map<String, Integer> m1 = new HashMap<>();
		m1.put("Bologna", 395416);
		m1.put("Modena", 189013);
		m1.put("Parma", 200455);
		System.out.println(m1);

		// Create a modifiable map using TreeMap implementation
		Map<String, Integer> m2 = new TreeMap<>();
		m2.put("Bologna", 395416);
		m2.put("Modena", 189013);
		m2.put("Parma", 200455);
		System.out.println(m2);

		// Create a modifiable map using type inference (var) and HashMap implementation
		var m3 = new HashMap<>();
		m3.put("Bologna", 395416);
		m3.put("Modena", 189013);
		m3.put("Parma", 200455);
		System.out.println(m3);
	}
}