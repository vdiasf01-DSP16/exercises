package lab04helloworldDecoupledInterfaceWithFactory;

/**
 * The Message Provider interface, aiming to only
 * require the method which supplies the message.
 * 
 * @author Vasco
 *
 */
public interface MessageProvider {
	
	/**
	 * The message.
	 * 
	 * @return String
	 */
    String getMessage();
}
