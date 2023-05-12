package primaVersione;

/**
 * The Demo class provides sample test cases for the CalcolatoreSeggi class. It
 * demonstrates the usage of the vote calculator to calculate seat allocations
 * for different scenarios. The results and logs are printed to the console.
 * 
 * @author michelemazzaa
 */
public class Demo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();

		CalcolatoreSeggi calculator = new CalcolatoreSeggi("proporzionale", sb);

		test1(calculator);
		test2(calculator);
		test3(calculator);
	}

	/**
	 * Executes a test case with sample data. Prints the party names, votes, and
	 * seat allocations. Also prints the calculation log.
	 * 
	 * @param calculator The CalcolatoreSeggi object.
	 */
	public static void test1(CalcolatoreSeggi calculator) {
		String[] partiti = { "Formiche rosse", "Topolini grigi", "Farfalle blu", "Bruchi verdi", "Canarini gialli" };
		long[] voti = { 10, 100, 200, 300, 400 };
		final long SEGGI_DA_ASSEGNARE = 100;
		long[] seggi = calculator.calcolaSeggi(SEGGI_DA_ASSEGNARE, partiti, voti);
		System.out.println("PARTITO\t" + "\t" + "VOTI" + "\t" + "SEGGI");
		for (int i = 0; i < partiti.length; i++)
			System.out.println(partiti[i] + "\t " + voti[i] + "\t " + seggi[i]);
		System.out.println("---Log calcolo---" + System.lineSeparator() + calculator.getLogger());
	}

	/**
	 * Executes a test case with sample data. Prints the party names, votes, and
	 * seat allocations. Also prints the calculation log.
	 * 
	 * @param calculator The CalcolatoreSeggi object.
	 */
	public static void test2(CalcolatoreSeggi calculator) {
		String[] partiti = { "Lista A\t", "Lista B\t", "Lista C\t", "Lista D\t" };
		long[] voti = { 171000, 132000, 84000, 36000 };
		final long SEGGI_DA_ASSEGNARE = 8;
		long[] seggi = calculator.calcolaSeggi(SEGGI_DA_ASSEGNARE, partiti, voti);
		System.out.println("PARTITO\t" + "\t" + "VOTI" + "\t" + "SEGGI");
		for (int i = 0; i < partiti.length; i++)
			System.out.println(partiti[i] + "\t " + voti[i] + "\t " + seggi[i]);
		System.out.println("---Log calcolo---" + System.lineSeparator() + calculator.getLogger());
	}

	/**
	 * Executes a test case with sample data. Prints the party names, votes, and
	 * seat allocations. Also prints the calculation log.
	 * 
	 * @param calculator The CalcolatoreSeggi object.
	 */
	public static void test3(CalcolatoreSeggi calculator) {
		String[] partiti = { "Gialli", "Bianchi", "Rossi", "Verdi", "Blu", "Rosa" };
		long[] voti = { 47000, 16000, 15800, 12000, 6100, 3100 };
		final long SEGGI_DA_ASSEGNARE = 10;
		long[] seggi = calculator.calcolaSeggi(SEGGI_DA_ASSEGNARE, partiti, voti);

		System.out.println("PARTITO\t" + "\t" + "VOTI" + "\t" + "SEGGI");
		for (int i = 0; i < partiti.length; i++)
			System.out.println(partiti[i] + "\t" + "\t " + voti[i] + "\t " + seggi[i]);
		System.out.println("---Log calcolo---" + System.lineSeparator() + calculator.getLogger());
	}
}
