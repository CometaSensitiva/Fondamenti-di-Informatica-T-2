package flights.persistence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.text.ParsePosition;
import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import flights.model.Aircraft;
import flights.model.Airport;
import flights.model.FlightSchedule;

public class MyFlightScheduleReader implements FlightScheduleReader {
	private static final DateTimeFormatter timeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

	@Override
	public Collection<FlightSchedule> read(Reader reader, Map<String, Airport> airportMap,
			Map<String, Aircraft> aircraftMap) throws IOException, BadFileFormatException {

		BufferedReader bufferedReader = new BufferedReader(reader);
		Collection<FlightSchedule> flightScheduleCollection = new HashSet<>();
		FlightSchedule flightSchedule;

		while ((flightSchedule = readSchedule(bufferedReader, airportMap, aircraftMap)) != null) {
			flightScheduleCollection.add(flightSchedule);
		}

		return flightScheduleCollection;
	}

	private FlightSchedule readSchedule(BufferedReader reader, Map<String, Airport> airportMap,
			Map<String, Aircraft> aircraftMap) throws IOException, BadFileFormatException {
		String line = reader.readLine();
		if (line == null || line.trim().isEmpty()) {
			return null;
		}
		//
		FlightSchedule flightSchedule;

		String code;

		Airport departureAirport;
		LocalTime departureLocalTime;

		Airport arrivalAirport;
		LocalTime arrivalLocalTime;

		int dayOffset;
		Set<DayOfWeek> daysOfWeek;

		Aircraft aircraft;
		//

		StringTokenizer tokenizer = new StringTokenizer(line, ",");
		if (tokenizer.countTokens() != 8)
			throw new BadFileFormatException("Numero di token diverso dalle attese (!=8)");

		code = tokenizer.nextToken();

		String departureAirportId = tokenizer.nextToken().trim();
		if (airportMap.containsKey(departureAirportId)) {
			departureAirport = airportMap.get(departureAirportId);
		} else {
			throw new BadFileFormatException(
					"Identificativo aereoporto non contenuto nel database : " + departureAirportId);
		}

		String departureLocalTimeString = tokenizer.nextToken().trim();
		ParsePosition pos1 = new ParsePosition(0);
		try {
			TemporalAccessor timeTemporal = timeFormatter.parse(departureLocalTimeString, pos1);
			departureLocalTime = LocalTime.from(timeTemporal);
		} catch (DateTimeParseException e) {
			throw new BadFileFormatException("Errore nel parsing di : " + departureLocalTimeString);
		}

		String arrivalAirportId = tokenizer.nextToken().trim();
		if (airportMap.containsKey(arrivalAirportId)) {
			arrivalAirport = airportMap.get(arrivalAirportId);
		} else {
			throw new BadFileFormatException(
					"Identificativo aereoporto non contenuto nel database : " + arrivalAirportId);
		}

		String arrivalLocalTimeString = tokenizer.nextToken().trim();
		try {
			TemporalAccessor timeTemporal = timeFormatter.parse(arrivalLocalTimeString);
			arrivalLocalTime = LocalTime.from(timeTemporal);
		} catch (DateTimeParseException e) {
			throw new BadFileFormatException("Errore nel parsing di : " + arrivalLocalTimeString);
		}
		String dayOffsetString = tokenizer.nextToken().trim();
		try {
			dayOffset = Integer.valueOf(dayOffsetString);
		} catch (NumberFormatException e) {
			throw new BadFileFormatException("Formato Offset dei giorni non corretto : " + dayOffsetString);
		}

		daysOfWeek = new HashSet<>(readDaysOfWeek(tokenizer.nextToken().trim()));

		String aircraftId = tokenizer.nextToken().trim();
		if (aircraftMap.containsKey(aircraftId)) {
			aircraft = aircraftMap.get(aircraftId);
		} else {
			throw new BadFileFormatException("Identificativo aereomobile non contenuto nel database : " + aircraftId);
		}
		flightSchedule = new FlightSchedule(code, departureAirport, departureLocalTime, arrivalAirport,
				arrivalLocalTime, dayOffset, daysOfWeek, aircraft);

		return flightSchedule;
	}

	private Collection<DayOfWeek> readDaysOfWeek(String days) throws BadFileFormatException {
		Set<DayOfWeek> daysOfWeek = new HashSet<>();
		if (days.length() != 7)
			throw new BadFileFormatException();
		days = days.replace("-", "");
		if (!hasConsecutiveDigits(days))
			throw new BadFileFormatException();
		for (int i = 0; i < days.length(); i++) {
			try {
				daysOfWeek.add(DayOfWeek.of(Integer.valueOf(days.substring(i, i + 1))));
			} catch (DateTimeException e) {
				throw new BadFileFormatException("Formato stringa giorni di volo non corretto" + days);
			}
		}
		return daysOfWeek;
	}

	private static boolean hasConsecutiveDigits(String str) {
		for (int i = 0; i < str.length() - 1; i++) {
			char currentChar = str.charAt(i);
			char nextChar = str.charAt(i + 1);
			if (!Character.isDigit(currentChar) || !Character.isDigit(nextChar)) {
				return false; // Trovato un carattere non numerico
			}
			int currentDigit = Character.getNumericValue(currentChar);
			int nextDigit = Character.getNumericValue(nextChar);
			if (nextDigit < currentDigit + 1) {
				return false; // Trovata una non corrispondenza nella sequenza di cifre consecutive
			}
		}
		return true; // Tutte le cifre sono consecutive
	}

}
