package generics;

public interface GenericStack<T> {
	/**
	 * Returns the last element in the stack.
	 * 
	 * @return T
	 */
	T pop();

	/**
	 * Adds an element to the stack.
	 * 
	 * @param T element
	 */
	void push(T element);

	/**
	 * Checks if the stack is empty.
	 * 
	 * @return true if empty.
	 */
	boolean isEmpty();
}
