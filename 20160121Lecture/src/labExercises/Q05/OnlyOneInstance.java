package labExercises.Q05;

/**
 * This is the class that must prevent other developers from
 * constructing new instances.
 * 
 * @author Vasco
 *
 */
public class OnlyOneInstance {
	/**
	 * The place where this instance is instantiated once.
	 */
	private static OnlyOneInstance onlyOneInstance = new OnlyOneInstance();
	
	/**
	 * Private constructor to avoid users to instantiate it.
	 */
	private OnlyOneInstance () { }

	/**
	 * Get the instantiated instance for this class.
	 * 
	 * @return OnlyOneInstance
	 */
	static OnlyOneInstance getInstance() {
		return onlyOneInstance;
	}	
}
