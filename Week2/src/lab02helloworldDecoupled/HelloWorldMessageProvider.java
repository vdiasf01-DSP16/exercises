package lab02helloworldDecoupled;

/**
 * The Hello World message provider, supplying the 
 * message to the rendered.
 * 
 * @author Vasco
 *
 */
public class HelloWorldMessageProvider {
	/**
	 * The Hello World message.
	 */
	private String message = "Hello World!";

	/**
	 * Supplying the message.
	 * 
	 * @return String
	 */
	public String getMessage() {
		return message;
	}

}