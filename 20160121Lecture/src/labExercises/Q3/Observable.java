package labExercises.Q3;

import java.util.LinkedList;
import java.util.List;
/**
 * Observable class decoupled from any other class
 * which accepts implementations for the Changed interface
 * and will call iHaveChanged whenever a change has occurred.
 * 
 * The method getName() is there to only label Changed instances
 * for testing purposes.
 * 
 * @author Vasco
 *
 */
public class Observable implements Runnable {

	/**
	 * Singleton instance for this Observable class.
	 */
	private static Observable singletonObservable = new Observable();

	/**
	 * Main switch to turn on or off the Observable.
	 */
	private boolean mainSwitchOn = true;
	
	/**
	 * The static list of all the Interfaces that want to know if a change occurred.
	 */
	private static List<Changed> list;
	
	/**
	 * Private caller to not allow more than one instance.
	 */
	private Observable() {
		list = new LinkedList<Changed>();
	}

	/**
	 * Subscribe a new Change.
	 * 
	 * @param changed
	 */
	public void subscribe(Changed changed) {
    	list.add(changed);
		System.out.println("Added: '" + changed.getName() + "' to the list.");
	}

	/**
	 * Un-subscribe a Changed from the list.
	 * 
	 * @param changed
	 */
	public void unSubscribe(Changed changed) {
    	list.remove(changed);
		System.out.println("Removed: '" + changed.getName() + "' from the list.");
	}

	/**
	 * One instance.
	 * 
	 * @return Observable
	 */
	public static Observable getInstance() {
		return singletonObservable;
	}

	/**
	 * To turn the main switch off and stop sending messages to all subscribers.
	 */
	public void turnOff() {
		mainSwitchOn = false;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void run() {
		// Sample code to trigger a change every second while the main switch is on
		while( mainSwitchOn ) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			// Let all subscribers know about the change.
			for ( Changed inter : list ) {
				inter.iHaveChanged("I have changed");
			}
		}
	}
}
