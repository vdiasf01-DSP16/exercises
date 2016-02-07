package lab03helloworldDecoupledInterface;

/**
 * The implementation of the MessageRenderer interface.
 * 
 * @author Vasco
 *
 */
public class StandardOutMessageRenderer implements MessageRenderer {

	/**
	 * The internal MessageProvider to be used.
	 */
    private MessageProvider messageProvider = null;

    /**
     * {@inheritDoc}
     */
    @Override
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException(
            	"You must set the property messageProvider of class:"
                + StandardOutMessageRenderer.class.getName());
        }
        System.out.println(messageProvider.getMessage());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }
}