package esempio02;

/**
 * Represents a plot of land that implements the {@link Rettangolare} interface.
 * The plot of land is identified by its GPS coordinates.
 * 
 * @author michelemazza
 */
public class Appezzamento implements Rettangolare {

	private double larghezza, lunghezza;
	private String gps;

	/**
	 * Creates a new plot of land with the specified dimensions and GPS coordinates.
	 *
	 * @param larghezza the width of the plot of land
	 * @param lunghezza the length of the plot of land
	 * @param gps       the GPS coordinates of the plot of land
	 */
	public Appezzamento(double larghezza, double lunghezza, String gps) {
		this.larghezza = larghezza;
		this.lunghezza = lunghezza;
		this.gps = gps;
	}

	/**
	 * Gets the width of the plot of land.
	 *
	 * @return the width of the plot of land
	 */
	@Override
	public double larghezza() {
		return larghezza;
	}

	/**
	 * Gets the length of the plot of land.
	 *
	 * @return the length of the plot of land
	 */
	@Override
	public double lunghezza() {
		return lunghezza;
	}

	/**
	 * Gets the GPS coordinates of the plot of land.
	 *
	 * @return the GPS coordinates of the plot of land
	 */
	public String gpsCoordinates() {
		return gps;
	}
}
