package esempio10.costruttori;

import java.util.function.*;

/**
 * 
 * Esempio31_10 class is a Java program that demonstrates the usage of method
 * references to constructors.
 * 
 * It defines a Persona class with different constructors and showcases creating
 * instances using method references.
 * 
 * It also prints the created instances to the console.
 * 
 * The Persona class should have appropriate constructors matching the
 * functional interfaces used in this example.
 * 
 * Note: The implementation of the Persona class is not provided here.
 * 
 * The TriFunction and QuadriFunction interfaces are custom functional
 * interfaces defined elsewhere in the code.
 * 
 * @author michelemazzaa
 */
public class Esempio31_10 {
	public static void main(String[] args) {
		Supplier<Persona> ctor0 = Persona::new;
		Function<String, Persona> ctor1 = Persona::new;
		BiFunction<String, String, Persona> ctor2 = Persona::new;
		// nostre interfacce funzionali «custom»
		TriFunction<String, String, Integer, Persona> ctor3 = Persona::new;
		QuadriFunction<String, String, Integer, Boolean, Persona> ctor4 = Persona::new;
		Persona p0 = ctor0.get();
		Persona p1 = ctor1.apply("Mario");
		Persona p2 = ctor2.apply("Mario", "Rossi");
		Persona p3 = ctor3.apply("Mario", "Rossi", 21);
		Persona p4 = ctor4.apply("Mario", "Rossi", 21, Boolean.FALSE);

		System.out.println(p0);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
	}
}
