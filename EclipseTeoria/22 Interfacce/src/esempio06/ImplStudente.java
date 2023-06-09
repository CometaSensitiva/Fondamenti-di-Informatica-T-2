package esempio06;

import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * 
 * The ImplStudente class is an implementation of the Studente interface and
 * extends the ImplPersona class. It represents a student and includes basic
 * information about them, as well as an array of their exams.
 * 
 * @author michelemazzaa
 */
public class ImplStudente extends ImplPersona implements Studente {

	private Esame[] esami;

	/**
	 * 
	 * Constructs a new ImplStudente object with the specified parameters.
	 * 
	 * @param cognome        the student's surname
	 * @param nome           the student's given name
	 * @param dataDiNascita  the student's date of birth
	 * @param luogoDiNascita the student's place of birth
	 * @param esami          an array of the student's exams
	 */
	public ImplStudente(String cognome, String nome, LocalDateTime dataDiNascita, String luogoDiNascita,
			Esame[] esami) {
		super(cognome, nome, dataDiNascita, luogoDiNascita);
		this.esami = esami;
	}

	@Override
	public Esame[] esami() {
		return esami;
	}

	/**
	 * 
	 * Returns a string representation of this ImplStudente object. The string
	 * includes the student's full name, place of birth, date of birth, and an array
	 * of their exams.
	 * 
	 * @return a string representation of this ImplStudente object
	 */
	@Override
	public String toString() {
		return super.toString() + " e ha in carriera in seguenti esami " + Arrays.toString(esami);
	}
}