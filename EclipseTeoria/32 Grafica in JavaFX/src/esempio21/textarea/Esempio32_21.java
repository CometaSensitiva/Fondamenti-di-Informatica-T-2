package esempio21.textarea;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * 
 * This class represents an example application.
 * 
 * It extends the Application class and implements the start method.
 * 
 * The main method is also included to launch the application.
 * 
 * @author michelemazzaa
 */
public class Esempio32_21 extends Application {

	/**
	 * 
	 * The start method is called when the application is launched.
	 * 
	 * It sets the title of the stage to "Esempio 21" and creates a FlowPane as the
	 * main panel.
	 * 
	 * A TextArea named txt is created for input, initialized with the default text
	 * "Scrivere qui il testo".
	 * 
	 * A Label named l is created to display the number of characters in txt.
	 * 
	 * txt is set to have 25 columns and a listener is added to its textProperty to
	 * update the label with the number of letters in the text.
	 * 
	 * The panel is added to a Scene with a black background color.
	 * 
	 * Finally, the stage is set with the scene and shown.
	 * 
	 * @param stage the main stage of the application
	 * 
	 * @throws Exception if an exception occurs during the start method
	 */
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Esempio 21");

		FlowPane panel = new FlowPane();

		TextArea txt = new TextArea("Scrivere qui il testo");
		Label l = new Label("Numero Caratteri : 0");
		txt.setPrefColumnCount(25);
		txt.textProperty().addListener(
				(obs, oldValue, newValue) -> l.setText("Numero Lettere : " + txt.getText().trim().length()));

		panel.getChildren().addAll(txt, l);
		Scene scene = new Scene(panel, Color.BLACK);
		stage.setScene(scene);
		stage.show();
	}

	/**
	 * 
	 * The main method is the entry point of the application. It launches the
	 * application by calling the launch method with the provided arguments.
	 * 
	 * @param args the command-line arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
