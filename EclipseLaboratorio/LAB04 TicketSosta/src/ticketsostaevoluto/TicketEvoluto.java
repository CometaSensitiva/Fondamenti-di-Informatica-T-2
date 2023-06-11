package ticketsostaevoluto;

import java.text.NumberFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * This class represents an advanced parking ticket.
 * 
 * @author michelemazzaa
 */
public class TicketEvoluto {
	private double costo;
	private LocalDateTime inizio;
	private LocalDateTime fine;

	/**
	 * Constructs a new TicketEvoluto object with the specified start and end times
	 * and cost.
	 *
	 * @param inizio the start time of the parking
	 * @param fine   the end time of the parking
	 * @param costo  the cost of the parking
	 */
	public TicketEvoluto(LocalDateTime inizio, LocalDateTime fine, double costo) {
		this.inizio = inizio;
		this.fine = fine;
		this.costo = costo;
	}

	/**
	 * Returns the cost of this parking ticket.
	 *
	 * @return the cost of this parking ticket
	 */
	public double getCosto() {
		return this.costo;
	}

	/**
	 * Returns the start time of this parking ticket.
	 *
	 * @return the start time of this parking ticket
	 */
	public LocalDateTime getInizioSosta() {
		return this.inizio;
	}

	/**
	 * Returns the end time of this parking ticket.
	 *
	 * @return the end time of this parking ticket
	 */
	public LocalDateTime getFineSosta() {
		return this.fine;
	}

	/**
	 * Returns a string representation of the cost of this parking ticket formatted
	 * as currency.
	 *
	 * @return a string representation of the cost of this parking ticket formatted
	 *         as currency
	 */
	public String getCostoAsString() {
		NumberFormat formattatore1 = NumberFormat.getCurrencyInstance(Locale.ITALY);
		String res = formattatore1.format(costo);
		return res;
	}

	/**
	 * Returns a string representation of the specified duration.
	 *
	 * @param duration the duration to be represented as a string
	 * @return a string representation of the specified duration
	 */
	public String toStringDuration(Duration duration) {
		String sDuration;

		if (duration.toMinutesPart() > 10) {
			sDuration = duration.toDays() + " d " + duration.toHoursPart() + " h " + duration.toMinutesPart() + " m";
		} else {
			sDuration = duration.toDays() + " d " + duration.toHoursPart() + " h " + duration.toMinutesPart() + " m";
		}

		return sDuration;
	}

	/**
	 * Returns a string representation of this TicketEvoluto object.
	 *
	 * @return a string representation of this TicketEvoluto object
	 */
	public String toString() {
		StringBuilder sTicket = new StringBuilder();
		DateTimeFormatter formattatoreDataOrario = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)
				.withLocale(Locale.ITALY);

		sTicket.append("Sosta autorizzata \ndal : ");
		sTicket.append(formattatoreDataOrario.format(this.inizio));
		sTicket.append(" al : ");
		sTicket.append(formattatoreDataOrario.format(this.fine) + "\n");

		sTicket.append("Durata totale : ");
		sTicket.append(toStringDuration(Duration.between(this.inizio, this.fine)) + "\n");

		sTicket.append("Totale pagato : ");
		sTicket.append(getCostoAsString());

		return sTicket.toString();
	}
}