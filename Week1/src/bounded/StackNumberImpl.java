package bounded;

import java.util.LinkedList;
import java.util.List;

public class StackNumberImpl<T extends Number> implements StackNumber<T> {
	/**
	 * The stack of type T
	 */
	private final List<T> stack =  new LinkedList<T>();
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public T pop() {
		if ( isEmpty() )
			throw new IllegalStateException("Trying to pop from an empty stack");
		
		return stack.remove(0);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void push(T element) {
		stack.add(0,element);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isEmpty() {
		return stack.isEmpty();
	}
}
