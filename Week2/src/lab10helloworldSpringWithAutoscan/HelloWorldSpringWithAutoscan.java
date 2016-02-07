package lab10helloworldSpringWithAutoscan;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lab09helloworldSpringWithAnnotation.MessageRenderer;

/**
 * The Main class for Autoscan.
 * 
 * @author Vasco
 *
 */
public class HelloWorldSpringWithAutoscan {

	/**
	 * The Main method.
	 * 
	 * @param args
	 * @throws Exception
	 */
    public static void main(String[] args) throws Exception {

        // The Bean factory
        BeanFactory factory = getBeanFactory();
        MessageRenderer mr = (MessageRenderer) factory.getBean("renderer");
        mr.render();
    }

    /**
     * The BeanFactory.
     * 
     * @return BeanFactory 
     * @throws Exception
     */
    private static BeanFactory getBeanFactory() throws Exception {
        // The Bean factory from beans.xml
        BeanFactory factory = new ClassPathXmlApplicationContext("lab10helloworldSpringWithAutoscan/beans.xml");
        return factory;
    }
}
