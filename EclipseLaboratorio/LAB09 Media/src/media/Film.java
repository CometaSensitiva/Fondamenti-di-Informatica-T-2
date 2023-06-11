package media;

import media.filters.HasDuration;
import media.filters.HasGenre;
import utils.StringUtils;

/**
 * A class representing a film that extends the Media class and implements the
 * HasGenre and HasDuration interfaces.
 * 
 * @author michelemazzaa
 */
public class Film extends Media implements HasGenre, HasDuration {
	private String[] actors = null;
	private String director = null;
	private int duration = -1;
	private String genre = null;

	/**
	 * Constructs a new Film object with the specified title, year, director,
	 * duration, actors, and genre.
	 *
	 * @param title    the title of the film
	 * @param year     the year of the film
	 * @param director the director of the film
	 * @param duration the duration of the film in minutes
	 * @param actors   an array of actors in the film
	 * @param genre    the genre of the film
	 */
	public Film(String title, int year, String director, int duration, String[] actors, String genre) {
		super(year, title);
		setDirector(director);
		setDuration(duration);
		setGenre(genre);
		setActors(actors);
	}

	/**
	 * Returns the director of the film.
	 *
	 * @return the director of the film
	 */
	public String getDirector() {
		return director;
	}

	/**
	 * Sets the director of the film.
	 *
	 * @param director the new director of the film
	 */
	public void setDirector(String director) {
		this.director = director;
	}

	/**
	 * Returns the duration of the film in minutes.
	 *
	 * @return the duration of the film in minutes
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * Sets the duration of the film in minutes.
	 *
	 * @param duration the new duration of the film in minutes
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}

	/**
	 * Returns the genre of the film.
	 *
	 * @return the genre of the film
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * Sets the genre of the film.
	 *
	 * @param genre the new genre of the film
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

	/**
	 * Returns an array of actors in the film.
	 *
	 * @return an array of actors in the film
	 */
	public String[] getActors() {
		String[] actors = new String[this.actors.length];
		for (int i = 0; i < this.actors.length; i++) {
			actors[i] = this.actors[i];
		}
		return actors;
	}

	/**
	 * Sets the actors in the film.
	 *
	 * @param actors an array of new actors in the film
	 */
	public void setActors(String[] actors) {
		this.actors = new String[actors.length];
		for (int i = 0; i < actors.length; i++) {
			this.actors[i] = actors[i];
		}
	}

	/**
	 * Returns the type of the media item.
	 *
	 * @return the type of the media item
	 */
	public Type getType() {
		return Type.FILM;
	}

	/**
	 * Determines whether this Film object is equal to the specified object. Two
	 * Film objects are considered equal if they have the same title, year,
	 * director, duration, genre, and actors.
	 *
	 * @param o the object to compare with this Film object
	 * @return true if this Film object is equal to the specified object; false
	 *         otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (o instanceof Film c) {
			return super.equals(o) && getDirector().equals(c.getDirector()) && getDuration() == c.getDuration()
					&& getGenre().equals(c.getGenre()) && StringUtils.areEquivalent(getActors(), c.getActors());
		}
		return false;
	}

	/**
	 * Returns a string representation of this Film object.
	 *
	 * @return a string representation of this Film object
	 */
	@Override
	public String toString() {
		String str = super.toString() + " director: " + getDirector() + " duration: minutes " + getDuration()
				+ " actors: ";
		for (int i = 0; i < this.actors.length; i++) {
			str += actors[i];
			if (i < this.actors.length - 1) {
				str += ", ";
			}
		}
		str += "\n";
		return str;
	}

}
