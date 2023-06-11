package esempio05;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * A class that demonstrates formatting of LocalTime objects in different styles
 * and locales using the DateTimeFormatter class.
 * 
 * @author michelemazzaa
 */
public class FormattazioneDiOrari {

	/**
	 * The main method that demonstrates formatting of LocalTime objects in
	 * different styles and locales using the DateTimeFormatter class.
	 * 
	 * @param args the command-line arguments
	 */
	public static void main(String[] args) {

		// Get the current LocalTime
		LocalTime t = LocalTime.now();

		// Create DateTimeFormatter objects for the SHORT and MEDIUM styles with the
		// default locale
		DateTimeFormatter formatterShortDefault = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		DateTimeFormatter formatterMediumDefault = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);

		// Format the LocalTime with the default formatters and print the results
		System.out.println(t.format(formatterShortDefault));
		System.out.println(t.format(formatterMediumDefault));
		System.out.println();

		// Create DateTimeFormatter objects for the SHORT and MEDIUM styles with the UK
		// locale
		DateTimeFormatter formatterShortUK = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(Locale.UK);
		DateTimeFormatter formatterMediumUK = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)
				.withLocale(Locale.UK);

		// Format the LocalTime with the UK formatters and print the results
		System.out.println(t.format(formatterShortUK));
		System.out.println(t.format(formatterMediumUK));
		System.out.println();

		// Create DateTimeFormatter objects for the SHORT and MEDIUM styles with the US
		// locale
		DateTimeFormatter formatterShortUS = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(Locale.US);
		DateTimeFormatter formatterMediumUS = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)
				.withLocale(Locale.US);

		// Format the LocalTime with the US formatters and print the results
		System.out.println(t.format(formatterShortUS));
		System.out.println(t.format(formatterMediumUS));
		System.out.println();

		// Create DateTimeFormatter objects for the SHORT and MEDIUM styles with the
		// Canada locale
		DateTimeFormatter formatterShortCANADA = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)
				.withLocale(Locale.CANADA);
		DateTimeFormatter formatterMediumCANADA = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)
				.withLocale(Locale.CANADA);

		// Format the LocalTime with the Canada formatters and print the results
		System.out.println(t.format(formatterShortCANADA));
		System.out.println(t.format(formatterMediumCANADA));
		System.out.println();

		// Create DateTimeFormatter objects for the SHORT and MEDIUM styles with the
		// French Canada locale
		DateTimeFormatter formatterShortCANADA_FRENCH = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)
				.withLocale(Locale.CANADA_FRENCH);
		DateTimeFormatter formatterMediumCANADA_FRENCH = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)
				.withLocale(Locale.CANADA_FRENCH);

		// Format the LocalTime with the French Canada formatters and print the results
		System.out.println(t.format(formatterShortCANADA_FRENCH));
		System.out.println(t.format(formatterMediumCANADA_FRENCH));
		System.out.println();

	}

}
