package esempio18.parsingpercentuali;

import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Locale;


/**
 * The `Esempio30_18` class demonstrates parsing a percentage value using
 * `NumberFormat`. It parses a percentage string and prints the parsed value as
 * a double.
 *
 * Note: This code assumes that the percentage string follows the specified
 * format with the Italian locale. If the format or locale is different, it may
 * produce unexpected results or throw a `ParseException`.
 * 
 * Author: michelemazzaa
 */
public class Esempio30_18 {
	public static void main(String[] args) {
		NumberFormat formatter = NumberFormat.getPercentInstance(Locale.ITALY);
		String percentString = "36,75%";
		Number percentNumber = null;
		ParsePosition pos = new ParsePosition(0);
		percentNumber = formatter.parse(percentString, pos);
		System.out.println("Percentuale parsata : " + percentNumber.doubleValue());
	}
}
