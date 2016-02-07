package lab03helloworldDecoupledInterface;

/**
 * The MessageRenderer interface requiring an implementation
 * with the render method to any output type, and the ability to 
 * set and get different types of MessageProviders.
 * 
 * @author Vasco
 *
 */
public interface MessageRenderer {

	/**
	 * The render method to render the message.
	 */
    void render();

    /**
     * Accepting a MessageProvider to be used internally
     * to collect the message to be rendered.
     * 
     * @param provider
     */
    void setMessageProvider(MessageProvider provider);
    
    /**
     * The MessageProvider set.
     * 
     * @return MessageProvider
     */
    MessageProvider getMessageProvider();
}
