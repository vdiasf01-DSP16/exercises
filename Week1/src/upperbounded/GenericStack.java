package upperbounded;

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
	
	/**
	 * Pops all this elements into supplied stack.
	 * Source supplied stack must be superclass of this stack.
	 * 
	 * @param stack
	 */
	void popOut(GenericStack<? super T> stack);

	/**
	 * Pops in all this elements from supplied stack.
	 * Supplied stack elements must extend those of this stack.
	 * 
	 * @param stack
	 */
	void popIn(GenericStack<? extends T> stack);
}
