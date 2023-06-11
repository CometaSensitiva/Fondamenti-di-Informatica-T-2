package esempio03;

import javafx.application.*;
import javafx.stage.*;

/**
 * 
 * This class represents an example JavaFX application.
 * 
 * It displays a window titled "Esempio 3" with a minimum width of 100 pixels,
 * maximum width of 300 pixels,
 * 
 * and a preferred width of 200 pixels. It also has a minimum height of 50
 * pixels, maximum height of 200 pixels,
 * 
 * and a preferred height of 100 pixels.
 * 
 * @author michelemazzaa
 */
public class Esempio32_03 extends Application {

	/**
	 * 
	 * The entry point of the JavaFX application. It sets the title, minimum width,
	 * maximum width, preferred width, minimum height, maximum height, preferred
	 * height of the stage, and shows the stage.
	 * 
	 * @param stage the primary stage for this application
	 */
	public void start(Stage stage) {
		stage.setTitle("Esempio 3");
		stage.setMinWidth(100);
		stage.setMaxWidth(300);
		stage.setWidth(200);
		stage.setMinHeight(50);
		stage.setMaxHeight(200);
		stage.setHeight(100);
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