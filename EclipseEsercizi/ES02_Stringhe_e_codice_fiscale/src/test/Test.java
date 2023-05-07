package test;

import codicefiscale.*;

public class Test {
	
	public static void main(String[] args) {
		
		assert(CodiceFiscale.calcolaCodiceFiscale("Mario", "Rossi", 12, 6, 1976,'M', "Bologna").equals("RSSMRA76H12A944I"));
		assert(CodiceFiscale.calcolaCodiceFiscale("Mario", "Rossi", 1, 1, 1990, 'M', "Milano").equals("RSSMRA90A01F205Z"));
		assert(CodiceFiscale.verificaCodiceFiscale("Mario", "Rossi", 12, 6, 1976, 'M', "Bologna", "RSSMRA76H12A94QF"));
		assert(CodiceFiscale.verificaCodiceFiscale("Mario", "Rossi", 12, 6, 1976, 'M', "Bologna", "RSSMRA76H12A9Q4U"));
		assert(CodiceFiscale.verificaCodiceFiscale("Mario", "Rossi", 1, 1, 1990, 'M', "Milano", "RSSMRA90A01F20RU"));
		assert(CodiceFiscale.verificaCodiceFiscale("Mario", "Rossi", 1, 1, 1990, 'M', "Milano", "RSSMRA90A01F2L5K"));
		assert(CodiceFiscale.verificaCodiceFiscale("Mario", "Rossi", 1, 1, 1990, 'M', "Milano", "RSSMRA90A01FN05O"));
		assert(CodiceFiscale.verificaCodiceFiscale("Mario", "Rossi", 1, 1, 1990, 'M', "Milano", "RSSMRA90A0MF205R"));
		assert(CodiceFiscale.verificaCodiceFiscale("Mario", "Rossi", 1, 1, 1990, 'M', "Milano", "RSSMRA90AL1F205K"));
	}
}
