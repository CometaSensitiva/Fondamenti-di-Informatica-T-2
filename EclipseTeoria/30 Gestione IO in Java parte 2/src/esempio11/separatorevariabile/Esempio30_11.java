package esempio11.separatorevariabile;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * The `Esempio30_11` class is an example of reading a text file and parsing its
 * contents using variable delimiters. It uses the `Scanner` class to tokenize
 * each line of the file. The delimiters used are "," for the name and surname,
 * "-" for the address, and "\n\r" for the city. The format of each line is
 * assumed to be: "Name, Surname - Address City".
 *
 * Note: This code assumes that each line of the file follows the specified
 * format and contains all the required tokens. If the format is not consistent
 * or tokens are missing, it may throw an exception.
 *
 * Please make sure the file exists and is accessible before running this code.
 * 
 * @author michelemazzaa
 */
public class Esempio30_11 {

	/**
	 * The main method reads a text file, tokenizes each line using variable
	 * delimiters, and prints the parsed data.
	 *
	 * @param args the command-line arguments
	 */
	public static void main(String[] args) {
		String fileName = "src/esempio11/separatorevariabile/esempio11.txt";
		Path filePath = Paths.get(fileName);
		try (BufferedReader reader = Files.newBufferedReader(filePath)) {
			String line;
			while ((line = reader.readLine()) != null) {
				Scanner scanner = new Scanner(line);
				scanner.useDelimiter(",");
				String nomeCognome = scanner.next();
				scanner.skip("\\s*,\\s*");
				scanner.useDelimiter("-");
				String indirizzo = scanner.next();
				scanner.skip("\\s*-\\s*");
				scanner.useDelimiter("\n\r");
				String città = scanner.next();
				System.out.println("Persona = " + nomeCognome + " " + indirizzo + " " + città);
				scanner.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
