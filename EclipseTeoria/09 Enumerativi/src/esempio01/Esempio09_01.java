package esempio01;

/**
 * A class to test the Direction enum.
 * 
 * @author michelemazzaa
 */
public class Esempio09_01 {

	/**
	 * The main method to test the Direction enum.
	 * 
	 * @param args the command-line arguments (not used in this case)
	 */
	public static void main(String[] args) {
		Direction dir = Direction.NORTH;
		System.out.println(dir);
		System.out.println(dir.getOpposite());
	}
}
