package lab04helloworldDecoupledInterfaceWithFactory;

/**
 * The MessageProvider implementation as HelloWorldMessageProvider,
 * aiming to only supply the Hello World message.
 * 
 * @author Vasco
 *
 */
public class HelloWorldMessageProvider implements MessageProvider {

	/**
	 * {@inheritDoc}
	 */
    @Override
    public String getMessage() {
        return "Hello World!";
    }

}