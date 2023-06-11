/**
 * This class demonstrates the use of the MyMath class to calculate the greatest
 * common divisor (GCD) of two numbers.
 * 
 * @author michelemazzaa
 */
public class EsempioMath {

	/**
	 * The main method takes two command line arguments and converts them to
	 * integers. It then uses the MyMath class to calculate the GCD of the two
	 * numbers and prints the result.
	 * 
	 * @param args Command line arguments
	 */
	public static void main(String args[]) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int mcd = MyMath.mcd(a, b);
		System.out.println(mcd);
	}
}