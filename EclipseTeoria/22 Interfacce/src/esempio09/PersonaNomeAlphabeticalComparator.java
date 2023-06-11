package esempio09;

import java.text.Normalizer;
import java.util.Comparator;

/**
 * 
 * A Comparator that compares Person objects based on their first names in
 * alphabetical order.
 * 
 * @author michelemazzaa
 */
public class PersonaNomeAlphabeticalComparator implements Comparator<Persona> {

	/**
	 * 
	 * Compares two Persona objects based on their first names.
	 * 
	 * @param p1 the first Persona object to compare
	 * 
	 * @param p2 the second Persona object to compare
	 * 
	 * @return a negative integer, zero, or a positive integer as the first argument
	 *         is less than, equal to, or greater than the second
	 */
	@Override
	public int compare(Persona p1, Persona p2) {
		// Normalize the first names to account for differences in diacritical marks and case sensitivity
		String s1 = Normalizer.normalize(p1.nome().toLowerCase(), Normalizer.Form.NFD).replaceAll("\\s", "");
		String s2 = Normalizer.normalize(p2.nome().toLowerCase(), Normalizer.Form.NFD).replaceAll("\\s", "");

		// Compare the normalized first names
		return s1.compareTo(s2);
	}
}