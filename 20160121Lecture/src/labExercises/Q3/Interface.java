package labExercises.Q3;

/**
 *  3. Provide an example of an interface with methods that do not imply 
 *  responsibility on the part of the implementing class to take action 
 *  on behalf of the caller or to return a value. 
 *  
 *  This Interface is a sample interface with only one aim: to print a message.
 *  
 * @author Vasco
 *
 */
public interface Interface {
	
	/**
	 * This is the message that will be sent out when a change has happened.
	 */
	void printMessage(String message);
}
