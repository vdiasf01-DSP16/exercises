package abstractFactory;

/**
 * The London Factory.
 * 
 * @author Vasco
 *
 */
public class LDNFactory implements AbstractParserFactory {

	/**
	 * The instance of the XMLParser for the London factory.
	 */
	@Override
	public XMLParser getParserInstance(String parserType) {
		// TODO: Convert this string to a global constant
		// Also use reflection.
		if ( parserType.equals("LondonFEEDBACK")) {
			// String to print as a test at this stage.
			System.out.println("London Parsing order XML...");
			return new LDNXMLParser();
		}
		// Maybe an exception?...
		return null;
	}

}
