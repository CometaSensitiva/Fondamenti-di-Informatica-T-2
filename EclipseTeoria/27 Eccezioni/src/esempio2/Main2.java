package esempio2;

/**
 * This class contains the main method to execute the program. It demonstrates
 * parsing strings to integers and handles NumberFormatExceptions.
 * 
 * @author michelemazzaa
 */
public class Main2 {

	/**
	 * The main method that runs the program. It creates an array of strings and
	 * attempts to parse each string to an integer. If a string cannot be parsed, a
	 * NumberFormatException is caught and an error message is displayed.
	 * 
	 * @param args The command line arguments passed to the program.
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String[] stringhe = { "-12", "12a", "14" };
		for (String s : stringhe) {
			try {
				int a = Integer.parseInt(s);
				System.out.println("String correct: " + s);
			} catch (NumberFormatException e) {
				System.out.println("Invalid string: " + s);
			}
		}
	}
}
