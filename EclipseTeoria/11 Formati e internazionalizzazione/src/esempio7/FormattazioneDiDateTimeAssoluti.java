package esempio7;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * This class provides examples of formatting absolute date and time values in
 * Java.
 * 
 * @author michelemazzaa.
 */
public class FormattazioneDiDateTimeAssoluti {

	/**
	 * The main method demonstrates how to format absolute date and time values
	 * using various built-in formats in Java.
	 * 
	 * @param args the command-line arguments (not used in this example)
	 */
	public static void main(String[] args) {
		ZonedDateTime zdt = ZonedDateTime.now();

		// Create formatters for various built-in date and time formats
		DateTimeFormatter formatterShortShortDefault = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT,
				FormatStyle.SHORT);
		DateTimeFormatter formatterMediumShortDefault = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM,
				FormatStyle.SHORT);
		DateTimeFormatter formatterLongShortDefault = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG,
				FormatStyle.SHORT);
		DateTimeFormatter formatterFullShortDefault = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL,
				FormatStyle.SHORT);
		DateTimeFormatter formatterShortMediumDefault = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT,
				FormatStyle.SHORT);
		DateTimeFormatter formatterMediumMediumDefault = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM,
				FormatStyle.MEDIUM);
		DateTimeFormatter formatterLongMediumDefault = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG,
				FormatStyle.MEDIUM);
		DateTimeFormatter formatterFullMediumDefault = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL,
				FormatStyle.MEDIUM);

		// Print the formatted date and time values using the various formats
		System.out.println(zdt.format(formatterShortShortDefault));
		System.out.println(zdt.format(formatterMediumShortDefault));
		System.out.println(zdt.format(formatterLongShortDefault));
		System.out.println(zdt.format(formatterFullShortDefault));
		System.out.println(zdt.format(formatterShortMediumDefault));
		System.out.println(zdt.format(formatterMediumMediumDefault));
		System.out.println(zdt.format(formatterLongMediumDefault));
		System.out.println(zdt.format(formatterMediumShortDefault));
		System.out.println(zdt.format(formatterFullMediumDefault));
		System.out.println();

		OffsetDateTime odt = OffsetDateTime.now();

		// Print the formatted date and time values using the various formats
		System.out.println(odt.format(formatterShortShortDefault));
		System.out.println(odt.format(formatterMediumShortDefault));
		System.out.println(odt.format(formatterLongShortDefault));
		System.out.println(odt.format(formatterFullShortDefault));
		System.out.println(odt.format(formatterMediumMediumDefault));
		System.out.println(odt.format(formatterLongMediumDefault));
		System.out.println(odt.format(formatterMediumShortDefault));
		System.out.println(odt.format(formatterFullMediumDefault));
		System.out.println();
	}
}
