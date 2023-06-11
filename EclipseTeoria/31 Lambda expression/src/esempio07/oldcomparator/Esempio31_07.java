package esempio07.oldcomparator;

import java.util.Arrays;

public class Esempio31_07 {

	public static void main(String[] args) {
		Persona[] persone = new Persona[] {
				new Persona("John", "Doe", 25), 
				new Persona("Jane", "Doe", 45),
				new Persona("Anne", "Bee", 31), 
				new Persona("Jane", "Doe", 22) 
				};
		for (Persona p : persone) {
			System.out.println(p);
		}
		System.out.println("- - - - - - Persone ordinato per cognome - - - - - -");
		Arrays.sort(persone, new CognomeComparator());
		for (Persona p : persone) {
			System.out.println(p);
		}
		System.out.println("- - - - - - Persone ordinato per nome - - - - - -");
		Arrays.sort(persone, new NomeComparator());
		for (Persona p : persone) {
			System.out.println(p);
		}
		System.out.println("- - - - - - Persone ordinato per età - - - - - -");
		Arrays.sort(persone, new EtaComparator());
		for (Persona p : persone) {
			System.out.println(p);
		}
	}

}
