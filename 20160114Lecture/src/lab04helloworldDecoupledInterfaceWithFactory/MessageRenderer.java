package lab04helloworldDecoupledInterfaceWithFactory;

/**
 * The MessageRender interface.
 * 
 * @author Vasco
 *
 */
public interface MessageRenderer {
	/**
	 * The Render method.
	 */
    void render();
    
    /**
     * The getter for the MessageProvider.
     * 
     * @return MessageProvider
     */
    MessageProvider getMessageProvider();
    
    /**
     * The setter for the MessageProvider.
     * 
     * @param provider
     */
    void setMessageProvider(MessageProvider provider);
}
