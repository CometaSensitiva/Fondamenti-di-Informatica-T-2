package myfitnessdiary.model;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Represents a personal fitness diary that keeps track of workouts.
 * 
 * Implements the FitnessDiary interface.
 * 
 * @author michelemazzaa
 */
public class MyFitnessDiary implements FitnessDiary {
	private List<Workout> workouts;

	/**
	 * 
	 * Constructs a new MyFitnessDiary object with an empty list of workouts.
	 */
	public MyFitnessDiary() {
		this.workouts = new ArrayList<>();
	}

	/**
	 * 
	 * Adds a workout to the diary.
	 * 
	 * @param wo the workout to be added
	 */
	public void addWorkout(Workout wo) {
		this.workouts.add(wo);
	}

	/**
	 * 
	 * Retrieves a list of workouts for a specific date.
	 * 
	 * @param date the date to retrieve workouts for
	 * @return a list of workouts for the specified date
	 */
	public List<Workout> getDayWorkouts(LocalDate date) {
		List<Workout> woList = new ArrayList<>();
		for (Workout wo : workouts) {
			if (wo.getDate().equals(date))
				woList.add(wo);
		}
		return woList;
	}

	/**
	 * 
	 * Calculates the total calories burned for a specific date.
	 * 
	 * @param date the date to calculate calories for
	 * @return the total calories burned on the specified date
	 */
	public int getDayWorkoutCalories(LocalDate date) {
		List<Workout> woList = getDayWorkouts(date);
		return calcCalories(woList);
	}

	/**
	 * 
	 * Calculates the total workout minutes for a specific date.
	 * 
	 * @param date the date to calculate workout minutes for
	 * @return the total workout minutes on the specified date
	 */
	public int getDayWorkoutMinutes(LocalDate date) {
		List<Workout> woList = getDayWorkouts(date);
		return calcMinutes(woList);
	}

	/**
	 * 
	 * Retrieves a list of workouts for a whole week starting from the specified
	 * date.
	 * 
	 * @param date the date to start the week from
	 * @return a list of workouts for the week starting from the specified date
	 */
	public List<Workout> getWeekWorkouts(LocalDate date) {
		List<Workout> woList = new ArrayList<>();
		int daysToSubtract = date.getDayOfWeek().getValue() - DayOfWeek.MONDAY.getValue();
		LocalDate monday = date.minusDays(daysToSubtract);
		for (int i = 0; i < 7; i++) {
			woList.addAll(getDayWorkouts(monday.plusDays(i)));
		}
		return woList;
	}

	/**
	 * 
	 * Calculates the total calories burned for a whole week starting from the
	 * specified date.
	 * 
	 * @param date the date to start the week from
	 * @return the total calories burned for the week starting from the specified
	 *         date
	 */
	public int getWeekWorkoutCalories(LocalDate date) {
		List<Workout> woList = getWeekWorkouts(date);
		return calcCalories(woList);
	}

	/**
	 * 
	 * Calculates the total workout minutes for a whole week starting from the
	 * specified date.
	 * 
	 * @param date the date to start the week from
	 * @return the total workout minutes for the week starting from the specified
	 *         date
	 */
	public int getWeekWorkoutMinutes(LocalDate date) {
		List<Workout> woList = getWeekWorkouts(date);
		return calcMinutes(woList);
	}

	private int calcCalories(List<Workout> woList) {
		int calories = 0;
		for (Workout wo : woList) {
			calories += wo.getBurnedCalories();
		}
		return calories;
	}

	private int calcMinutes(List<Workout> woList) {
		int minutes = 0;
		for (Workout wo : woList) {
			minutes += wo.getDuration();
		}
		return minutes;
	}
}
