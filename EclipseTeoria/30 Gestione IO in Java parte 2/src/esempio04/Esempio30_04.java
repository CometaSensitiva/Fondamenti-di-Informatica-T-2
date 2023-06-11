package esempio04;

import java.io.Console;
import java.util.Arrays;

/**
 * This is a class that demonstrates the use of the Console class for user
 * input. It prompts the user for a username and password using the Console
 * object. It then prints a welcome message with the username.
 * <p>
 * The Console object is obtained using the System.console() method. If the
 * Console object is null, it means that the program is not running in a console
 * environment. In such cases, an appropriate error message is displayed, and
 * the program exits.
 * <p>
 * The Console object is used to read the username and password from the user.
 * The readLine() method is used to read a line of text from the console. The
 * readPassword() method is used to read a password as a character array.
 * <p>
 * After reading the password, the character array is filled with spaces to
 * clear the sensitive information. This is done using the fill() method from
 * the Arrays class.
 * <p>
 * Finally, the welcome message is printed using the printf() method of the
 * Console object. The username is included in the message using the %1$s format
 * specifier. The line.separator system property is used to print a new line
 * after the message.
 * <p>
 * Note: This program assumes that it is running in a console environment. If it
 * is run in an IDE or another non-console environment, the Console object may
 * be null.
 * <p>
 * Example usage: java Esempio30_04 This will prompt the user for a username and
 * password and print a welcome message.
 * <p>
 * Example output: User Name? michele Password? Welcome, michele.
 * <p>
 * 
 * @author michelemazzaa
 */
public class Esempio30_04 {

	public static void main(String[] args) {
		Console console = System.console();
		if (console == null) {
			System.out.println("Console is null");
			System.exit(1);
		}

		String username = console.readLine("User Name? ");
		char[] password = console.readPassword("Password? ");

		Arrays.fill(password, ' ');

		console.printf("Welcome, %1$s.", username);
		console.printf(System.getProperty("line.separator"));
	}

}
