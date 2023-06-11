package esempio20.parsingdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * The `Esempio30_20` class demonstrates parsing a date-time string using
 * `DateTimeFormatter`. It parses a date-time string in the Italian locale and
 * prints the parsed date, time, and date-time.
 *
 * Note: This code assumes that the date-time string follows the specified
 * format with the Italian locale. If the format or locale is different, it may
 * produce unexpected results or throw an exception.
 * 
 * Author: michelemazzaa
 */
public class Esempio30_20 {
	public static void main(String[] args) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)
				.withLocale(Locale.ITALY);
		String dateTimeString = "12/02/23, 12:30";
		try {
			LocalTime time = LocalTime.parse(dateTimeString, dateTimeFormatter);
			LocalDate date = LocalDate.parse(dateTimeString, dateTimeFormatter);
			LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, dateTimeFormatter);
			System.out.println(date);
			System.out.println(time);
			System.out.println(dateTime);
		} catch (DateTimeParseException e) {
			e.printStackTrace();
			System.err.println("Errore nel parsing di : " + dateTimeString);
		}
	}
}
