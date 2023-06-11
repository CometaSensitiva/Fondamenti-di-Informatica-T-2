package esempio13.separatoreimplicito;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.StringTokenizer;

/**
 * The `Esempio30_13` class is an example of reading a text file and parsing its
 * contents using an implicit delimiter. It uses the `StringTokenizer` class to
 * tokenize each line of the file. The format of each line is assumed to be:
 * "Name Surname Phone City". The implicit delimiter used is space.
 *
 * Note: This code assumes that each line of the file follows the specified
 * format and contains all the required tokens. If the format is not consistent
 * or tokens are missing, it may throw an exception.
 *
 * Please make sure the file exists and is accessible before running this code.
 * 
 * @author michelemazzaa
 */
public class Esempio30_13 {

	/**
	 * The main method reads a text file, tokenizes each line using an implicit
	 * delimiter, and prints the parsed data.
	 *
	 * @param args the command-line arguments
	 */
	public static void main(String[] args) {
		String fileName = "src/esempio13/separatoreimplicito/esempio13.txt";
		Path filePath = Paths.get(fileName);
		try (BufferedReader reader = Files.newBufferedReader(filePath)) {
			String line;
			while ((line = reader.readLine()) != null) {
				StringTokenizer tokenizer = new StringTokenizer(line);
				String nomeCognome = tokenizer.nextToken("0123456789").trim();
				String telefono = tokenizer.nextToken(" ").trim();
				String città = tokenizer.nextToken("\n\r").trim();
				System.out.println("Persona = " + nomeCognome + " " + telefono + " " + città);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
