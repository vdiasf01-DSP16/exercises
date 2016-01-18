package lab04helloworldDecoupledInterfaceWithFactory;

/**
 * The Main class.
 * 
 * @author Vasco
 *
 */
public class HelloWorldDecoupledWithFactory {

	/**
	 * The Main method.
	 * 
	 * @param args
	 */
    public static void main(String[] args) {
    	// The MessageRenderer implementation loaded through
    	// the MessageSupportFactory after reading which implementation
    	// to use from the bean.properties file.
        MessageRenderer mr = MessageSupportFactory.getInstance()
                .getMessageRenderer();

        // The MesageProvider implementation loaded vie the
        // MessageSupportFactory in the same way as above.
        MessageProvider mp = MessageSupportFactory.getInstance()
                .getMessageProvider();
        
        // With these instantiated, set the MessageProvider with 
        // the instantiated method found by the MessageSupportFactory
        mr.setMessageProvider(mp);
        
        // Render
        mr.render();
    }
}