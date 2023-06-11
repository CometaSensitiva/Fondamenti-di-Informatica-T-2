package test;

import frazione.*;

/**
 * A test class for the Frazione class.
 * 
 * @author michelemazzaa
 */
public class FrazioneTest {
	/**
	 * The main method for testing the Frazione class.
	 * 
	 * @param args Command line arguments (not used).
	 */
	public static void main(String[] args) {
		Frazione[] collezioneA = new Frazione[10]; // iniz. vuoto
		collezioneA[0] = new Frazione(1, 3);
		collezioneA[1] = new Frazione(2, 3);
		collezioneA[2] = new Frazione(-1, 2);
		collezioneA[3] = new Frazione(1, 6);
		Frazione[] collezioneB = new Frazione[10]; // iniz. vuoto
		collezioneB[0] = new Frazione(1, 5);
		collezioneB[1] = new Frazione(2, 8);
		collezioneB[2] = new Frazione(1, 7);
		collezioneB[3] = new Frazione(-1, 6);
		Frazione[] somma = Frazione.sum(collezioneA, collezioneB);
		assert (somma[0].getNum() == 8 && somma[0].getDen() == 15);
		assert (somma[1].getNum() == 11 && somma[1].getDen() == 12);
		assert (somma[2].getNum() == -5 && somma[2].getDen() == 14);
		assert (somma[3].getNum() == 0 && somma[3].getDen() == 6);

		Frazione[] prodotto = Frazione.mul(collezioneA, collezioneB);
		assert (prodotto[0].getNum() == 1 && prodotto[0].getDen() == 15);
		assert (prodotto[1].getNum() == 1 && prodotto[1].getDen() == 6);
		assert (prodotto[2].getNum() == -1 && prodotto[2].getDen() == 14);
		assert (prodotto[3].getNum() == -1 && prodotto[3].getDen() == 36);

	}
}
