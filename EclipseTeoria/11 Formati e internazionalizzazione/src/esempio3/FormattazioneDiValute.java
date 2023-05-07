package esempio3;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * The FormattazioneDiValute class demonstrates how to format currency values
 * using different locales and maximum fraction digits. The code was authored by
 * MicheleMazzaa.
 */
public class FormattazioneDiValute {

	/**
	 * The main method of the class.
	 * 
	 * @param args An array of strings representing command line arguments.
	 */
	public static void main(String[] args) {
		// Define the value to be formatted
		double x = 1234.5678;

		// Create a number formatter using the default locale
		NumberFormat formattatoreNumerico1 = NumberFormat.getCurrencyInstance();

		// Set the maximum fraction digits to 2
		formattatoreNumerico1.setMaximumFractionDigits(2);

		// Display the formatted value using the default locale
		System.out.println("Default locale");
		System.out.println(formattatoreNumerico1.format(x));
		System.out.println();

		// Create a number formatter using the Canadian locale
		NumberFormat formattatoreNumerico2 = NumberFormat.getCurrencyInstance(Locale.CANADA);

		// Set the maximum fraction digits to 2
		formattatoreNumerico2.setMaximumFractionDigits(2);

		// Display the formatted value using the Canadian locale
		System.out.println("Canada locale");
		System.out.println(formattatoreNumerico2.format(x));
		System.out.println();

		// Create a number formatter using the Canadian French locale
		NumberFormat formattatoreNumerico3 = NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH);

		// Set the maximum fraction digits to 2
		formattatoreNumerico3.setMaximumFractionDigits(2);

		// Display the formatted value using the Canadian French locale
		System.out.println("Canada Francese locale");
		System.out.println(formattatoreNumerico3.format(x));
		System.out.println();

	}

}
