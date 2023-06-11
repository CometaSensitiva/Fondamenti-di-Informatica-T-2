package esempio02;

import javafx.application.*;
import javafx.stage.*;

/**
 * 
 * This class represents an example JavaFX application.
 * 
 * It displays a window titled "Esempio 2" with a width of 200 pixels, height of
 * 100 pixels,
 * 
 * and positioned at coordinates (300, 300) on the screen.
 * 
 * @author michelemazzaa
 */
public class Esempio32_02 extends Application {

	/**
	 * 
	 * The entry point of the JavaFX application. It sets the title, width, height,
	 * and position of the stage, and shows the stage.
	 * 
	 * @param stage the primary stage for this application
	 */
	public void start(Stage stage) {
		stage.setTitle("Esempio 2");
		stage.setWidth(200);
		stage.setHeight(100);
		stage.setX(300);
		stage.setY(300);
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