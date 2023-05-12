package secondaVersione;

/**
 * 
 * This class serves as a demo for the "CalcolatoreSeggi" class. It demonstrates
 * the usage of the class
 * 
 * by performing a test calculation and printing the results.
 * 
 * @author michelemazzaa
 */
public class Demo {

	/**
	 * 
	 * The main entry point of the program.
	 * 
	 * @param args The command-line arguments.
	 */
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		CalcolatoreSeggi calculator = new CalcolatoreSeggi("Calcolatore Seggi", sb);

		test1(calculator);
		System.out.println(sb.toString());
	}

	/**
	 * 
	 * Performs a test calculation using the provided "CalcolatoreSeggi" object and
	 * prints the results.
	 * 
	 * @param calculator The instance of "CalcolatoreSeggi" used for the
	 *                   calculation.
	 */
	private static void test1(CalcolatoreSeggi calculator) {
		RisultatoDelPartito[] partiti = { new RisultatoDelPartito("Formiche rosse", 10, -1),
				new RisultatoDelPartito("Topolini grigi", 100, -1), new RisultatoDelPartito("Farfalle blu", 200, -1),
				new RisultatoDelPartito("Bruchi verdi", 300, -1), new RisultatoDelPartito("Canarini ocra", 400, -1) };
		long seggiDaAssegnare = 100;
		calculator.calcolaSeggi(seggiDaAssegnare, partiti);
	}
}