package flights.persistence;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import flights.model.Aircraft;
import flights.model.Airport;
import flights.model.City;
import flights.model.FlightSchedule;

public class DataManager {
	Map<String, Aircraft> aircraftMap;
	AircraftsReader aircraftsReader;

	Map<String, Airport> airportMap;
	CitiesReader citiesReader;

	Collection<FlightSchedule> flightSchedules;
	FlightScheduleReader flightScheduleReader;

	public DataManager(CitiesReader citiesReader, AircraftsReader aircraftsReader,
			FlightScheduleReader flightScheduleReader) {
		if (citiesReader == null || aircraftsReader == null || flightScheduleReader == null) {
			throw new IllegalArgumentException("Reader null");
		}
		this.aircraftsReader = aircraftsReader;
		this.citiesReader = citiesReader;
		this.flightScheduleReader = flightScheduleReader;
		aircraftMap = new HashMap<>();
		airportMap = new HashMap<>();
		flightSchedules = new HashSet<>();
	}

	
	public Collection<FlightSchedule> getFlightSchedules() {
		return flightSchedules;
	}

	
	public Map<String, Aircraft> getAircraftMap() {
		return aircraftMap;
	}

	
	public Map<String, Airport> getAirportMap() {
		return airportMap;
	}

	public void readAll() throws IOException, BadFileFormatException {
		String file1 = "Cities.txt";
		Path filePath1 = Paths.get(file1);
		try (BufferedReader reader1 = Files.newBufferedReader(filePath1, StandardCharsets.UTF_8)) {
			Collection<City> cities = citiesReader.read(reader1);
			airportMap.clear();
			for (City city : cities) {
				for (Airport airport : city.getAirports()) {
					airportMap.put(airport.getCode(), airport);
				}
			}
		}
		;

		String file2 = "Aircrafts.txt";
		Path filePath2 = Paths.get(file2);
		try (BufferedReader reader2 = Files.newBufferedReader(filePath2, StandardCharsets.UTF_8)) {
			Collection<Aircraft> aircrafts = aircraftsReader.read(reader2);
			aircraftMap.clear();
			for (Aircraft aircraft : aircrafts) {
				aircraftMap.put(aircraft.getCode(), aircraft);
			}
		}
		;

		String file3 = "FlightSchedule.txt";
		Path filePath3 = Paths.get(file3);
		try (BufferedReader reader3 = Files.newBufferedReader(filePath3, StandardCharsets.UTF_8)) {
			flightSchedules = flightScheduleReader.read(reader3, airportMap, aircraftMap);
		}
		;

	}
}
