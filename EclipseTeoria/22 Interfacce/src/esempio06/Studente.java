package esempio06;

/**
 * 
 * The Studente interface represents a student and extends the Persona
 * interface. It includes information about the student's exams.
 * 
 * @author michelemazzaa
 */
public interface Studente extends Persona {

	/**
	 * 
	 * Returns an array of exams taken by the student.
	 * 
	 * @return an array of exams taken by the student
	 */
	public Esame[] esami();
}