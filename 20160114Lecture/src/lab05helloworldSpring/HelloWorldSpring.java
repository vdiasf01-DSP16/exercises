package lab05helloworldSpring;

import java.io.FileInputStream;
import java.util.Properties;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;

import lab04helloworldDecoupledInterfaceWithFactory.MessageProvider;
import lab04helloworldDecoupledInterfaceWithFactory.MessageRenderer;

/**
 * Main class.
 * 
 * @author Vasco
 *
 */
public class HelloWorldSpring {
   
	/**
	 * Main method
	 * 
	 * @param args
	 * @throws Exception
	 */
    public static void main(String[] args) throws Exception {

        // The bean factory after loading the Properties.
        BeanFactory factory = getBeanFactory();
        
        MessageRenderer mr = (MessageRenderer) factory.getBean("renderer");
        MessageProvider mp = (MessageProvider) factory.getBean("provider");
        
        mr.setMessageProvider(mp);
        mr.render();
    }
    
    private static BeanFactory getBeanFactory() throws Exception {
    	// The DefaultListableBeanFactory
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        
        // The definition reader
        PropertiesBeanDefinitionReader rdr = new PropertiesBeanDefinitionReader(factory);
        
        // Pointing the properties to the beans.properties file configuration options
        Properties props = new Properties();
        props.load(new FileInputStream("/Users/Vasco/Desktop/DSPLectures - git/exercises/20160114Lecture/src/lab05helloworldSpring/beans.properties"));

        // Regiester the Bead Definitions.
        rdr.registerBeanDefinitions(props);
        
        return factory;
    }
}