package generics;

import java.util.LinkedList;
import java.util.List;

public class GenericStackImpl<T> implements GenericStack<T> {

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
	public void push(T object) {
		stack.add(0,object);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isEmpty() {
		return stack.isEmpty();
	}

}
