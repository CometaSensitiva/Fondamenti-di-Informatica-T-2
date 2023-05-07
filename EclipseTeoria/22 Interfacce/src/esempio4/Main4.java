package esempio4;

/**
 * Classe di esempio per l'utilizzo delle interfacce Complex e Real.
 * 
 * @author michelemazzaa
 */
public class Main4 {

	/**
	 * Metodo principale.
	 *
	 * @param args gli argomenti della riga di comando
	 */
	public static void main(String[] args) {
		Complex c1 = Complex.of(1, 2);
		Complex c2 = Complex.of(3, 4);
		Complex sum = c1.sum(c2); // la somma di due numeri complessi è un numero complesso
		Complex mul = c1.mul(c2); // il prodotto di due numeri complessi è un numero complesso

		// Real estende Complex, quindi un numero reale può essere usato dove viene
		// richiesto un numero complesso
		Real r1 = Real.of(5);
		Real r2 = Real.of(6);
		Real sumR = r1.sum(r2); // la somma di due numeri reali è un numero reale
		Real mulR = r1.mul(r2); // il prodotto di due numeri reali è un numero reale

		// La somma di un numero reale e uno complesso è un numero complesso
		Complex sumRC = r1.sum(c1);

		// Non è possibile assegnare un Complex a un Real, perché non è un tipo
		// compatibile
		// Real r3 = c1; // ERRORE: Type mismatch

		// Per stampare i numeri complessi e reali, viene chiamato il metodo toString()
		// di ogni classe
		System.out.println("Sum of " + c1.toString() + " and " + c2.toString() + " is " + sum.toString());
		System.out.println("Product of " + c1.toString() + " and " + c2.toString() + " is " + mul.toString());
		System.out.println("Sum of " + r1.toString() + " and " + r2.toString() + " is " + sumR.toString());
		System.out.println("Product of " + r1.toString() + " and " + r2.toString() + " is " + mulR.toString());
		System.out.println("Sum of " + r1.toString() + " and " + c1.toString() + " is " + sumRC.toString());
	}
}
