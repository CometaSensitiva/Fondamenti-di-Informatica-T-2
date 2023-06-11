package esempio12.button;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * 
 * This class represents an example program that demonstrates the usage of
 * JavaFX to create a GUI application.
 * 
 * It extends the Application class and implements the EventHandler<ActionEvent>
 * interface.
 * 
 * The program displays a label and a button, and when the button is clicked, it
 * toggles the text of the label between "Tizio" and "Caio".
 * 
 * @author michelemazzaa
 */
public class Esempio32_12 extends Application implements EventHandler<ActionEvent> {
	private Label l;

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
		stage.setTitle("Esempio 12");
		FlowPane panel = new FlowPane();
		l = new Label("Tizio");
		Button b = new Button("Tizio/Caio");
		b.setOnAction(this);
		b.setTooltip(new Tooltip("Premere per commutare"));
		panel.getChildren().addAll(l, b);
		Scene scene = new Scene(panel, Color.BLACK);
		stage.setScene(scene);
		stage.show();
	}

	/**
	 * 
	 * Handles the button click event. When the button is clicked, it toggles the
	 * text of the label between "Tizio" and "Caio".
	 * 
	 * @param event the event representing the button click
	 */
	public void handle(ActionEvent event) {
		l.setText(l.getText().equals("Tizio") ? "Caio" : "Tizio");
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