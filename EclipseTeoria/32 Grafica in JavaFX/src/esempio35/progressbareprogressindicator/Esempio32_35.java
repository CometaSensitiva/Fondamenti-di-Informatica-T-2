package esempio35.progressbareprogressindicator;

import java.text.NumberFormat;
import java.util.Locale;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
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
 * It demonstrates the usage of a ProgressBar, ProgressIndicator, and TextField.
 * 
 * The ProgressBar and ProgressIndicator show the progress of a task, and the
 * TextField displays the current progress value.
 * 
 * Author: michelemazzaa
 */
public class Esempio32_35 extends Application {
	private ProgressBar progressBar;
	private ProgressIndicator progressIndicator;

	private TextField txt1;
	private NumberFormat formatter = NumberFormat.getPercentInstance(Locale.getDefault());

	/**
	 * 
	 * The start method is called when the application is launched.
	 * 
	 * It sets the title of the stage to "Esempio 35" and creates a FlowPane as the
	 * main panel.
	 * 
	 * A TextField, txt1, is created and set as not editable.
	 * 
	 * A ProgressBar, progressBar, and a ProgressIndicator, progressIndicator, are
	 * created with an initial progress value of 0.25.
	 * 
	 * A change listener is added to the progressBar to update the TextField with
	 * the current progress value.
	 * 
	 * The progress of the progressBar is then set to 0.456.
	 * 
	 * The elements are added to the panel, which is set to a preferred height.
	 * 
	 * The panel is added to a Scene with a black background color.
	 * 
	 * Finally, the stage is set with the scene and shown.
	 * 
	 * @param stage the main stage of the application
	 */
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Esempio 35");
		formatter.setMaximumFractionDigits(2);
		FlowPane panel = new FlowPane();

		txt1 = new TextField();
		txt1.setPrefWidth(250);
		txt1.setEditable(false);

		progressBar = new ProgressBar(0.25);
		progressIndicator = new ProgressIndicator(0.25);
		progressBar.progressProperty().addListener((changed, oldval, newval) -> txt1
				.setText("Valore corrente: " + formatter.format(newval) + " (era: " + formatter.format(oldval) + ")"));
		progressBar.setProgress(0.456);
		panel.getChildren().addAll(progressBar, progressIndicator, txt1);
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
