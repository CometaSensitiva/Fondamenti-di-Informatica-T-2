package esempio6;

import java.time.LocalDateTime;

/**
 * 
 * The ImplLavoratore class is an implementation of the Lavoratore interface and
 * extends the ImplPersona class. It represents a worker and includes basic
 * information about them, as well as their job position and salary.
 * 
 * @author michelemazzaa
 */
public class ImplLavoratore extends ImplPersona implements Lavoratore {

	private String impiego;
	private double stipendio;

	/**
	 * 
	 * Constructs a new ImplLavoratore object with the specified parameters.
	 * 
	 * @param cognome        the worker's surname
	 * @param nome           the worker's given name
	 * @param dataDiNascita  the worker's date of birth
	 * @param luogoDiNascita the worker's place of birth
	 * @param impiego        the worker's job position
	 * @param stipendio      the worker's salary
	 */
	public ImplLavoratore(String cognome, String nome, LocalDateTime dataDiNascita, String luogoDiNascita,
			String impiego, double stipendio) {
		super(cognome, nome, dataDiNascita, luogoDiNascita);
		this.impiego = impiego;
		this.stipendio = stipendio;
	}

	@Override
	public String impiego() {
		return impiego;
	}

	@Override
	public double stipendio() {
		return stipendio;
	}

	/**
	 * 
	 * Returns a string representation of this ImplLavoratore object. The string
	 * includes the worker's full name, place of birth, date of birth, job position,
	 * and salary.
	 * 
	 * @return a string representation of this ImplLavoratore object
	 */
	@Override
	public String toString() {
		return super.toString() + ", di mestiere fa " + impiego() + " e guadagna € " + stipendio();
	}
}
