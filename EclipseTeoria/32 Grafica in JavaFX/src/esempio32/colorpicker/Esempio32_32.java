package esempio32.colorpicker;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
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
 * It demonstrates the usage of a ColorPicker and three TextFields.
 * 
 * The ColorPicker allows selecting a color from a color palette.
 * 
 * The TextFields display the RGB values of the selected color.
 * 
 * @author: michelemazzaa
 */
public class Esempio32_32 extends Application {
	private ColorPicker picker;
	private TextField txt1, txt2, txt3;

	/**
	 * 
	 * The start method is called when the application is launched.
	 * 
	 * It sets the title of the stage to "Esempio 32" and creates a FlowPane as the
	 * main panel.
	 * 
	 * Three TextFields, txt1, txt2, and txt3, are created and set as not editable.
	 * 
	 * A ColorPicker, picker, is created.
	 * 
	 * An action event handler is added to the picker to update the TextFields with
	 * the RGB values of the selected color.
	 * 
	 * The panel is added to a Scene with a black background color.
	 * 
	 * Finally, the stage is set with the scene and shown.
	 * 
	 * @param stage the main stage of the application
	 */
	public void start(Stage stage) {
		stage.setTitle("Esempio 32");
		FlowPane panel = new FlowPane();
		txt1 = new TextField();
		txt1.setEditable(false);
		txt2 = new TextField();
		txt2.setEditable(false);
		txt3 = new TextField();
		txt3.setEditable(false);
		picker = new ColorPicker();
		picker.setOnAction(event -> {
			txt1.setText("Rosso: " + picker.getValue().getRed());
			txt2.setText("Verde: " + picker.getValue().getGreen());
			txt3.setText("Blu: " + picker.getValue().getBlue());
		});

		panel.getChildren().addAll(picker, txt1, txt2, txt3);
		panel.setPrefHeight(50);
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
