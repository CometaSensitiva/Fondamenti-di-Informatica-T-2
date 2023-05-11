package esempio9;

import java.util.Comparator;

/**
 * 
 * A Comparator that compares Person objects based on their age in ascending
 * order.
 * 
 * @author michelemazzaa
 */
public class PersonaEtaAscendingComparator implements Comparator<Persona> {

	/**
	 * 
	 * Compares two Persona objects based on their age.
	 * 
	 * @param p1 the first Persona object to compare
	 * @param p2 the second Persona object to compare
	 * @return a negative integer, zero, or a positive integer as the age of the
	 *         first argument is less than, equal to, or greater than the second
	 */
	@Override
	public int compare(Persona p1, Persona p2) {
		// Compare the ages of the two Persona objects
		return Integer.compare(p1.eta(), p2.eta());
	}
}