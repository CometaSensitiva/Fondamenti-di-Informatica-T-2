package ticketsosta;

import java.time.Duration;
import java.time.LocalTime;

/**
 * This class represents a parking meter.
 * 
 * @author michelemazzaa
 */
public class Parcometro {
	private Tariffa tariffa;

	/**
	 * Constructs a new Parcometro object with the specified Tariffa
	 *
	 * @param tariffa the Tariffa to be used by this parking meter
	 */
	public Parcometro(Tariffa tariffa) {
		this.tariffa = tariffa;
	}

	/**
	 * Calculates the cost of parking and returns a Ticket object.
	 *
	 * @param inizio the start time of the parking
	 * @param fine   the end time of the parking
	 * @return a Ticket object representing the parking transaction
	 */
	public Ticket emettiTicket(LocalTime inizio, LocalTime fine) {
		LocalTime inizioEffettivo = inizio.plusMinutes(tariffa.getMinutiFranchigia());
		double costo = 0;
		long durataSosta = Duration.between(inizioEffettivo, fine).toMinutes();

		if (durataSosta > tariffa.getDurataMinima()) {
			costo = calcolaCosto(tariffa.getTariffaOraria(), inizioEffettivo, fine);
		} else {
			costo = tariffa.getDurataMinima() * tariffa.getTariffaOraria() / 60.0;
		}

		Ticket result = new Ticket(inizio, fine, costo);
		return result;
	}

	/**
	 * Calculates and returns the cost of parking based on the hourly rate and start
	 * and end times.
	 *
	 * @param costoOrario the hourly rate for parking
	 * @param inizio      the start time of the parking
	 * @param fine        the end time of the parking
	 * @return the cost of parking
	 */
	private double calcolaCosto(double costoOrario, LocalTime inizio, LocalTime fine) {
		double costo = 0;
		Duration duration;

		if (fine.isBefore(inizio) || LocalTime.of(0, 0).equals(inizio)) {
			// Do not consider the parking time of the next day
			duration = Duration.between(inizio, LocalTime.of(23, 59)).plusMinutes(1);
		} else {
			duration = Duration.between(inizio, fine);
		}

		costo = costoOrario * duration.toMinutes() / 60.0;
		return costo;
	}

	/**
	 * Returns a string representation of this Parcometro object.
	 *
	 * @return a string representation of this Parcometro object
	 */
	public String toString() {
		String sParcometro = "Parcometro configurato con la tariffa :" + tariffa.toString();
		return sParcometro;
	}
}
