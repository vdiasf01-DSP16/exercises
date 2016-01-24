package labExercises.Q07;

import java.util.Observable;

/**
 * The Newspaper Observable.
 * 
 * @author Vasco
 *
 */
public class Newspaper extends Observable {
	
	/**
	 * The Observable overridden setChanged method to 
	 * tell next notify request, to let all observers
	 * to know about the change that happened.
	 */
	@Override
	protected synchronized void setChanged() {
		super.setChanged();
	}
}
