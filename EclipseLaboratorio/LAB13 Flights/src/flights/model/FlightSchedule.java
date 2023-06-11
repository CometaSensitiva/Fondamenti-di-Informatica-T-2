package flights.model;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class FlightSchedule {
	String code;

	Airport departureAirport;
	LocalTime departureLocalTime;
	
	Airport arrivalAirport;
	LocalTime arrivalLocalTime;

	int dayOffset;
	Set<DayOfWeek> daysOfWeek;
	Aircraft aircraft;

	public FlightSchedule(String code, Airport departureAirport, LocalTime departureLocalTime, Airport arrivalAirport,
			LocalTime arrivalLocalTime, int dayOffset, Collection<DayOfWeek> daysOfWeek, Aircraft aircraft) {
		if (aircraft == null || arrivalAirport == null || arrivalLocalTime == null || code == null || daysOfWeek == null
				|| departureAirport == null || departureLocalTime == null) {
			throw new IllegalArgumentException("Gli argomenti non possono essere null");
		}
		this.aircraft = aircraft;
		this.arrivalAirport = arrivalAirport;
		this.arrivalLocalTime = arrivalLocalTime;
		this.code = code;
		this.dayOffset = dayOffset;
		this.daysOfWeek = new HashSet<>(daysOfWeek);
		this.departureAirport = departureAirport;
		this.departureLocalTime = departureLocalTime;
	}

	public Duration getFlightDuration() {
		OffsetDateTime departure = OffsetDateTime.of(LocalDate.now(), departureLocalTime,
				ZoneOffset.ofHours(getDepartureAirport().getCity().getTimeZone()));
		OffsetDateTime arrival = OffsetDateTime.of(LocalDate.now(), arrivalLocalTime,
				ZoneOffset.ofHours(getArrivalAirport().getCity().getTimeZone()));
		Duration result = Duration.between(departure, arrival);
		while (result.isNegative()) {
			result = result.plusDays(1);
		}	
		return result;
	}

	/**
	 * @return the aircrafts
	 */
	public Aircraft getAircraft() {
		return aircraft;
	}


	public Airport getArrivalAirport() {
		return arrivalAirport;
	}


	public LocalTime getArrivalLocalTime() {
		return arrivalLocalTime;
	}

	public String getCode() {
		return code;
	}

	public int getDayOffset() {
		return dayOffset;
	}

	
	public Set<DayOfWeek> getDaysOfWeek() {
		return daysOfWeek;
	}


	public Airport getDepartureAirport() {
		return departureAirport;
	}


	public LocalTime getDepartureLocalTime() {
		return departureLocalTime;
	}

	@Override
	public int hashCode() {
		return Objects.hash(aircraft, arrivalAirport, arrivalLocalTime, code, dayOffset, daysOfWeek, departureAirport,
				departureLocalTime);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FlightSchedule other = (FlightSchedule) obj;
		return Objects.equals(aircraft, other.aircraft) && Objects.equals(arrivalAirport, other.arrivalAirport)
				&& Objects.equals(arrivalLocalTime, other.arrivalLocalTime) && Objects.equals(code, other.code)
				&& dayOffset == other.dayOffset && Objects.equals(daysOfWeek, other.daysOfWeek)
				&& Objects.equals(departureAirport, other.departureAirport)
				&& Objects.equals(departureLocalTime, other.departureLocalTime);
	}

}
