package lab09helloworldSpringWithAnnotation;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Main Class
 * 
 * @author Vasco
 *
 */
public class HelloWorldSpringWithAnnotation {

	/**
	 * Main method.
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// The bean factory and the rendering.
		BeanFactory factory = getBeanFactory();
		MessageRenderer mr = (MessageRenderer) factory.getBean("renderer");
		mr.render();
	}

	/**
	 * The Bean Factory.
	 * 
	 * @return BeanFactory
	 * @throws Exception
	 */
	private static BeanFactory getBeanFactory() throws Exception {
		// Create a bean factory from beans.xml
		BeanFactory factory = new ClassPathXmlApplicationContext("lab09helloworldSpringWithAnnotation/beans.xml");
		return factory;
	}
}