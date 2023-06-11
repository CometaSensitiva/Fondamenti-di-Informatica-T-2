package media.filters;

import media.Media;
import media.Type;

/**
 * This class represents a filter for Media objects based on their type.
 */
public class TypeFilter implements Filter {
	/**
	 * A Type representing the type to be used as a filter.
	 */
	private Type typeToFind;

	/**
	 * Constructs a TypeFilter object with the specified type.
	 *
	 * @param typeToFind A Type representing the type to be used as a filter.
	 */
	public TypeFilter(Type typeToFind) {
		setType(typeToFind);
	}

	/**
	 * Sets the type to be used as a filter to the specified Type.
	 *
	 * @param typeToFind A Type representing the type to be used as a filter.
	 */
	public void setType(Type typeToFind) {
		this.typeToFind = typeToFind;
	}

	/**
	 * Determines whether or not the specified Media object passes the filter based
	 * on its type.
	 *
	 * @param media A Media object to be tested against the filter.
	 * @return true if the specified Media object passes the filter, false
	 *         otherwise.
	 */
	@Override
	public boolean filter(Media media) {
		if (media instanceof HasType m) {
			return this.typeToFind.equals(m.getType());
		}
		return false;
	}
}
