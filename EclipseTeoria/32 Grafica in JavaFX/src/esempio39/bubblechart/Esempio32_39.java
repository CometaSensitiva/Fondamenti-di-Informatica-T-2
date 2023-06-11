package esempio39.bubblechart;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BubbleChart;
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
 * It demonstrates the usage of a BubbleChart to plot various functions.
 * 
 * @author: michelemazzaa
 */
public class Esempio32_39 extends Application {

	/**
	 * 
	 * The start method is called when the application is launched.
	 * 
	 * It sets the title of the stage to "Esempio 34" and creates a FlowPane as the
	 * main panel.
	 * 
	 * Two NumberAxis objects are created, one for the x-axis with the label "x" and
	 * one for the y-axis with the label "y".
	 * 
	 * A BubbleChart is created with the number axes.
	 * 
	 * The title of the chart is set to "Funzioni varie".
	 * 
	 * Two XYChart.Series objects are created to represent the functions.
	 * 
	 * Data points are added to each series.
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
	public void start(Stage stage) {
		stage.setTitle("Esempio 34");
		FlowPane panel = new FlowPane();

		NumberAxis asseX = new NumberAxis();
		asseX.setLabel("x");

		NumberAxis asseY = new NumberAxis();
		asseY.setLabel("y");

		BubbleChart<Number, Number> chart = new BubbleChart<>(asseX, asseY);
		chart.setTitle("Funzioni varie");

		XYChart.Series<Number, Number> parabola = new XYChart.Series<>();
		parabola.setName("parabola");
		parabola.getData().add(new XYChart.Data<>(0, 0));
		parabola.getData().add(new XYChart.Data<>(10, 10));
		parabola.getData().add(new XYChart.Data<>(15, 22));
		parabola.getData().add(new XYChart.Data<>(20, 40));
		parabola.getData().add(new XYChart.Data<>(30, 90));

		XYChart.Series<Number, Number> retta45 = new XYChart.Series<>();
		retta45.setName("retta 45");
		retta45.getData().add(new XYChart.Data<>(0, 0));
		retta45.getData().add(new XYChart.Data<>(5, 5));
		retta45.getData().add(new XYChart.Data<>(15, 15));
		retta45.getData().add(new XYChart.Data<>(20, 20));
		retta45.getData().add(new XYChart.Data<>(30, 30));
		retta45.getData().add(new XYChart.Data<>(40, 40));
		retta45.getData().add(new XYChart.Data<>(50, 50));

		chart.getData().add(parabola);
		chart.getData().add(retta45);

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
