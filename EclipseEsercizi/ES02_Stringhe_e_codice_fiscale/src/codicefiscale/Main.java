package codicefiscale;
/**
 * 
 * @author michelemazza
 *
 */
public class Main {

	public static void main(String[] args) {
		String codice=CodiceFiscale.calcolaCodiceFiscale("Mario", "Rossi", 12, 6, 1976,'M', "Bologna");
		System.out.println(codice); 
		codice=CodiceFiscale.calcolaCodiceFiscale("Mario", "Rossi", 1, 1, 1990, 'M', "Milano");
		System.out.println(codice); 
		codice=CodiceFiscale.calcolaCodiceFiscale("Michele", "Mazza", 18, 5, 2003, 'M', "San Marino");
		System.out.println(codice); 
	}

}
