package esempio11.iterazione;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * Esempio31_11 class is a Java program that demonstrates the usage of lambda
 * expressions and method references with the forEach method of List interface.
 * 
 * It creates a List of Persona objects, and then prints the objects using
 * lambda expressions and method references.
 * 
 * The Persona class should have an appropriate toString() method
 * implementation.
 * 
 * Note: The implementation of the Persona class is not provided here.
 * 
 * @author michelemazzaa
 */
public class Esempio31_11 {

	public static void main(String[] args) {
		Persona[] personeArray = new Persona[] { 
				new Persona("John", "Doe", 25), 
				new Persona("Jane", "Doe", 45),
				new Persona("Anne", "Bee", 31), 
				new Persona("Jane", "Doe", 22) 
				};
		List<Persona> personeList = Arrays.asList(personeArray);
		System.out.println("- - - - - - Utilizzo lambda - - - - - -");
		personeList.forEach(p -> System.out.println(p));
		System.out.println("- - - - - - Utilizzo method reference - - - - - -");
		personeList.forEach(System.out::println);
	}
}
