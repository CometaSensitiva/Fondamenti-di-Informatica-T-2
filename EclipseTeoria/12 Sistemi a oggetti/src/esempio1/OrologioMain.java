package esempio1;

/**
 * The OrologioMain class contains the main method to run the Orologio program.
 * 
 * @author michelemazzaa
 */
public class OrologioMain {

	/**
	 * The main method initializes an Orologio object with a time of 12:00:00, and
	 * then continuously prints the time to the console, updates the time by one
	 * second, and repeats indefinitely.
	 * 
	 * @param args The command line arguments passed to the program.
	 */
	public static void main(String[] args) {
		Orologio o1 = new Orologio(12, 0, 0);

		while (true) {
			System.out.println(o1);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// do nothing
			}
			o1.tic();
		}
	}
}
