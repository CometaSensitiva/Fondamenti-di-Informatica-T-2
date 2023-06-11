package esempio02;

/**
 * A simple class for testing the functionality of the Taglio enumeration.
 * Creates an array of banknote denominations, calculates the total value of the
 * banknotes and prints out the content and value of the wallet.
 *
 * @author michelemazza
 */
public class Esempio09_02 {
	public static void main(String[] args) {
		Taglio[] portafoglio = new Taglio[] { Taglio.CINQUANTA, Taglio.VENTI, Taglio.DIECI, Taglio.DUE, Taglio.DUE,
				Taglio.UNO };
		System.out.println("Contenuto portafoglio: " + Taglio.contenuto(portafoglio));
		System.out.println("Valore portafoglio: " + Taglio.valore(portafoglio));
	}
}
