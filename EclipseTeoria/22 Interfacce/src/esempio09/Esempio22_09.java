package esempio09;

import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * 
 * The Esempio22_09 class demonstrates sorting of an array of Persona objects using
 * three different comparators to sort by last name, first name, and age.
 * 
 * @author michelemazzaa
 */
public class Esempio22_09 {

	public static void main(String[] args) {
		PersonaCognomeCognomeAlphabeticalComparator cmp1 = new PersonaCognomeCognomeAlphabeticalComparator();
		PersonaNomeAlphabeticalComparator cmp2 = new PersonaNomeAlphabeticalComparator();
		PersonaEtaAscendingComparator cmp3 = new PersonaEtaAscendingComparator();
		// Create an array of 10 different Persona objects using the ImplPersona class
		Persona[] persone = new Persona[10];

		// Initialize the array with different instances of ImplPersona
		persone[0] = new ImplPersona("Rossi", "Mario", LocalDateTime.of(1985, 3, 17, 0, 0), "Milano");
		persone[1] = new ImplPersona("Bianchi", "Anna", LocalDateTime.of(1999, 5, 24, 0, 0), "Roma");
		persone[2] = new ImplPersona("Verdi", "Luca", LocalDateTime.of(1990, 8, 10, 0, 0), "Napoli");
		persone[3] = new ImplPersona("Neri", "Giulia", LocalDateTime.of(2002, 12, 5, 0, 0), "Firenze");
		persone[4] = new ImplPersona("Ferrari", "Marco", LocalDateTime.of(1982, 7, 28, 0, 0), "Torino");
		persone[5] = new ImplPersona("Russo", "Valentina", LocalDateTime.of(2001, 9, 1, 0, 0), "Palermo");
		persone[6] = new ImplPersona("Esposito", "Gabriele", LocalDateTime.of(1994, 1, 20, 0, 0), "Bari");
		persone[7] = new ImplPersona("Rizzo", "Laura", LocalDateTime.of(1989, 11, 11, 0, 0), "Genova");
		persone[8] = new ImplPersona("Moretti", "Simone", LocalDateTime.of(1996, 4, 8, 0, 0), "Venezia");
		persone[9] = new ImplPersona("Lombardi", "Sara", LocalDateTime.of(1991, 6, 18, 0, 0), "Bologna");
		for (Persona p : persone) {
			System.out.println(p);
		}

		System.out.println("- - - - - - Persone ordinato per cognome - - - - - -");
		Arrays.sort(persone, cmp1);
		for (Persona p : persone) {
			System.out.println(p);
		}

		System.out.println("- - - - - - Persone ordinato per nome - - - - - -");
		Arrays.sort(persone, cmp2);
		for (Persona p : persone) {
			System.out.println(p);
		}

		System.out.println("- - - - - - Persone ordinato per età - - - - - -");
		Arrays.sort(persone, cmp3);
		for (Persona p : persone) {
			System.out.println(p);
		}

	}

}
