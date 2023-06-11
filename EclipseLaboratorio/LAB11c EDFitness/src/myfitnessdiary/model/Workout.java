package myfitnessdiary.model;

import java.time.LocalDate;

/**
 *
 * Represents a workout with specific details such as activity, date, duration,
 * and intensity.
 *
 * @author michelemazzaa
 */
public class Workout {
	private Activity activity;
	private LocalDate date;
	private int duration;
	private Intensity intensity;

	/**
	 *
	 * Constructs a new Workout object with the given date, duration, intensity, and
	 * activity.
	 *
	 * @param date      the date of the workout
	 *
	 * @param duration  the duration of the workout in minutes
	 *
	 * @param intensity the intensity level of the workout
	 *
	 * @param activity  the activity performed during the workout
	 *
	 * @throws IllegalArgumentException if any of the input parameters is invalid
	 */
	public Workout(LocalDate date, int duration, Intensity intensity, Activity activity) {
		if (date == null)
			throw new IllegalArgumentException("Invalid date.");
		if (duration <= 0)
			throw new IllegalArgumentException("Invalid duration.");
		if (intensity == null)
			throw new IllegalArgumentException("Invalid intensity.");
		if (activity == null)
			throw new IllegalArgumentException("Invalid activity.");

		this.date = date;
		this.duration = duration;
		this.intensity = intensity;
		this.activity = activity;
	}

	/**
	 *
	 * Returns the activity associated with this workout.
	 *
	 * @return the activity
	 */
	public Activity getActivity() {
		return activity;
	}

	/**
	 *
	 * Returns the date of this workout.
	 *
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 *
	 * Returns the duration of this workout in minutes.
	 *
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 *
	 * Returns the intensity level of this workout.
	 *
	 * @return the intensity
	 */
	public Intensity getIntensity() {
		return intensity;
	}

	/**
	 *
	 * Calculates and returns the number of calories burned during this workout.
	 *
	 * @return the number of burned calories
	 */
	public int getBurnedCalories() {
		return getDuration() * getActivity().getCalories(getIntensity());
	}
}
