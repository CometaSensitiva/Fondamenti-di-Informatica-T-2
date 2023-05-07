package compleanno;

import java.time.LocalDate;
import java.time.Period;

/**
 * This class represents a birthday calculator that computes the period of time
 * between today's date and the next birthday date given a specific date of
 * birth.
 *
 * @author michelemazzaa
 */
public class BirthdayCalculator {

	/**
	 * Calculates the period of time between today's date and the next birthday date
	 * given a specific date of birth.
	 *
	 * @param dateOfBirth the date of birth of the person
	 * @return the period of time until the next birthday
	 */
	private static Period calculateNextBirthday(LocalDate dateOfBirth) {
		LocalDate today = LocalDate.now();
		int currentYear = today.getYear();
		LocalDate nextBirthDay = dateOfBirth.withYear(currentYear);
		if (nextBirthDay.isBefore(today)) {
			nextBirthDay = dateOfBirth.withYear(currentYear + 1);
		}
		return Period.between(today, nextBirthDay);
	}

	/**
	 * The main method of the program, which calculates the period of time until the
	 * next birthday given a specific date of birth and outputs the result to the
	 * console.
	 *
	 * @param args the command line arguments (not used in this program)
	 */
	public static void main(String[] args) {
		// Example usage: calculating the period of time until the next birthday for a
		// person born on May 18, 2003
		LocalDate dateOfBirth = LocalDate.of(2003, 5, 18);
		Period nextBirthday = BirthdayCalculator.calculateNextBirthday(dateOfBirth);
		System.out.println(nextBirthday);
	}
}
