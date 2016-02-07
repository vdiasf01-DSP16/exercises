package lab03helloworldDecoupledInterface;

/**
 * The Implementation for the MessageProvider interface.
 * 
 * @author Vasco
 *
 */
public class HelloWorldMessageProvider implements MessageProvider {

	/**
	 * The message to be returned for this class.
	 */
	public String getMessage() {
		return "Hello World!";
	}

}