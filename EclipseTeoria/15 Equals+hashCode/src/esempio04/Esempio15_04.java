package esempio04;

import java.time.LocalDate;

/**
 * The Esempio15_03 class creates three instances of the Persona class and invokes the
 * hashCode() and equals() methods to compare them.
 * 
 * @author
 */
public class Esempio15_04 {

	/**
	 * The main method of the program creates instances of the Persona class and
	 * invokes the hashCode() and equals() methods to compare them.
	 * 
	 * @param args the command-line arguments passed to the program
	 */
	public static void main(String[] args) {
		// Create the first instance of the Persona class
		Persona p1 = new Persona("Michele", "Mazza", LocalDate.of(2003, 5, 18));
		// Create the second instance of the Persona class
		Persona p2 = new Persona("Michele", "Mazza", LocalDate.of(2003, 5, 18));
		// Create the third instance of the Persona class
		Persona p3 = new Persona("Nicolas", "Mazza", LocalDate.of(2000, 11, 2));

		// Print the hash code of the first instance
		System.out.println(p1.hashCode());
		// Print the hash code of the second instance
		System.out.println(p2.hashCode());
		// Print the hash code of the third instance
		System.out.println(p3.hashCode());

		// Compare the first and second instances using the equals() method
		System.out.println(p1.equals(p2));
		// Compare the first and third instances using the equals() method
		System.out.println(p1.equals(p3));
	}

}
