package codicefiscale;

public class CodiceFiscale {
	private static String vocaliAlfabeto = "aeiouyAEIOUY";
	private static String consonantiAlfabeto = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";

	/**
	 * 
	 * @param cognome
	 * @return
	 */
	private static String calcolaCognome(String cognome) {
		StringBuilder codiceCognome = new StringBuilder();
		StringBuilder vocali = new StringBuilder();
		StringBuilder consonanti = new StringBuilder();
		for (int i = 0; i < cognome.length(); i++) {
			char c = cognome.charAt(i);
			if (vocaliAlfabeto.indexOf(c) != -1) {
				vocali.append(c);
			} else if (consonantiAlfabeto.indexOf(c) != -1) {
				consonanti.append(c);
			}
		}

		int i = 0;
		while (codiceCognome.length() < 3 && i < consonanti.length()) {
			codiceCognome.append(consonanti.charAt(i));
			i++;
		}
		i = 0;
		while (codiceCognome.length() < 3 && i < vocali.length()) {
			codiceCognome.append(vocali.charAt(i));
			i++;
		}
		while (codiceCognome.length() < 3) {
			codiceCognome.append('X');
		}
		return codiceCognome.toString().toUpperCase();
	}

	/**
	 * 
	 * @param nome
	 * @return
	 */
	private static String calcolaNome(String nome) {
		StringBuilder codiceNome = new StringBuilder();
		StringBuilder vocali = new StringBuilder();
		StringBuilder consonanti = new StringBuilder();

		for (int i = 0; i < nome.length(); i++) {
			char c = nome.charAt(i);
			if (vocaliAlfabeto.indexOf(c) != -1) {
				vocali.append(c);
			} else if (consonantiAlfabeto.indexOf(c) != -1) {
				consonanti.append(c);
			}
		}

		if (consonanti.length() >= 4)
			codiceNome.append(consonanti.charAt(0) + consonanti.charAt(2) + consonanti.charAt(3));
		else if (consonanti.length() > 0) {
			int i = 0;
			codiceNome.append(consonanti);
			while (codiceNome.length() < 3 && i < vocali.length()) {
				codiceNome.append(vocali.charAt(i));
				i++;
			}
		}
		while (codiceNome.length() < 3) {
			codiceNome.append('X');
		}
		return codiceNome.toString().toUpperCase();
	}

	/**
	 * 
	 * @param anno
	 * @return
	 */
	private static String calcolaAnno(int anno) {
		return Integer.toString(anno % 100);
	}

	/**
	 * 
	 * @param mese
	 * @return
	 */
	private static String calcolaMese(int mese) {
		String pesoMese = "ABCDEHLMPRST";
		return Character.toString(pesoMese.charAt(mese - 1));
	}

	/**
	 * 
	 * @param giorno
	 * @param sesso
	 * @return codice
	 */
	private static String calcolaGiornoSesso(int giorno, char sesso) {
		String codice;
		if (sesso == 'M') {
			if (giorno < 9)
				codice = ("0") + Integer.toString(giorno);
			else
				codice = Integer.toString(giorno);
		} else {
			codice = Integer.toString(giorno + 40);
		}
		return codice;
	}

	/**
	 * 
	 * @param comune
	 * @return
	 */
	private static String calcolaComune(String comune) {
		StringBuilder codiceComune = new StringBuilder();
		if (comune.equals("Rimini"))
			codiceComune.append("H294");
		else if (comune.equals("Milano"))
			codiceComune.append("F205");
		else if (comune.equals("Bologna"))
			codiceComune.append("A944");
		else if (comune.equals("Siracusa"))
			codiceComune.append("I754");
		else if (comune.equals("San Marino"))
			codiceComune.append("Z130");
		return codiceComune.toString().toUpperCase();
	}

	/**
	 * 
	 * @param cognome
	 * @param nome
	 * @param anno
	 * @param mese
	 * @param giorno
	 * @param sesso
	 * @param comune
	 * @return
	 */
	private static String calcolaCarControllo(String cognome, String nome, int anno, int mese, int giorno, char sesso,
			String comune) {
		StringBuilder codice = new StringBuilder();
		codice.append(calcolaCognome(cognome) + calcolaNome(nome) + calcolaAnno(anno) + calcolaMese(mese)
				+ calcolaGiornoSesso(giorno, sesso) + calcolaComune(comune));
		char controllo;
		String codiceCaratteri = codice.toString();
		int valoreControllo = 0;
		int[] dispari = { 1, 0, 5, 7, 9, 13, 15, 17, 19, 21, 2, 4, 18, 20, 11, 3, 6, 8, 12, 14, 16, 10, 22, 25, 24,
				23 };
		int[] pari = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		for (int i = 0; i < codiceCaratteri.length(); i++) {
			char c = codiceCaratteri.charAt(i);
			int valore;
			if (i % 2 == 0) {
				// posizione dispari
				if (Character.isDigit(c)) {
					valore = dispari[Character.getNumericValue(c)];
				} else {
					valore = dispari[c - 'A'];
				}
			} else {
				// posizione pari
				if (Character.isDigit(c)) {
					valore = pari[Character.getNumericValue(c)];
				} else {
					valore = pari[c - 'A'];
				}
			}
			valoreControllo += valore;
		}
		valoreControllo = valoreControllo % 26;
		controllo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(valoreControllo);
		return codice.append(controllo).toString();
	}

	/**
	 * 
	 * @param nome
	 * @param cognome
	 * @param giorno
	 * @param mese
	 * @param anno
	 * @param sesso
	 * @param comune
	 * @return
	 */
	public static String calcolaCodiceFiscale(String nome, String cognome, int giorno, int mese, int anno, char sesso,
			String comune) {
		return calcolaCarControllo(cognome, nome, anno, mese, giorno, sesso, comune);
	}

	/**
	 * 
	 * @param nome
	 * @param cognome
	 * @param giorno
	 * @param mese
	 * @param anno
	 * @param sesso
	 * @param comune
	 * @param codiceFiscale
	 * @return
	 */
	public static boolean verificaCodiceFiscale(String nome, String cognome, int giorno, int mese, int anno, char sesso,
			String comune, String codiceFiscale) {
		if (calcolaCodiceFiscale(nome, cognome, giorno, mese, anno, sesso, comune).equals(codiceFiscale))
			return true;
		return false;
	}
}

