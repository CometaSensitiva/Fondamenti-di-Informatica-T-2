package secondaVersione;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

/**
 * 
 * This class contains the unit test for the "calcolaSeggi" method in the
 * "CalcolatoreSeggi" class.
 * 
 * It verifies the correctness of the calculation by comparing the expected and
 * actual results.
 * 
 * @author michelemazzaa
 */
public class DemoTest {

	/**
	 * 
	 * Test the "calcolaSeggi" method in the "CalcolatoreSeggi" class.
	 */
	@Test
	public void testCalcolaSeggi() {
		StringBuilder sb = new StringBuilder();
		CalcolatoreSeggi calculator = new CalcolatoreSeggi("Calcolatore Seggi", sb);

		RisultatoDelPartito[] partiti = { new RisultatoDelPartito("Formiche rosse", 10, -1),
				new RisultatoDelPartito("Topolini grigi", 100, -1), new RisultatoDelPartito("Farfalle blu", 200, -1),
				new RisultatoDelPartito("Bruchi verdi", 300, -1), new RisultatoDelPartito("Canarini ocra", 400, -1) };
		long seggiDaAssegnare = 100;
		calculator.calcolaSeggi(seggiDaAssegnare, partiti);

		String expected = "Formiche rosse,	voti=10,	seggi=-1\n" + "Topolini grigi,	voti=100,	seggi=-1\n"
				+ "Farfalle blu,	voti=200,	seggi=-1\n" + "Bruchi verdi,	voti=300,	seggi=-1\n"
				+ "Canarini ocra,	voti=400,	seggi=-1\n" + "Seggi da assegnare: 100\n"
				+ "Quoziente elettorale: 10.1\n" + "Seggi assegnati al primo giro: \n"
				+ "Formiche rosse,	voti=10,	seggi=0\n" + "Topolini grigi,	voti=100,	seggi=9\n"
				+ "Farfalle blu,	voti=200,	seggi=19\n" + "Bruchi verdi,	voti=300,	seggi=29\n"
				+ "Canarini ocra,	voti=400,	seggi=39\n" + "Resti dopo il primo giro: \n"
				+ "RestoDelPartito [partito=Formiche rosse, resto=10]\n"
				+ "RestoDelPartito [partito=Topolini grigi, resto=9]\n"
				+ "RestoDelPartito [partito=Farfalle blu, resto=8]\n"
				+ "RestoDelPartito [partito=Bruchi verdi, resto=7]\n"
				+ "RestoDelPartito [partito=Canarini ocra, resto=6]\n" + "Seggi ancora da assegnare: 4\n"
				+ "Seggi assegnati alla fine: \n" + "Formiche rosse,	voti=10,	seggi=1\n"
				+ "Topolini grigi,	voti=100,	seggi=10\n" + "Farfalle blu,	voti=200,	seggi=20\n"
				+ "Bruchi verdi,	voti=300,	seggi=30\n" + "Canarini ocra,	voti=400,	seggi=39\n" + "";
		String actual = sb.toString();
		assertEquals(expected, actual);
	}

}
