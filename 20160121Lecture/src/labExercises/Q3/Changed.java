package labExercises.Q3;

/**
 * Interface Changed known by the Observer the the only method the Observer
 * will need to know about and know how to call it. 
 * 
 * @author Vasco
 *
 */
public interface Changed extends Interface {
	/**
	 * The method used to alert subscribers about a change.
	 * 
	 * @param message
	 */
	void iHaveChanged(String message);

	/**
	 * Returns the name given for this Changed implementation.
	 * 
	 * @return String
	 */
	String getName();
	
}
