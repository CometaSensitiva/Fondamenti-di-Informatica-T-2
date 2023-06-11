package esempio15.separatorefisso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

/**
 * The `Esempio30_15` class is an example of reading from a string and splitting
 * its contents using a specified separator. It uses the `StringReader` and
 * `BufferedReader` classes to read the string line by line. Each line is split
 * using the specified separator and the resulting parts are printed.
 *
 * Note: This code assumes that the input string follows the specified format
 * and contains all the required separators. If the format is not consistent or
 * separators are missing, it may produce unexpected results.
 *
 * @author michelemazzaa
 */
public class Esempio30_15 {

	/**
	 * Reads from a given string and splits each line using the specified separator.
	 *
	 * @param fakeFile the string to read from
	 * @param sep      the separator to use for splitting
	 * @throws IOException if an I/O error occurs while reading the string
	 */
	static void readFromString(String fakeFile, String sep) throws IOException {
		BufferedReader rdr = new BufferedReader(new StringReader(fakeFile));
		String riga;
		while ((riga = rdr.readLine()) != null) {
			String[] parti = riga.split(sep);
			System.out.println(Arrays.asList(parti));
		}
		System.out.println("------------------------------");
	}

	/**
	 * The main method demonstrates reading from a string and splitting its contents
	 * using different separators.
	 *
	 * @param args the command-line arguments
	 */
	public static void main(String[] args) {
		String fintoFile1 = "Giulio Verdi, via Indipendenza 38 , Bologna\n"
				+ "Pier Nicola Prinzi, viale dei Mille 42, Reggio Emilia\n"
				+ "Vanna Maria Senzi, via dell'Arco 18/2, S.Lazzaro\n";
		String fintoFile2 = "Giovanni Rossi $  via Indipendenza 38$Bologna\n"
				+ "Gian Paolo Prinzi $ via Altabella 46$Bologna\n"
				+ "Anna Maria Senzi$ via dell'Arco 18/2 $S.Lazzaro\n";
		try {
			readFromString(fintoFile1, "\\s*,\\s*");
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			readFromString(fintoFile2, "\\s*\\$\\s*");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
