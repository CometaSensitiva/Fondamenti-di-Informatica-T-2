package esempio01;

/**
 * The Esempio1 class demonstrates how to print the arguments passed to a Java
 * program from the command line.
 * 
 * @author michelemazzaa
 */
public class Esempio07_01 {

	/**
	 * The main method is the entry point of the program. It checks whether any
	 * arguments were passed to the program from the command line, and prints them
	 * out.
	 * 
	 * @param args The command line arguments.
	 */
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("No arguments");
		} else {
			for (int i = 0; i < args.length; i++) {
				System.out.println("Argument " + i + ": " + args[i]);
			}
		}
	}
}
