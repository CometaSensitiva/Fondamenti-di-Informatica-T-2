package esempio38.barchart;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
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
 * It demonstrates the usage of a BarChart to display sales data for different
 * fruits in different cities.
 * 
 * Author: michelemazzaa
 */
public class Esempio32_38 extends Application {

	/**
	 * 
	 * The start method is called when the application is launched.
	 * 
	 * It sets the title of the stage to "Esempio38" and creates a FlowPane as the
	 * main panel.
	 * 
	 * A CategoryAxis is created for the x-axis with the label "Tipi di frutta".
	 * 
	 * A NumberAxis is created for the y-axis with the label "Vendite".
	 * 
	 * A BarChart is created with the category axis and number axis.
	 * 
	 * The title of the chart is set to "Andamento vendite frutta".
	 * 
	 * Three XYChart.Series objects are created to represent the data for different
	 * cities.
	 * 
	 * Data points are added to each series for the fruits "Mele", "Pere", and
	 * "Arance".
	 * 
	 * The series are added to the chart.
	 * 
	 * The chart is added to the panel.
	 * 
	 * The panel is set as the scene for the stage, and the stage is shown.
	 * 
	 * @param stage the primary stage for the application
	 */
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Esempio38");
		FlowPane panel = new FlowPane();

		CategoryAxis asseOrizz = new CategoryAxis();
		asseOrizz.setLabel("Tipi di frutta");

		NumberAxis asseVert = new NumberAxis();
		asseVert.setLabel("Vendite");

		BarChart<String, Number> chart = new BarChart<>(asseOrizz, asseVert);
		chart.setTitle("Andamento vendite frutta");

		XYChart.Series<String, Number> modena = new XYChart.Series<>();
		modena.setName("Modena");

		modena.getData().add(new XYChart.Data<>("Mele", 30));
		modena.getData().add(new XYChart.Data<>("Pere", 15));
		modena.getData().add(new XYChart.Data<>("Arance", 50));

		XYChart.Series<String, Number> bologna = new XYChart.Series<>();
		bologna.setName("Bologna");

		bologna.getData().add(new XYChart.Data<>("Mele", 53));
		bologna.getData().add(new XYChart.Data<>("Pere", 12));
		bologna.getData().add(new XYChart.Data<>("Arance", 25));

		XYChart.Series<String, Number> imola = new XYChart.Series<>();
		imola.setName("Imola");

		imola.getData().add(new XYChart.Data<>("Mele", 33));
		imola.getData().add(new XYChart.Data<>("Pere", 80));
		imola.getData().add(new XYChart.Data<>("Arance", 12));

		chart.getData().add(modena);
		chart.getData().add(bologna);
		chart.getData().add(imola);

		panel.getChildren().add(chart);
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
