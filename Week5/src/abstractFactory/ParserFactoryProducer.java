package abstractFactory;

/**
 * The Factory producer, returning an AbstractParserFactory type
 * depending on the factory requested.
 * 
 * @author Vasco
 *
 */
public class ParserFactoryProducer {
	
	/**
	 * Returning the requested factory.
	 * 
	 * @param factory
	 * @return AbstractParserFactory
	 */
	public static AbstractParserFactory getFactory(String factory) {

		// TODO: Convert these strings into global variables.
		// Use reflection to create a dependency injection at this point
		// which will close this class from further changes.
		// The NYC Factory
		if ( factory.equals("NYCFactory") ) {
			return new NYFactory();
	    }
		// The London Factory
		else if ( factory.equals("LondonFactory")) {
			return new LDNFactory();
		}
		// An exception should be thrown here
		else {
		    return null;
		}
	}

}
