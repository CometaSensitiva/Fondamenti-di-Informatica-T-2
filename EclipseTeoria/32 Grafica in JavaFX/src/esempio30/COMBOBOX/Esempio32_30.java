package esempio30.COMBOBOX;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
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
 * It demonstrates the usage of a ComboBox and a TextField.
 * 
 * The ComboBox allows selecting an option from a drop-down list.
 * 
 * The TextField displays the selected option and its index.
 * 
 * Author: michelemazzaa
 */
public class Esempio32_30 extends Application {
	private ComboBox<String> comboBox;
	private TextField txt1;

	/**
	 * 
	 * The start method is called when the application is launched.
	 * 
	 * It sets the title of the stage to "Esempio 30" and creates a FlowPane as the
	 * main panel.
	 * 
	 * A ComboBox, comboBox, is created and populated with items "Rosso", "Giallo",
	 * "Verde", and "Blu".
	 * 
	 * The width of the ComboBox is set to 100.
	 * 
	 * A TextField, txt1, is created with a preferred width of 300.
	 * 
	 * An action event handler is added to the ComboBox to update the TextField with
	 * the selected option and its index.
	 * 
	 * The panel is added to a Scene with a black background color.
	 * 
	 * Finally, the stage is set with the scene and shown.
	 * 
	 * @param stage the main stage of the application
	 */
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Esempio 30");
		FlowPane panel = new FlowPane();

		comboBox = new ComboBox<>();
		comboBox.setPrefWidth(100);
		comboBox.setItems(FXCollections.observableArrayList("Rosso", "Giallo", "Verde", "Blu"));

		txt1 = new TextField();
		txt1.setPrefWidth(300);

		comboBox.setOnAction(
				event -> txt1.setText("Opzione corrente : " + comboBox.getSelectionModel().getSelectedItem() + "("
						+ comboBox.getSelectionModel().getSelectedIndex() + ")"));

		panel.getChildren().addAll(comboBox, txt1);
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
