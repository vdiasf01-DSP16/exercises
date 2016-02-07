package lab03helloworldDecoupledInterface;

/**
 * Main application for decoupled Interface.
 * 
 * The Rendered and the Provider and decoupled from where it
 * renders to, and what message provider should be receiving.
 * 
 * This will allow to render to other outputs by passing a 
 * different type of renders, as well as new types of messages
 * by instantiating new message providers.
 * 
 * @author Vasco
 *
 */
public class HelloWorldDecoupledInterface {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		MessageRenderer mr = new StandardOutMessageRenderer();
		MessageProvider mp = new HelloWorldMessageProvider();
		mr.setMessageProvider(mp);
		mr.render();
	}
}
