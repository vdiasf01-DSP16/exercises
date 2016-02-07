package abstractFactory;

/**
 * The NY XML Parser implementation.
 * 
 * @author Vasco
 *
 */
public class NYXMLParser implements XMLParser {

	/**
	 * The parse implementation for the NYC text.
	 */
	@Override
	public String parse() {
		return "NYC Order XML Message";
	}

}
