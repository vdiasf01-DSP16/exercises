package lab10helloworldSpringWithAutoscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lab04helloworldDecoupledInterfaceWithFactory.MessageProvider;
import lab09helloworldSpringWithAnnotation.MessageRenderer;

/**
 * The new Standard Out Message Render implementation for autoscan.
 * 
 * @author Vasco
 *
 */
@Component("renderer")
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