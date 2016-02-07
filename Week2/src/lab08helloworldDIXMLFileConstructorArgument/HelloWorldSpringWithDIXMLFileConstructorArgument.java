package lab08helloworldDIXMLFileConstructorArgument;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lab04helloworldDecoupledInterfaceWithFactory.MessageRenderer;

/**
 * The Main class.
 * 
 * @author Vasco
 *
 */
public class HelloWorldSpringWithDIXMLFileConstructorArgument {

	/**
	 * The Main method.
	 * 
	 * @param args
	 * @throws Exception
	 */
    public static void main(String[] args) throws Exception {

        // The bean factory and the render call.
        BeanFactory factory = getBeanFactory();
        MessageRenderer mr = (MessageRenderer) factory.getBean("renderer");
        mr.render();
    }

    private static BeanFactory getBeanFactory() throws Exception {
        // The Bean Factory from dixmlcons.xml
        BeanFactory factory = new ClassPathXmlApplicationContext("lab08helloworldDIXMLFileConstructorArgument/dixmlcons.xml");
        return factory;
    }
}
