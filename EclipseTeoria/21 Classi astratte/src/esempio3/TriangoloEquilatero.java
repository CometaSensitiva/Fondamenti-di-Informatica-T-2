package esempio3;

/**
 * A class representing an equilateral triangle shape. This class extends the
 * 'TriangoloIsoscele' class and constructs an equilateral triangle with equal
 * sides.
 * 
 * @author michelemazzaa
 */
public class TriangoloEquilatero extends TriangoloIsoscele {

	/**
	 * Constructs an equilateral triangle with the given side length.
	 * 
	 * @param lato The length of the equal sides of the equilateral triangle.
	 */
	public TriangoloEquilatero(double lato) {
		super(lato, lato);
	}

	/**
	 * Returns the length of the equal sides of the TriangoloEquilatero.
	 * 
	 * @return The length of the equal sides of the TriangoloEquilatero.
	 */
	public double getLato() {
		return getLatoA();
	}
}
