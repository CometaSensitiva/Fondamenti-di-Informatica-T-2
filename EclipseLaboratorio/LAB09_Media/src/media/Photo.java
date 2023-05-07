package media;

import utils.StringUtils;

/**
 * A class representing a photo that extends the Media class.
 * 
 * @author michelemazzaa
 */
public class Photo extends Media {
	/**
	 * An array of Strings representing the authors of the Ebook.
	 */
	private String[] authors = null;

	/**
	 * Constructs a new Photo object with the specified title, year, and authors.
	 *
	 * @param title   the title of the photo
	 * @param year    the year of the photo
	 * @param authors an array of authors of the photo
	 */
	public Photo(String title, int year, String[] authors) {
		super(year, title);
		setAuthors(authors);
	}

	/**
	 * Returns an array of authors of the photo.
	 *
	 * @return an array of authors of the photo
	 */
	public String[] getAuthors() {
		String[] authors = new String[this.authors.length];
		for (int i = 0; i < this.authors.length; i++) {
			authors[i] = this.authors[i];
		}
		return authors;
	}

	/**
	 * Sets the authors of the photo.
	 *
	 * @param authors an array of new authors of the photo
	 */
	public void setAuthors(String[] authors) {
		this.authors = new String[authors.length];
		for (int i = 0; i < authors.length; i++) {
			this.authors[i] = authors[i];
		}
	}

	/**
	 * Returns the type of the media item.
	 *
	 * @return the type of the media item
	 */
	public Type getType() {
		return Type.PHOTO;
	}

	/**
	 * Determines whether this Photo object is equal to the specified object. Two
	 * Photo objects are considered equal if they have the same title, year, and
	 * authors.
	 *
	 * @param o the object to compare with this Photo object
	 * @return true if this Photo object is equal to the specified object; false
	 *         otherwise
	 */
	@Override
	public boolean equals(Object o) {
		if (o instanceof Photo c) {
			return super.equals(o) && StringUtils.areEquivalent(getAuthors(), c.getAuthors());
		}
		return false;
	}

	/**
	 * Returns a string representation of this Photo object.
	 *
	 * @return a string representation of this Photo object
	 */
	@Override
	public String toString() {
		String str = super.toString() + " authors: ";
		for (int i = 0; i < this.authors.length; i++) {
			str += authors[i] + " ";
		}
		return str;
	}
}
