
package fondt2.tlc;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;

import fondt2.tlc.util.DayOfWeekHelper;

/**
 * 
 * @author michelemazza
 * 
 *         Questa classe rappresenta una fascia oraria con un costo associato
 *         per intervallo.
 */
public class Band {
	private DayOfWeek[] combinedDays;
	private double costPerInterval;
	private LocalTime startTime;
	private LocalTime endTime;

	/**
	 * Costruttore della classe Band.
	 *
	 * @param startTime       l'ora di inizio della fascia oraria
	 * @param endTime         l'ora di fine della fascia oraria
	 * @param combinedDays    i giorni della settimana in cui la fascia è attiva
	 * @param costPerInterval il costo per intervallo associato alla fascia
	 */
	public Band(LocalTime startTime, LocalTime endTime, DayOfWeek[] combinedDays, double costPerInterval) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.combinedDays = Arrays.copyOf(combinedDays, combinedDays.length);
		this.costPerInterval = costPerInterval;
	}

	/**
	 * Restituisce i giorni della settimana in cui la fascia è attiva.
	 *
	 * @return un array di oggetti DayOfWeek che rappresentano i giorni della
	 *         settimana in cui la fascia è attiva
	 */
	public DayOfWeek[] getCombinedDays() {
		return combinedDays;
	}

	/**
	 * Restituisce il costo per intervallo associato alla fascia.
	 *
	 * @return il costo per intervallo associato alla fascia
	 */
	public double getCostPerInterval() {
		return costPerInterval;
	}

	/**
	 * Restituisce l'ora di inizio della fascia oraria.
	 *
	 * @return l'ora di inizio della fascia oraria
	 */
	public LocalTime getStartTime() {
		return startTime;
	}

	/**
	 * Restituisce l'ora di fine della fascia oraria.
	 *
	 * @return l'ora di fine della fascia oraria
	 */
	public LocalTime getEndTime() {
		return endTime;
	}

	/**
	 * Verifica se una data e ora specificata rientra nella fascia oraria.
	 *
	 * @param dateTime la data e ora da verificare
	 * @return true se la data e ora specificata rientra nella fascia oraria,
	 *         altrimenti false
	 */
	public boolean isInBand(LocalDateTime dateTime) {
		return DayOfWeekHelper.isDayIn(dateTime.getDayOfWeek(), getCombinedDays())
				&& !dateTime.toLocalTime().isBefore(getStartTime()) && !dateTime.toLocalTime().isAfter(getEndTime());
	}

	/**
	 * Verifica se la fascia oraria è valida.
	 *
	 * @return true se la fascia oraria è valida, altrimenti false
	 */
	public boolean isValid() {
		if (getStartTime().isBefore(getEndTime()) && getCostPerInterval() > 0 && getCombinedDays() != null
				&& getCombinedDays().length > 0) {
			for (DayOfWeek x : getCombinedDays()) {
				if (x == null)
					return false;
			}
			return true;
		} else
			return false;
	}

	/**
	 * Questa classe implementa un comparatore per oggetti Band in base all'ora di
	 * inizio.
	 */
	public static class bandComparator implements Comparator<Band> {

		/**
		 * Confronta due oggetti Band in base all'ora di inizio.
		 *
		 * @param b1 il primo oggetto Band da confrontare
		 * @param b2 il secondo oggetto Band da confrontare
		 * @return un valore negativo se l'ora di inizio del primo oggetto è precedente
		 *         a quella del secondo, un valore positivo se l'ora di inizio del primo
		 *         oggetto è successiva a quella del secondo, zero se le ore di inizio
		 *         dei due oggetti sono uguali
		 */
		@Override
		public int compare(Band b1, Band b2) {
			if (b1.getStartTime().isBefore(b2.getStartTime()))
				return -1;
			if (b1.getStartTime().isAfter(b2.getStartTime()))
				return 1;
			else
				return 0;
		}
	}
}