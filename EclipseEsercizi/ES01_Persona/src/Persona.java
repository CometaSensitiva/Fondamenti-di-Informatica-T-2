
public class Persona {
	private static String nameSurname;
	private static int yearOfBirth;
	
	@SuppressWarnings("static-access")
	public Persona (String nameSurname, int yearOfBirth) {
		this.nameSurname=nameSurname;
		this.yearOfBirth=yearOfBirth;
	}
	
	@SuppressWarnings("static-access")
	public Persona(String nameSurname, String yearOfBirth) {
		this.nameSurname=nameSurname;
		this.yearOfBirth= Integer.decode(yearOfBirth).intValue();
	}
	
	@SuppressWarnings("static-access")
	public String getNameSurname() {
		return this.nameSurname;
	}
	
	@SuppressWarnings("static-access")
	public int getYearOfBirth() {
		return this.yearOfBirth;
	}
	
	@SuppressWarnings("static-access")
	public boolean omonimo(Persona p) {
		return p.nameSurname.equals(this.nameSurname);
	}
	
	public int olderThan(Persona other) {
		return this.getYearOfBirth() > other.getYearOfBirth() ? -1 : this.getYearOfBirth()==other.getYearOfBirth() ? 0 :  +1;
	}
	
}

