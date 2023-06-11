package esempio02;

/**
 * An enumeration representing different banknote denominations. Each
 * denomination has a specific integer value associated with it.
 *
 * @author michelemazzaa
 */
public enum Taglio {

	/** Five hundred euro banknote. */
	CINQUECENTO(500),

	/** Two hundred euro banknote. */
	DUECENTO(200),

	/** One hundred euro banknote. */
	CENTO(100),

	/** Fifty euro banknote. */
	CINQUANTA(50),

	/** Twenty euro banknote. */
	VENTI(20),

	/** Ten euro banknote. */
	DIECI(10),

	/** Five euro banknote. */
	CINQUE(5),

	/** Two euro coin. */
	DUE(2),

	/** One euro coin. */
	UNO(1);

	/** The integer value associated with the banknote denomination. */
	private int value;

	/**
	 * Constructs a banknote denomination with the specified value.
	 *
	 * @param value the integer value of the banknote denomination.
	 */
	private Taglio(int value) {
		this.value = value;
	}

	/**
	 * Returns the integer value associated with the banknote denomination.
	 *
	 * @return the integer value of the banknote denomination.
	 */
	public int getValore() {
		return this.value;
	}

	/**
	 * Returns the total value of the banknotes in the specified array.
	 *
	 * @param portafoglio an array of banknote denominations.
	 * @return the total value of the banknotes in the array.
	 */
	public static int valore(Taglio[] portafoglio) {
		int sum = 0;
		for (Taglio x : portafoglio) {
			sum += x.getValore();
		}
		return sum;
	}

	/**
	 * Returns a string representation of the banknote denominations in the
	 * specified array.
	 *
	 * @param portafoglio an array of banknote denominations.
	 * @return a string representation of the banknote denominations in the array.
	 */
	public static String contenuto(Taglio[] portafoglio) {
		StringBuilder sb = new StringBuilder();
		for (Taglio x : portafoglio) {
			sb.append(x).append(", ");
		}
		return sb.toString();
	}

}
