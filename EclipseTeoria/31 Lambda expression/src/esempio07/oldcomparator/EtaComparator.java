package esempio07.oldcomparator;

import java.util.Comparator;

public class EtaComparator implements Comparator<Persona> {

	@Override
	public int compare(Persona p1, Persona p2) {
		return Integer.compare(p1.getEtà(), p2.getEtà());
	}

}