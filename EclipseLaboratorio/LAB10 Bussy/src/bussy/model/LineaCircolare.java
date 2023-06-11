package bussy.model;

import java.util.Map;
import java.util.Optional;

/**
 * A concrete subclass of Linea representing a circular transportation line. It
 * inherits the unique identifier and schedule of stops from the superclass.
 * 
 * <p>
 * The {@code getPercorso} method is overridden to calculate the route between
 * two stops and return an optional Percorso object.
 * </p>
 * 
 * <p>
 * The constructor ensures that the line is circular by calling the superclass
 * constructor and checking the circularity condition.
 * </p>
 * 
 * <p>
 * This class assumes that the schedule of stops represents a circular route.
 * </p>
 * 
 * @author michelemazzaa
 */
public class LineaCircolare extends Linea {

	/**
	 * Constructs a LineaCircolare object with the specified identifier and schedule
	 * of stops. It also checks if the line is circular and throws an exception if
	 * it is not.
	 *
	 * @param id                          The unique identifier of the
	 *                                    transportation line.
	 * @param orariDiPassaggioAlleFermate The schedule of stops and their associated
	 *                                    times.
	 * @throws IllegalArgumentException if the line is not circular.
	 */
	public LineaCircolare(String id, Map<Integer, Fermata> orariDiPassaggioAlleFermate) {
		super(id, orariDiPassaggioAlleFermate);
		if (!isCircolare()) {
			throw new IllegalArgumentException("The line cannot be a point-to-point line.");
		}
	}

	/**
	 * Calculates the route between the specified starting stop and destination stop
	 * on a circular line. It returns an optional Percorso object representing the
	 * route if it is possible, or an empty optional otherwise.
	 *
	 * @param fermataDa The starting stop.
	 * @param fermataA  The destination stop.
	 * @return An optional Percorso object representing the route, or an empty
	 *         optional if the route is not possible.
	 */
	@Override
	public Optional<Percorso> getPercorso(String fermataDa, String fermataA) {
		try {
			int durata = 0;
			int orarioPartenza = getOrarioPassaggioAllaFermata(fermataDa);
			int orarioArrivo = getOrarioPassaggioAllaFermata(fermataA);

			if (isCapolineaIniziale(fermataDa) && isCapolineaFinale(fermataA)) {
				durata = getCapolineaFinale().getKey();
			} else if (isCapolineaIniziale(fermataDa)) {
				durata = orarioArrivo;
			} else if (isCapolineaFinale(fermataDa)) {
				durata = getCapolineaFinale().getKey() - orarioPartenza;
			} else if (orarioPartenza < orarioArrivo) {
				durata = orarioArrivo - orarioPartenza;
			} else if (orarioPartenza >= orarioArrivo) {
				durata = (orarioArrivo - orarioPartenza) + getCapolineaFinale().getKey();
			}
			return Optional.of(new Percorso(fermataDa, fermataA, this, durata));
		} catch (IllegalArgumentException e) {
			return Optional.empty();
		}
	}
}
