package esempio26.listview;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
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
 * It demonstrates the usage of a ListView and a TextField.
 * 
 * When an item in the ListView is selected, the TextField displays the selected
 * option.
 * 
 * Author: michelemazzaa
 */
public class Esempio32_26 extends Application {
	private ListView<String> listView;
	private TextField txt1;

	/**
	 * 
	 * The start method is called when the application is launched.
	 * 
	 * It sets the title of the stage to "Esempio 26" and creates a FlowPane as the
	 * main panel.
	 * 
	 * A ListView, listView, is created and populated with items "Rosso", "Giallo",
	 * "Verde", and "Blu".
	 * 
	 * The height and width of the ListView are set based on the number of items.
	 * 
	 * A listener is added to the selectedItemProperty of the ListView to update the
	 * TextField with the selected option.
	 * 
	 * A TextField, txt1, is created as read-only.
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
		stage.setTitle("Esempio 26");
		FlowPane panel = new FlowPane();

		listView = new ListView<>();
		listView.setItems(FXCollections.observableArrayList("Rosso", "Giallo", "Verde", "Blu"));
		listView.setPrefHeight(listView.getItems().size() * 24 + 2);
		listView.setPrefWidth(72);
		listView.getSelectionModel().selectedItemProperty()
				.addListener((obj, oldVal, newVal) -> txt1.setText("Opzione corrente : " + newVal));
		txt1 = new TextField();
		txt1.setEditable(false);
		panel.getChildren().addAll(listView, txt1);
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
