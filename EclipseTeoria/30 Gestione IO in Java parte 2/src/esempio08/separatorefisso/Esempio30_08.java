package esempio08.separatorefisso;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.StringTokenizer;

/**
 * The `Esempio30_08` class is an example of reading a text file and parsing its
 * contents using a fixed delimiter.
 *
 * @author michelemazzaa
 */
public class Esempio30_08 {

	/**
	 * The main method reads a text file, tokenizes each line using a fixed
	 * delimiter, and prints the parsed data.
	 *
	 * @param args the command-line arguments
	 */
	public static void main(String[] args) {
		String fileName = "esempio08.txt";
		Path filePath = Paths.get("src/esempio08/separatorefisso", fileName);
		try (BufferedReader reader = Files.newBufferedReader(filePath, StandardCharsets.UTF_8)) {
			String line;
			while ((line = reader.readLine()) != null) {
				StringTokenizer tokenizer = new StringTokenizer(line, "$\n\r");
				if (tokenizer.countTokens() >= 3) {
					String nomeCognome = tokenizer.nextToken().trim();
					String indirizzo = tokenizer.nextToken().trim();
					String città = tokenizer.nextToken().trim();
					System.out.println("Persona = " + nomeCognome + " " + indirizzo + " " + città);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Errore in lettura file");
		}

	}

}
