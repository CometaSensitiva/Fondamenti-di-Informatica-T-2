package esempio25.radiobutton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
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
 * It demonstrates the usage of RadioButtons and a TextField.
 * 
 * When a RadioButton is selected, the TextField displays the selected option.
 * 
 * Author: michelemazzaa
 */
public class Esempio32_25 extends Application {
	private RadioButton b1, b2, b3;
	private ToggleGroup tg;
	private TextField txt1;

	/**
	 * 
	 * The start method is called when the application is launched. It sets the
	 * title of the stage to "Esempio 25" and creates a FlowPane as the main panel.
	 * A ToggleGroup, tg, is created to group the RadioButtons together. Three
	 * RadioButtons, b1, b2, and b3, are created with labels "Pere", "Pere", and
	 * "Arance" respectively. A TextField, txt1, is created as read-only. Action
	 * event handlers are set for the RadioButtons to call the myHandle method. The
	 * panel is added to a Scene with a black background color. Finally, the stage
	 * is set with the scene and shown.
	 * 
	 * @param stage the main stage of the application
	 * @throws Exception if an exception occurs during the start method
	 */
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Esempio 25");
		FlowPane panel = new FlowPane();
		tg = new ToggleGroup();
		b1 = new RadioButton("Pere");
		b1.setToggleGroup(tg);
		b2 = new RadioButton("Mele");
		b2.setToggleGroup(tg);
		b3 = new RadioButton("Arance");
		b3.setToggleGroup(tg);
		txt1 = new TextField();
		txt1.setEditable(false);
		tg.selectedToggleProperty().addListener(
				(changed, oldval, newval) -> txt1.setText("Opzione corrente: " + ((RadioButton) newval).getText()));
		panel.getChildren().addAll(b1, b2, b3, txt1);
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
