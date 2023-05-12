package esempio7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * This is a class that reads a file line by line and splits each line using the
 * split() method. It demonstrates how to split a string into an array of
 * substrings based on a delimiter.
 * <p>
 * The FileReader class is used to read the file specified by the command line
 * argument. If the file is not found, an appropriate error message is
 * displayed, and the program exits.
 * <p>
 * The BufferedReader class is used to efficiently read lines from the file.
 * Each line is split into substrings using the split() method with the comma
 * (",") delimiter. The resulting substrings are stored in an array. The trim()
 * method is called on each substring to remove leading/trailing whitespace. The
 * substrings are then joined using a space delimiter and printed to the
 * console.
 * <p>
 * Example usage: java Main7 file.txt This will read the specified file and
 * split each line using the comma delimiter.
 * <p>
 * 
 * @author michelemazzaa
 */
public class Main7 {

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
				String[] s = riga.split(",");
				s[0] = s[0].trim();
				s[1] = s[1].trim();
				s[2] = s[2].trim();
				System.out.println(String.join(" ", s));
			}
		} catch (IOException e) {
			System.out.println("Errore in lettura");
			System.exit(1);
		}
	}
}
