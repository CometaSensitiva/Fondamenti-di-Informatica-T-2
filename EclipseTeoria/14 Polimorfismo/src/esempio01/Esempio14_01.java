package esempio01;

import java.time.LocalDate;

public class Esempio14_01 {
	public static void main(String args[]) {
		Persona p1 = new Persona("John", "Snow", LocalDate.of(1980, 3, 23));
		Studente s1 = new Studente("Tom", "Brady", LocalDate.of(2002, 2, 2), 987654321);
		Studente s2 = new Studente("Anna", "Frank", LocalDate.of(2002, 2, 2), 345728341);
		Persona p2 = new Persona("Michele", "Mazza", LocalDate.of(2003, 5, 18));

		Persona[] v = { p1, s1, s2, p2 };
		for (Persona x : v)
			System.out.println(x); // in un array di Persona, println(v[i]) invocherà
		// ogni volta la toString appropriata all'oggetto i-esimo
		
		// System.out.println(p1.getMatricola());  NO!
	}
}
