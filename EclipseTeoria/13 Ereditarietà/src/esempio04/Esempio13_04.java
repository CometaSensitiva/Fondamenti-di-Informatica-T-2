package esempio04;

// import java.awt.Font;

import ed.utils.Finestra;

/**
 * The Esempio13_04 class contains the main method that creates and uses instances of
 * the Finestra class and its subclasses.
 * 
 * @author michelemazzaa
 */
public class Esempio13_04 {

	/**
	 * The main method creates instances of the Finestra class and its subclasses,
	 * and uses their print and println methods to print text and arithmetic results
	 * to their respective windows.
	 *
	 * @param args The command line arguments passed to the program. This method
	 *             does not use the args parameter.
	 */
	public static void main(String[] args) {
		// Create a new instance of the Finestra class and assign it to the variable f1
		Finestra f1 = new Finestra("f1");
		// Print the string "Ciao Mondo" to the window associated with the f1 instance
		// of the Finestra class
		f1.print("Ciao Mondo");

		// Create a new instance of the Finestra2 class and assign it to the variable f2
		Finestra2 f2 = new Finestra2("f2");
		// Print the string "Ciao Mondo" to the window associated with the f2 instance
		// of the Finestra2 class, followed by a newline character
		f2.println("Ciao Mondo");
		// Print the string "Sono la seconda finestra" to the window associated with the
		// f2 instance of the Finestra2 class, followed by a newline character
		f2.println("Sono la seconda finestra");
		// Print the string "Il risultato di 14+ 15 è : " to the window associated with
		// the f2 instance of the Finestra2 class
		f2.println("Il risultato di 14+ 15 è : ");
		// Print the result of the arithmetic expression 14+15 to the window associated
		// with the f2 instance of the Finestra2 class
		f2.print(14 + 15);

		// Create a new instance of the Finestra3 class and assign it to the variable f3
		Finestra3 f3 = new Finestra3("f3");
		// Print the string "Ciao Mondo" to the window associated with the f3 instance
		// of the Finestra3 class, followed by a newline character
		f3.println("Ciao Mondo");
		// Print the string "Sono la terza Finestra" to the window associated with the
		// f3 instance of the Finestra3 class, followed by a newline character
		f3.println("Sono la terza Finestra");
		// Print the string "Il risultato di 14+ 15 è : " to the window associated with
		// the f3 instance of the Finestra3 class
		f3.println("Il risultato di 14+ 15 è : ");
		// Print the result of the arithmetic expression 14+15 to the window associated
		// with the f3 instance of the Finestra3 class
		f3.print(14 + 15);

		/*
		 * The following code is commented out because it is currently not being used.
		 * It creates a new instance of the Finestra4 class, which is not defined in the
		 * code provided.
		 * 
		 * Finestra4 f4= new Finestra4("f4", Font.getFont("bold"));
		 * f4.print("Ciao Mondo Sono la quarta Finestra");
		 */
	}

}
