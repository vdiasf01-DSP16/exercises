package lab07helloworldSpringWithDIXMLFile;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lab04helloworldDecoupledInterfaceWithFactory.MessageRenderer;

/**
 * Main class.
 * 
 * @author Vasco
 *
 */
public class HelloWorldSpringWithDIXMLFile {

	/**
	 * Main Method.
	 * 
	 * @param args
	 * @throws Exception
	 */
    public static void main(String[] args) throws Exception {

        // get the bean factory and render the message.
        BeanFactory factory = getBeanFactory();
        MessageRenderer mr = (MessageRenderer) factory.getBean("renderer");
        mr.render();
    }

    /**
     * The BeanFactory
     * 
     * @return BeanFactory
     * @throws Exception
     */
    private static BeanFactory getBeanFactory() throws Exception {
        // The bean factory from dixml.xml
        BeanFactory factory = new ClassPathXmlApplicationContext("lab07helloworldSpringWithDIXMLFile/dixml.xml");
        return factory;
    }
}
