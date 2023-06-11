package esempio06;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.canvas.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;

/**
 * 
 * This class represents an example JavaFX application.
 * 
 * It displays a window titled "Esempio 6" with a FlowPane as the root node.
 * 
 * The FlowPane contains a Canvas with dimensions 150x130 pixels.
 * 
 * On the Canvas, it draws a filled red rectangle, a blue stroked rectangle,
 * 
 * and a black text saying "ciao" using a Serif font with a bold weight and size
 * 20.
 * 
 * Note: The Canvas is placed inside the FlowPane, which determines its size.
 * 
 * @author michelemazzaa
 */
public class Esempio32_06 extends Application {

	/**
	 * 
	 * The entry point of the JavaFX application.
	 * 
	 * It sets the title of the stage, creates a FlowPane as the root node,
	 * 
	 * creates a Canvas with the specified dimensions, adds the Canvas to the
	 * FlowPane,
	 * 
	 * gets the GraphicsContext of the Canvas, sets the font and fill color,
	 * 
	 * draws a filled red rectangle, a blue stroked rectangle, and a black text on
	 * the Canvas.
	 * 
	 * Finally, it creates a Scene with the FlowPane as its content, sets the scene
	 * to the stage,
	 * 
	 * and shows the stage.
	 * 
	 * @param stage the primary stage for this application
	 */
	public void start(Stage stage) {
		stage.setTitle("Esempio 6");

		FlowPane panel = new FlowPane();
		panel.setPrefSize(200, 130);

		Canvas canvas = new Canvas(150, 130);
		panel.getChildren().add(canvas);

		GraphicsContext g = canvas.getGraphicsContext2D();
		g.setFont(Font.font("Serif", FontWeight.BOLD, 20));
		g.setFill(Color.RED);
		g.fillRect(20, 20, 100, 80);
		g.setFill(Color.BLUE);
		g.strokeRect(30, 30, 80, 60);
		g.setFill(Color.BLACK);
		g.fillText("ciao", 50, 60);

		Scene scene = new Scene(panel);
		stage.setScene(scene);
		stage.show();
	}

	/**
	 * 
	 * The main method of the application. It launches the JavaFX application.
	 * 
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}
}