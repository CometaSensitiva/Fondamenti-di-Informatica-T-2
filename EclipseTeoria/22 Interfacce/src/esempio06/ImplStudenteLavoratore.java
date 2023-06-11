package esempio06;

import java.time.LocalDateTime;

/**
 * 
 * This class represents an implementation of a student worker, extending the
 * implementation of a student and implementing the StudentWorker interface.
 * 
 * @author michelemazzaa
 */
public class ImplStudenteLavoratore extends ImplStudente implements StudenteLavoratore {

	private String impiego;
	private double stipendio;

	/**
	 * 
	 * Constructs an ImplStudentWorker object with the specified attributes.
	 * 
	 * @param surname      the surname of the student worker
	 * @param name         the name of the student worker
	 * @param dateOfBirth  the date of birth of the student worker
	 * @param placeOfBirth the place of birth of the student worker
	 * @param exams        an array of exams taken by the student worker
	 * @param job          the job of the student worker
	 * @param salary       the salary of the student worker
	 */
	public ImplStudenteLavoratore(String cognome, String nome, LocalDateTime dataDiNascita, String luogoDiNascita,
			Esame[] esami, String impiego, double stipendio) {
		super(cognome, nome, dataDiNascita, luogoDiNascita, esami);
		this.impiego = impiego;
		this.stipendio = stipendio;
	}

	/**
	 * Returns a string representation of the object, including the worker's job and
	 * salary.
	 * 
	 * @return a string representation of the object
	 */
	@Override
	public String toString() {
		return super.toString() + ", di mestiere fa il " + impiego() + " e guadagna € " + stipendio();
	}

	/**
	 * Returns the worker's job.
	 * 
	 * @return the worker's job
	 */
	@Override
	public String impiego() {
		return impiego;
	}

	/**
	 * Returns the worker's salary.
	 * 
	 * @return the worker's salary
	 */
	@Override
	public double stipendio() {
		return stipendio;
	}
}
