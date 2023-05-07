/**
 * The FrazioneMain class is a driver program to test the Frazione class. It
 * creates instances of the Frazione class and tests its methods.
 *
 * @author michelemazzaa
 */
public class FrazioneMain {

	/**
	 * The main method is the entry point of the program. It creates instances of
	 * the Frazione class and tests its methods.
	 *
	 * @param args an array of command-line arguments
	 */
	public static void main(String[] args) {
		System.out.println("Testing the Frazione class...");
		System.lineSeparator();

		// Create instances of the Frazione class
		Frazione f1 = new Frazione();
		Frazione f2 = new Frazione(5);
		Frazione f3 = new Frazione(15, 10);
		Frazione f4, f5, f6;

		// Print the values of the fractions
		System.out.println("Frazione f1: " + f1.getNum() + "/" + f1.getDen());
		System.out.println("Frazione f2: " + f2.getNum() + "/" + f2.getDen());
		System.out.println("Frazione f3: " + f3.getNum() + "/" + f3.getDen());

		// Test the minTerm method
		f4 = f1.minTerm();
		f5 = f2.minTerm();
		f6 = f3.minTerm();

		// Print the reduced fractions
		System.out.println("Frazione f1 ridotta: " + f4.getNum() + "/" + f4.getDen());
		System.out.println("Frazione f2 ridotta: " + f5.getNum() + "/" + f5.getDen());
		System.out.println("Frazione f3 ridotta: " + f6.getNum() + "/" + f6.getDen());
	}
}
