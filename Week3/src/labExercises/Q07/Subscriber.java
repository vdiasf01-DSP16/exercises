package labExercises.Q07;

import java.util.Observable;
import java.util.Observer;

/**
 * The Subscriber aiming to get some news.
 * 
 * @author Vasco
 *
 */
public class Subscriber implements Observer {

	/**
	 * The subscriber name.
	 */
	private String name;

	/**
	 * Constructor instantiating the subsriber.
	 * 
	 * @param name
	 */
	public Subscriber(String name) {
		this.name = name;
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @param o Observable
	 * @param arg Object
	 */
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Newspaper sent me (" + 
	       name + "): '" + (String)arg + "'"
	    );
	}

}