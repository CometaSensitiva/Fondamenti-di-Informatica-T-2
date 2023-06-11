package esempio05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * This is a class that reads a file line by line and tokenizes each line using
 * the StringTokenizer class. It demonstrates how to extract tokens from a
 * string using different delimiters.
 * <p>
 * The FileReader class is used to read the file specified by the command line
 * argument. If the file is not found, an appropriate error message is
 * displayed, and the program exits.
 * <p>
 * The BufferedReader class is used to efficiently read lines from the file.
 * Each line is tokenized using the StringTokenizer class. The first token is
 * obtained using the nextToken() method without any delimiter specified. The
 * second token is obtained using the nextToken() method with a custom delimiter
 * of "0123456789". The third token is obtained using the nextToken() method
 * with a delimiter of newline or carriage return ("\n\r").
 * <p>
 * The tokens are then printed to the console for each line.
 * <p>
 * Example usage: java Esempio30_05 file.txt This will read the specified file and
 * tokenize each line.
 * <p>
 * 
 * @author michelemazzaa
 */
public class Esempio30_05 {

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
				StringTokenizer stk = new StringTokenizer(riga);

				String first = stk.nextToken();
				String second = stk.nextToken("0123456789");
				String third = stk.nextToken("\n\r");

				System.out.println("Primo token : " + first);
				System.out.println("Secondo token : " + second);
				System.out.println("Terzo token : " + third);
			}
		} catch (IOException e) {
			System.out.println("Errore in lettura");
			System.exit(1);
		}
	}
}
