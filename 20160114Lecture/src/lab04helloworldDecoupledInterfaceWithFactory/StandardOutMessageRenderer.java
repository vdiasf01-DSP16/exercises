package lab04helloworldDecoupledInterfaceWithFactory;

/**
 * The MessageRender implementation.
 * 
 * @author Vasco
 *
 */
public class StandardOutMessageRenderer implements MessageRenderer {

	/**
	 * The MessageProvider handler.
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
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }

}