package esempivari;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Mock extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		// Creazione della finestra principale
		primaryStage.setTitle("Applicazione JavaFX");

		// Creazione degli elementi grafici
		Button button = new Button("Clicca qui!");
		Label label = new Label("Benvenuto!");

		// Configurazione degli eventi
		button.setOnAction(event -> {
			label.setText("Hai cliccato il pulsante!");
		});

		// Creazione del layout principale
		BorderPane root = new BorderPane();
		HBox node = new HBox();
		
		node.getChildren().add(label);
		root.setTop(node);
		root.setCenter(button);

		// Creazione della scena
		Scene scene = new Scene(root, 300, 200);

		// Impostazione della scena sulla finestra principale
		primaryStage.setScene(scene);

		// Avvio dell'applicazione
		primaryStage.show();
	}
}
