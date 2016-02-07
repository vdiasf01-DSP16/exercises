package labExercises.Q06;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import labExercises.Q06.OnlyOneInstance;

/**
 * The Main class to test lazy-instantiation.
 * 
 * @author Vasco
 *
 */
public class Main {
	/**
	 * Counting the number of instances generated.
	 */
	HashSet<Double> instancesCreated = new HashSet<>();
	
	/**
	 * The Main method.
	 * 
	 * @param args
	 */
	public static void main(String []args) {

		// Does not work
//		OnlyOneInstance o1 = new OnlyOneInstance();
		
		Main main = new Main();
		main.startMain();
	}
	
	/**
	 * Stating the Main.
	 */
	private void startMain() {
		
		List<Thread> listThreads = new LinkedList<>();

		// Creating new Thread instances.
		for( int i = 0; i < 300; i++ ) {
 		    listThreads.add(new Thread(new Runnable() {
			    @Override
		    	public void run() {
			    	double d = OnlyOneInstance.getInstance().getNumber();
			    	instancesCreated.add(d);
    			}
	    	}));
		}
		
		// Starting all threads
		for ( Thread a : listThreads ) a.start();

		// Give threads some time to finish.
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Number of instances created: " + instancesCreated.size());
	}
}
