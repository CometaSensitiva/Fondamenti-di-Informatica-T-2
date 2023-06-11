package esempio27.listviewdinamica;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
 * It demonstrates the usage of a ListView, TextFields, and Buttons.
 * 
 * The ListView allows multiple selections.
 * 
 * The TextFields are used to display the selected options and add/remove items
 * from the ListView.
 * 
 * Author: michelemazzaa
 */
public class Esempio32_27 extends Application {

	private ListView<String> listview;
	private TextField txt1, txt2;
	private Button ba, br;

	/**
	 * 
	 * The start method is called when the application is launched. It sets the
	 * title of the stage to "Esempio 27" and creates a FlowPane as the main panel.
	 * A ListView, listview, is created and populated with items "Rosso", "Giallo",
	 * "Verde", and "Blu". The selection mode of the ListView is set to MULTIPLE. A
	 * listener is added to the selectedItemProperty of the ListView to update the
	 * first TextField with the selected options. Two TextFields, txt1 and txt2, are
	 * created with preferred column counts. Two Buttons, ba and br, are created
	 * with labels "Add" and "Remove" respectively. The panel is added to a Scene.
	 * Action event handlers are set for the buttons to add or remove items from the
	 * ListView based on the input in txt2. Finally, the stage is set with the scene
	 * and shown.
	 * 
	 * @param stage the main stage of the application
	 */
	public void start(Stage stage) {
		stage.setTitle("Esempio 27");
		FlowPane panel = new FlowPane();
		listview = new ListView<>();
		listview.setItems(FXCollections.observableArrayList("Rosso", "Giallo", "Verde", "Blu"));
		listview.setPrefHeight(listview.getItems().size() * 24 + 2);
		listview.setPrefWidth(72);
		listview.getSelectionModel().selectedItemProperty().addListener((obj, oldval, newval) -> {
			StringBuilder sb = new StringBuilder();
			for (String item : listview.getSelectionModel().getSelectedItems())
				sb.append(item + ", ");
			txt1.setText("Opzione corrente: " + sb);
		});
		txt1 = new TextField();
		txt1.setPrefColumnCount(20);
		txt2 = new TextField();
		txt2.setPrefColumnCount(20);
		ba = new Button("Add");
		br = new Button("Remove");
		panel.getChildren().addAll(listview, txt1, txt2, ba, br);
		ba.setOnAction(e -> listview.getItems().add(txt2.getText()));
		br.setOnAction(e -> listview.getItems().remove(txt2.getText()));
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
