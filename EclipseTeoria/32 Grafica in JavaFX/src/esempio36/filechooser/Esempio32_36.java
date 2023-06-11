package esempio36.filechooser;

import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

/**
 * 
 * This class represents an example application.
 * 
 * It extends the Application class and implements the start method.
 * 
 * The main method is also included to launch the application.
 * 
 * It demonstrates the usage of a FileChooser to select a file.
 * 
 * @author: michelemazzaa
 */
public class Esempio32_36 extends Application {
	private FileChooser chooser;
	private File selectedFile;
	private Button button;
	private TextField txt1, txt2;

	/**
	 * 
	 * The start method is called when the application is launched.
	 * 
	 * It sets the title of the stage to "Esempio 24 ter" and creates a FlowPane as
	 * the main panel.
	 * 
	 * A button with the label "Scelta file" is created.
	 * 
	 * Two text fields, txt1 and txt2, are created.
	 * 
	 * The preferred width of txt1 is set to 300 and the preferred width of txt2 is
	 * set to 500.
	 * 
	 * The button's action is set to open a FileChooser dialog when clicked.
	 * 
	 * The FileChooser dialog is configured with filters for different file types.
	 * 
	 * The selected file is assigned to the selectedFile variable.
	 * 
	 * If a file is selected, the text fields are updated with the file name and
	 * path.
	 * 
	 * The button, txt1, and txt2 are added to the panel.
	 * 
	 * The panel's preferred height is set to 50.
	 * 
	 * A Scene is created with the panel and a black background color.
	 * 
	 * The scene is set as the scene for the stage, and the stage is shown.
	 * 
	 * @param stage the primary stage for the application
	 */
	public void start(Stage stage) {
		stage.setTitle("Esempio 36");
		FlowPane panel = new FlowPane();
		
		button = new Button("Scelta file");
		txt1 = new TextField();
		txt2 = new TextField();

		txt1.setPrefWidth(300);
		txt2.setPrefWidth(500);
		button.setOnAction(event -> {
			chooser = new FileChooser();
			chooser.setTitle("Apri file");
			chooser.getExtensionFilters().addAll(new ExtensionFilter("Text Files", ".txt"),
					new ExtensionFilter("Image Files", ".png", ".jpg", ".gif"),
					new ExtensionFilter("Audio Files", ".wav", ".mp3", ".aac"), new ExtensionFilter("All Files", ".*"));
			selectedFile = chooser.showOpenDialog(stage);
			if (selectedFile != null) {
				txt1.setText("File name: " + selectedFile.getName());
				txt2.setText("Percorso: " + selectedFile.getPath());
			}
		});

		panel.getChildren().addAll(button, txt1, txt2);
		panel.setPrefHeight(50);
		Scene scene = new Scene(panel, Color.BLACK);
		stage.setScene(scene);
		stage.show();
	}

	/**
	 * 
	 * The main method launches the JavaFX application.
	 * 
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
