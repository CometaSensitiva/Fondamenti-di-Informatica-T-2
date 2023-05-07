package esempio8;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * A utility class for formatting dates and times in ISO format.
 * 
 * @author michelemazzaa
 */
public class FormattazioneISO {

	/**
	 * Main method to test the formatting of dates and times in ISO format.
	 * 
	 * @param args command line arguments (unused)
	 */
	public static void main(String[] args) {

		// Get the current date and time in various formats
		OffsetDateTime odt = OffsetDateTime.now();
		ZonedDateTime zdt = ZonedDateTime.now();
		LocalDate d = LocalDate.now();

		// Define various ISO date/time formatters
		DateTimeFormatter formattatoreIso1 = DateTimeFormatter.ISO_OFFSET_TIME;
		DateTimeFormatter formattatoreIso2 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		DateTimeFormatter formattatoreIso3 = DateTimeFormatter.BASIC_ISO_DATE;

		// Print the formatted dates and times
		System.out.println(odt.format(formattatoreIso1));
		System.out.println(zdt.format(formattatoreIso2));
		System.out.println(d.format(formattatoreIso3));
	}

}
