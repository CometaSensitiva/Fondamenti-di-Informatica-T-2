package esempio6;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * This class contains methods that demonstrate exception handling when opening
 * a file. It showcases the option to handle the FileNotFoundException
 * externally by notifying the caller.
 * 
 * @author michelemazzaa
 */
public class Main6 {

	/**
	 * Reads the contents of a file with the given filename. It throws a
	 * FileNotFoundException if the file is not found.
	 * 
	 * @param fname The filename of the file to be read.
	 * @throws FileNotFoundException If the file is not found.
	 */
	@SuppressWarnings({ "resource", "unused" })
	static void read(String fname) throws FileNotFoundException {
		FileReader f = new FileReader(fname);
	}

	/**
	 * Prints all contents of a file with the given filename. If a
	 * FileNotFoundException is caught, it notifies the caller that the file was not
	 * found.
	 * 
	 * @param filename The filename of the file to be printed.
	 */
	public static void printAll(String filename) {
		try {
			read(filename);
		} catch (FileNotFoundException e) {
			System.err.println("File not found with propagated exception");
		}
	}

	/**
	 * The main method that runs the program. It calls the `printAll` method with
	 * the filename "info.txt".
	 * 
	 * @param args The command line arguments passed to the program.
	 */
	public static void main(String[] args) {
		printAll("info.txt");
	}
}
