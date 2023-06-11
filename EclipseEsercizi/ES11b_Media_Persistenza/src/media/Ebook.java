package media;

import media.filters.HasGenre;
import utils.StringUtils;

/**
 * This class represents an Ebook which extends the Media class and implements
 * the HasGenre interface.
 * 
 * @authors michelemazzaa
 */
public class Ebook extends Media implements HasGenre{
	/**
	 * An array of Strings representing the authors of the Ebook.
	 */
	private String[] authors = null;
	/**
	 * A String representing the genre of the Ebook.
	 */
	private String genre = null;

	/**
	 * Constructs an Ebook object with the specified title, year, authors and genre.
	 *
	 * @param title   A String representing the title of the Ebook.
	 * @param year    An int representing the year of publication of the Ebook.
	 * @param authors An array of Strings representing the authors of the Ebook.
	 * @param genre   A String representing the genre of the Ebook.
	 */
	public Ebook(String title, int year, String[] authors, String genre) {
		super(year, title);
		setAuthors(authors);
		setGenre(genre);
	}

	/**
	 * Returns an array of Strings representing the authors of the Ebook.
	 *
	 * @return An array of Strings representing the authors of the Ebook.
	 */
	public String[] getAuthors() {
		String[] authorsCopy = new String[authors.length];
		for (int i = 0; i < authors.length; i++) {
			authorsCopy[i] = authors[i];
		}
		return authorsCopy;
	}

	/**
	 * Sets the authors of the Ebook to the specified array of Strings.
	 *
	 * @param authors An array of Strings representing the authors to be set for the
	 *                Ebook.
	 */
	public void setAuthors(String[] authors) {
		this.authors = new String[authors.length];
		for (int i = 0; i < authors.length; i++) {
			this.authors[i] = authors[i];
		}
	}

	/**
	 * Returns a String representing the genre of the Ebook.
	 *
	 * @return A String representing the genre of the Ebook.
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * Sets the genre of the Ebook to the specified String.
	 *
	 * @param genre A String representing the genre to be set for the Ebook.
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

	/**
	 * Returns a Type representing the type of Media that this Ebook is.
	 *
	 * @return A Type representing the type of Media that this Ebook is.
	 */
	public Type getType() {
		return Type.EBOOK;
	}

	@Override
	/**
	 * Determines whether or not the specified Object is equal to this Ebook. The
	 * specified Object is equal to this Ebook if it is an instance of Ebook, and if
	 * its title, year, genre and authors are equal to this Ebook's.
	 *
	 * @param o An Object to be compared with this Ebook for equality.
	 * @return true if the specified Object is equal to this Ebook, false otherwise.
	 */
	public boolean equals(Object o) {
		if (o instanceof Ebook c) {
			return super.equals(o) && getGenre().equals(c.getGenre())
					&& StringUtils.areEquivalent(getAuthors(), c.getAuthors());
		}
		return false;
	}

	@Override
	/**
	 * Returns a String representation of this Ebook.
	 *
	 * @return A String representation of this Ebook.
	 */
	public String toString() {
		StringBuilder str = new StringBuilder(super.toString() + " authors: ");
		for (int i = 0; i < this.authors.length; i++) {
			str.append(authors[i]).append(" ");
		}
		str.append("genre: ").append(getGenre()).append("\n");
		return str.toString();
	}

}
