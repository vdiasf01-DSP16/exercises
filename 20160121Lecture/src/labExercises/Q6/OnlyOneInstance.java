package labExercises.Q6;

import lombok.Synchronized;

/**
 * Lazy-initialisation, is non-thread safe
 * 
 * @author Vasco
 *
 */
public class OnlyOneInstance {
	/**
	 * The place where this instance is instantiated once.
	 */
	private static OnlyOneInstance onlyOneInstance; // = new OnlyOneInstance();
	
	/**
	 * Random variable to be different every time this class is instantiated
	 * just to prove our point.
	 */
	private double number;
	
	/**
	 * Private constructor to avoid users to instantiate it.
	 */
	private OnlyOneInstance () { 
	    number = Math.random();
	}

	/**
	 * Get the instantiated instance for this class.
	 * 
	 * @return OnlyOneInstance
	 */
	@Synchronized
	public static OnlyOneInstance getInstance() {
		if ( onlyOneInstance == null ) {
			onlyOneInstance = new OnlyOneInstance();
		}
		return onlyOneInstance;
	}

	/**
	 * Returning the number value.
	 * 
	 * @return Double
	 */
	public Double getNumber() {
		return number;
	}

}
