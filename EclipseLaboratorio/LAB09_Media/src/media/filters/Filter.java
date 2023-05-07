package media.filters;

import media.Media;

/**
 * This interface represents a filter for Media objects.
 * 
 * @author michelemazzaa
 */
public interface Filter {
	/**
	 * Determines whether or not the specified Media object passes the filter.
	 *
	 * @param media A Media object to be tested against the filter.
	 * @return true if the specified Media object passes the filter, false
	 *         otherwise.
	 */
	public boolean filter(Media media);
}
