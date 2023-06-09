package esempio03;

/**
 * A class representing an isosceles triangle shape. This class extends the
 * 'Triangolo' class and overrides the 'nome' method to return the name of the
 * isosceles triangle shape.
 * 
 * @author michelemazzaa
 */
public class TriangoloIsoscele extends Triangolo {

	/**
	 * Constructs an isosceles triangle with the given base and equal sides.
	 * 
	 * @param base The length of the base of the isosceles triangle.
	 * @param lato The length of the equal sides of the isosceles triangle.
	 */
	public TriangoloIsoscele(double base, double lato) {
		super(base, lato, lato);
	}

	/**
	 * Returns the name of the isosceles triangle shape.
	 * 
	 * @return The name of the isosceles triangle shape.
	 */
	@Override
	public String nome() {
		return "Triangolo isoscele";
	}

	/**
	 * Returns the length of the first equal side of the isosceles triangle.
	 * 
	 * @return The length of the first equal side of the isosceles triangle.
	 */
	public double getLato1() {
		return getLatoB();
	}

	/**
	 * Returns the length of the second equal side of the isosceles triangle.
	 * 
	 * @return The length of the second equal side of the isosceles triangle.
	 */
	public double getLato2() {
		return getLatoC();
	}

	/**
	 * Returns the length of the base of the isosceles triangle.
	 * 
	 * @return The length of the base of the isosceles triangle.
	 */
	public double getBase() {
		return getLatoA();
	}

	/**
	 * Calculates and returns the height of the isosceles triangle.
	 * 
	 * @return The height of the isosceles triangle.
	 */
	public double getAltezza() {
		double lato = getLatoB(); // The length of one of the equal sides
		double base = getLatoA(); // The length of the base
		return Math.sqrt(lato * lato - base * base / 4);
	}

	/**
	 * Calculates and returns the apex angle (the angle opposite the base) of the
	 * isosceles triangle.
	 * 
	 * @return The apex angle of the isosceles triangle, in degrees.
	 */
	public double getAngoloApice() {
		double lato = getLatoB(); // The length of one of the equal sides
		double base = getLatoA(); // The length of the base
		double sin = base / (2 * lato);
		return Math.toDegrees(Math.asin(sin)) * 2;
	}

}
