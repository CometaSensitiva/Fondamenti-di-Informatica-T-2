package esempio09;

import java.text.DecimalFormat;

/**
 * This class provides examples of how to format numbers in a custom way using
 * the DecimalFormat class.
 * 
 * @author michelemazzaa
 */
public class FormattazionePersonalizzata {

	/**
	 * The main method demonstrates how to use the DecimalFormat class to format
	 * numbers in a custom way.
	 * 
	 * @param args The command-line arguments.
	 */
	public static void main(String[] args) {

		// Create a DecimalFormat object that formats numbers with a currency symbol, a
		// space, and commas for thousands
		// and two decimal places.
		DecimalFormat f = new DecimalFormat("¤ #,##0.##");

		// Print the formatted numbers to the console.
		System.out.println(f.format(1234.567));
		System.out.println(f.format(-1234.567));
		System.out.println(f.format(0.567));
		System.out.println(f.format(12345678.91234));

		// Create a DecimalFormat object that formats numbers with a currency symbol, a
		// space, and commas for thousands
		// and two decimal places, with negative numbers in parentheses.
		DecimalFormat f2 = new DecimalFormat("¤ #,##0.##;¤ -#,##0.##");

		// Print the formatted numbers to the console.
		System.out.println(f2.format(1234.567));
		System.out.println(f2.format(-1234.567));
		System.out.println(f2.format(0.567));
		System.out.println(f2.format(12345678.91234));
	}

}
