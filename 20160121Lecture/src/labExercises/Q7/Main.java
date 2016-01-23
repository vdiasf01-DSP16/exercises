package labExercises.Q7;

/**
 * Main class to answer question seven.
 * 
 * @author Vasco
 *
 */
public class Main {

	/**
	 * The Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Main main = new Main();
		main.callMain();
	}

	/**
	 * The Main execution.
	 */
	private void callMain() {

		// Instantiate the newspaper
		Newspaper news = new Newspaper();

		// Instantiate subscribers
		Subscriber subscriber1 = new Subscriber("1");
		Subscriber subscriber2 = new Subscriber("2");
		Subscriber subscriber3 = new Subscriber("3");
		
		// Add all subscribers to the Observer list
        news.addObserver(subscriber1);
        news.addObserver(subscriber2);
        news.addObserver(subscriber3);

        // Set the Observer to changed for the next time 
        // it is requested to notify all Observers.
        news.setChanged();

        // Expose the above
        System.out.println("Something was changed but not yet notifying...");
        
        // Give some delay to raise the expectation...
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

        // Go... tell it everyone
        news.notifyObservers("Hello! I have news for you.");

		// Record the end.
		System.out.println("Finished");
	}
}
