package esempio11;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * This class demonstrates the usage of TreeMap with a custom comparator.
 * It creates a TreeMap with a comparator that orders the keys based on string length.
 * It prints the original map, the TreeMap sorted using the default String comparator,
 * and the TreeMap sorted using the custom StringLengthComparator.
 *
 * @author michelemazzaa
 */
public class Esempio25_11 {

    /**
     * The main method of the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        // Create the original map
        Map<String, Integer> m1 = Map.of("Bologna", 395416, "Modena", 189013, "Parma", 200455);
        System.out.println(m1);

        // Create a TreeMap with the default String comparator
        SortedMap<String, Integer> m2 = new TreeMap<>(m1);
        System.out.println("TreeMap sorted with the default String comparator:\n" + m2);

        // Create a TreeMap with the custom StringLengthComparator
        StringLengthComparator cmp = new StringLengthComparator();
        SortedMap<String, Integer> m3 = new TreeMap<>(cmp);
        m3.putAll(m1);
        System.out.println("TreeMap sorted with the StringLengthComparator:\n" + m3);
    }
}
