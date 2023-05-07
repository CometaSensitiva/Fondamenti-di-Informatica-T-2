package esempio2;

/**
 * The PoligonoMain class is a driver program that creates and prints several
 * Poligono objects.
 * 
 * @author michelemazzaa
 */
public class PoligonoMain {

	/**
	 * The main method creates several Punto and Poligono objects, prints them to
	 * the console, and demonstrates the functionality of the Poligono class.
	 * 
	 * @param args An array of command-line arguments (not used in this program).
	 */
	public static void main(String[] args) {
		Punto p1 = new Punto(1, 1);
		Punto p2 = new Punto(5, 1);
		Punto p3 = new Punto(5, 4);
		Punto p4 = new Punto(1, -2);
		Punto p5 = new Punto(5, -2);
		Punto p6 = new Punto(3, -5.46);

		Poligono trg1 = new Poligono("trg1", new Punto[] { p1, p2, p3 });
		Poligono trg2 = new Poligono("trg2", new Punto[] { p1, p2, p5 });
		Poligono trg3 = new Poligono("trg3", new Punto[] { p4, p5, p6 });
		Poligono rect = new Poligono("rect", new Punto[] { p1, p2, p5, p4 });
		Poligono farfalla1 = new Poligono("farfalla1", new Punto[] { p1, p2, p4, p5 });
		Poligono farfalla2 = new Poligono("farfalla2", new Punto[] { p1, p5, p2, p4 });

		System.out.println(trg1.toString());
		System.out.println();
		System.out.println(trg2.toString());
		System.out.println();
		System.out.println(trg3.toString());
		System.out.println();
		System.out.println(rect.toString());
		System.out.println();
		System.out.println(farfalla1.toString());
		System.out.println();
		System.out.println(farfalla2.toString());

	}
}
