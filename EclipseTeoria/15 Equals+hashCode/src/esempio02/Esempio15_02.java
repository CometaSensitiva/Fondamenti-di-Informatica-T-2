package esempio02;

/**
 * The Esempio15_02 class contains a main method that demonstrates the use of the
 * correct equals method in the Counter class with the polymorfism.
 */
public class Esempio15_02 {

	/**
	 * The main method creates three instances of the Counter class and uses the
	 * equals method improved to compare them.
	 * 
	 * @param args command line arguments (not used)
	 */
	public static void main(String[] args) {
		Counter c1 = new Counter(13);
		Counter c2 = new Counter(13);
		Counter c3 = new Counter(8);
		System.out.println(c1.equals(c2)); // true
		System.out.println(c2.equals(c1)); // true
		System.out.println(c1.equals(c3)); // false
		System.out.println(c3.equals(c1)); // false

		Object obj = c1;
		System.out.println(obj.equals(c2)); // true
		System.out.println(c2.equals(obj)); // true
	}
}