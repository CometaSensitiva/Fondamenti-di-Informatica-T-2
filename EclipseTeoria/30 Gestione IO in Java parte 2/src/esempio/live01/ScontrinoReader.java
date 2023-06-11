package esempio.live01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class ScontrinoReader {
	private Reader rdr;

	public ScontrinoReader(Reader rdr) {
		this.rdr = rdr;
	}

	public List<Scontrino> leggiScontrino() throws IOException, BadFileFormatException {
		List<Scontrino> result = new ArrayList<>();

		String line;
		BufferedReader reader = new BufferedReader(rdr);
		while ((line = reader.readLine()) != null) {
			String[] tokens = line.split("\\t+");// così divide se c'è una o più tabulazioni
			if (tokens.length != 2) {
				throw new BadFileFormatException("La riga deve contenere esattamente 2 elementi" + line);
			}

			String dataAsString = tokens[0].trim();
			String importoAsString = tokens[1].trim();
			LocalDate data = null;
			double importo;
			try {
				data = LocalDate.parse(dataAsString, Formatters.dateFormatter);
				importo = Formatters.priceFormatter.parse(importoAsString).doubleValue();
			} catch (DateTimeParseException e) {
				throw new BadFileFormatException("Data errata alla riga" + line);
			} catch (ParseException e) {
				throw new BadFileFormatException("Importo errata alla riga" + line);
			}
			result.add(new Scontrino(data, importo));
		}

		return result;
	}
}
