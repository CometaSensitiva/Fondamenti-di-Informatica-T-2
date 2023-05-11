package esempio3;

import java.text.NumberFormat;
import java.text.ParseException;

/**
 * This class contains the main method to execute the program. It demonstrates
 * parsing a formatted number using NumberFormat and handling ParseExceptions.
 * The expected behavior is for the parse method to throw an exception when an
 * "unusual" string is encountered. However, this is not the case.
 * 
 * @author michelemazzaa
 */
public class Main3 {

	/**
	 * The main method that runs the program. It creates an instance of NumberFormat
	 * and attempts to parse the string "10,50" as a number. If the parsing fails, a
	 * ParseException is caught and an error message is displayed.
	 * 
	 * @param args The command line arguments passed to the program.
	 */
	public static void main(String[] args) {
		NumberFormat f = NumberFormat.getNumberInstance();
		try {
			Number n = f.parse("10,50");
			System.out.println(n);
			Number m = f.parse(":10,50");
			System.out.println(m);
		} catch (ParseException e) {
			System.out.println("Parsing failed");
		}
	}
}
