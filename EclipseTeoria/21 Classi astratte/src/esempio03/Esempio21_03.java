package esempio03;

/**
 * A main class that demonstrates the use of the 'Triangolo',
 * 'TriangoloIsoscele' and 'TriangoloEquilatero' classes.
 */

/**
 * Classe che rappresenta un esempio di utilizzo delle classi Triangolo,
 * TriangoloIsoscele e TriangoloEquilatero.
 * 
 * @author michelemazzaa
 */
public class Esempio21_03 {

	public static void main(String[] args) {
		// Creazione di un triangolo isoscele
		TriangoloIsoscele t1 = new TriangoloIsoscele(5, 10);
		System.out.println("Triangolo isoscele t1:");
		System.out.println("- Base: " + t1.getBase());
		System.out.println("- Lato 1: " + t1.getLato1());
		System.out.println("- Lato 2: " + t1.getLato2());
		System.out.println("- Altezza: " + t1.getAltezza());
		System.out.println("- Angolo apice: " + t1.getAngoloApice());

		// Creazione di un triangolo equilatero
		TriangoloEquilatero t2 = new TriangoloEquilatero(7);
		System.out.println("Triangolo equilatero t2:");
		System.out.println("- Lato: " + t2.getLato());
		System.out.println("- Altezza: " + t2.getAltezza());
		System.out.println("- Angolo apice: " + t2.getAngoloApice());
	}

}
