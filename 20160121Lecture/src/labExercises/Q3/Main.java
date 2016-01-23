package labExercises.Q3;

/**
 * Main implementing an Interface.
 * 
 * @author Vasco
 *
 */
public class Main implements Interface, Changed {
	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Start the Observable in a new thread.
		new Thread(Observable.getInstance()).start();
		
		// Start the Main
		Main m = new Main();
		m.call();
	}
	
	/**
	 * Start of the main call.
	 */
	private void call() {
		// Subscribe to the observable to be notified when a change has happened
		Observable.getInstance().subscribe(this);

		// Apply any sleep to allow the Observer to run for a while
		// and let us know if has changed a few times.
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

        // Un-subscribe from the observer
		Observable.getInstance().unSubscribe(this);

		// Wait for a while to ensure that any updates are no longer happening.
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

        // All done, turn off the Observer
        System.out.println("Finished main.");
		Observable.getInstance().turnOff();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void printMessage(String message) {
		System.out.println("Observer says: '" + message + "'");
	}

	@Override
	public void iHaveChanged(String message) {
		printMessage(message);
	}

	@Override
	public String getName() {
		return "Main()";
	}

}
