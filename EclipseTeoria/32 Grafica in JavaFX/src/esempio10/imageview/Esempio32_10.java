package esempio10.imageview;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * 
 * The Esempio32_10 class is an example JavaFX application that displays an
 * image.
 * 
 * The image is loaded from a specified URL and displayed in a stage.
 * 
 * The application extends the Application class and overrides the start()
 * method.
 * 
 * @author michelemazzaa
 */
public class Esempio32_10 extends Application {

	/**
	 * 
	 * The URL of the image to be displayed.
	 */
	final static String URL = "https://pbs.twimg.com/media/FM9kV5XUUAE2dWb.jpg";

	/**
	 * 
	 * The main entry point for the JavaFX application.
	 * 
	 * @param args The command line arguments.
	 */
	public static void main(String[] args) {
		launch(args);
	}

	/**
	 * 
	 * The start method is called when the application is launched. It sets up the
	 * stage, creates a panel, and displays the image in the center.
	 * 
	 * @param stage The primary stage for the JavaFX application.
	 * @throws Exception If an exception occurs during the application startup.
	 */
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Esempio 10");
		BorderPane panel = new BorderPane();
		panel.setCenter(new ImageView(new Image(URL, 1000, 667, true, false)));
		Scene scene = new Scene(panel, 1100, 700, Color.WHITE);
		stage.setScene(scene);
		stage.show();
	}
}
