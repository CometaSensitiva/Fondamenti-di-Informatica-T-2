package esempio6;

import java.time.LocalDateTime;

/**
 * 
 * This class contains the main method to demonstrate the behavior of the
 * implemented classes.
 * 
 * @author michelemazzaa
 */
public class Main6 {
	public static void main(String[] args) {
// Create an array of Person objects, containing instances of ImplPersona, ImplLavoratore, ImplStudente, and ImplStudenteLavoratore.
		Persona[] persone = { new ImplPersona("Rossi", "Mario", LocalDateTime.of(1998, 12, 25, 13, 20), "Bologna"),
				new ImplLavoratore("Neri", "Giacomo", LocalDateTime.of(1985, 2, 15, 11, 50), "Bologna", "lo chef",
						50000),
				new ImplStudente("Verdi", "Paolo", LocalDateTime.of(2001, 3, 27, 14, 14), "Bologna",
						new Esame[] { new ImplEsame("Analisi 1", 30, true), new ImplEsame("Fondamenti 1", 28, false) }),
				new ImplStudenteLavoratore("Bruni", "Elvio", LocalDateTime.of(1999, 4, 25, 4, 51), "Bologna",
						new Esame[] { new ImplEsame("Analisi 1", 25, false), new ImplEsame("Fondamenti 1", 30, true) },
						"il rider part time", 5000) };

		// Iterate over the array of Person objects and print each object using its
		// toString() method.
		for (Persona p : persone)
			System.out.println(p);
	}
}