package esempio05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * The Esempio36_05 class calculates the approximation of pi using float precision.
 * 
 * It prompts the user for a desired precision level and performs the
 * calculation.
 * 
 * The loop continues until the desired precision is achieved or the number of
 * sides exceeds a certain limit.
 * 
 * The calculated values for pi with lower and upper bounds are displayed at
 * each iteration.
 * 
 * Note: The code does not include Javadoc comments for individual variables
 * since their meanings are not clear from the context.
 * 
 * However, the code is appropriately formatted and includes comments to explain
 * its purpose.
 * 
 * @author michelemazzaa
 */
public class Esempio36_05 {
	public static void main(String[] args) {
		System.out.println("Calculating pi using FLOAT precision.");
		// Prompt for precision level
		System.out.print("Precision [1e-8]? ");
		float eps = 1E-8F; // Default precision

		try {
			BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));
			eps = Float.parseFloat(kbd.readLine());
		} catch (IOException e) {
			System.err.println("Input error - Program exit");
			System.exit(1);
		}

		float nlati = 4.0F;
		float ln = (float) Math.sqrt(2.0);
		float smpinf, smpsup;

		do {
			float OC2 = (float) Math.sqrt(4.0 - ln * ln);
			nlati *= 2.0;
			ln = (float) Math.sqrt(2.0F - OC2);
			smpinf = ln * nlati / 2.0F;
			smpsup = ln * nlati / OC2;
			System.out.println("nl=" + nlati + " d2=" + OC2 + " piInf=" + smpinf + " piSup=" + smpsup);
		} while ((smpsup - smpinf >= eps) && (nlati < 1e+19));
	}
}