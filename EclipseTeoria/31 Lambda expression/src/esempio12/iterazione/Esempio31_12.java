package esempio12.iterazione;

import java.util.Arrays;

/**
 * 
 * Esempio31_12 class is a Java program that demonstrates the calculation of the
 * average age of Person objects in an array.
 * 
 * It creates an array of Persona objects and calculates the average age using
 * lambda expressions and forEach method.
 * 
 * Note: The implementation of the Persona class is not provided here.
 * 
 * Due to the limitation of effectively final variables in lambda expressions,
 * it is not possible to directly update a local variable
 * 
 * inside a lambda expression. In the commented code, an attempt is made to
 * calculate the sum of ages using a forEach loop,
 * 
 * but it results in a compilation error.
 * 
 * To overcome this limitation, a workaround using a wrapper object is employed.
 * An anonymous inner class is created as a wrapper
 * 
 * that holds the ageSum variable. This allows updating the ageSum variable
 * inside the lambda expression.
 * 
 * The ageSum is then divided by the number of Person objects to calculate the
 * average age, which is printed to the console.
 * 
 * Note: The solution with the wrapper object is considered a workaround and not
 * a recommended approach in general.
 * 
 * The Persona class should have an appropriate getEtà() method implementation.
 * 
 * The array of Persona objects and the calculation of the average age are
 * demonstrated in the main method of the class.
 * 
 * @author michelemazzaa
 */
public class Esempio31_12 {

	public static void main(String[] args) {
		Persona[] persone = new Persona[] { 
				new Persona("John", "Doe", 25), 
				new Persona("Jane", "Doe", 45),
				new Persona("Anne", "Bee", 31), 
				new Persona("Jane", "Doe", 22) 
				};
		var wrapper = new Object() {
			int ageSum = 0;
		};
		Arrays.asList(persone).forEach(p -> wrapper.ageSum += p.getEtà());
		System.out.println("media = " + wrapper.ageSum / persone.length);
	}
}
