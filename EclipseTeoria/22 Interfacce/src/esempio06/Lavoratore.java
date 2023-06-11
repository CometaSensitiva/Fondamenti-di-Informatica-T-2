package esempio06;

/**
 * 
 * The Lavoratore interface represents a worker and extends the Persona
 * interface. It includes information about the worker's job title and salary.
 * 
 * @author michelemazzaa
 */
public interface Lavoratore extends Persona {

	/**
	 * 
	 * Returns the worker's job title.
	 * 
	 * @return the worker's job title
	 */
	public String impiego();

	/**
	 * 
	 * Returns the worker's salary.
	 * 
	 * @return the worker's salary
	 */
	public double stipendio();
}