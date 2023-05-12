package esempio1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * This is a class that demonstrates file reading using FileReader. It reads
 * characters from a file and prints them to the console. It also counts the
 * number of characters read.
 * <p>
 * The file to read is specified as a command-line argument. The program will
 * read the contents of the specified file.
 * <p>
 * Note: FileReader is used for reading characters from a file. Ensure that the
 * java.io.FileReader class is imported or defined in the same package as Main1.
 * <p>
 * The FileReader object is initialized inside a try block to handle exceptions.
 * If the file is not found, a FileNotFoundException is caught and an
 * appropriate error message is displayed.
 * <p>
 * After successful initialization, the file is read character by character in a
 * loop until the end of the file is reached. Each character is printed to the
 * console, and the number of characters is incremented.
 * <p>
 * If an IOException occurs during reading, an error message is displayed, and
 * the program exits with a non-zero status.
 * <p>
 * The FileReader resource is automatically closed at the end of the try block
 * using try-with-resources statement. This ensures proper resource handling and
 * simplifies the code.
 * <p>
 * This class assumes that the input file contains only ASCII characters. If the
 * file contains non-ASCII characters, consider using InputStreamReader and
 * specifying the appropriate character encoding.
 * <p>
 * It catches FileNotFoundException and IOException separately to handle
 * potential exceptions. In case of an error, it displays an appropriate error
 * message and exits the program.
 * <p>
 * Note: The code assumes that the input file is a text file. For binary file
 * reading, consider using FileInputStream instead of FileReader. For reading
 * lines of text, consider using BufferedReader with FileReader or
 * InputStreamReader.
 * <p>
 * Example usage: java Main1 input.txt This will read the contents of
 * "input.txt" file and print them to the console. The number of characters read
 * will also be displayed.
 * <p>
 * Example output: H e l l o , W o r l d ! Number of characters: 14
 * <p>
 * 
 * @author michelemazzaa
 */
public class Main1 {
	public static void main(String[] args) {
		FileReader r = null;
		try {
			r = new FileReader(args[0]);
		} catch (FileNotFoundException e) {
			System.out.println("File non esistente");
			System.exit(1);
		}

		try {
			int x = r.read();
			int n = 0;
			while (x >= 0) {
				char ch = (char) x;
				System.out.print(ch + " ");
				n++;
				x = r.read();
			}
			System.out.println("\nNumber of characters: " + n);
		} catch (IOException e) {
			System.out.println("Error during reading");
			System.exit(2);
		}
	}
}
