package esempio1;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * This class contains the main method to execute the program. It reads a file
 * named "info.txt" and exits with an error message if the file is not found.
 * 
 * @author michelemazzaa
 */
public class Main1 {

	/**
	 * The main method that runs the program. It attempts to read a file named
	 * "info.txt" and exits with an error message if the file is not found.
	 * 
	 * @param args The command line arguments passed to the program.
	 */
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		try {
			FileReader f = new FileReader("info.txt");
		} catch (FileNotFoundException e) {
			System.err.println("File " + "info.txt" + " not found");
			System.exit(1); // exits with an error indication
		}
	}
}
