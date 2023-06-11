package media;

import media.filters.HasType;

/**
 * An abstract class representing a media item.
 * 
 * @author michelemazzaa
 */
public abstract class Media implements HasType {

	private String title = null;
	private int year = -1;

	/**
	 * Constructs a new Media object with the specified year and title.
	 *
	 * @param year  the year of the media item
	 * @param title the title of the media item
	 */
	public Media(int year, String title) {
		this.year = year;
		this.title = title;
	}

	/**
	 * Returns the title of the media item.
	 *
	 * @return the title of the media item
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the title of the media item.
	 *
	 * @param title the new title of the media item
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Returns the year of the media item.
	 *
	 * @return the year of the media item
	 */
	public int getYear() {
		return year;
	}

	/**
	 * Sets the year of the media item.
	 *
	 * @param year the new year of the media item
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * Returns the type of the media item.
	 *
	 * @return the type of the media item
	 */
	public abstract Type getType();

	/**
	 * Determines whether this Media object is equal to the specified object. Two
	 * Media objects are considered equal if they have the same title and year.
	 *
	 * @param o the object to compare with this Media object
	 * @return true if this Media object is equal to the specified object; false
	 *         otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (o instanceof Media c) {
			return getTitle().equals(c.getTitle()) && getYear() == c.getYear();
		}
		return false;
	}

	/**
	 * Returns a string representation of this Media object.
	 *
	 * @return a string representation of this Media object
	 */
	@Override
	public String toString() {
		return "Media of type " + getType() + " with title: " + getTitle() + " year: " + getYear();
	}

}
