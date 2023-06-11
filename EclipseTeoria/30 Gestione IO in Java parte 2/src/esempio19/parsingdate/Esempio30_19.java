package esempio19.parsingdate;

import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Locale;

/**
 * The `Esempio30_19` class demonstrates parsing a date string using
 * `DateTimeFormatter`. It parses a date string in the Italian locale and prints
 * the parsed date.
 *
 * Note: This code assumes that the date string follows the specified format
 * with the Italian locale. If the format or locale is different, it may produce
 * unexpected results or throw an exception.
 * 
 * Author: michelemazzaa
 */
public class Esempio30_19 {
	public static void main(String[] args) {
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(Locale.ITALY);
		String dateString = "12/02/23";
		ParsePosition pos = new ParsePosition(0);
		if (pos.getIndex() != -1) {
			TemporalAccessor dateTemporal = dateFormatter.parse(dateString, pos);
			LocalDate date = LocalDate.from(dateTemporal);
			System.out.println(date);
		} else {
			System.err.println("Errore nel parsing di : " + dateString);
		}
	}
}
