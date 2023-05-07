package esempio1;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * This class demonstrates how to format numbers using various locales.
 *
 * @author michelemazzaa
 */
public class FormattazioneDiNumeri {
	public static void main(String[] args) {
		double x = 43.12345678;
		double y = 0.7;
		double z = 13456.78;

		// Create a number formatter based on the default locale
		NumberFormat numberFormatter1 = NumberFormat.getNumberInstance();

		// Set the maximum number of decimal places to 2
		numberFormatter1.setMaximumFractionDigits(2);
		System.out.println("Default locale");
		System.out.println(numberFormatter1.format(x));
		System.out.println(numberFormatter1.format(y));
		System.out.println(numberFormatter1.format(z));
		System.out.println();

		// Create a number formatter based on the Canadian locale
		NumberFormat numberFormatter2 = NumberFormat.getNumberInstance(Locale.CANADA);

		// Set the maximum number of decimal places to 2
		numberFormatter2.setMaximumFractionDigits(2);
		System.out.println("Canadian locale");
		System.out.println(numberFormatter2.format(x));
		System.out.println(numberFormatter2.format(y));
		System.out.println(numberFormatter2.format(z));
		System.out.println();

		// Create a number formatter based on the Canadian French locale
		NumberFormat numberFormatter3 = NumberFormat.getNumberInstance(Locale.CANADA_FRENCH);

		// Set the maximum number of decimal places to 2
		numberFormatter3.setMaximumFractionDigits(2);
		System.out.println("Canadian French locale");
		System.out.println(numberFormatter3.format(x));
		System.out.println(numberFormatter3.format(y));
		System.out.println(numberFormatter3.format(z));
		System.out.println();
	}
}
