package labExercises.Q09;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Main class for testing the two commonly used Java methods
 * that return a new Object.
 * 
 * @author Vasco
 *
 */
public class MainBeanFactory {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		MainBeanFactory main = new MainBeanFactory();
		main.callMain();
	}

	/**
	 * The Main execution.
	 */
	private void callMain() {
		// Get the bean factory
		BeanFactory factory = getBeanFactory();
		
		// Call for the bean name "theclass" which instantiated it with a name already.
	    AnInterface inter = (AnInterface) factory.getBean("theclass");
		System.out.println("Name injected into the new Object is: '" + inter.getName() + "'");
	}

	/**
	 * Load the Spring xml definition properties.
	 * 
	 * @return BeanFactory
	 */
	private static BeanFactory getBeanFactory() {
        BeanFactory factory = new ClassPathXmlApplicationContext("labExercises/Q09/Spring.xml");
        return factory;
	}
}
