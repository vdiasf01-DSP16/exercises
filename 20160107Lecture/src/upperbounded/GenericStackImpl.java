package upperbounded;

import java.util.LinkedList;
import java.util.List;

public class GenericStackImpl<T> implements GenericStack<T> {

	/**
	 * The stack of type T
	 */
	private List<T> stack =  new LinkedList<T>();
	
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

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void popOut(GenericStack<? super T> stack) {
		while( ! this.stack.isEmpty() ) 
			stack.push(pop());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void popIn(GenericStack<? extends T> stack) {
		while( ! stack.isEmpty() ) 
			this.stack.add(0,stack.pop());
	}
}
