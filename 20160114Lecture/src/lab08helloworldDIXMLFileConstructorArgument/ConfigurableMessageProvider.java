package lab08helloworldDIXMLFileConstructorArgument;

import lab04helloworldDecoupledInterfaceWithFactory.MessageProvider;

/**
 * The New Message Provider implementation.
 * 
 * @author Vasco
 *
 */
public class ConfigurableMessageProvider implements MessageProvider {

	/**
	 * The message.
	 */
    private String message;

    /**
     * The Message passed in at the constructor point.
     * 
     * @param message
     */
    public ConfigurableMessageProvider(String message) {
        this.message = message;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getMessage() {
        return message;
    }
}