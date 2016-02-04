package abstractFactory;

/**
 * The London XML Parser.
 * 
 * @author Vasco
 *
 */
public class LDNXMLParser implements XMLParser {

	/**
	 * The actual parsing function.
	 */
	@Override
	public String parse() {
		return "London Parsing feedback XML...";
	}

}
