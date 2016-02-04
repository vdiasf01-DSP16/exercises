package textFormatter;

public class TextEditor {
	
	/**
	 * The currently selected type of formatter.
	 */
	private TextFormatter textFormater;
	
	/**
	 * Constructor.
	 * 
	 * @param formatter
	 */
	public TextEditor(TextFormatter formatter) {
		this.textFormater = formatter;
	}
	
	/**
	 * Print the given test onto stdout using the
	 * supplied formatter.
	 * 
	 * @param text String
	 */
	public void publishText(String text) {
		textFormater.format(text);
	};
}
