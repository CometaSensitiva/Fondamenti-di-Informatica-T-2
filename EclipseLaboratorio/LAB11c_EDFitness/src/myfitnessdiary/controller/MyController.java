package myfitnessdiary.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import myfitnessdiary.model.FitnessDiary;
import myfitnessdiary.model.Workout;
import myfitnessdiary.persistence.ActivityRepository;
import myfitnessdiary.persistence.ReportWriter;

/**
 * 
 * Represents a custom controller class that extends the base Controller class.
 * 
 * It provides additional functionality for retrieving and formatting workout
 * information for a specific day.
 * 
 * The date is formatted using the FULL format style.
 * 
 * @author michelemazzaa
 */
public class MyController extends Controller {
	private DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);

	/**
	 * 
	 * Constructs a new MyController object with the specified FitnessDiary,
	 * ActivityRepository, and ReportWriter.
	 * 
	 * @param diary        the FitnessDiary instance to use
	 * @param repository   the ActivityRepository instance to use
	 * @param reportWriter the ReportWriter instance to use
	 */
	public MyController(FitnessDiary diary, ActivityRepository repository, ReportWriter reportWriter) {
		super(diary, repository, reportWriter);
	}

	/**
	 * 
	 * Retrieves the workout information for a specific day and formats it as a
	 * string.
	 * 
	 * @param date the date for which to retrieve the workout information
	 * 
	 * @return a formatted string containing the workout information for the
	 *         specified date
	 */
	@Override
	public String getDayWorkout(LocalDate date) {
		StringBuilder str = new StringBuilder();
		str.append("Allenamento di ");
		str.append(date.format(formatter));
		str.append("\n");

		for (Workout wo : getDayWorkouts(date)) {
			str.append(wo.getActivity().getName()).append(" minuti: ").append(wo.getDuration())
					.append(" calorie bruciate: ").append(wo.getBurnedCalories()).append("\n");
		}

		str.append("\nMinuti totali allenamento: ").append(getFitnessDiary().getDayWorkoutMinutes(date))
				.append(" \nCalorie totali bruciate: ").append(getFitnessDiary().getDayWorkoutCalories(date))
				.append("\n");

		return str.toString();
	}
}
