package esempio.live01;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

//Immaginiamo di leggere da file, contenuto, file e valuta, data e prezzo sono separate da spazi
// 20/02/2023	13,29 €
//per simulare la lettura da un file che in questo caso non esiste utilizzo un fake readere uno stringreader

//ho tutto ciò che mi serve?
//leggo date e prezzo, mi servono formattatori
//giorno mese anno con anno di 4 cifre è un formattatore speciale me lo faccio io
//quello delle valute è standard utilizzo quello standard
//dove metto il formattatore? sarà utilizzato da tante componenti quindi è il caso di mettere il formattatore in un posto comune

public class Live1 {

	final static Reader fakeReader = new StringReader("20/02/2023\t13,29\u00A0€\n");

	public static void main(String[] args) {

		try {
			ScontrinoReader rdr = new ScontrinoReader(fakeReader);
			System.out.println(rdr.leggiScontrino());
		} catch (IOException e) {
			System.out.println("Errore di I/O inatteso");
		} catch (BadFileFormatException e) {
			System.out.println("Errore nel formato del file");
		}
	}

}
