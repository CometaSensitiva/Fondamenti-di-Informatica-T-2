package esempio2;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * This class demonstrates the use of NumberFormat to format percentages in
 * different locales.
 * 
 * @author michelemazzaa
 */
public class FormattazioneDiPercentuali {

	/**
	 * The main method of this class.
	 * 
	 * @param args an array of Strings representing command line arguments.
	 */
	public static void main(String[] args) {

		// Declare and initialize the input values
		double p = 0.4312;
		double q = 0.7;
		double r = 1.2345678;

		// Create a NumberFormat instance for the default locale
		NumberFormat numberFormat1 = NumberFormat.getPercentInstance();

		// Set the maximum fraction digits to 2
		numberFormat1.setMaximumFractionDigits(2);

		// Print results for the default locale
		System.out.println("Default locale");
		System.out.println(numberFormat1.format(p));
		System.out.println(numberFormat1.format(q));
		System.out.println(numberFormat1.format(r));
		System.out.println();

		// Create a NumberFormat instance for the Canadian locale
		NumberFormat numberFormat2 = NumberFormat.getPercentInstance(Locale.CANADA);

		// Set the maximum fraction digits to 2
		numberFormat2.setMaximumFractionDigits(2);

		// Print results for the Canadian locale
		System.out.println("Canadian locale");
		System.out.println(numberFormat2.format(p));
		System.out.println(numberFormat2.format(q));
		System.out.println(numberFormat2.format(r));
		System.out.println();

		// Create a NumberFormat instance for the Canadian French locale
		NumberFormat numberFormat3 = NumberFormat.getPercentInstance(Locale.CANADA_FRENCH);

		// Set the maximum fraction digits to 2
		numberFormat3.setMaximumFractionDigits(2);

		// Print results for the Canadian French locale
		System.out.println("Canadian French locale");
		System.out.println(numberFormat3.format(p));
		System.out.println(numberFormat3.format(q));
		System.out.println(numberFormat3.format(r));
		System.out.println();
	}
}
