package esempio01;

/**
 * The Esempio22_01 class contains the main method that tests the Libreria class.
 * 
 * @author michelemazzaa
 */
public class Esempio22_01 {

	public static void main(String[] args) {
		// Creating Counter objects
		Counter a1 = new Counter(1);
		Counter a2 = new Counter(2);
		Counter a3 = new Counter(3);

		Counter b1 = new Counter(1);
		Counter b2 = new Counter(2);
		Counter b3 = new Counter(3);

		Counter c1 = new Counter(10);
		Counter c2 = new Counter(2);
		Counter c3 = new Counter(3);

		// Creating arrays of Counter objects
		Counter[] a = new Counter[] { a1, a2, a3 };
		Counter[] b = new Counter[] { b1, b2, b3 };
		Counter[] c = new Counter[] { c1, c2, c3 };

		// Creating an array of String objects
		String[] d = { "Ciao", "Mondo" };

		// Correct call with type tag <T>
		System.out.println(Libreria.<Counter>idem(a, b)); // True
		System.out.println(Libreria.<Counter>idem(a, c)); // False
		System.out.println(Libreria.<Counter>idem(b, c)); // False

		// Incorrect call without type tag assumes that the arguments are Object
		System.out.println(Libreria.idem(a, b)); // True, if Counter has polymorphic equals
		System.out.println(Libreria.idem(a, c)); // False
		System.out.println(Libreria.idem(b, c)); // False

		// DIABOLICAL call with type tag
		// System.out.println(Libreria.<Counter>idem(a, d)); // False

		// DIABOLICAL call without type tag
		System.out.println(Libreria.idem(a, d)); // False
	}
}
