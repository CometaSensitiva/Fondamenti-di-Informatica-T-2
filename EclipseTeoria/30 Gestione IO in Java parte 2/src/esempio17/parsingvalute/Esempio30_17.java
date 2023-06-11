package esempio17.parsingvalute;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Locale;

/**
 * The `Esempio30_17` class demonstrates parsing currency values using
 * `NumberFormat` and `DecimalFormat`. It shows how to parse currency strings
 * with different formats and symbols. The parsed numbers are then printed as
 * integer and double values.
 *
 * Note: This code assumes that the currency strings follow the specified
 * formats with the Italian locale. If the formats or locales are different, it
 * may produce unexpected results or throw a `ParseException`.
 * 
 * IMPORTANT: The code includes two different parsing scenarios, each using a
 * different format pattern. Make sure to pay attention to the comments and the
 * corresponding parsing logic.
 * 
 * @author: michelemazzaa
 */
public class Esempio30_17 {
	public static void main(String[] args) {
		// Parsing scenario 1: Currency format with euro symbol (e.g., "1.234,56 €")
		NumberFormat formatter1 = NumberFormat.getCurrencyInstance(Locale.ITALY);
		String numberString1 = "1.234,56\u00A0€";
		Number number1 = null;
		ParsePosition pos1 = new ParsePosition(0);
		number1 = formatter1.parse(numberString1, pos1);
		if (number1 != null) {
			System.out.println("Valore parsato ad int : " + number1.longValue());
			System.out.println("Valore parsato a double : " + number1.doubleValue());
		}

		// Parsing scenario 2: Currency format with custom pattern (e.g., "€ 1,234.56")
		DecimalFormat formatter2 = new DecimalFormat("¤ #,##0.00;¤ -#,##0.00");
		String numberString2 = "€ 1,234.56";
		numberString2 = numberString2.replace(",", "").replace(".", ",");
		System.out.println(numberString2);
		Number number2 = null;
		ParsePosition pos2 = new ParsePosition(0);
		number2 = formatter2.parse(numberString2, pos2);
		if (number2 != null) {
			System.out.println("Valore parsato ad int : " + number2.intValue());
			System.out.println("Valore parsato a double : " + number2.doubleValue());
		}

		// Parsing scenario 3: Currency format with negative value (e.g., "€ -123,45")
		DecimalFormat formatter3 = new DecimalFormat("¤ #,##0.00;¤ -#,##0.00");
		String numberString3 = "€ -123,45";
		Number number3 = null;
		ParsePosition pos3 = new ParsePosition(0);
		number3 = formatter3.parse(numberString3, pos3);
		if (number3 != null) {
			System.out.println("Valore parsato ad int : " + number3.intValue());
			System.out.println("Valore parsato a double : " + number3.doubleValue());
		}
	}
}
