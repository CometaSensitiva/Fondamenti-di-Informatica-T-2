package esempio04;

import javafx.application.*;
import javafx.stage.*;
import javafx.geometry.*;

/**
 * 
 * This class represents an example JavaFX application.
 * 
 * It displays a window titled "Esempio 4" with a width of 200 pixels and a
 * height of 100 pixels.
 * 
 * The window is positioned in the bottom-right corner of the screen based on
 * the screen dimensions obtained from the primary screen.
 * 
 * It also prints the dimensions of the screen to the console.
 * 
 * Note: The assumed screen dimensions are 1920 x 1040.
 * 
 * @author michelemazzaa
 */
public class Esempio32_04 extends Application {

	/**
	 * 
	 * The entry point of the JavaFX application.
	 * 
	 * It sets the title, width, height, and position of the stage based on the
	 * screen dimensions,
	 * 
	 * and shows the stage.
	 * 
	 * It also prints the dimensions of the screen to the console.
	 * 
	 * @param stage the primary stage for this application
	 */
	public void start(Stage stage) {
		stage.setTitle("Esempio 4");
		stage.setWidth(200);
		stage.setHeight(100);

		Rectangle2D screen = Screen.getPrimary().getVisualBounds();
		System.out.println(screen); // for me: 1920 x 1040

		stage.setX(screen.getMinX() + screen.getWidth() - stage.getWidth());
		stage.setY(screen.getMinY() + screen.getHeight() - stage.getHeight());

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