package mastermind.model;

import java.util.StringJoiner;

/**
 * The Combinazione class represents a combination of PioloDiGioco objects.
 * 
 * @author michelemazzaa
 */
public class Combinazione {
	private PioloDiGioco[] combinazione;
	private int dim;

	/**
	 * Constructs a new Combinazione object with the specified dimension.
	 * 
	 * @param dim the dimension of the new Combinazione object
	 */
	public Combinazione(int dim) {
		this.dim = dim;
		this.combinazione = new PioloDiGioco[dim];
		for (int i = 0; i < this.dim; i++) {
			this.combinazione[i] = PioloDiGioco.VUOTO;
		}
	}

	/**
	 * Returns the dimension of this Combinazione object.
	 * 
	 * @return the dimension of this Combinazione object
	 */
	public int dim() {
		return dim;
	}

	/**
	 * Returns the PioloDiGioco object at the specified index.
	 * 
	 * @param index the index of the PioloDiGioco object to return
	 * @return the PioloDiGioco object at the specified index
	 */
	public PioloDiGioco getPiolo(int index) {
		return combinazione[index];
	}

	/**
	 * Sets the PioloDiGioco object at the specified index to the specified value.
	 * 
	 * @param index the index of the PioloDiGioco object to set
	 * @param c     the new value for the PioloDiGioco object at the specified index
	 */
	public void setPiolo(int index, PioloDiGioco c) {
		this.combinazione[index] = c;
	}

	/**
	 * Determines whether this Combinazione object is equal to the specified
	 * Combinazione object.
	 * 
	 * @param that the Combinazione object to compare with this Combinazione object
	 * @return true if this Combinazione object is equal to the specified
	 *         Combinazione object; false otherwise
	 */
	public boolean equals(Combinazione that) {
		if (this.dim == that.dim)
			for (int i = 0; i < this.dim(); i++)
				if (!this.getPiolo(i).equals(that.getPiolo(i)))
					return false;
		return true;
	}

	/**
	 * Returns a string representation of this Combinazione object.
	 * 
	 * @return a string representation of this Combinazione object
	 */
	public String toString() {
		StringJoiner sb = new StringJoiner(",");
		for (PioloDiGioco c : combinazione) {
			sb.add(c.toString());
		}
		return sb.toString();
	}
}
