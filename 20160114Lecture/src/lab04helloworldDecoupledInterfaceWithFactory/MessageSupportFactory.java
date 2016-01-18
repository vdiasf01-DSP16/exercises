package lab04helloworldDecoupledInterfaceWithFactory;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * The MessageSupportFactory class aiming to load the properties
 * from a bean file and instantiate the required classes from it.
 * 
 * @author Vasco
 *
 */
public class MessageSupportFactory {

	/**
	 * The one and only static MessageSupportFactory.
	 */
	private static MessageSupportFactory instance = null;
	
	/**
	 * The properties handler for the read bean file.
	 */
	private Properties props = null;
	
	/**
	 * The MessageRender handler.
	 */
	private MessageRenderer renderer = null;
	
	/**
	 * The MessageProvider hander.
	 */
	private MessageProvider provider = null;
	
	/**
	 * The private constructor instantiating once the Message
	 * Render and Provider from the implemented classes named
	 * inside the bean.properties file.
	 */
	private MessageSupportFactory() {
		// The Properties handler instantiated.
		props = new Properties();

		try {
			// Try to load the properties from the file, if exists / found.
			props.load(new FileInputStream("/Users/Vasco/Desktop/DSPLectures - git/exercises/20160114Lecture/src/lab04helloworldDecoupledInterfaceWithFactory/bean.properties"));

			// The class names ad given as values from the known keys
			String rendererClass = props.getProperty("renderer.class");
			String providerClass = props.getProperty("provider.class");

			// Having the class names, instantiate each in turn
			renderer = (MessageRenderer) Class.forName(rendererClass)
					.newInstance();
			provider = (MessageProvider) Class.forName(providerClass)
					.newInstance();
		} catch (Exception ex) {
			System.err.println("Failed to create factory methods");
			ex.printStackTrace();
		}
	}

	/**
	 * Instantiate once the MessageSupportFactory.
	 */
	static {
		instance = new MessageSupportFactory();
	}

	/**
	 * Returns the same static instantiated once instance.
	 * 
	 * @return MessageSupportFactory
	 */
	public static MessageSupportFactory getInstance() {
		return instance;
	}

	/**
	 * The MessageRender instantiated.
	 * 
	 * @return MessageRender
	 */
	public MessageRenderer getMessageRenderer() {
		return renderer;
	}

	/**
	 * The MessageProvider instantiated.
	 * 
	 * @return MessageProvider
	 */
	public MessageProvider getMessageProvider() {
		return provider;
	}

}