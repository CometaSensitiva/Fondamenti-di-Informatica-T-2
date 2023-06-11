package esempio11.text;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * 
 * The GraphicApplication class is a JavaFX application that provides a
 * graphical user interface with an output area.
 * 
 * It extends the Application class and overrides the start() method.
 * 
 * It allows setting the title of the application window and printing text to
 * the output area.
 * 
 * The main entry point for the application is the start() method.
 */
public class GraphicApplication extends Application {

	protected TextArea ta;
	private Stage primaryStage;
	private String titolo = "Esempio 11";

	/**
	 * 
	 * The main method is the entry point for the JavaFX application. It launches
	 * the application by calling the launch() method.
	 * 
	 * @param args The command line arguments.
	 */
	public static void main() {
		launch();
	}

	/**
	 * 
	 * Sets the title of the application window.
	 * 
	 * @param titolo The title to be set for the application window.
	 */
	public void setTitolo(String titolo) {
		this.titolo = titolo;
		primaryStage.setTitle(titolo);
	}

	/**
	 * 
	 * Prints the given text to the output area.
	 * 
	 * @param txt The text to be printed to the output area.
	 */
	public void print(String txt) {
		ta.appendText(txt);
	}

	/**
	 * 
	 * The start method is called when the application is launched. It sets up the
	 * stage, creates a panel with a label and a text area, and displays it.
	 * 
	 * @param stage The primary stage for the JavaFX application.
	 * @throws Exception If an exception occurs during the application startup.
	 */
	@Override
	public void start(Stage stage) throws Exception {
		if (stage == null) {
			throw new IllegalArgumentException("The stage cannot be null.");
		}
		this.primaryStage = stage;
		stage.setTitle(titolo);
		Label l = new Label("Output Area");
		ta = new TextArea();
		ta.setPrefColumnCount(25);
		ta.setEditable(false);
		FlowPane panel = new FlowPane();
		panel.getChildren().addAll(l, ta);
		stage.setScene(new Scene(panel, 320, 220));
		stage.show();
		main();
	}
}
