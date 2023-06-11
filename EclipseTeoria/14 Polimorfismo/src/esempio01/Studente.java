package esempio01;

import java.time.LocalDate;

public class Studente extends Persona {

	private long numMatricola;

	public Studente(String name, String surname, LocalDate birthDay) {
		super(name, surname, birthDay);
	}

	public Studente(String name, String surname, String birthDay) {
		super(name, surname, birthDay);
	}

	public Studente(String name, String surname, LocalDate birthDay, long numMatricola) {
		super(name, surname, birthDay);
		setNumMatricola(numMatricola);
	}
	
	public Studente(String name, String surname, String birthDay, long numMatricola) {
		super(name, surname, birthDay);
		setNumMatricola(numMatricola);
	}
	
	public Studente(String name, String surname, String birthDay, String numMatricola) {
		super(name, surname, birthDay);
		setNumMatricola(Long.parseLong(numMatricola));
	}

	public long getNumMatricola() {
		return numMatricola;
	}

	protected void setNumMatricola(long numMatricola) {
		this.numMatricola = numMatricola;
	}

	@Override
	public String toString() {
		return super.toString() + "\nNumero di matricola : " + getNumMatricola();
	}

}
