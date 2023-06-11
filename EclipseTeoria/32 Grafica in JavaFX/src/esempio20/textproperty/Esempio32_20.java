package esempio20.textproperty;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
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
public class Esempio32_20 extends Application {

	/**
	 * 
	 * The start method is called when the application is launched.
	 * 
	 * It sets the title of the stage to "Esempio 20" and creates a FlowPane as the
	 * main panel.
	 * 
	 * Two TextFields are created, txt1 and txt2, and added to the panel.
	 * 
	 * txt1 is a TextField for input, initialized with the default text "Scrivere
	 * qui il nuovo messaggio".
	 * 
	 * txt2 is a read-only TextField used to display the contents of txt1.
	 * 
	 * A listener is added to txt1's textProperty to update txt2's text whenever it
	 * changes.
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
		stage.setTitle("Esempio 20");
		FlowPane panel = new FlowPane();

		TextField txt1 = new TextField("Scrivere qui il nuovo messaggio");
		txt1.setPrefColumnCount(25);

		TextField txt2 = new TextField();
		txt2.setEditable(false);
		txt2.setPrefColumnCount(25);

		txt1.textProperty().addListener((obs, oldValue, newValue) -> {
			System.out.println("Cambio: da " + oldValue + " a " + newValue);
			txt2.setText(newValue);
		});

		panel.getChildren().addAll(txt1, txt2);
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