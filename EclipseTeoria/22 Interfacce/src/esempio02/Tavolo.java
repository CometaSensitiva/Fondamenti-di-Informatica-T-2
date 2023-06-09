package esempio02;

/**
 * Represents a table that implements the {@link Rettangolare} interface.
 * 
 * @author michelemazza
 */
public class Tavolo implements Rettangolare {

	private double larghezza, lunghezza, altezza;

	/**
	 * Creates a new table with the specified dimensions.
	 *
	 * @param larghezza the width of the table
	 * @param lunghezza the length of the table
	 * @param altezza   the height of the table
	 */
	public Tavolo(double larghezza, double lunghezza, double altezza) {
		this.larghezza = larghezza;
		this.lunghezza = lunghezza;
		this.altezza = altezza;
	}

	/**
	 * Gets the width of the table.
	 *
	 * @return the width of the table
	 */
	@Override
	public double larghezza() {
		return larghezza;
	}

	/**
	 * Gets the length of the table.
	 *
	 * @return the length of the table
	 */
	@Override
	public double lunghezza() {
		return lunghezza;
	}

	/**
	 * Gets the height of the table.
	 *
	 * @return the height of the table
	 */
	public double altezza() {
		return altezza;
	}
}
