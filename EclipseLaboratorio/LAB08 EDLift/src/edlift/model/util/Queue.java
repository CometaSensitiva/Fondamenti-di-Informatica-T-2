package edlift.model.util;

import java.util.Arrays;

/**
 * Class representing a queue. The queue has a maximum number of bookings and an
 * array of bookings.
 * 
 * @author michelemazzaa
 */
public class Queue {
	private int booked;
	private int[] bookings;
	private int maxBookings;

	/**
	 * Constructor for the Queue class.
	 * 
	 * @param maxBookings The maximum number of bookings the queue can hold.
	 */
	public Queue(int maxBookings) {
		this.maxBookings = maxBookings;
		bookings = new int[maxBookings];
	}

	/**
	 * Gets the number of bookings in the queue.
	 * 
	 * @return The number of bookings in the queue.
	 */
	public int getBooked() {
		return booked;
	}

	/**
	 * Sets the number of bookings in the queue.
	 * 
	 * @param booked The new number of bookings in the queue.
	 */
	public void setBooked(int booked) {
		this.booked = booked;
	}

	/**
	 * Gets the array of bookings in the queue.
	 * 
	 * @return The array of bookings in the queue.
	 */
	public int[] getBookings() {
		return bookings;
	}

	/**
	 * Gets the maximum number of bookings the queue can hold.
	 * 
	 * @return The maximum number of bookings the queue can hold.
	 */
	public int getMaxBookings() {
		return maxBookings;
	}

	/**
	 * Extracts the first element from the bookings array. If the size of the array
	 * is greater than 0, the first element is removed and returned. The remaining
	 * elements are shifted to the left by one position. If the size of the array is
	 * 0, Integer.MIN_VALUE is returned.
	 *
	 * @return The first element of the bookings array or Integer.MIN_VALUE if the
	 *         array is empty.
	 */
	public int extract() {
		int result;
		if (size() > 0) {
			result = bookings[0];
			for (int i = 0; i < size() - 1; i++)
				bookings[i] = bookings[i + 1];
			booked--;
		} else
			result = Integer.MIN_VALUE;
		return result;
	}

	/**
	 * Inserts an element into the bookings array. If the size of the array is less
	 * than the maximum number of bookings allowed, the element is added to the end
	 * of the array and true is returned. If the size of the array is equal to or
	 * greater than the maximum number of bookings allowed, false is returned.
	 *
	 * @param n The element to be inserted into the bookings array.
	 * @return True if the element was successfully inserted, false otherwise.
	 */
	public boolean insert(int n) {
		boolean result;
		if (size() < getMaxBookings()) {
			bookings[size()] = n;
			booked++;
			result = true;
		} else
			result = false;
		return result;
	}

	/**
	 * Checks if the bookings array has any elements.
	 *
	 * @return True if the size of the bookings array is greater than 0, false
	 *         otherwise.
	 */
	public boolean hasItems() {
		return size() > 0;
	}

	/**
	 * Returns the first element of the bookings array without removing it. If the
	 * size of the array is greater than 0, the first element is returned. If the
	 * size of the array is 0, Integer.MIN_VALUE is returned.
	 *
	 * @return The first element of the bookings array or Integer.MIN_VALUE if the
	 *         array is empty.
	 */
	public int peek() {
		int result;
		if (size() > 0)
			result = bookings[0];
		else
			result = Integer.MIN_VALUE;
		return result;
	}

	/**
	 * Returns the number of elements in the bookings array.
	 *
	 * @return The number of elements in the bookings array.
	 */
	public int size() {
		return booked;
	}

	/**
	 * Returns a string representation of the bookings array. The string
	 * representation consists of a list of the array's elements, enclosed in square
	 * brackets ("[]"). Adjacent elements are separated by the characters ", " (a
	 * comma followed by a space).
	 *
	 * @return A string representation of the bookings array.
	 */
	@Override
	public String toString() {
		return Arrays.toString(Arrays.copyOf(getBookings(), getBooked()));
	}
}
