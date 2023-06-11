package esempio05;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;;

/**
 * 
 * This class represents an example JavaFX application.
 * 
 * It displays a window titled "Esempio 5" with a yellow background color.
 * 
 * The window contains a Pane as its root node with a width of 300 pixels and a
 * height of 50 pixels.
 * 
 * Note: The root node does not contain any visible elements in this example.
 * 
 * @author michelemazzaa
 */
public class Esempio32_05 extends Application {

	/**
	 * 
	 * The entry point of the JavaFX application.
	 * 
	 * It sets the title of the stage, creates a Pane as the root node,
	 * 
	 * creates a Scene with the specified width, height, and background color,
	 * 
	 * sets the scene to the stage, and shows the stage.
	 * 
	 * @param stage the primary stage for this application
	 */
	public void start(Stage stage) {
		stage.setTitle("Esempio 5");

		Pane root = new Pane();

		Scene scene = new Scene(root, 300, 50, Color.YELLOW);

		stage.setScene(scene);
		stage.show();
	}

	/**
	 * 
	 * The main method of the application. It launches the JavaFX application.
	 * 
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}
}