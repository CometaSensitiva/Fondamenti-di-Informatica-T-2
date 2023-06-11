package esempio07;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * This class demonstrates the construction of modifiable sets using HashSet and
 * TreeSet implementations. It creates and populates sets using HashSet and
 * TreeSet. The sets are then printed to the console.
 * 
 * @author michelemazzaa
 */
public class Esempio25_07 {
	public static void main(String[] args) {
		// Create a modifiable set using HashSet implementation
		Set<String> s1 = new HashSet<>();
		s1.add("Bologna");
		s1.add("Modena");
		s1.add("Parma");
		System.out.println(s1);

		// Create a modifiable set using TreeSet implementation
		Set<String> s2 = new TreeSet<>();
		s2.add("Bologna");
		s2.add("Modena");
		s2.add("Parma");
		System.out.println(s2);

		// Create a modifiable set using type inference (var) and HashSet implementation
		var s3 = new HashSet<>();
		s3.add("Piacenza");
		s3.add("Cesena");
		s3.add("Reggio");
		System.out.println(s3);
	}
}