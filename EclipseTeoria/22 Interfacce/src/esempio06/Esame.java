package esempio06;

/**
 * 
 * The Esame interface represents an exam and includes information about the
 * exam's name, grade, and honors (if any).
 * 
 * @author michelemazzaa
 */
public interface Esame {

	/**
	 * 
	 * Returns the name of the exam.
	 * 
	 * @return the name of the exam
	 */
	public String denominazione();

	/**
	 * 
	 * Returns the grade received on the exam.
	 * 
	 * @return the grade received on the exam
	 */
	public int voto();

	/**
	 * 
	 * Returns the grade received on the exam as a string.
	 * 
	 * @return the grade received on the exam as a string
	 */
	public String votoAsString();

	/**
	 * 
	 * Returns whether the exam was taken with honors.
	 * 
	 * @return true if the exam was taken with honors, false otherwise
	 */
	public boolean lode();
}