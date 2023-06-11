package esempio40.piechart;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * 
 * This class represents an example application.
 * 
 * It extends the Application class and implements the start method.
 * 
 * The main method is also included to launch the application.
 * 
 * It demonstrates the usage of a PieChart to display sales data of fruits.
 * 
 * Author: michelemazzaa
 */
public class Esempio32_40 extends Application {

	/**
	 * 
	 * The start method is called when the application is launched. It sets the
	 * title of the stage to "Esempio 40" and creates a FlowPane as the main panel.
	 * An ObservableList of PieChart.Data objects is created to hold the sales data.
	 * Three PieChart.Data objects are added to the list, representing the sales of
	 * "Mele" (apples). A PieChart is created with the data list. The title of the
	 * chart is set to "Andamento vendite frutta". The chart is added to the panel.
	 * The panel is set as the scene for the stage, and the stage is shown.
	 * 
	 * @param stage the primary stage for the application
	 */
	@Override
	public void start(Stage stage) {
		stage.setTitle("Esempio 40");
		FlowPane panel = new FlowPane();
		ObservableList<PieChart.Data> dati = FXCollections.observableArrayList(new PieChart.Data("Mele", 30),
				new PieChart.Data("Pere", 30), new PieChart.Data("Arance", 30));
		PieChart chart = new PieChart(dati);
		chart.setTitle("Andamento vendite frutta");
		chart.setAnimated(true);
		Button button = new Button("Aggiorna");
		button.setOnAction(event -> {
			double randomValue1 = Math.random() * 100;
			double randomValue2 = Math.random() * 100;
			double randomValue3 = Math.random() * 100;

			dati.get(0).setPieValue(randomValue1);
			dati.get(1).setPieValue(randomValue2);
			dati.get(2).setPieValue(randomValue3);
		});

		panel.getChildren().addAll(button, chart);
		stage.setScene(new Scene(panel));
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