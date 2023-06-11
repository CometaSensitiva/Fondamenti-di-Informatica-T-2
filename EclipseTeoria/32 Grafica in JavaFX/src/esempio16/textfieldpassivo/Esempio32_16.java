package esempio16.textfieldpassivo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
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
 * The program displays two text fields and a button. When the button is
 * clicked, it updates the second text field with the text from the first text
 * field.
 * 
 * Note: The code is missing imports for javafx.scene.paint.Color,
 * javafx.scene.control.TextField, and javafx.scene.control.Button.
 * 
 * Make sure to import them in your code.
 * 
 * @author michelemazzaa
 */
public class Esempio32_16 extends Application {

	/**
	 * 
	 * The entry point of the application.
	 * 
	 * It sets up the stage, creates the UI elements, and shows the stage.
	 * 
	 * @param stage the primary stage for this application
	 * 
	 * @throws Exception if an exception occurs during the execution of the method
	 */
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Esempio 16");
		FlowPane panel = new FlowPane();

		TextField txt1 = new TextField("Scrivere qui il nuovo messaggio");
		txt1.setPrefColumnCount(25);

		TextField txt2 = new TextField();
		txt2.setPrefColumnCount(25);

		Button b = new Button("Aggiorna");
		b.setOnAction(event -> txt2.setText(txt1.getText()));

		panel.getChildren().addAll(txt1, txt2, b);
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
}
