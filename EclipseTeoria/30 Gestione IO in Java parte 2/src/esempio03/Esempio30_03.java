package esempio03;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * This is a class that demonstrates file writing using PrintWriter. It writes
 * two lines of text to a file specified as a command-line argument.
 * <p>
 * The file to write is specified as a command-line argument. The program will
 * create or overwrite the specified file and write the text to it.
 * <p>
 * Note: PrintWriter is used for writing text to a file. Ensure that the
 * java.io.PrintWriter class is imported or defined in the same package as
 * Esempio30_03.
 * <p>
 * The PrintWriter object is initialized inside a try block to handle
 * exceptions. If the file cannot be opened for writing, a FileNotFoundException
 * is caught, and an appropriate error message is displayed.
 * <p>
 * Within the try block, the PrintWriter object is used to write two lines of
 * text to the file. The println() method is used to write a line of text
 * followed by a newline character. The print() method is used to write a line
 * of text without a newline character.
 * <p>
 * If an exception occurs during file writing, an error message is displayed.
 * <p>
 * The PrintWriter resource is automatically closed at the end of the try block
 * using try-with-resources statement. This ensures proper resource handling and
 * simplifies the code.
 * <p>
 * This class assumes that the output file will be created or overwritten. The
 * specified text will be written to the file.
 * <p>
 * It catches FileNotFoundException separately to handle the exception. In case
 * of an error, it displays an appropriate error message.
 * <p>
 * Example usage: java Esempio30_03 output.txt This will create or overwrite the
 * "output.txt" file and write the specified text to it.
 * <p>
 * Example output file (output.txt): Nel mezzo del cammin di nostra vita mi
 * ritrovai in una selva oscura
 * <p>
 * 
 * @author michelemazzaa
 */
public class Esempio30_03 {

	public static void main(String[] args) {
		try (PrintWriter f = new PrintWriter(args[0])) {
			f.println("Nel mezzo del cammin di nostra vita");
			f.print("mi ritrovai in una selva oscura");
		} catch (FileNotFoundException e) {
			System.out.println("Errore in apertura in scrittura");
		}
	}

}
