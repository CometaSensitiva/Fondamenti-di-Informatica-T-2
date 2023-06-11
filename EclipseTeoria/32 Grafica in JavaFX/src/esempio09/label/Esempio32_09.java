package esempio09.label;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.*;
import javafx.scene.control.*;

/**
 * 
 * The Esempio32_09 class is a JavaFX application that displays two labels with
 * different font styles.
 * 
 * @author michelemazzaa
 */
public class Esempio32_09 extends Application {

	/**
	 * 
	 * The start method is called when the application is launched.
	 * 
	 * @param stage the primary stage for the application
	 * @throws Exception if an exception occurs during the start method
	 */
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Esempio 9");
		FlowPane panel = new FlowPane();
		Label l1 = new Label("Etichetta 1");
		Label l2 = new Label("Etichetta 2");
		l1.setFont(Font.font("Courier New", FontWeight.BOLD, 24));
		l2.setFont(Font.font("Times New Roman", FontPosture.ITALIC, 18));
		panel.getChildren().addAll(l1, l2);
		Scene scene = new Scene(panel);
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
