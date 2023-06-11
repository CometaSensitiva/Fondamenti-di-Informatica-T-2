package esempio09.newcomparator;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 
 * Esempio31_09 class is a Java program that demonstrates sorting an array of
 * objects using Comparator and method references.
 * 
 * It defines a Persona class and creates an array of Persona objects.
 * 
 * It then sorts the array based on different criteria (cognome, nome, età)
 * using Comparator and method references.
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
public class Esempio31_09 {

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
		Arrays.sort(persone, Comparator.comparing(Persona::getCognome));
		for (Persona p : persone) {
			System.out.println(p);
		}
		System.out.println("- - - - - - Persone ordinato per nome - - - - - -");
		Arrays.sort(persone, Comparator.comparing(Persona::getNome));
		for (Persona p : persone) {
			System.out.println(p);
		}
		System.out.println("- - - - - - Persone ordinato per età - - - - - -");
		Arrays.sort(persone, Comparator.comparing(Persona::getEtà));
		for (Persona p : persone) {
			System.out.println(p);
		}
		System.out.println("- - - - - - Persone ordinato per cognome, nome, età - - - - - -");
		Arrays.sort(persone, 
				Comparator.comparing(Persona::getCognome)
				.thenComparing(Persona::getNome)
				.thenComparing(Persona::getEtà));
		for (Persona p : persone) {
			System.out.println(p);
		}
	}

}
