package esempio08.newcomparator;

import java.util.Arrays;

/**
 * 
 * Esempio31_09 class is a Java program that demonstrates sorting an array of
 * objects using lambda expressions.
 * 
 * It defines a Persona class and creates an array of Persona objects.
 * 
 * It then sorts the array based on different criteria (cognome, nome, età)
 * using lambda expressions as comparators.
 * 
 * Finally, it prints the sorted array to the console.
 * 
 * The Persona class should have appropriate getters for the "nome", "cognome",
 * and "età" attributes.
 * 
 * Note: The implementation of the Persona class is not provided here.
 * 
 * @author michelemazzaa
 */
public class Esempio31_08 {

	public static void main(String[] args) {
		Persona[] persone = new Persona[] {
				new Persona("John", "Doe", 25), 
				new Persona("Jane", "Doe", 45),
				new Persona("Anne", "Bee", 31), 
				new Persona("Jane", "Doe", 22) 
				};
		for (Persona p : persone) {
			System.out.println(p);
		}
		System.out.println("- - - - - - Persone ordinato per cognome - - - - - -");
		Arrays.sort(persone, (p1, p2) -> p1.getCognome().compareTo(p2.getCognome()));
		for (Persona p : persone) {
			System.out.println(p);
		}
		System.out.println("- - - - - - Persone ordinato per nome - - - - - -");
		Arrays.sort(persone, (p1, p2) -> p1.getNome().compareTo(p2.getNome()));
		for (Persona p : persone) {
			System.out.println(p);
		}
		System.out.println("- - - - - - Persone ordinato per età - - - - - -");
		Arrays.sort(persone, (p1, p2) -> Integer.compare(p1.getEtà(), p2.getEtà()));
		for (Persona p : persone) {
			System.out.println(p);
		}
	}

}
