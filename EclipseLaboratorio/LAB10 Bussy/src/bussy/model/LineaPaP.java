package bussy.model;

import java.util.Map;

import java.util.Optional;

/**
 * A concrete subclass of Linea representing a point-to-point transportation
 * line. It inherits the unique identifier and schedule of stops from the
 * superclass.
 * 
 * <p>
 * The {@code getPercorso} method is overridden to calculate the route between
 * two stops and return an optional Percorso object.
 * </p>
 * 
 * <p>
 * The constructor ensures that the line is not circular by calling the
 * superclass constructor and checking the circularity condition.
 * </p>
 * 
 * <p>
 * This class assumes that the schedule of stops is valid and does not contain
 * circular routes.
 * </p>
 * 
 * @author michelemazzaa
 */
public class LineaPaP extends Linea {

	/**
	 * Constructs a LineaPaP object with the specified identifier and schedule of
	 * stops. It also checks if the line is circular and throws an exception if it
	 * is.
	 *
	 * @param id                          The unique identifier of the
	 *                                    transportation line.
	 * @param orariDiPassaggioAlleFermate The schedule of stops and their associated
	 *                                    times.
	 * @throws IllegalArgumentException if the line is circular.
	 */
	public LineaPaP(String id, Map<Integer, Fermata> orariDiPassaggioAlleFermate) {
		super(id, orariDiPassaggioAlleFermate);
		if (isCircolare()) {
			throw new IllegalArgumentException("The line cannot be circular.");
		}
	}

	/**
	 * Calculates the route between the specified starting stop and destination
	 * stop. It returns an optional Percorso object representing the route if it is
	 * possible, or an empty optional otherwise.
	 *
	 * @param fermataDa The starting stop.
	 * @param fermataA  The destination stop.
	 * @return An optional Percorso object representing the route, or an empty
	 *         optional if the route is not possible.
	 */
	@Override
	public Optional<Percorso> getPercorso(String fermataDa, String fermataA) {
		try {
			Optional<Percorso> optionalPercorso = Optional.empty();
			int orarioPartenza = getOrarioPassaggioAllaFermata(fermataDa);
			int orarioArrivo = getOrarioPassaggioAllaFermata(fermataA);
			int durata = orarioArrivo - orarioPartenza;
			if (durata > 0) {
				optionalPercorso = Optional.of(new Percorso(fermataDa, fermataA, this, durata));
			}
			return optionalPercorso;
		} catch (IllegalArgumentException e) {
			return Optional.empty();
		}
	}
}
