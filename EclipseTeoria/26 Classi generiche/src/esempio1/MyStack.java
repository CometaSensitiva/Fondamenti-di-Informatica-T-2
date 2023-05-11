package esempio1;

import java.util.*;

/**
 * A generic stack implementation using a list as the underlying storage.
 * Supports pushing elements onto the stack, popping elements from the stack,
 * and checking if the stack is empty.
 *
 * @param <T> The type of elements stored in the stack.
 * @author michelemazzaa
 */
public class MyStack<T> {
	private List<T> storage;

	/**
	 * Constructs an empty stack.
	 */
	public MyStack() {
		storage = new ArrayList<T>();
	}

	/**
	 * Pushes an element onto the top of the stack.
	 *
	 * @param elem The element to be pushed onto the stack.
	 */
	public MyStack<T> push(T elem) {
		storage.add(elem);
		return this;
	}

	/**
	 * Removes and returns the element at the top of the stack.
	 *
	 * @return The element removed from the top of the stack.
	 * @throws Exception if the stack is empty.
	 */
	public T pop() throws Exception {
		if (isEmpty())
			throw new Exception();
		return storage.remove(storage.size() - 1);
	}

	/**
	 * Checks if the stack is empty.
	 *
	 * @return true if the stack is empty, false otherwise.
	 */
	public boolean isEmpty() {
		return storage.isEmpty();
	}
}
