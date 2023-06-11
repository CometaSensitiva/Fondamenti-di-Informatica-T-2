package esempio03;

/**
 * The Esempio22_03 class contains a main method that demonstrates the usage of various
 * triangle classes and a triangle factory class.
 * 
 * @author michelemazzaa
 */
public class Esempio22_03 {

	/**
	 * The main method demonstrates the usage of various triangle classes and a
	 * triangle factory class. It creates instances of different triangle types,
	 * including a triangle, isosceles triangle, equilateral triangle, right
	 * triangle, and right isosceles triangle. It also creates instances of these
	 * triangles using a triangle factory. Finally, it prints out the string
	 * representation of each triangle using the toString method.
	 * 
	 * @param args an array of command-line arguments for the program (not used)
	 */
	public static void main(String[] args) {
		// Create instances of different triangle types
		Triangle t = Triangle.of(5, 7, 9);
		IsoscelesTriangle it = IsoscelesTriangle.of(7, 5);
		EquilateralTriangle et = EquilateralTriangle.of(3);
		RightTriangle rt = RightTriangle.of(3, 4);
		RightIsoscelesTriangle rit = RightIsoscelesTriangle.of(1);

		// Print out the string representation of each triangle
		System.out.println(t.toString());
		System.out.println(it.toString());
		System.out.println(et.toString());
		System.out.println(rt.toString());
		System.out.println(rit.toString());

		// Create instances of different triangles using a triangle factory
		Triangle tf = TriangleFactory.of(5, 7, 9);
		Triangle itf = TriangleFactory.of(7, 5, 5);
		Triangle etf = TriangleFactory.of(3, 3, 3);
		Triangle rtf = TriangleFactory.of(3, 4, 5);
		Triangle ritf = TriangleFactory.of(Math.sqrt(2), 1, 1);

		// Print out the string representation of each triangle created by the factory
		System.out.println(tf.toString());
		System.out.println(itf.toString());
		System.out.println(etf.toString());
		System.out.println(rtf.toString());
		System.out.println(ritf.toString());
	}

}
