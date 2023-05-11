package esempio5;

/**
 * This class contains the main method to execute the program. It demonstrates
 * the usage of the `Triangle` class by creating `Triangle` objects using the
 * static factory method `of()`. The triangles' side lengths are provided as
 * arguments, and the triangles are printed.
 * 
 * @see Triangle
 * @author michelemazzaa
 */
public class Main5 {

	/**
	 * The main method that runs the program. It creates `Triangle` objects using
	 * the static factory method `of()` of the `Triangle` class. The side lengths of
	 * the triangles are provided as arguments, and the triangles are printed.
	 * 
	 * @param args The command line arguments passed to the program.
	 */
	public static void main(String[] args) {
		Triangle t1 = Triangle.of(3, 4, 5);
		System.out.println(t1);
		Triangle t2 = Triangle.of(1, 1, 10);
		System.out.println(t2);
	}
}
