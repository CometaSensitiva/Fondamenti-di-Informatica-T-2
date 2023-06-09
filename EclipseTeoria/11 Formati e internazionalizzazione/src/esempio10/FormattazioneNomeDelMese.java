package esempio10;

import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.util.Locale;

/**
 * A utility class for formatting month names and getting their corresponding
 * numerical values.
 * 
 * @author michelemazzaa
 */
public class FormattazioneNomeDelMese {

	/**
	 * Returns the numerical value of the month represented by the specified month
	 * name in the given locale.
	 *
	 * @param monthName The name of the month to retrieve the numerical value for.
	 * @param locale    The locale in which the month name is expressed.
	 * @return The numerical value of the month, as an integer from 1 (January) to
	 *         12 (December).
	 */
	public static int getMonth(String monthName, Locale locale) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM", locale);
		TemporalAccessor temporalAccessor = formatter.parse(monthName);
		return temporalAccessor.get(ChronoField.MONTH_OF_YEAR);
	}

	/**
	 * A sample method to demonstrate the usage of the getMonth() method.
	 *
	 * @param args The command-line arguments.
	 */
	public static void main(String[] args) {
		System.out.println(FormattazioneNomeDelMese.getMonth("mei", Locale.forLanguageTag("nl-NL")));
		System.out.println(FormattazioneNomeDelMese.getMonth("mai", Locale.FRENCH));
		System.out.println(FormattazioneNomeDelMese.getMonth("May", Locale.UK));
	}
}
