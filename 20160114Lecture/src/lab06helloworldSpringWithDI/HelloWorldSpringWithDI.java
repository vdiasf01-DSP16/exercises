package lab06helloworldSpringWithDI;

import java.io.FileInputStream;
import java.util.Properties;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;

import lab04helloworldDecoupledInterfaceWithFactory.MessageRenderer;

/**
 * The HelloWorldSpring with Dependency Injection.
 * 
 * @author Vasco
 *
 */
public class HelloWorldSpringWithDI {

	/**
	 * The Main method.
	 * 
	 * @param args
	 * @throws Exception
	 */
    public static void main(String[] args) throws Exception {

        // get the bean factory
        BeanFactory factory = getBeanFactory();

        // Get the MessageRender from the Bean factory and render.
        MessageRenderer mr = (MessageRenderer) factory.getBean("renderer");
        mr.render();
    }

    /**
     * The Bean factory.
     * 
     * @return BeanFactory
     * @throws Exception
     */
    private static BeanFactory getBeanFactory() throws Exception {
        // get the bean factory
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        // create a definition reader
        PropertiesBeanDefinitionReader rdr = new PropertiesBeanDefinitionReader(factory);

        // load the configuration options
        Properties props = new Properties();
        props.load(new FileInputStream("/Users/Vasco/Desktop/DSPLectures - git/exercises/20160114Lecture/src/lab06helloworldSpringWithDI/beans.properties"));

        rdr.registerBeanDefinitions(props);

        return factory;
    }
}
