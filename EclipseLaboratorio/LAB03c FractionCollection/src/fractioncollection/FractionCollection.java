package fractioncollection;

import java.util.Arrays;

import frazione.*;

/**
 * A collection of Fraction objects.
 * 
 * @author michelemazzaa
 */
public class FractionCollection {
	final int DEFAULT_GROWTH_FACTOR = 2;
	final int DEFAULT_PHYSICAL_SIZE = 10;
	private Frazione[] innerContainer;
	// logical size and first free position
	private int size;

	/**
	 * Constructor 1: Initializes a new FractionCollection with the specified size.
	 * 
	 * @param size the initial size of the collection
	 */
	public FractionCollection(int size) {
		this.innerContainer = new Frazione[size];
		this.size = 0;
	}

	/**
	 * Constructor 2: Initializes a new FractionCollection with the default size.
	 */
	public FractionCollection() {
		this.innerContainer = new Frazione[DEFAULT_PHYSICAL_SIZE];
		this.size = 0;
	}

	/**
	 * Constructor 3: Initializes a new FractionCollection with the given Fractions.
	 * 
	 * @param tutte an array of Fractions to initialize the collection with
	 */
	public FractionCollection(Frazione[] tutte) {
		this.innerContainer = Arrays.copyOf(tutte, tutte.length);
		this.size = tutte.length;
	}

	/**
	 * Returns the logical size of the collection.
	 * 
	 * @return the logical size of the collection
	 */
	public int size() {
		return this.size;
	}

	/**
	 * Returns the Fraction at the specified index.
	 * 
	 * @param index the index of the Fraction to return
	 * @return the Fraction at the specified index, or null if the index is out of
	 *         bounds
	 */
	public Frazione get(int index) {
		if (index >= this.size())
			return null;
		return this.innerContainer[index];
	}

	/**
	 * Adds a new Fraction to the collection.
	 * 
	 * @param f the Fraction to add
	 */
	public void put(Frazione f) {
		if (this.size < this.innerContainer.length) {
			this.innerContainer[size] = f;
			this.size++;
			return;
		}
		Frazione[] temp = Arrays.copyOf(this.innerContainer, this.innerContainer.length * DEFAULT_GROWTH_FACTOR);
		temp[this.size] = f;
		this.size++;
		this.innerContainer = temp;
	}

	/**
	 * Removes the Fraction at the specified index from the collection.
	 * 
	 * @param index the index of the Fraction to remove
	 * @throws IndexOutOfBoundsException if the index is out of bounds
	 */
	public void remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index out of bounds: " + index);
		}
		Frazione[] temp = new Frazione[size - 1];
		System.arraycopy(innerContainer, 0, temp, 0, index);
		System.arraycopy(innerContainer, index + 1, temp, index, size - index - 1);
		innerContainer = temp;
		size--;
	}

	/**
	 * Returns a new FractionCollection that is the element-wise sum of this
	 * collection and another collection.
	 * 
	 * @param other another FractionCollection to add to this collection
	 * @return a new FractionCollection that is the element-wise sum of this
	 *         collection and another collection, or null if the two collections
	 *         have different sizes
	 */
	public FractionCollection sum(FractionCollection other) {
		if (this.size != other.size) {
			return null;
		}
		FractionCollection res = new FractionCollection(this.size);
		for (int i = 0; i < this.size; i++)
			res.put(this.get(i).sum(other.get(i)));
		return res;
	}

	/**
	 * Returns a new FractionCollection that is the element-wise difference of this
	 * collection and another collection.
	 * 
	 * @param other another FractionCollection to subtract from this collection
	 * @return a new FractionCollection that is the element-wise difference of this
	 *         collection and another collection, or null if the two collections
	 *         have different sizes
	 */
	public FractionCollection sub(FractionCollection other) {
		if (this.size != other.size) {
			return null;
		}
		FractionCollection res = new FractionCollection(this.size);
		for (int i = 0; i < this.size; i++)
			res.put(this.get(i).sub(other.get(i)));
		return res;
	}

	/**
	 * Returns a new FractionCollection that is the element-wise product of this
	 * collection and another collection.
	 * 
	 * @param other another FractionCollection to multiply with this collection
	 * @return a new FractionCollection that is the element-wise product of this
	 *         collection and another collection, or null if the two collections
	 *         have different sizes
	 */
	public FractionCollection mul(FractionCollection other) {
		if (this.size != other.size) {
			return null;
		}
		FractionCollection res = new FractionCollection(this.size);
		for (int i = 0; i < this.size; i++)
			res.put(this.get(i).mul(other.get(i)));
		return res;
	}

	/**
	 * Returns a new FractionCollection that is the element-wise quotient of this
	 * collection and another collection.
	 * 
	 * @param other another FractionCollection to divide this collection by
	 * @return a new FractionCollection that is the element-wise quotient of this
	 *         collection and another collection, or null if the two collections
	 *         have different sizes
	 */
	public FractionCollection div(FractionCollection other) {
		if (this.size != other.size) {
			return null;
		}
		FractionCollection res = new FractionCollection(this.size);
		for (int i = 0; i < this.size; i++)
			res.put(this.get(i).div(other.get(i)));
		return res;
	}

	/**
	 * Returns a string representation of this FractionCollection.
	 * 
	 * @return a string representation of this FractionCollection
	 */
	public String toString() {
		StringBuilder res = new StringBuilder();
		res.append("[ ");
		for (int i = 0; i < this.size; i++) {
			res.append(this.innerContainer[i].toString());
			if (i + 1 < this.size)
				res.append(", ");
		}
		res.append(" ]");
		return res.toString();
	}
}
