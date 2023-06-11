package esempio29.choiceboxdinamica;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
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
 * It demonstrates the usage of a ChoiceBox, TextFields, and Buttons.
 * 
 * The ChoiceBox allows selecting an option from a list.
 * 
 * The TextFields display the selected option and allow adding/removing items
 * from the ChoiceBox.
 * 
 * Author: michelemazzaa
 */
public class Esempio32_29 extends Application {
	private ChoiceBox<String> choiceBox;
	private TextField txt1, txt2;
	private Button ba, br;

	/**
	 * 
	 * The start method is called when the application is launched.
	 * 
	 * It sets the title of the stage to "Esempio 29" and creates a FlowPane as the
	 * main panel.
	 * 
	 * A ChoiceBox, choiceBox, is created and populated with items "Rosso",
	 * "Giallo", "Verde", and "Blu".
	 * 
	 * The dimensions of the ChoiceBox are set.
	 * 
	 * A listener is added to the selectedItemProperty of the ChoiceBox to update
	 * the TextField with the selected option.
	 * 
	 * Two TextFields, txt1 and txt2, are created with preferred column counts and
	 * editability.
	 * 
	 * A Button, ba, is created with the label "Add" and a Button, br, is created
	 * with the label "Remove".
	 * 
	 * The panel is added to a Scene with a black background color.
	 * 
	 * Action event handlers are added to the buttons to add/remove items from the
	 * ChoiceBox.
	 * 
	 * Finally, the stage is set with the scene and shown.
	 * 
	 * @param stage the main stage of the application
	 */
	public void start(Stage stage) {
		stage.setTitle("Esempio 29");
		FlowPane panel = new FlowPane();
		choiceBox = new ChoiceBox<>();
		choiceBox.setItems(FXCollections.observableArrayList("Rosso", "Giallo", "Verde", "Blu"));
		choiceBox.setPrefHeight(24);
		choiceBox.setPrefWidth(72);
		choiceBox.getSelectionModel().selectedItemProperty().addListener((obj, oldval, newval) -> {
			txt1.setText("Opzione corrente: " + choiceBox.getSelectionModel().getSelectedItem());
		});
		txt1 = new TextField();
		txt1.setPrefColumnCount(20);
		txt1.setEditable(false);
		txt2 = new TextField("Scrivere quì per aggiungere un elemento alla lista");
		txt2.setPrefWidth(txt2.getText().length() * 6);
		txt2.setPrefColumnCount(20);
		txt2.setTooltip(new Tooltip("Scrivere quì per aggiungere un elemento alla lista"));

		ba = new Button("Add");
		br = new Button("Remove");
		panel.getChildren().addAll(choiceBox, txt1, txt2, ba, br);
		ba.setOnAction(e -> choiceBox.getItems().add(txt2.getText()));
		br.setOnAction(e -> choiceBox.getItems().remove(txt2.getText()));
		Scene scene = new Scene(panel, Color.BLACK);
		stage.setScene(scene);
		stage.show();

		Platform.runLater(() -> {
			double width = choiceBox.getWidth() + txt1.getWidth() + txt2.getWidth() + ba.getWidth() + br.getWidth();
			double height = panel.getHeight();
			scene.getWindow().setWidth(width);
			scene.getWindow().setHeight(height);
		});
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