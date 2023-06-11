package esempio02;

/**
 * The Esempio07_02 class provides a method to create an array of integers and fill
 * it with the squares of the first n-1 values. It also includes a main method
 * for testing the method.
 * 
 * @author michelemazzaa
 */
public class Esempio07_02 {

	/**
	 * This static method creates an integer array of the specified size, fills it
	 * with the squares of the first n-1 values, and returns it to the caller.
	 * 
	 * @param n The size of the integer array to be created.
	 * @return An integer array filled with the squares of the first n-1 values.
	 */
	static int[] creaTabella(int n) {
		int[] v = new int[n];
		for (int i = 0; i < n; i++) {
			v[i] = i * i;
		}
		return v;
	}

	/**
	 * The main method creates an integer array using the creaTabella method and
	 * prints out its contents using the for-each loop.
	 * 
	 * @param args The command line arguments (not used in this method).
	 */
	public static void main(String[] args) {
		int[] tab = creaTabella(4);
		for (int x : tab) {
			System.out.println(x);
		}
	}
}
