package bussy.model;

import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * A concrete implementation of the Cercatore interface. It performs searches
 * for valid routes based on a map of transportation lines.
 * 
 * <p>
 * The constructor initializes the object with the given map of lines, and
 * throws an exception if the map is empty or invalid.
 * </p>
 * 
 * <p>
 * The {@code cercaPercorsi} method searches for valid routes between two stops,
 * taking an optional maximum duration into account. It returns a sorted set of
 * Percorso objects representing the valid routes found.
 * </p>
 * 
 * <p>
 * This class assumes that the input stops are non-null and non-empty.
 * </p>
 * 
 * <p>
 * The implementation uses the Linea.getPercorso method to find valid routes on
 * each line in the map. It applies the maximum duration constraint if provided.
 * </p>
 * 
 * <p>
 * The getMappaLinee method returns the map of lines used by the Cercatore.
 * </p>
 * 
 * <p>
 * This class is not thread-safe.
 * </p>
 * 
 * <p>
 * Note: The class name "MyCercatore" is a placeholder and should be replaced
 * with a more meaningful name in the actual implementation.
 * </p>
 * 
 * @author michelemazzaa
 */
public class MyCercatore implements Cercatore {

	private Map<String, Linea> mappaLinee;

	/**
	 * Constructs a MyCercatore object with the specified map of transportation
	 * lines.
	 *
	 * @param mappaLinee The map of transportation lines.
	 * @throws IllegalArgumentException if the map is null or empty.
	 */
	public MyCercatore(Map<String, Linea> mappaLinee) {
		if (mappaLinee == null || mappaLinee.isEmpty()) {
			throw new IllegalArgumentException("Empty or invalid line map.");
		}
		this.mappaLinee = mappaLinee;
	}

	/**
	 * Searches for valid routes between the specified starting stop and destination
	 * stop, considering an optional maximum duration. It returns a sorted set of
	 * Percorso objects representing the valid routes found.
	 *
	 * @param fermataPartenza The starting stop.
	 * @param fermataArrivo   The destination stop.
	 * @param durataMassima   An optional maximum duration for the routes.
	 * @return A sorted set of Percorso objects representing the valid routes found.
	 * @throws IllegalArgumentException if the input stops are null or empty.
	 */
	@Override
	public SortedSet<Percorso> cercaPercorsi(String fermataPartenza, String fermataArrivo, OptionalInt durataMassima) {
		// Input validation
		if (fermataPartenza == null || fermataPartenza.isEmpty() || fermataArrivo == null || fermataArrivo.isEmpty()) {
			throw new IllegalArgumentException("Invalid stops.");
		}

		// Search for valid routes
		SortedSet<Percorso> percorsiValidi = new TreeSet<>();
		for (Linea linea : mappaLinee.values()) {
			Optional<Percorso> optionalPercorso = linea.getPercorso(fermataPartenza, fermataArrivo);
			if (optionalPercorso.isPresent()) {
				Percorso percorso = optionalPercorso.get();
				if (percorso.getDurata() > 0) {
					percorsiValidi.add(percorso);
				}
			}
		}

		// Apply maximum duration, if provided
		SortedSet<Percorso> risultato;
		if (durataMassima.isPresent()) {
			risultato = new TreeSet<>();
			for (Percorso percorso : percorsiValidi) {
				if (percorso.getDurata() <= durataMassima.getAsInt()) {
					risultato.add(percorso);
				}
			}
		} else {
			risultato = percorsiValidi;
		}

		return risultato;
	}

	/**
	 * Returns the map of transportation lines used by the Cercatore.
	 *
	 * @return The map of transportation lines.
	 */
	@Override
	public Map<String, Linea> getMappaLinee() {
		return mappaLinee;
	}
}
