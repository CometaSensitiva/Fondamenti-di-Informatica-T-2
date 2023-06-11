package esempio04;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * This class demonstrates the usage of Set interface and its implementations.
 * 
 * The Set interface defines a set, while the internalized factory Set.of
 * produces an unmodifiable set. HashSet and TreeSet, on the other hand, produce
 * modifiable sets. TreeSet implements SortedSet and thus produces an ordered
 * set.
 * 
 * Note that the implicit iterator of foreach navigates the set in arbitrary
 * order. It guarantees to follow the order in the case of SortedSet (and thus
 * TreeSet).
 * 
 * The copy constructor is used to create a shallow copy of a collection. All
 * collection (here TreeSet in s3) accepts another collection (here, a Set) as
 * an argument from which it copies all the elements.
 * 
 * @author michelemazzaa
 */
public class Esempio25_04 {
	/**
	 * Demonstrates the usage of Set interface and its implementations.
	 */
	public static void main(String[] args) {
		// Create an unmodifiable set using Set.of method
		Set<Double> s1 = Set.of(3.14, 2.15, 1.16, -0.17);

		// Create a modifiable set using HashSet
		Set<Double> s2 = new HashSet<>();

		// Add elements to the modifiable set
		s2.add(3.14);
		s2.add(2.15);
		s2.add(1.16);
		s2.add(-0.17);

		System.out.println(s1);
		System.out.println(s2);

		// Attempting to add an element to an unmodifiable set throws an
		// UnsupportedOperationException
		// s1.add(22.2)

		// Add an element to the modifiable set
		s2.add(11.1);
		System.out.println(s2);

		// Iterate over the unmodifiable set using foreach loop
		for (Double d : s1)
			System.out.println("Elemento : " + d);

		// Create a new set using TreeSet and the elements of s1
		Set<Double> s3 = new TreeSet<>(s1);

		// Add an element to the new set
		s3.add(22.2);
		System.out.println(s3);

		// Iterate over the new set using foreach loop
		for (Double d : s3)
			System.out.println("Elemento : " + d);
	}
}
