package esempio02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * A class that demonstrates file writing and exception handling.
 * 
 * @author michelemazzaa
 */
public class Esempio29_02 {

	/**
	 * 
	 * The main entry point of the program.
	 * 
	 * @param args The command-line arguments.
	 */
	public static void main(String[] args) {
		FileOutputStream os = null;
		try {
			os = new FileOutputStream(args[0]);
			// Throws a mandatory checked exception
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist");
			System.exit(1);
		}

		// Writing loop
		try {
			for (int x = 0; x < 10; x += 3) {
				os.write(x);
				System.out.println("Wrote byte to file: " + x);
			}
			System.out.println("Write operation successful");
		} catch (IOException e) {
			// Error during writing
			System.out.println("Error while writing");
			System.exit(2);
		}
	}
}
