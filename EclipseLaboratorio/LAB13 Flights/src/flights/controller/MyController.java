package flights.controller;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import flights.model.Airport;
import flights.model.FlightSchedule;
import flights.persistence.DataManager;

public class MyController implements Controller {

	private DataManager dataManager;

	private List<Airport> sortedAirports;

	public MyController(DataManager dataManager) {
		if (dataManager == null) {
			throw new IllegalArgumentException("Il data Manager non può essere null");
		}
		this.dataManager = dataManager;
		sortedAirports = new ArrayList<>();
	}

	@Override
	public List<Airport> getSortedAirports() {
		Set<Airport> sortedAirportsSet = new TreeSet<>(
				Comparator.comparing((Airport airport) -> airport.getCity().getName()).thenComparing(Airport::getName));

		sortedAirportsSet.addAll(dataManager.getAirportMap().values());

		sortedAirports = new ArrayList<>(sortedAirportsSet);

		return sortedAirports;
	}

	@Override
	public List<FlightSchedule> searchFlights(Airport departureAirport, Airport arrivalAirport, LocalDate date) {
		Collection<FlightSchedule> flightScheduleSet = new HashSet<>(dataManager.getFlightSchedules());
		List<FlightSchedule> foundFlights = new ArrayList<>();

		DayOfWeek day = DayOfWeek.from(date);
		for (FlightSchedule flight : flightScheduleSet) {
			if (flight.getDepartureAirport().equals(departureAirport) && 
				flight.getArrivalAirport().equals(arrivalAirport) && 
				flight.getDaysOfWeek().contains(day)) {
				foundFlights.add(flight);
			}
		}
		return foundFlights;
	}

}
