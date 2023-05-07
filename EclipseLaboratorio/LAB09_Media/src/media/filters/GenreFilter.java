package media.filters;

import media.Media;

/**
 * This class represents a filter for Media objects based on their genre.
 */
public class GenreFilter implements Filter {
	/**
	 * A String representing the genre to be used as a filter.
	 */
	private String genre;

	/**
	 * Constructs a GenreFilter object with the specified genre.
	 *
	 * @param genre A String representing the genre to be used as a filter.
	 */
	public GenreFilter(String genre) {
		setGenre(genre);
	}

	/**
	 * Sets the genre to be used as a filter to the specified String.
	 *
	 * @param genre A String representing the genre to be used as a filter.
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

	/**
	 * Determines whether or not the specified Media object passes the filter based
	 * on its genre.
	 *
	 * @param media A Media object to be tested against the filter.
	 * @return true if the specified Media object passes the filter, false
	 *         otherwise.
	 */
	@Override
	public boolean filter(Media media) {
		if (media instanceof HasGenre m) {
			return this.genre.equals(" ") || m.getGenre().equals(this.genre);
		}
		return false;
	}
}
