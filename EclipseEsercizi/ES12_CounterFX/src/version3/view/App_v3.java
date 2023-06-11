package version3.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import version3.controller.Controller;

public class App_v3 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Counter FX 1.0");
		Controller controller = new Controller(3);
		MainPane panel = new MainPane(controller);

		Scene scene = new Scene(panel, Color.BLACK);
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
