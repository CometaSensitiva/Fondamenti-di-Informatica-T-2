package esempio09.separatorefisso;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * The `Esempio30_09` class is an example of reading a text file and parsing its
 * contents using a fixed delimiter. It uses the `Scanner` class to tokenize
 * each line of the file.
 *
 * @author michelemazzaa
 */
public class Esempio30_09 {

	/**
	 * The main method reads a text file, tokenizes each line using a fixed
	 * delimiter, and prints the parsed data.
	 *
	 * @param args the command-line arguments
	 */
	public static void main(String[] args) {
		String fileName = "src/esempio09/separatorefisso/esempio09.txt";
		Path filePath = Paths.get(fileName);
		try (BufferedReader reader = Files.newBufferedReader(filePath)) {
			String line;
			Scanner scanner = null;
			while ((line = reader.readLine()) != null) {
				scanner = new Scanner(line);
				scanner.useDelimiter("\\$+(\\n\\r)*");
				String nomeCognome = scanner.next().trim();
				String indirizzo = scanner.next().trim();
				String città = scanner.next().trim();
				System.out.println("Persona = " + nomeCognome + " " + indirizzo + " " + città);
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Errore in lettura file");
		}

	}

}
