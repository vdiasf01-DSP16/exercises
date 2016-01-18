package lab03helloworldDecoupledInterface;

/**
 * The MessageProvider interface, requiring 
 * the implementation of the method which 
 * will supply the message.
 * 
 * @author Vasco
 *
 */
public interface MessageProvider {
	
	/**
	 * The Message to be returned.
	 * 
	 * @return String
	 */
	String getMessage();
}
