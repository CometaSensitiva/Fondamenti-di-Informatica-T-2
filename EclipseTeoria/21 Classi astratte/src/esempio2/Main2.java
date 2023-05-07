package esempio2;

/**
 * This class contains the main method to test the behavior of the animal
 * classes.
 * 
 * @author michelemazzaa
 */
public class Main2 {

	/**
	 * The main method creates instances of different animal classes and displays
	 * their information using the mostra() method.
	 * 
	 * @param args command line arguments (not used)
	 */
	public static void main(String[] args) {
		AnimaleTerrestre elefante = new Elefante("Dumbo"); // create an instance of an elephant
		AnimaleAcquatico squalo = new Squalo("Bruce"); // create an instance of a shark
		PesceDiMare pesce = new Tonno("Nemo"); // create an instance of a tuna fish

		Animale[] zoo = { elefante, squalo, pesce }; // create an array of animals
		for (Animale x : zoo) {
			x.mostra(); // print the information of each animal using the mostra() method
		}
	}

}
