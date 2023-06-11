package esempio01;

/**
 * 
 * The ImplRettangolo class represents a rectangle shape with height and base
 * dimensions, implemented through the Rettangolo interface.
 * 
 * @author michelemazzaa
 */
public class ImplRettangolo implements Rettangolo {

	private double lato1, lato2;

	/**
	 * 
	 * Constructs a rectangle with given height and base dimensions.
	 * 
	 * @param altezza the height of the rectangle
	 * @param base    the base of the rectangle
	 */
	public ImplRettangolo(double altezza, double base) {
		this.lato1 = base;
		this.lato2 = altezza;
	}

	/**
	 * 
	 * Returns the height dimension of this rectangle.
	 * 
	 * @return the height of this rectangle
	 */
	@Override
	public double altezza() {
		return lato2;
	}

	/**
	 * 
	 * Returns the base dimension of this rectangle.
	 * 
	 * @return the base of this rectangle
	 */
	@Override
	public double base() {
		return lato1;
	}
}