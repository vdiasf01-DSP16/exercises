package lab01helloworld;

/**
 * The "Hello World" main accepting command line arguments
 * for a dynamic messaging.
 * 
 * @author Vasco
 *
 */
public class HelloWorldWithCommandLineArguments {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length > 0) {
			System.out.println(args[0]);
		} else {
			System.out.println("Hello World!");
		}
	}
}