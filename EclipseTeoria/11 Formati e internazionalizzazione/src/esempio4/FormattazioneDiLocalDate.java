package esempio4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * This class demonstrates formatting a LocalDate object using various
 * DateTimeFormatter objects and different locales.
 * 
 * @author:michelemazzaa
 */
public class FormattazioneDiLocalDate {

	/**
	 * The main method creates a LocalDate object and uses various DateTimeFormatter
	 * objects to format it.
	 * 
	 * @param args The command line arguments (not used in this program).
	 */
	public static void main(String[] args) {

		// Create a LocalDate object for today's date
		LocalDate d = LocalDate.now();

		// Create DateTimeFormatter objects with default format styles
		DateTimeFormatter formatterShortDefault = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter formatterMediumDefault = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter formatterLongDefault = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter formatterFullDefault = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);

		// Print formatted date using default format styles
		System.out.println(d.format(formatterShortDefault));
		System.out.println(d.format(formatterMediumDefault));
		System.out.println(d.format(formatterLongDefault));
		System.out.println(d.format(formatterFullDefault));
		System.out.println();

		// Create DateTimeFormatter objects with UK locale
		DateTimeFormatter formatterShortUK = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(Locale.UK);
		DateTimeFormatter formatterMediumUK = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)
				.withLocale(Locale.UK);
		DateTimeFormatter formatterLongUK = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.UK);
		DateTimeFormatter formatterFullUK = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.UK);

		// Print formatted date using UK locale
		System.out.println(d.format(formatterShortUK));
		System.out.println(d.format(formatterMediumUK));
		System.out.println(d.format(formatterLongUK));
		System.out.println(d.format(formatterFullUK));
		System.out.println();

		// Create DateTimeFormatter objects with US locale
		DateTimeFormatter formatterShortUS = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(Locale.US);
		DateTimeFormatter formatterMediumUS = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)
				.withLocale(Locale.US);
		DateTimeFormatter formatterLongUS = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.US);
		DateTimeFormatter formatterFullUS = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.US);

		// Print formatted date using US locale
		System.out.println(d.format(formatterShortUS));
		System.out.println(d.format(formatterMediumUS));
		System.out.println(d.format(formatterLongUS));
		System.out.println(d.format(formatterFullUS));
		System.out.println();

		// Create DateTimeFormatter objects with France locale
		DateTimeFormatter formatterShortFRANCE = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)
				.withLocale(Locale.FRANCE);
		DateTimeFormatter formatterMediumFRANCE = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)
				.withLocale(Locale.FRANCE);
		DateTimeFormatter formatterLongFRANCE = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)
				.withLocale(Locale.FRANCE);
		DateTimeFormatter formatterFullFRANCE = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)
				.withLocale(Locale.FRANCE);

		// Print formatted date using France locale
		System.out.println(d.format(formatterShortFRANCE));
		System.out.println(d.format(formatterMediumFRANCE));
		System.out.println(d.format(formatterLongFRANCE));
		System.out.println(d.format(formatterFullFRANCE));
		System.out.println();

	}
}
