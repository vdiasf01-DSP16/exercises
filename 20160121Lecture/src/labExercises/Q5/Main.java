package labExercises.Q5;

import java.util.LinkedList;
import java.util.List;

/**
 * Main class as example.
 * 
 * @author Vasco
 *
 */
public class Main {
	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(final String []args) {
		// Does not work because the constructor is now private
//		OnlyOneInstance o1 = new OnlyOneInstance();

		List<Thread> listThreads = new LinkedList<>();

		for( int i = 0; i < 3; i++ )
 		    listThreads.add(new Thread(new Runnable() {
			    @Override
		    	public void run() {
    				System.out.println("I am: '"+OnlyOneInstance.getInstance()+"'");
    			}
	    	}));
	
		// Attempting to run i threads to ensure same memory address is returned
		for ( Thread a : listThreads ) a.start();
	}
}
