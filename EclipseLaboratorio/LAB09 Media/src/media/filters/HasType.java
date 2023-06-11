package media.filters;

import media.Type;

/**
 * This interface represents an object that has a type.
 * 
 * @author michelemazzaa
 */
public interface HasType {
	/**
	 * Returns a Type representing the type of the object.
	 *
	 * @return A Type representing the type of the object.
	 */
	Type getType();
}