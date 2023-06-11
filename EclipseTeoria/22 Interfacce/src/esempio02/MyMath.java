package esempio02;

/**
 * 
 * The MyMath class provides utility methods for mathematical calculations.
 * 
 * This class contains a static method for calculating the area of a rectangular
 * shape.
 * 
 * @author michelemazzaa
 */
public class MyMath {

	/**
	 * 
	 * Calculates the area of a rectangular shape.
	 * 
	 * @param r the rectangular shape for which to calculate the area
	 * @return the area of the rectangular shape as a double
	 */
	public static double area(Rettangolare r) {
		return r.larghezza() * r.lunghezza();
	}
}
