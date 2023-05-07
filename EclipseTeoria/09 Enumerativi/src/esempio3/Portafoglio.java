package esempio3;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * Class representing a wallet containing banknotes of different denominations.
 * 
 * @author michelemazzaa
 */
public class Portafoglio {

	private Taglio[] contenuto;
	private int logicalSize;

	/**
	 * Constructor for creating an empty wallet with a specified capacity.
	 * 
	 * @param n the capacity of the wallet
	 */
	public Portafoglio(int n) {
		contenuto = new Taglio[n];
		logicalSize = 0;
	}

	/**
	 * Constructor for creating a wallet with existing banknotes.
	 * 
	 * @param contenuto the array of banknotes to add to the wallet
	 */
	public Portafoglio(Taglio[] contenuto) {
		this.contenuto = Arrays.copyOf(contenuto, contenuto.length);
		this.logicalSize = contenuto.length;
	}

	/**
	 * Adds a banknote to the wallet.
	 * 
	 * @param t the banknote to add to the wallet
	 */
	public void add(Taglio t) {
		contenuto[logicalSize++] = t;
	}

	/**
	 * Returns the total value of the banknotes in the wallet.
	 * 
	 * @return the total value of the banknotes in the wallet
	 */
	public int getvalore() {
		int sum = 0;
		for (int i = 0; i < this.logicalSize; i++) {
			sum += this.contenuto[i].getValore();
		}
		return sum;
	}

	/**
	 * Returns a string representation of the wallet.
	 * 
	 * @return a string representation of the wallet
	 */
	@Override
	public String toString() {
		StringJoiner sj = new StringJoiner(", ");
		for (int i = 0; i < this.logicalSize; i++) {
			sj.add(this.contenuto[i].toString() + ", ");
		}
		return sj.toString();
	}
}
