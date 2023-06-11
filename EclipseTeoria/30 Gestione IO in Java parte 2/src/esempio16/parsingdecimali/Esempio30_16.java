package esempio16.parsingdecimali;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * The `Esempio30_16` class is an example of parsing a formatted number string
 * using `NumberFormat` class. It demonstrates how to parse a number string with
 * the Italian format (e.g., "1.234,56") into a `Number` object. The parsed
 * number is then printed as an integer and a double value.
 *
 * Note: This code assumes that the number string follows the specified format
 * with the Italian locale. If the format is not consistent or the locale is
 * different, it may throw a `ParseException`.
 *
 * @author michelemazzaa
 */
public class Esempio30_16 {

	/**
	 * The main method demonstrates parsing a formatted number string using
	 * `NumberFormat` class.
	 *
	 * @param args the command-line arguments
	 */
	public static void main(String[] args) {
		NumberFormat formatter = NumberFormat.getNumberInstance(Locale.ITALY);
		String numberString = "1.234,56";
		Number number = null;
		try {
			number = formatter.parse(numberString);
		} catch (ParseException e) {
			e.printStackTrace();
			System.err.println("Errore di formato : " + numberString);
			System.exit(1);
		}
		if (number != null) {
			System.out.println("Valore parsato ad int : " + number.intValue());
			System.out.println("Valore parsato a double : " + number.doubleValue());
		}
	}
}
