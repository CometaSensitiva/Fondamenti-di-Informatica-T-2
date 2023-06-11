package mastermind.model;

import java.util.StringJoiner;

/**
 * The Risposta class represents a response consisting of PioloRisposta objects.
 * 
 * @author michelemazzaa
 */
public class Risposta {
	private PioloRisposta[] risposta;
	private int dim;

	/**
	 * Constructs a new Risposta object with the specified dimension.
	 * 
	 * @param dim the dimension of the new Risposta object
	 */
	public Risposta(int dim) {
		this.dim = dim;
		this.risposta = new PioloRisposta[dim];
		for (int i = 0; i < this.dim; i++) {
			this.risposta[i] = PioloRisposta.VUOTO;
		}
	}

	/**
	 * Returns the dimension of this Risposta object.
	 * 
	 * @return the dimension of this Risposta object
	 */
	public int dim() {
		return dim;
	}

	/**
	 * Returns the PioloRisposta object at the specified index.
	 * 
	 * @param index the index of the PioloRisposta object to return
	 * @return the PioloRisposta object at the specified index
	 */
	public PioloRisposta getPiolo(int index) {
		return risposta[index];
	}

	/**
	 * Sets the PioloRisposta object at the specified index to the specified value.
	 * 
	 * @param index the index of the PioloRisposta object to set
	 * @param c     the new value for the PioloRisposta object at the specified
	 *              index
	 */
	public void setPiolo(int index, PioloRisposta c) {
		this.risposta[index] = c;
	}

	/**
	 * Determines whether this Risposta object is equal to the specified Risposta
	 * object.
	 * 
	 * @param that the Risposta object to compare with this Risposta object
	 * @return true if this Risposta object is equal to the specified Risposta
	 *         object; false otherwise
	 */
	public boolean equals(Risposta that) {
		if (this.dim == that.dim)
			for (int i = 0; i < this.dim(); i++)
				if (!this.getPiolo(i).equals(that.getPiolo(i)))
					return false;
		return true;
	}

	/**
	 * Determines whether this Risposta object represents a victory.
	 * 
	 * @return true if this Risposta object represents a victory; false otherwise
	 */
	public boolean vittoria() {
		for (int i = 0; i < dim; i++)
			if (!risposta[i].equals(PioloRisposta.NERO))
				return false;
		return true;
	}

	/**
	 * Returns a string representation of this Risposta object.
	 * 
	 * @return a string representation of this Risposta object
	 */
	@Override
	public String toString() {
		StringJoiner sb = new StringJoiner(",");
		for (PioloRisposta r : risposta) {
			sb.add(r.toString());
		}
		return sb.toString();
	}

}
