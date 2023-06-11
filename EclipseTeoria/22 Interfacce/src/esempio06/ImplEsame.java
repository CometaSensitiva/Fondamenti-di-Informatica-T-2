package esempio06;

/**
 * 
 * Implementation of the Esame interface representing an exam with a name, a
 * grade, and an optional honor.
 * 
 * @author michelemazzaa
 */
public class ImplEsame implements Esame {

	private String denominazione; // Name of the exam
	private int voto; // Numeric grade of the exam
	private boolean lode; // Whether the exam received an honor (only possible if voto==30)

	/**
	 * 
	 * Constructor to create an instance of the exam with the given name, grade, and
	 * honor status.
	 * 
	 * @param denominazione The name of the exam.
	 * @param voto          The numeric grade of the exam.
	 * @param lode          Whether the exam received an honor (only possible if
	 *                      voto==30).
	 */
	public ImplEsame(String denominazione, int voto, boolean lode) {
		this.denominazione = denominazione;
		this.voto = voto;
		this.lode = lode;
		if (voto == 30) {
			this.lode = true; // If the grade is 30, the exam must have received an honor.
		}
	}

	/**
	 * 
	 * Constructor to create an instance of the exam with the given name and a
	 * default grade of 0 and no honor.
	 * 
	 * @param denominazione The name of the exam.
	 */
	public ImplEsame(String denominazione) {
		this(denominazione, 0, false);
	}

	/**
	 * 
	 * Returns the name of the exam.
	 * 
	 * @return The name of the exam.
	 */
	@Override
	public String denominazione() {
		return denominazione;
	}

	/**
	 * 
	 * Returns the numeric grade of the exam.
	 * 
	 * @return The numeric grade of the exam.
	 */
	public int voto() {
		return voto;
	}

	/**
	 * 
	 * Returns the grade of the exam as a string.
	 * 
	 * @return The grade of the exam as a string.
	 */
	public String votoAsString() {
		return String.valueOf(voto);
	}

	/**
	 * 
	 * Returns whether the exam received an honor.
	 * 
	 * @return True if the exam received an honor, false otherwise.
	 */
	public boolean lode() {
		return lode;
	}

	/**
	 * 
	 * Returns a string representation of the exam, consisting of the name, grade,
	 * and honor (if any).
	 * 
	 * @return A string representation of the exam.
	 */
	@Override
	public String toString() {
		return denominazione() + "\t" + voto() + (lode() ? "L" : "");
	}
}
