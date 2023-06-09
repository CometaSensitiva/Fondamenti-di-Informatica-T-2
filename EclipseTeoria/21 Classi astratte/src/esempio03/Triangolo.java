package esempio03;

/**
 * An abstract class representing a triangle shape. This class extends the
 * abstract class 'Forma' and defines methods for calculating the area and
 * perimeter of a triangle.
 * 
 * @author michelemazzaa
 */
public abstract class Triangolo extends Forma {

	private double a, b, c;

	/**
	 * Constructor for the Triangolo class.
	 *
	 * @param a The length of the first side of the triangle.
	 * @param b The length of the second side of the triangle.
	 * @param c The length of the third side of the triangle.
	 * @throws IllegalArgumentException If the given side lengths cannot form a
	 *                                  triangle.
	 */
	public Triangolo(double a, double b, double c) throws IllegalArgumentException {
		if (a > 0 && b > 0 && c > 0 && a < b + c && b < a + c && c < a + b) {
			this.a = a;
			this.b = b;
			this.c = c;
		} else {
			throw new IllegalArgumentException("Cannot construct a triangle with the specified side lengths.");
		}
	}

	/**
	 * Calculates the area of the triangle.
	 *
	 * @return The area of the triangle.
	 */
	@Override
	public double area() {
		double s = perimetro() / 2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	/**
	 * Calculates the perimeter of the triangle.
	 *
	 * @return The perimeter of the triangle.
	 */
	@Override
	public double perimetro() {
		return a + b + c;
	}

	/**
	 * Returns the name of the triangle shape.
	 *
	 * @return The name of the triangle shape.
	 */
	@Override
	public String nome() {
		return "Triangolo qualsiasi";
	}

	/**
	 * Returns the length of side a of the triangle.
	 *
	 * @return The length of side a of the triangle.
	 */
	public double getLatoA() {
		return a;
	}

	/**
	 * Returns the length of side b of the triangle.
	 *
	 * @return The length of side b of the triangle.
	 */
	public double getLatoB() {
		return b;
	}

	/**
	 * Returns the length of side c of the triangle.
	 *
	 * @return The length of side c of the triangle.
	 */
	public double getLatoC() {
		return c;
	}

	/**
	 * Calculates and returns the angle opposite to side b of the triangle.
	 *
	 * @return The angle opposite to side b of the triangle, in radians.
	 */
	public double getAngoloBC() {
		return Math.acos((-(a * a) + (b * b) + (c * c)) / (2 * b * c));
	}

	/**
	 * Calculates and returns the angle opposite to side a of the triangle.
	 *
	 * @return The angle opposite to side a of the triangle, in radians.
	 */
	public double getAngoloAB() {
		return Math.acos((-(c * c) + (a * a) + (b * b)) / (2 * a * b));
	}

	/**
	 * Calculates and returns the angle opposite to side a of the triangle.
	 *
	 * @return The angle opposite to side a of the triangle, in radians.
	 */
	public double getAngoloAC() {
		return Math.acos((-(b * b) + (a * a) + (c * c)) / (2 * b * c));
	}

	/**
	 * Determines if the triangle is a scalene triangle (i.e., all sides have
	 * different lengths).
	 *
	 * @return True if the triangle is a scalene triangle, false otherwise.
	 */
	public boolean isScaleno() {
		return a != b && a != c && b != c;
	}

}
