package bussy.model;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;

/**
 * An abstract class representing a transportation line with a unique identifier
 * and a schedule of stops. Concrete subclasses must implement the abstract
 * method {@link #getPercorso(String, String)}.
 * 
 * <p>
 * The {@code equals}, {@code hashCode}, and {@code toString} methods are
 * overridden to provide custom implementations.
 * </p>
 * 
 * <p>
 * The {@code validateOrariDiPassaggioAlleFermate} method is a private utility
 * method used to validate the schedule of stops.
 * </p>
 * 
 * @author michelemazzaa
 */
public abstract class Linea {
	private String id;
	private Map<Integer, Fermata> orariPassaggioAlleFermate;

	/**
	 * Creates a new Linea object with the specified identifier and schedule of
	 * stops.
	 *
	 * @param id                          The unique identifier of the
	 *                                    transportation line.
	 * @param orariDiPassaggioAlleFermate A map of scheduled stops and their
	 *                                    associated times.
	 * @throws IllegalArgumentException if the id or the map of scheduled stops are
	 *                                  null or empty.
	 */
	public Linea(String id, Map<Integer, Fermata> orariDiPassaggioAlleFermate) {
		if (id == null || orariDiPassaggioAlleFermate == null || id.equals(""))
			throw new IllegalArgumentException();
		validateOrariDiPassaggioAlleFermate(orariDiPassaggioAlleFermate);
		this.id = id;
		this.orariPassaggioAlleFermate = new TreeMap<>(orariDiPassaggioAlleFermate);
	}

	/**
	 * Returns an optional Percorso object representing the route between two stops.
	 *
	 * @param fermataDa The starting stop.
	 * @param fermataA  The ending stop.
	 * @return An optional Percorso object representing the route between the two
	 *         stops.
	 */
	public abstract Optional<Percorso> getPercorso(String fermataDa, String fermataA);

	/**
	 * Returns the unique identifier of the transportation line.
	 *
	 * @return The identifier of the transportation line.
	 */
	public String getId() {
		return id;
	}

	/**
	 * Returns the schedule of stops for the transportation line.
	 *
	 * @return A map of scheduled stops and their associated times.
	 */
	public Map<Integer, Fermata> getOrariPassaggioAlleFermate() {
		return orariPassaggioAlleFermate;
	}

	/**
	 * Returns the scheduled time of passage for a specific stop.
	 *
	 * @param nomeFermata The name of the stop.
	 * @return The scheduled time of passage for the specified stop.
	 * @throws IllegalArgumentException if no stop with the given name is found in
	 *                                  the schedule.
	 */
	public int getOrarioPassaggioAllaFermata(String nomeFermata) {
		Optional<Entry<Integer, Fermata>> optionalEntry = Optional.empty();
		for (Entry<Integer, Fermata> entry : orariPassaggioAlleFermate.entrySet()) {
			if (entry.getValue().getNome().equals(nomeFermata))
				optionalEntry = Optional.of(entry);
		}
		if (optionalEntry.isPresent())
			return optionalEntry.get().getKey();
		throw new IllegalArgumentException("No stop with the given name found in the schedule.");
	}

	/**
	 * Returns the final terminal stop of the transportation line.
	 *
	 * @return The entry representing the final terminal stop, with its associated
	 *         scheduled time.
	 * @throws IllegalArgumentException if the list of stops is empty or illegal.
	 */
	public Entry<Integer, Fermata> getCapolineaFinale() {
		Optional<Entry<Integer, Fermata>> entryFinale = Optional.empty();
		for (Entry<Integer, Fermata> entry : orariPassaggioAlleFermate.entrySet()) {
			if (entryFinale.isEmpty() || entry.getKey() > entryFinale.get().getKey())
				entryFinale = Optional.of(entry);
		}
		if (entryFinale.isPresent())
			return entryFinale.get();
		else
			throw new IllegalArgumentException("Empty or illegal list of stops.");
	}

	/**
	 * Returns the initial terminal stop of the transportation line.
	 *
	 * @return The entry representing the initial terminal stop, with its associated
	 *         scheduled time.
	 * @throws IllegalArgumentException if the list of stops is empty or illegal.
	 */
	public Entry<Integer, Fermata> getCapolineaIniziale() {
		Optional<Entry<Integer, Fermata>> entryIniziale = Optional.empty();
		for (Entry<Integer, Fermata> entry : orariPassaggioAlleFermate.entrySet()) {
			if (entryIniziale.isEmpty() || entry.getKey() < entryIniziale.get().getKey())
				entryIniziale = Optional.of(entry);
		}
		if (entryIniziale.isPresent())
			return entryIniziale.get();
		else
			throw new IllegalArgumentException("Empty or illegal list of stops.");
	}

	/**
	 * Checks if the specified stop is the final terminal stop of the transportation
	 * line.
	 *
	 * @param nomeFermata The name of the stop.
	 * @return {@code true} if the specified stop is the final terminal stop,
	 *         {@code false} otherwise.
	 */
	public boolean isCapolineaFinale(String nomeFermata) {
		return getCapolineaFinale().getValue().getNome().equals(nomeFermata);
	}

	/**
	 * Checks if the specified stop is the initial terminal stop of the
	 * transportation line.
	 *
	 * @param nomeFermata The name of the stop.
	 * @return {@code true} if the specified stop is the initial terminal stop,
	 *         {@code false} otherwise.
	 */
	public boolean isCapolineaIniziale(String nomeFermata) {
		return getCapolineaIniziale().getValue().getNome().equals(nomeFermata);
	}

	/**
	 * Checks if the transportation line is circular, i.e., the initial terminal
	 * stop is the same as the final terminal stop.
	 *
	 * @return {@code true} if the transportation line is circular, {@code false}
	 *         otherwise.
	 */
	public boolean isCircolare() {
		return getCapolineaIniziale().getValue().getNome().equals(getCapolineaFinale().getValue().getNome());
	}

	/**
	 * Compares this Linea object with the specified object for equality.
	 *
	 * @param obj The object to compare with.
	 * @return {@code true} if the objects are equal, {@code false} otherwise.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Linea other = (Linea) obj;
		return Objects.equals(id, other.id)
				&& Objects.equals(orariPassaggioAlleFermate, other.orariPassaggioAlleFermate);
	}

	/**
	 * Returns the hash code value for this Linea object.
	 *
	 * @return The hash code value.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(id, orariPassaggioAlleFermate);
	}

	/**
	 * Returns a string representation of this Linea object.
	 *
	 * @return A string representation of this Linea object.
	 */
	@Override
	public String toString() {
		return "Linea: " + getId() + "\n" + "Orari di passaggio alle fermate:\n" + orariPassaggioAlleFermate.toString();
	}

	/**
	 * Validates the schedule of stops, ensuring that the keys (scheduled times) are
	 * non-negative.
	 *
	 * @param orariDiPassaggioAlleFermate A map of scheduled stops and their
	 *                                    associated times.
	 * @throws IllegalArgumentException if any of the keys in the schedule are
	 *                                  negative.
	 */
	private void validateOrariDiPassaggioAlleFermate(Map<Integer, Fermata> orariDiPassaggioAlleFermate) {
		Set<Entry<Integer, Fermata>> entrySet = orariDiPassaggioAlleFermate.entrySet();
		for (Entry<Integer, Fermata> entry : entrySet) {
			if (entry.getKey() < 0) {
				throw new IllegalArgumentException("The keys in the schedule must be non-negative.");
			}
		}
	}

}
