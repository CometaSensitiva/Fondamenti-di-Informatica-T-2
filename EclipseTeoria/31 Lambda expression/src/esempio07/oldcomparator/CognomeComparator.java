package esempio07.oldcomparator;

import java.util.Comparator;

public class CognomeComparator implements Comparator<Persona> {

	@Override
	public int compare(Persona p1, Persona p2) {
		return p1.getCognome().compareTo(p2.getCognome());
	}

}
