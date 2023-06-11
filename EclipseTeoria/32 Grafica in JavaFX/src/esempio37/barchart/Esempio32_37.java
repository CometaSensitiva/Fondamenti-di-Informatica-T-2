package esempio37.barchart;

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
 * types of fruit.
 * 
 * The chart displays the sales data for the city of Modena.
 * 
 * Author: michelemazzaa
 */
public class Esempio32_37 extends Application {

	/**
	 * 
	 * The start method is called when the application is launched. It sets the
	 * title of the stage to "Esempio 37" and creates a FlowPane as the main panel.
	 * A CategoryAxis, asseOrizz, is created and labeled as "Tipi di frutta". A
	 * NumberAxis, asseVert, is created and labeled as "Vendite". A BarChart is
	 * created using asseOrizz and asseVert, with the title "Andamento vendite
	 * frutta". An XYChart.Series, modena, is created and named "Modena". Data
	 * points are added to modena for the types of fruit: "Mele", "Pere", and
	 * "Arance". The modena series is added to the chart's data. The chart is added
	 * to the panel. The panel is set as the scene for the stage, and the stage is
	 * shown.
	 * 
	 * @param stage the primary stage for the application
	 */
	public void start(Stage stage) {
		stage.setTitle("Esempio 37");
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
		
		chart.getData().add(modena);
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
