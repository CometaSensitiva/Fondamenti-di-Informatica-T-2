package esempio3;

/**
 * The Main3 class contains a main method that shows the error without the
 * redefinition of the hashcode()
 */
public class Main3 {

	/**
	 * The main method creates three instances of the Counter class and prints the
	 * hashcodes
	 * 
	 * @param args command line arguments (not used)
	 */
	public static void main(String[] args) {
		Counter c1 = new Counter(13);
		Counter c2 = new Counter(13);
		Counter c3 = new Counter(8);
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
	}
}