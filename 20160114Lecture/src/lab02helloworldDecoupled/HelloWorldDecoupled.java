package lab02helloworldDecoupled;

/**
 * Main class to print the message.
 * 
 * @author Vasco
 *
 */
public class HelloWorldDecoupled {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Instantiate the renderer
		StandardOutMessageRenderer mr = new StandardOutMessageRenderer();
		
		// Instantiate the message provider
		HelloWorldMessageProvider mp = new HelloWorldMessageProvider();
		
		// Pass into the rendered the message provider 
		mr.setMessageProvider(mp);
		
		// Render the message to STDOUT.
		mr.render();		
	}
}
