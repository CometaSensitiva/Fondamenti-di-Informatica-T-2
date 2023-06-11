package esempio24.toggle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Esempio32_24 extends Application {
	ToggleButton tg1;
	ToggleButton tg2;
	TextField txt1;
	TextField txt2;

	private void myHandle(ActionEvent event) {
		txt1.setText("Sono cambiate le " + (event.getSource() == tg1 ? "Pere" : "Mele"));
		String frase = (tg1.isSelected() ? "Pere" : "") + (tg2.isSelected() ? "Mele" : "");
		txt2.setText(frase);
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Esempio 24");

		FlowPane panel = new FlowPane();
		tg1 = new ToggleButton("Pere");
		tg2 = new ToggleButton("Mele");


		txt1 = new TextField(); txt1.setEditable(false); 
		txt2 = new TextField(); txt2.setEditable(false);

		tg1.setOnAction(this::myHandle);
		tg2.setOnAction(this::myHandle);

		panel.getChildren().addAll(tg1, tg2, txt1, txt2);
		Scene scene = new Scene(panel, Color.BLACK);
		stage.setScene(scene);
		stage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
