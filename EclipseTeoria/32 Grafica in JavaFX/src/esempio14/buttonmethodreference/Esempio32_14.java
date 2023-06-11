package esempio14.buttonmethodreference;

import javafx.application.Application;
import javafx.event.ActionEvent;
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
 * The program displays two buttons, "Rosso" and "Blu", and when either button
 * is clicked, it changes the background color of the panel accordingly.
 * 
 * The button click events are handled by the method myHandle.
 * 
 * Note: The code is missing imports for javafx.scene.paint.Color and
 * javafx.scene.control.Button.
 * 
 * Make sure to import them in your code.
 * 
 * @author michelemazzaa
 */
public class Esempio32_14 extends Application {
	private Button b1, b2;
	private FlowPane panel;

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
		stage.setTitle("Esempio 14");
		panel = new FlowPane();
		b1 = new Button("Rosso");
		b2 = new Button("Blu");
		b1.setOnAction(this::myHandle);
		b2.setOnAction(this::myHandle);
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
		launch(args);
	}

	/**
	 * 
	 * Handles the button click events. If the source of the event is b1, it sets
	 * the background color of the panel to red. If the source of the event is b2,
	 * it sets the background color of the panel to blue.
	 * 
	 * @param event the event representing the button click
	 */
	public void myHandle(ActionEvent event) {
		if (event.getSource() == b1) {
			panel.setStyle("-fx-background: red;");
		} else {
			panel.setStyle("-fx-background: blue;");
		}
	}
}
