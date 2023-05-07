package esempio3;

/**
 * Enum representing available banknote denominations.
 * 
 * @author michelemazzaa
 */
public enum Taglio {

	CINQUECENTO(500), DUECENTO(200), CENTO(100), CINQUANTA(50), VENTI(20), DIECI(10), CINQUE(5), DUE(2), UNO(1);

	private int value;

	/**
	 * Constructor for Taglio enum.
	 * 
	 * @param value the denomination value of the banknote
	 */
	private Taglio(int value) {
		this.value = value;
	}

	/**
	 * Returns the denomination value of the banknote.
	 * 
	 * @return the denomination value of the banknote
	 */
	public int getValore() {
		return this.value;
	}
}
