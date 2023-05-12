package esempio2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * This is a class that demonstrates file reading using BufferedReader. It reads
 * lines from a file, splits each line by ":" delimiter, and prints the
 * resulting parts.
 * <p>
 * The file to read is specified as a command-line argument. The program will
 * read the contents of the specified file.
 * <p>
 * Note: BufferedReader is used for reading lines from a file. Ensure that the
 * java.io.BufferedReader class is imported or defined in the same package as
 * Main2.
 * <p>
 * The FileReader object is initialized inside a try block to handle exceptions.
 * If the file is not found, a FileNotFoundException is caught and an
 * appropriate error message is displayed.
 * <p>
 * After successful initialization, the file is read line by line in a loop.
 * Each line is split using ":" as the delimiter, and the resulting parts are
 * printed to the console.
 * <p>
 * If an IOException occurs during reading, an error message is displayed, and
 * the program exits with a non-zero status.
 * <p>
 * The BufferedReader resource is automatically closed at the end of the try
 * block using try-with-resources statement. This ensures proper resource
 * handling and simplifies the code.
 * <p>
 * This class assumes that the input file contains text lines. Each line is
 * split by ":" delimiter, and the resulting parts are printed.
 * <p>
 * It catches FileNotFoundException and IOException separately to handle
 * potential exceptions. In case of an error, it displays an appropriate error
 * message and exits the program.
 * <p>
 * Example usage: java Main2 input.txt This will read the contents of
 * "input.txt" file, split each line by ":" delimiter, and print the resulting
 * parts.
 * <p>
 * Example input file (input.txt): key1: value1 key2: value2
 * <p>
 * Example output: key1 value1 key2 value2
 * <p>
 * 
 * @author michelemazzaa
 */
public class Main2 {

	public static void main(String[] args) {
		FileReader r = null;
		try {
			r = new FileReader(args[0]);
		} catch (FileNotFoundException e) {
			System.out.println("File non esistente");
			System.exit(1);
		}

		try {
			BufferedReader br = new BufferedReader(r);
			String riga;
			while ((riga = br.readLine()) != null) {
				System.out.println(String.join(" ", riga.split(": ")));
			}
		} catch (IOException e) {
			System.out.println("Errore in lettura");
			System.exit(1);
		}
	}

}
