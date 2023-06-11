package media.filters;

import media.Media;

/**
 * This class represents a filter for Media objects based on their duration.
 */
public class DurationFilter implements Filter {
	/**
	 * An int representing the duration to be used as a filter.
	 */
	private int duration = -1;

	/**
	 * Constructs a DurationFilter object with the specified duration.
	 *
	 * @param duration An int representing the duration to be used as a filter.
	 */
	public DurationFilter(int duration) {
		setDuration(duration);
	}

	/**
	 * Sets the duration to be used as a filter to the specified int.
	 *
	 * @param duration An int representing the duration to be used as a filter.
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}

	/**
	 * Determines whether or not the specified Media object passes the filter based
	 * on its duration.
	 *
	 * @param media A Media object to be tested against the filter.
	 * @return true if the specified Media object passes the filter, false
	 *         otherwise.
	 */
	@Override
	public boolean filter(Media media) {
		if (media instanceof HasDuration m) {
			return (this.duration == 0 || (m.getDuration() <= this.duration));
		}
		return false;
	}
}
