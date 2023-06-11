package esempio01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 
 * The Esempio29_01 class is the entry point of the program.
 * 
 * It reads a file and prints the content while counting the number of bytes
 * read.
 * 
 * It also displays the size of the file and a reference size for comparison.
 * 
 * <p>
 * Usage:
 * 
 * java Esempio29_01 <file-path>
 * 
 * <p>
 * Example:
 * 
 * java Esempio29_01 /path/to/file.txt
 * 
 * @author michelemazzaa
 */
public class Esempio29_01 {

	/**
	 * 
	 * The main method is the entry point of the program.
	 * 
	 * @param args The command-line arguments. The first argument should be the file
	 *             path.
	 */
	public static void main(String[] args) {
		FileInputStream is = null;
		try {
			is = new FileInputStream(args[0]);
			// Exception handling for mandatory check
		} catch (FileNotFoundException e) {
			System.out.println("File non esistente");
			System.exit(1);
		}

		// Reading loop
		try {
			int x = is.read();
			int n = 0;
			int k = 10;
			while (x >= 0) {
				if (n % k != 0) {
					System.out.print(x + " ");
				} else {
					System.out.println(x + " ");
				}
				n++;
				x = is.read();
			}
			System.out.println("Grandezza File : " + n + " byte");
			System.out.println("Grandezza File da Ispeziona: 2.763.775  bytes");
		} catch (IOException e) {
			// Error during reading
			System.out.println("Errore in lettura");
			System.exit(2);
		}
	}
}
