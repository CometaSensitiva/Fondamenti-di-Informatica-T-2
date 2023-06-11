package esempio18.textarea;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
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
 * The program displays a text area, a label showing the number of characters in
 * the text area, and a button.
 * 
 * When the button is clicked, it updates the label with the number of letters
 * in the text area.
 * 
 * Note: The code is missing imports for javafx.scene.paint.Color,
 * javafx.scene.control.TextArea, javafx.scene.control.Label, and
 * javafx.scene.control.Button.
 * 
 * Make sure to import them in your code.
 * 
 * @author michelemazzaa
 */
public class Esempio32_18 extends Application {

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
		stage.setTitle("Esempio 18");

		FlowPane panel = new FlowPane();

		TextArea txt = new TextArea("Scrivere qui il testo");
		txt.setPrefColumnCount(25);

		Label l = new Label("Numero Caratteri : 0");

		Button b = new Button("Aggiorna");

		b.setOnAction(event -> l.setText("Numero Lettere : " + txt.getText().trim().length()));

		panel.getChildren().addAll(txt, l, b);
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
