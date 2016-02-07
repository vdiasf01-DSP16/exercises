package abstractFactory;

/**
 * The abstract parser factory, the factory of factories.
 * 
 * @author Vasco
 *
 */
public interface AbstractParserFactory {
	
	/**
	 * The parser instance for the factory type requested.
	 * 
	 * @param parserType
	 * @return XMLParser
	 */
	public XMLParser getParserInstance(String parserType);
}
