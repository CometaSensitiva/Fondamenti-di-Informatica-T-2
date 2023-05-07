package esempio1;

import java.time.LocalDate;

/**
 * This class provides a demonstration of the differences and similarities
 * between a class Persona and a record PersonaRecord.
 * 
 * @author michelemazzaa
 *
 */
public class Main1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Creating an instance of the class Persona
		PersonaClass p1 = new PersonaClass("John", "Doe", LocalDate.of(2000, 1, 1));
		// Creating an instance of the record PersonaRecord
		PersonaRecord p2 = new PersonaRecord("Jane", "Doe", LocalDate.of(2000, 1, 1));

		// Accessing attributes of the class and the record
		String nome1 = p1.getNome();
		String nome2 = p2.nome();

		// Manipulating attributes of the class and the record
		p1.setNome("Jack");
		PersonaRecord p3 = p2.withNome("Jack");

		// Comparing instances of the class and the record
		boolean isEqual1 = p1.equals(new PersonaClass("John", "Doe", LocalDate.of(2000, 1, 1)));
		boolean isEqual2 = p2.equals(new PersonaRecord("Jane", "Doe", LocalDate.of(2000, 1, 1)));

		// Displaying instances of the class and the record
		System.out.println(p1); // output: Persona [nome=Jack, cognome=Doe, nascita=2000-01-01]
		System.out.println(p2); // output: PersonaRecord[nome=Jane, cognome=Doe, nascita=2000-01-01]

		// Using a switch statement with the record
		switch (p2.nome()) {
		case "John":
			System.out.println("Found John!");
			break;
		case "Jane":
			System.out.println("Found Jane!");
			break;
		default:
			System.out.println("Name not recognized.");
		}

		// Using the convenience methods of the record
		PersonaRecord p4 = new PersonaRecord("Jack", "Doe", LocalDate.of(2000, 1, 1));
		boolean isBefore = p2.nascita().isBefore(p4.nascita());
	}

}
