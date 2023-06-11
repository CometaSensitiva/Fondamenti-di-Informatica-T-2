package esempio06;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * A class that demonstrates formatting LocalDateTime instances using various
 * pre-defined patterns.
 *
 * @author michelemazzaa
 */
public class FormattazioneDiLocalDateTime {

	/**
	 * The main method that demonstrates formatting LocalDateTime instances using
	 * various pre-defined patterns.
	 * 
	 * @param args command-line arguments
	 */
	public static void main(String[] args) {
		// Obtain the current date and time
		LocalDateTime dt = LocalDateTime.now();

		// Define various date-time formatters with different patterns
		DateTimeFormatter formatterShortShortDefault = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT,
				FormatStyle.SHORT);
		DateTimeFormatter formatterMediumShortDefault = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM,
				FormatStyle.SHORT);
		DateTimeFormatter formatterLongShortDefault = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG,
				FormatStyle.SHORT);
		DateTimeFormatter formatterFullShortDefault = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL,
				FormatStyle.SHORT);
		DateTimeFormatter formatterShortMediumDefault = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT,
				FormatStyle.MEDIUM);
		DateTimeFormatter formatterMediumMediumDefault = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM,
				FormatStyle.MEDIUM);
		DateTimeFormatter formatterLongMediumDefault = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG,
				FormatStyle.MEDIUM);
		DateTimeFormatter formatterFullMediumDefault = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL,
				FormatStyle.MEDIUM);

		// Print the formatted date-time values
		System.out.println(dt.format(formatterShortShortDefault));
		System.out.println(dt.format(formatterMediumShortDefault));
		System.out.println(dt.format(formatterLongShortDefault));
		System.out.println(dt.format(formatterFullShortDefault));
		System.out.println(dt.format(formatterShortMediumDefault));
		System.out.println(dt.format(formatterMediumMediumDefault));
		System.out.println(dt.format(formatterLongMediumDefault));
		System.out.println(dt.format(formatterMediumShortDefault));
		System.out.println(dt.format(formatterFullMediumDefault));
		System.out.println();
	}
}
