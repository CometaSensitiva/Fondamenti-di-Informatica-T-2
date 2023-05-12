package esempio6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * This is a class that reads a file line by line and tokenizes each line using
 * the Scanner class. It demonstrates how to extract tokens from a string using
 * Scanner with different delimiters.
 * <p>
 * The FileReader class is used to read the file specified by the command line
 * argument. If the file is not found, an appropriate error message is
 * displayed, and the program exits.
 * <p>
 * The BufferedReader class is used to efficiently read lines from the file.
 * Each line is tokenized using the Scanner class. The first token is obtained
 * using the next() method. The second token is obtained using the next() method
 * again. The third token is obtained using the nextLine() method and trimmed to
 * remove leading/trailing whitespace.
 * <p>
 * The tokens are then printed to the console for each line.
 * <p>
 * Example usage: java Main6 file.txt This will read the specified file and
 * tokenize each line.
 * <p>
 * 
 * @author michelemazzaa
 */
public class Main6 {

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
				try (Scanner s1 = new Scanner(riga)) {
					String first = s1.next();
					String second = s1.next();
					String third = "";
					if (s1.hasNext()) {
						third = s1.nextLine().trim();
					}

					System.out.println("Primo token: " + first);
					System.out.println("Secondo token: " + second);
					System.out.println("Terzo token: " + third);
				} catch (NoSuchElementException e) {
					System.out.println("Errore in scan");
					System.exit(2);
				}
			}
		} catch (IOException e) {
			System.out.println("Errore in lettura");
			System.exit(1);
		}
	}
}
