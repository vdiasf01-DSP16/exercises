package lab10helloworldSpringWithAutoscan;

import org.springframework.stereotype.Component;

import lab04helloworldDecoupledInterfaceWithFactory.MessageProvider;

/**
 * The MessageProvider implementation as HelloWorldMessageProvider,
 * aiming to only supply the Hello World message.
 * 
 * @author Vasco
 *
 */
@Component
public class HelloWorldMessageProvider implements MessageProvider {

	/**
	 * {@inheritDoc}
	 */
    @Override
    public String getMessage() {
        return "Hello World!";
    }

}