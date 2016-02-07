package lab02helloworldDecoupled;

/**
 * The Hello World message render to decouple the message itself
 * from the rendering, e.g.: printing on the STDOUT.
 * 
 * @author Vasco
 *
 */
public class StandardOutMessageRenderer {

	/**
	 * The HelloWorkdMessageProvider handler.
	 */
    private HelloWorldMessageProvider messageProvider = null;

    /**
     * Render the message to STDOUT or throw an exception
     * if no message provider of type HelloWorldMessaProvider 
     * was passed in.
     */
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException(
            	"You must set the property messageProvider of class:"
                + StandardOutMessageRenderer.class.getName());
        }
        System.out.println(messageProvider.getMessage());
    }

    /**
     * Returns the handler for the HelloWorldMessageProvider object.
     * 
     * @return HelloWorldMessageProvider
     */
    public HelloWorldMessageProvider getMessageProvider() {
        return this.messageProvider;
    }

    /**
     * Sets the HelloWorldMessageProvider
     * 
     * @param provider
     */
    public void setMessageProvider(HelloWorldMessageProvider provider) {
        this.messageProvider = provider;
    }
}