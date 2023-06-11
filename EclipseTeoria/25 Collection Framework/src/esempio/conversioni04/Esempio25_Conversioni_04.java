package esempio.conversioni04;

import java.util.*;

/**
 * This class demonstrates the conversion of an unordered set to an ordered set
 * using TreeSet. It creates a Map of key-value pairs and then converts the keys
 * to an ordered set using TreeSet. The ordered set is then iterated and the
 * corresponding values are retrieved from the map and printed.
 *
 * @author michelemazzaa
 */
public class Esempio25_Conversioni_04 {

	public static void main(String[] args) {
		// Create a Map of key-value pairs
		Map<String, Integer> m = Map.of("Bologna", 395416, "Modena", 189013, "Parma", 200455);
		System.out.println(m);

		// Get the keys from the map as an unordered set
		Set<String> keys1 = m.keySet();
		for (String key : keys1)
			System.out.println(key + "\t" + m.get(key));

		// Convert the unordered set of keys to an ordered set using TreeSet
		SortedSet<String> keys2 = new TreeSet<>(m.keySet());
		for (String key : keys2)
			System.out.println(key + "\t" + m.get(key));
	}

}