package esempio5;

import java.time.LocalDate;

public class Main5 {

	public static void main(String[] args) {
		Persona p = new Persona("John","Snow", LocalDate.of(1980, 3, 23));
		Studente s= new Studente("Tom","Brady", LocalDate.of(2002, 2,  2), 987654321);
		System.out.println(p); // stampa i dati base
		System.out.println();
		System.out.println(s); // stampa anche la matricola
		
		p=s;				   // studente estende persona
		System.out.println();
		System.out.println(p); // polimorfismo
	
	}

}
