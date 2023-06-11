package esempio08;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.canvas.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import java.util.function.*;

/**
 * 
 * This class represents an example JavaFX application.
 * 
 * It displays a window titled "Grafico di funzione" with a FlowPane as the root
 * node.
 * 
 * The FlowPane contains a Canvas with dimensions 528x448 pixels.
 * 
 * On the Canvas, it draws a coordinate system with black border, red axes, and
 * axis labels.
 * 
 * It also plots two functions: f1 and f2, using different colors.
 * 
 * Note: The scaling factors for the coordinate system are calculated based on
 * the specified x and y axis ranges.
 * 
 * The functions are plotted by iterating over the x-axis and calculating the
 * corresponding y-values.
 * 
 * The functions:
 * 
 * f1(x) = (2.0 / Math.PI * Math.sin(1.0 * x)) + (2.0 / (3.0 * Math.PI) * Math.sin(3.0 * x)) 
 * f2(x) = 0.5F * x / (x - 1)
 * 
 * @author michelemazzaa
 */
public class Esempio32_08 extends Application {
	private static Function<Float, Float> f1 = x -> (float) (2.0 / Math.PI * Math.sin(1.0 * x)
			+ 2.0 / (3.0 * Math.PI) * Math.sin(3.0 * x));
	private static Function<Float, Float> f2 = x -> 0.5F * x / (x - 1);

	private int xAxisMin = -7, xAxisMax = 7, yAxisMin = -1, yAxisMax = 1;
	private int larghezza = 1270, altezza = 500;
	private float fattoreDiScalaX;
	private float fattoreDiScalaY;

	/**
	 * 
	 * The entry point of the JavaFX application.
	 * 
	 * It sets the title of the stage, creates a FlowPane as the root node,
	 * 
	 * creates a Canvas with the specified dimensions, adds the Canvas to the
	 * FlowPane,
	 * 
	 * gets the GraphicsContext of the Canvas, calculates the scaling factors for
	 * the coordinate system,
	 * 
	 * and calls the doMyGraphics method to draw the coordinate system and plot the
	 * functions.
	 * 
	 * Finally, it creates a Scene with the FlowPane as its content, sets the scene
	 * to the stage,
	 * 
	 * and shows the stage.
	 * 
	 * @param stage the primary stage for this application
	 */
	public void start(Stage stage) {
		stage.setTitle("Grafico di funzione");

		FlowPane panel = new FlowPane();

		Canvas canvas = new Canvas(1280, 500);
		panel.getChildren().add(canvas);

		GraphicsContext g = canvas.getGraphicsContext2D();
		calculateScaleFactors();
		doMyGraphics(g, f2); // LA FUNZIONE DA GRAFICARE
		doMyGraphics(g, f1); // Utilizza la funzione f1 per il grafico

		Scene scene = new Scene(panel);
		stage.setScene(scene);
		stage.show();
	}

	/**
	 * 
	 * Calculates the scaling factors for the coordinate system based on the
	 * specified x and y axis ranges, the width, and the height of the canvas.
	 */
	private void calculateScaleFactors() {
		yAxisMin = -1;
		yAxisMax = 1;
		fattoreDiScalaX = larghezza / ((float) (xAxisMax - xAxisMin));
		fattoreDiScalaY = altezza / ((float) (yAxisMax - yAxisMin));
	}

	/**
	 * 
	 * Draws the coordinate system, including the border, axes, and axis labels,
	 * 
	 * as well as plots the specified function on the canvas.
	 * 
	 * @param g the GraphicsContext of the canvas
	 * 
	 * @param f the function to be plotted
	 */
	private void doMyGraphics(GraphicsContext g, Function<Float, Float> f) {
		g.setStroke(Color.BLACK); // cornice nera
		g.strokeRect(20, 20, larghezza - 30, altezza - 40);

		g.setStroke(Color.RED); // assi cartesiani rossi
		g.strokeLine(50, altezza / 2, larghezza - 30, altezza / 2);
		g.strokeLine(larghezza / 2, 50, larghezza / 2, altezza - 50);

		g.fillText("" + xAxisMin, 20, altezza / 2 - 10); // graduazione assi
		g.fillText("" + xAxisMax, larghezza - 20, altezza / 2 - 5);
		g.fillText("" + yAxisMax, larghezza / 2 + 5, 40);
		g.fillText("" + yAxisMin, larghezza / 2 + 5, altezza - 35);

		g.setStroke(Color.BLUE); // funzione in blu
		float fXAxisMin = f.apply((float) xAxisMin);
		float xPrev = xAxisMin, yPrev = fXAxisMin;
		setPixel(g, xAxisMin, fXAxisMin);

		for (int ix = 1; ix < g.getCanvas().getWidth(); ix++) {
			float x = xAxisMin + ((float) ix) / fattoreDiScalaX;
			float y = f.apply(x);
			setLine(g, xPrev, yPrev, x, y); // Utilizza il metodo setLine per disegnare una linea
			xPrev = x;
			yPrev = y;
		}
	}

	/**
	 * 
	 * Draws a pixel at the specified coordinates on the canvas if they are within
	 * the specified axis ranges.
	 * 
	 * @param g the GraphicsContext of the canvas
	 * 
	 * @param x the x-coordinate
	 * 
	 * @param y the y-coordinate
	 */
	private void setPixel(GraphicsContext g, float x, float y) {
		if (x < xAxisMin || x > xAxisMax || y < yAxisMin || y > yAxisMax)
			return;

		int ix = Math.round((x - xAxisMin) * fattoreDiScalaX);
		int iy = altezza - Math.round((y - yAxisMin) * fattoreDiScalaY);
		g.strokeLine(ix, iy, ix, iy);
	}

	/**
	 * 
	 * Draws a line between the specified previous and current coordinates on the
	 * canvas
	 * 
	 * if they are within the specified axis ranges.
	 * 
	 * @param g  the GraphicsContext of the canvas
	 * 
	 * @param xP the previous x-coordinate
	 * 
	 * @param yP the previous y-coordinate
	 * 
	 * @param x  the current x-coordinate
	 * 
	 * @param y  the current y-coordinate
	 */
	private void setLine(GraphicsContext g, float xP, float yP, float x, float y) {
		if (x < xAxisMin || x > xAxisMax || y < yAxisMin || y > yAxisMax || xP < xAxisMin || xP > xAxisMax
				|| yP < yAxisMin || yP > yAxisMax)
			return;

		int ix = Math.round((x - xAxisMin) * fattoreDiScalaX);
		int iy = altezza - Math.round((y - yAxisMin) * fattoreDiScalaY);
		int ixP = Math.round((xP - xAxisMin) * fattoreDiScalaX);
		int iyP = altezza - Math.round((yP - yAxisMin) * fattoreDiScalaY);
		g.strokeLine(ixP, iyP, ix, iy);
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
