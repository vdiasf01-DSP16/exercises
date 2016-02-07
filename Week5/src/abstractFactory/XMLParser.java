package abstractFactory;

/**
 * The XMLParser interface requiring only one method to 
 * be implemented on the implementing classes.
 * 
 * @author Vasco
 *
 */
public interface XMLParser {

	/**
	 * To parse the text.
	 * 
	 * @return String
	 */
	public String parse();
}
