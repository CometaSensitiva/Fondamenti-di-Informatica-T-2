package esempio33.slider;

import java.text.NumberFormat;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
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
 * It demonstrates the usage of a Slider and a TextField.
 * 
 * The Slider allows selecting a value within a specified range.
 * 
 * The TextField displays the current value of the Slider.
 * 
 * Author: michelemazzaa
 */
public class Esempio32_33 extends Application {
	private Slider slider;
	private TextField txt1;
	private NumberFormat formatter = NumberFormat.getInstance();

	/**
	 * 
	 * The start method is called when the application is launched.
	 * 
	 * It sets the title of the stage to "Esempio 33" and creates a FlowPane as the
	 * main panel.
	 * 
	 * A TextField, txt1, is created and set as not editable.
	 * 
	 * A Slider, slider, is created with a minimum value of 0, maximum value of 10,
	 * and an initial value of 5.
	 * 
	 * Styling options are set for the slider, including tick marks, labels, and
	 * snap to ticks.
	 * 
	 * A change listener is added to the slider to update the TextField with the
	 * current value of the slider.
	 * 
	 * The panel is added to a Scene with a black background color.
	 * 
	 * Finally, the stage is set with the scene and shown.
	 * 
	 * @param stage the main stage of the application
	 */
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Esempio 33");
		formatter.setMaximumFractionDigits(2);
		FlowPane panel = new FlowPane();
		txt1 = new TextField();
		txt1.setPrefWidth(250);
		txt1.setEditable(false);
		slider = new Slider(0, 10, 5);
		slider.setShowTickMarks(true);
		slider.setShowTickLabels(true);
		slider.setMajorTickUnit(1);
		slider.setMinorTickCount(1);
		slider.setBlockIncrement(1);
		slider.setSnapToTicks(true);
		slider.setPrefWidth(250);
		slider.valueProperty().addListener((obj, oldVal, newVal) -> txt1
				.setText("Valore corrente : " + formatter.format(newVal) + " (era " + formatter.format(oldVal) + ")"));
		panel.getChildren().addAll(slider, txt1);
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
