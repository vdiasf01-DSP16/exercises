package abstractFactory;

/**
 * The NY Factory.
 * 
 * @author Vasco
 *
 */
public class NYFactory implements AbstractParserFactory {

	/**
	 * Returning the Parser Instance requested.
	 */
	@Override
	public XMLParser getParserInstance(String parserType) {
		// TODO: Make these constants global.
		// Use reflection.
		if ( parserType.equals("NYCORDER")) {
			System.out.println("NYC Parsing order XML...");
			return new NYXMLParser();
		}
		
		// Exception
		return null;
	}

}
