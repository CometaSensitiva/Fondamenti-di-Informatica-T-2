package media;

import media.filters.HasDuration;
import media.filters.HasGenre;

/**
 * A class representing a song that extends the Media class and implements the
 * HasGenre and HasDuration interfaces.
 * 
 * @author michelemazzaa
 */
public class Song extends Media implements HasGenre, HasDuration {
	private String singer = null;
	private int duration = -1;
	private String genre = null;

	/**
	 * Constructs a new Song object with the specified title, year, singer,
	 * duration, and genre.
	 *
	 * @param title    the title of the song
	 * @param year     the year of the song
	 * @param singer   the singer of the song
	 * @param duration the duration of the song in minutes
	 * @param genre    the genre of the song
	 */
	public Song(String title, int year, String singer, int duration, String genre) {
		super(year, title);
		setSinger(singer);
		setGenre(genre);
		setDuration(duration);
	}

	/**
	 * Returns the singer of the song.
	 *
	 * @return the singer of the song
	 */
	public String getSinger() {
		return singer;
	}

	/**
	 * Sets the singer of the song.
	 *
	 * @param singer the new singer of the song
	 */
	public void setSinger(String singer) {
		this.singer = singer;
	}

	/**
	 * Returns the genre of the song.
	 *
	 * @return the genre of the song
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * Sets the genre of the song.
	 *
	 * @param genre the new genre of the song
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

	/**
	 * Returns the duration of the song in minutes.
	 *
	 * @return the duration of the song in minutes
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * Sets the duration of the song in minutes.
	 *
	 * @param duration the new duration of the song in minutes
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}

	/**
	 * Returns the type of the media item.
	 *
	 * @return the type of the media item
	 */
	public Type getType() {
		return Type.SONG;
	}

	@Override
	/**
	 * Determines whether this Song object is equal to the specified object. Two
	 * Song objects are considered equal if they have the same title, year, singer,
	 * duration, and genre.
	 *
	 * @param o the object to compare with this Song object
	 * @return true if this Song object is equal to the specified object; false
	 *         otherwise
	 */
	public boolean equals(Object o) {
		if (o instanceof Song c) {
			return super.equals(o) && getSinger().equals(c.getSinger()) && getDuration() == c.getDuration()
					&& getGenre().equals(c.getGenre());
		}
		return false;
	}

	/**
	 * Returns a string representation of this Song object.
	 *
	 * @return a string representation of this Song object
	 */
	@Override
	public String toString() {
		return super.toString() + " singer: " + getSinger() + " duration: minutes " + getDuration() + "\n";
	}

}
