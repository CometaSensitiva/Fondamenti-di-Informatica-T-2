package esempio02;

/**
 * This class contains the main method that creates instances of the Libro,
 * Tavolo, and Appezzamento classes and uses the MyMath class to compute and
 * print the area of each object.
 * 
 * @author michelemazzaa
 */
public class Esempio22_02 {
	/**
	 * The main method of the program.
	 *
	 * @param args the command line arguments (unused)
	 */
	public static void main(String[] args) {
		// Create instances of Libro, Tavolo, and Appezzamento classes
		Libro libroJava = new Libro(22, 16, 3);
		Tavolo tavoloCucina = new Tavolo(120, 70, 74);
		Appezzamento terreno = new Appezzamento(21, 50, "44.49179603211135, 11.330909770799916");

		// Compute and print the area of each object using the MyMath class
		System.out.println("Area of libroJava: " + MyMath.area(libroJava));
		System.out.println("Area of tavoloCucina: " + MyMath.area(tavoloCucina));
		System.out.println("Area of terreno: " + MyMath.area(terreno));
	}
}
