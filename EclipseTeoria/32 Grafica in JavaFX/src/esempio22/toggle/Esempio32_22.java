package esempio22.toggle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Esempio32_22 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Esempio 22");

		FlowPane panel = new FlowPane();
		ToggleButton tg1 = new ToggleButton("Toggle");
		TextField txt2 = new TextField();
		txt2.setEditable(false);
		tg1.setOnAction(event -> txt2.setText(tg1.isSelected() ? "Opzione attivata" : "Opzione disattivata"));

		panel.getChildren().addAll(tg1, txt2);
		Scene scene = new Scene(panel, Color.BLACK);
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}

}
