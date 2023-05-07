
package fondt2.tlc;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;
import fondt2.tlc.Band.bandComparator;

/**
 * 
 * @author michelemazza Questa classe rappresenta una tariffa telefonica con
 *         diverse fasce orarie.
 */
public class Rate {
	private Band[] bands;
	private String name;
	private String numberRoot;
	private int intervallInMillis;
	private double startCallCost;

	/**
	 * Costruttore della classe Rate.
	 *
	 * @param name              il nome della tariffa
	 * @param bands             le fasce orarie associate alla tariffa
	 * @param intervallInMillis la durata dell'intervallo di tempo per il calcolo
	 *                          del costo della chiamata
	 * @param startCallCost     il costo iniziale della chiamata
	 * @param numberRoot        la radice del numero di telefono a cui si applica la
	 *                          tariffa
	 */
	public Rate(String name, Band[] bands, int intervallInMillis, double startCallCost, String numberRoot) {
		this.name = name;
		this.bands = Arrays.copyOf(bands, bands.length);
		this.intervallInMillis = intervallInMillis;
		this.startCallCost = startCallCost;
		this.numberRoot = numberRoot;

	}

	/**
	 * Restituisce le fasce orarie associate alla tariffa.
	 *
	 * @return un array di oggetti Band che rappresentano le fasce orarie associate
	 *         alla tariffa
	 */
	public Band[] getBands() {
		return Arrays.copyOf(bands, bands.length);
	}

	/**
	 * Restituisce il nome della tariffa.
	 *
	 * @return il nome della tariffa
	 */
	public String getName() {
		return name;
	}

	/**
	 * Restituisce la radice del numero di telefono a cui si applica la tariffa.
	 *
	 * @return la radice del numero di telefono a cui si applica la tariffa
	 */
	public String getNumberRoot() {
		return numberRoot;
	}

	/**
	 * Restituisce la durata dell'intervallo di tempo per il calcolo del costo della
	 * chiamata.
	 *
	 * @return la durata dell'intervallo di tempo per il calcolo del costo della
	 *         chiamata
	 */
	public int getIntervallInMillis() {
		return intervallInMillis;
	}

	/**
	 * Restituisce il costo iniziale della chiamata.
	 *
	 * @return il costo iniziale della chiamata
	 */
	public double getStartCallCost() {
		return startCallCost;
	}

	/**
	 * Verifica se la tariffa è applicabile a un numero di telefono specificato.
	 *
	 * @param destinationNumber il numero di telefono da verificare
	 * @return true se la tariffa è applicabile al numero di telefono specificato,
	 *         altrimenti false
	 */
	public boolean isApplicableTo(String destinationNumber) {
		return destinationNumber.contains(numberRoot);
	}

	/**
	 * Verifica se la tariffa è valida.
	 *
	 * @return true se la tariffa è valida, altrimenti false
	 */
	public boolean isValid() {
		boolean isValid = true;
		int i = 0;
		while (i < bands.length && isValid) {
			isValid = bands[i].isValid();
			i++;
		}
		for (i = 1; i < 8 && isValid; i++)
			isValid = validateDay(DayOfWeek.of(i));
		return isValid;
	}

	/**
	 * Verifica se una fascia oraria è valida per un giorno specifico.
	 *
	 * @param day il giorno della settimana da verificare
	 * @return true se la fascia oraria è valida per il giorno specificato,
	 *         altrimenti false
	 */
	private boolean validateDay(DayOfWeek day) {
		Band[] bandsInDay = selectBandsInDay(day);
		sortBandsByStartTime(bandsInDay);
		return validateBandsInDay(bandsInDay);
	}

	/**
	 * Seleziona le fasce orarie valide per un giorno specifico.
	 *
	 * @param day il giorno della settimana da verificare
	 * @return un array di oggetti Band che rappresentano le fasce orarie valide per
	 *         il giorno specificato
	 */
	private Band[] selectBandsInDay(DayOfWeek day) {
		int numberOfBandsInDay = 0;
		for (int i = 0; i < bands.length; i++) {
			DayOfWeek[] combinedDays = bands[i].getCombinedDays();

			for (int j = 0; j < combinedDays.length; j++)
				if (combinedDays[j].equals(day)) {
					numberOfBandsInDay++;
				}

		}
		Band[] bandsInDay = new Band[numberOfBandsInDay];
		int k = 0;
		for (int i = 0; i < bands.length; i++) {

			DayOfWeek[] combinedDays = bands[i].getCombinedDays();

			for (int j = 0; j < combinedDays.length; j++)
				if (combinedDays[j].equals(day)) {
					bandsInDay[k] = bands[i];
					k++;
				}
		}
		return bandsInDay;

	}

	/**
	 * Ordina un array di fasce orarie in base all'ora di inizio.
	 *
	 * @param bands l'array di fasce orarie da ordinare
	 */
	private void sortBandsByStartTime(Band[] bands) {
		bandComparator customComparator = new Band.bandComparator();
		Arrays.sort(bands, customComparator);
	}

	/**
	 * Verifica se le fasce orarie di un giorno specifico sono valide.
	 *
	 * @param bandsInDay l'array di fasce orarie da verificare
	 * @return true se le fasce orarie sono valide, altrimenti false
	 */
	private boolean validateBandsInDay(Band[] bandsInDay) {
		boolean isValid = false;
		if (bandsInDay[0].getStartTime().equals(LocalTime.MIN)
				&& bandsInDay[bandsInDay.length - 1].getEndTime().equals(LocalTime.MAX)) {
			isValid = true;
			for (int i = 0; i < bandsInDay.length - 1 && isValid; i++) {
				LocalTime tempEnd = bandsInDay[i].getEndTime();
				LocalTime tempStart = bandsInDay[i + 1].getStartTime();
				if (tempEnd.plusNanos(1).equals(tempStart))
					isValid = true;
				else
					isValid = false;

			}
		}
		return isValid;
	}

	/**
	 * Calcola il costo di una chiamata telefonica.
	 *
	 * @param phoneCall la chiamata telefonica da valutare
	 * @return il costo della chiamata telefonica
	 */
	public double getCallCost(PhoneCall phoneCall) {
		Band[] tempBands = getBands();
		Band callBand = null;
		boolean foundBand = false;
		double callCost = -1;
		int i = 0;
		while (i < tempBands.length && !foundBand) {
			if (tempBands[i].isInBand(phoneCall.getStart())) {
				callBand = tempBands[i];
				foundBand = true;
			}
			i++;
		}
		if (foundBand) {
			Duration callDuration = Duration.between(phoneCall.getStart(), phoneCall.getEnd());
			callCost = (int) (Math.ceil((double) callDuration.toMillis() / getIntervallInMillis()))
					* callBand.getCostPerInterval() + getStartCallCost();
		}
		return callCost;

	}
}
