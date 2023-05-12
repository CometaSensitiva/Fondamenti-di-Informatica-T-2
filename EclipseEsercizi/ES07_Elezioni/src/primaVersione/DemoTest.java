package primaVersione;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * The DemoTest class provides JUnit test cases for the CalcolatoreSeggi class.
 * It demonstrates the usage of the vote calculator to calculate seat
 * allocations for different scenarios. The results are asserted using JUnit
 * assertions.
 * 
 * @author michelemazzaa
 */
public class DemoTest {

	@Test
	public void test1() {
		CalcolatoreSeggi calculator = new CalcolatoreSeggi("proporzionale", new StringBuilder());

		String[] partiti = { "Formiche rosse", "Topolini grigi", "Farfalle blu", "Bruchi verdi", "Canarini gialli" };
		long[] voti = { 10, 100, 200, 300, 400 };
		final long SEGGI_DA_ASSEGNARE = 100;
		long[] seggi = calculator.calcolaSeggi(SEGGI_DA_ASSEGNARE, partiti, voti);

		long[] expectedSeggi = { 1, 10, 20, 30, 40 };
		assertArrayEquals(expectedSeggi, seggi);
	}

	@Test
	public void test2() {
		CalcolatoreSeggi calculator = new CalcolatoreSeggi("proporzionale", new StringBuilder());

		String[] partiti = { "Lista A\t", "Lista B\t", "Lista C\t", "Lista D\t" };
		long[] voti = { 171000, 132000, 84000, 36000 };
		final long SEGGI_DA_ASSEGNARE = 8;
		long[] seggi = calculator.calcolaSeggi(SEGGI_DA_ASSEGNARE, partiti, voti);

		long[] expectedSeggi = { 3, 2, 2, 1 };
		assertArrayEquals(expectedSeggi, seggi);
	}

	@Test
	public void test3() {
		CalcolatoreSeggi calculator = new CalcolatoreSeggi("proporzionale", new StringBuilder());

		String[] partiti = { "Gialli", "Bianchi", "Rossi", "Verdi", "Blu", "Rosa" };
		long[] voti = { 47000, 16000, 15800, 12000, 6100, 3100 };
		final long SEGGI_DA_ASSEGNARE = 10;
		long[] seggi = calculator.calcolaSeggi(SEGGI_DA_ASSEGNARE, partiti, voti);

		long[] expectedSeggi = { 5, 2, 1, 1, 1, 0 };
		assertArrayEquals(expectedSeggi, seggi);
	}
}
