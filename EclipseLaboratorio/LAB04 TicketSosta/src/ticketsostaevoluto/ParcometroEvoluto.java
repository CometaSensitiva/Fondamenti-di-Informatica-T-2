package ticketsostaevoluto;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import ticketsosta.Tariffa;

/**
 * The ParcometroEvoluto class represents an advanced parking meter that
 * calculates the cost of parking based on various tariffs.
 * 
 * @author michelemazzaa
 */
public class ParcometroEvoluto {
	private Tariffa[] tariffe;

	/**
	 * Constructs a new ParcometroEvoluto object with the specified tariffs.
	 * 
	 * @param tariffe an array of Tariffa objects representing the tariffs for this
	 *                parking meter
	 */
	public ParcometroEvoluto(Tariffa[] tariffe) {
		this.tariffe = tariffe;
	}

	/**
	 * Calculates the cost of parking and returns a TicketEvoluto object
	 * representing the parking ticket. The cost is calculated based on the start
	 * and end times of the parking period, taking into account any applicable
	 * deductible and minimum duration.
	 * 
	 * @param inizio the start time of the parking period
	 * @param fine   the end time of the parking period
	 * @return a TicketEvoluto object representing the parking ticket
	 */
	public TicketEvoluto emettiTicket(LocalDateTime inizio, LocalDateTime fine) {

		Tariffa tariffaPrimoGiorno = this.tariffe[inizio.getDayOfWeek().ordinal()];

		// franchigia: si pospone l'inizio effettivo della sosta
		LocalDateTime inizioEffettivo = inizio.plusMinutes(tariffaPrimoGiorno.getMinutiFranchigia());

		double costo;

		// minimo di durata: se durata effettiva inferiore, si considera la durata
		// minima
		long durataSosta = Duration.between(inizioEffettivo, fine).toMinutes();

		if (durataSosta < tariffaPrimoGiorno.getDurataMinima()) {
			costo = tariffaPrimoGiorno.getDurataMinima() * tariffaPrimoGiorno.getTariffaOraria() / 60.0;
		} else {
			costo = calcolaCostoSuPiuGiorni(inizio, fine);
		}
		return new TicketEvoluto(inizio, fine, costo); // NB: nel ticket metto orario ufficiale, non effettivo
	}

	/**
	 * Calculates the cost of parking over multiple days. The cost is calculated
	 * based on the start and end times of the parking period and the applicable
	 * tariffs for each day.
	 * 
	 * @param inizio the start time of the parking period
	 * @param fine   the end time of the parking period
	 * @return the total cost of parking over multiple days
	 */
	private double calcolaCostoSuPiuGiorni(LocalDateTime inizio, LocalDateTime fine) {
		LocalDate day = inizio.toLocalDate();
		LocalDate dayEnd = fine.toLocalDate();
		double costo = 0;
		while (!dayEnd.isBefore(day)) {
			LocalTime dayInizio;
			LocalTime dayFine;
			Tariffa tariffa = this.tariffe[day.getDayOfWeek().ordinal()];

			if (inizio.toLocalDate().equals(day)) {
				dayInizio = inizio.toLocalTime().plusMinutes(tariffa.getMinutiFranchigia());
			} else {
				dayInizio = LocalTime.of(0, 0);
			}

			if (fine.toLocalDate().equals(day)) {
				dayFine = fine.toLocalTime();
			} else {
				dayFine = LocalTime.of(0, 0);
			}

			costo += calcolaCosto(tariffa.getTariffaOraria(), dayInizio, dayFine);
			day = day.plusDays(1);
		}

		return costo;
	}

	/**
	 * Calculates the cost of parking for a single day. The cost is calculated based
	 * on the hourly rate and the start and end times of the parking period for that
	 * day.
	 * 
	 * @param costoOrario the hourly rate for parking
	 * @param da          the start time of the parking period for that day
	 * @param a           the end time of the parking period for that day
	 * @return the cost of parking for a single day
	 */
	private double calcolaCosto(double costoOrario, LocalTime da, LocalTime a) {
		Duration durataSosta;
		if (a.isBefore(da) || LocalTime.of(0, 0).equals(a)) {
			durataSosta = Duration.between(da, LocalTime.of(23, 59)).plusMinutes(1);
		} else {
			durataSosta = Duration.between(da, a);
		}
		return costoOrario * durataSosta.toMinutes() / 60.0;
	}

	/**
	 * Returns a string representation of this ParcometroEvoluto object. The string
	 * representation includes the tariffs configured for this parking meter.
	 * 
	 * @return a string representation of this ParcometroEvoluto object
	 */
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Parcometro configurato con le tariffe:  ");
		builder.append(System.lineSeparator());

		for (Tariffa tari : tariffe) {
			builder.append(tari);
			builder.append(System.lineSeparator());
		}

		return builder.toString();

	}
}
