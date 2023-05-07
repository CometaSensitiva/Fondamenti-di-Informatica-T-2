package esempio5;

import java.time.LocalDate;

/**
 * The Studente class represents a student that extends from the Persona class.
 * It contains a unique identification number called the matriculation number.
 *
 * @author michelemazzaa
 * @version 1.0
 */
public class Studente extends Persona {

	/** The unique identification number of the student. */
	private long numMatricola;

	/**
	 * Creates a new Studente object with the given name, surname, and birthdate.
	 * 
	 * @param name     The name of the student.
	 * @param surname  The surname of the student.
	 * @param birthDay The birthdate of the student.
	 */
	public Studente(String name, String surname, LocalDate birthDay) {
		super(name, surname, birthDay);
	}

	/**
	 * Creates a new Studente object with the given name, surname, and birthdate.
	 * 
	 * @param name     The name of the student.
	 * @param surname  The surname of the student.
	 * @param birthDay The birthdate of the student as a string in the format
	 *                 "dd/MM/yyyy".
	 */
	public Studente(String name, String surname, String birthDay) {
		super(name, surname, birthDay);
	}

	/**
	 * Creates a new Studente object with the given name, surname, birthdate, and
	 * matriculation number.
	 * 
	 * @param name         The name of the student.
	 * @param surname      The surname of the student.
	 * @param birthDay     The birthdate of the student.
	 * @param numMatricola The matriculation number of the student.
	 */
	public Studente(String name, String surname, LocalDate birthDay, long numMatricola) {
		super(name, surname, birthDay);
		setNumMatricola(numMatricola);
	}

	/**
	 * Creates a new Studente object with the given name, surname, birthdate, and
	 * matriculation number.
	 * 
	 * @param name         The name of the student.
	 * @param surname      The surname of the student.
	 * @param birthDay     The birthdate of the student as a string in the format
	 *                     "dd/MM/yyyy".
	 * @param numMatricola The matriculation number of the student.
	 */
	public Studente(String name, String surname, String birthDay, long numMatricola) {
		super(name, surname, birthDay);
		setNumMatricola(numMatricola);
	}

	/**
	 * Creates a new Studente object with the given name, surname, birthdate, and
	 * matriculation number.
	 * 
	 * @param name         The name of the student.
	 * @param surname      The surname of the student.
	 * @param birthDay     The birthdate of the student as a string in the format
	 *                     "dd/MM/yyyy".
	 * @param numMatricola The matriculation number of the student as a string.
	 */
	public Studente(String name, String surname, String birthDay, String numMatricola) {
		super(name, surname, birthDay);
		setNumMatricola(Long.parseLong(numMatricola));
	}

	/**
	 * Gets the matriculation number of the student.
	 * 
	 * @return The matriculation number of the student.
	 */
	public long getNumMatricola() {
		return numMatricola;
	}

	/**
	 * Sets the matriculation number of the student.
	 * 
	 * @param numMatricola The matriculation number of the student
	 */
	protected void setNumMatricola(long numMatricola) {
		this.numMatricola = numMatricola;
	}

	/**
	 * 
	 * Returns a string representation of the student's name, surname, birth date,
	 * and mamatriculation number.
	 * 
	 * @return a string representation of the person's name, surname, and birth
	 *         date, and mamatriculation number.
	 */
	@Override
	public String toString() {
		return super.toString() + "\nNumero di matricola : " + getNumMatricola();
	}

}
