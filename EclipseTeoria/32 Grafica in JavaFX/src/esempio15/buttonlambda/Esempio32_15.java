package esempio15.buttonlambda;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * 
 * This class represents an example program that demonstrates the usage of
 * JavaFX to create a GUI application.
 * 
 * It extends the Application class.
 * 
 * The program displays two buttons, "Rosso" and "Blue", and when either button
 * is clicked, it changes the background color of the panel accordingly.
 * 
 * The button click events are handled using lambda expressions.
 * 
 * Note: The code is missing imports for javafx.scene.paint.Color and
 * javafx.scene.control.Button.
 * 
 * Make sure to import them in your code.
 * 
 * @author michelemazzaa
 */
public class Esempio32_15 extends Application {
	private FlowPane panel;
	private Button b1, b2;

	/**
	 * 
	 * The entry point of the application. It sets up the stage, creates the UI
	 * elements, and shows the stage.
	 * 
	 * @param stage the primary stage for this application
	 * @throws Exception if an exception occurs during the execution of the method
	 */
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Esempio 15");
		panel = new FlowPane();
		b1 = new Button("Rosso");
		b2 = new Button("Blue");
		b1.setOnAction(event -> panel.setStyle("-fx-background: red;"));
		b2.setOnAction(event -> panel.setStyle("-fx-background: blue;"));
		panel.getChildren().addAll(b1, b2);
		Scene scene = new Scene(panel, Color.BLACK);
		stage.setScene(scene);
		stage.show();
	}

	/**
	 * 
	 * The main method of the program. It launches the JavaFX application.
	 * 
	 * @param args the command-line arguments
	 */
	public static void main(String[] args) {
		launch();
	}
}
