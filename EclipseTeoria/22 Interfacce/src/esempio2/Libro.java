package esempio2;

/**
 * Represents a book that implements the {@link Rettangolare} interface.
 * 
 * @author michelemazza
 */
public class Libro implements Rettangolare {

	private double larghezza, lunghezza, spessore;

	/**
	 * Creates a new book with the specified dimensions.
	 *
	 * @param larghezza the width of the book
	 * @param lunghezza the length of the book
	 * @param spessore  the thickness of the book
	 */
	public Libro(double larghezza, double lunghezza, double spessore) {
		this.larghezza = larghezza;
		this.lunghezza = lunghezza;
		this.spessore = spessore;
	}

	/**
	 * Gets the width of the book.
	 *
	 * @return the width of the book
	 */
	@Override
	public double larghezza() {
		return larghezza;
	}

	/**
	 * Gets the length of the book.
	 *
	 * @return the length of the book
	 */
	@Override
	public double lunghezza() {
		return lunghezza;
	}

	/**
	 * Gets the thickness of the book.
	 *
	 * @return the thickness of the book
	 */
	public double spessore() {
		return spessore;
	}
}
