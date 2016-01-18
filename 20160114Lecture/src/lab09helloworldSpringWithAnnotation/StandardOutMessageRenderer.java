package lab09helloworldSpringWithAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

import lab04helloworldDecoupledInterfaceWithFactory.MessageProvider;

/**
 * The new Standard Out Message Render implementation for autowire.
 * 
 * @author Vasco
 *
 */
public class StandardOutMessageRenderer implements MessageRenderer {

	/**
	 * The autowired MessageProvider following beans.xml specifications.
	 */
    @Autowired
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
}