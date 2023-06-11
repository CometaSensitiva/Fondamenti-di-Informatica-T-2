package esempio01;

import javafx.application.*;
import javafx.stage.*;

//--module-path /... /javafx-sdk-20.0.1/lib  --add-modules=javafx.controls,javafx.fxml

/**
 * 
 * This class represents an example JavaFX application.
 * 
 * It displays a window titled "Esempio 1".
 * 
 * @author michelemazzaa
 */
public class Esempio32_01 extends Application {

	/**
	 * 
	 * The entry point of the JavaFX application. It sets the title of the stage to
	 * "Esempio 1" and shows the stage.
	 * 
	 * @param stage the primary stage for this application
	 */
	public void start(Stage stage) {
		stage.setTitle("Esempio 1");
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