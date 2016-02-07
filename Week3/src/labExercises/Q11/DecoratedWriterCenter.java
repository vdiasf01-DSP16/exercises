package labExercises.Q11;

/**
 * Centre decoration to be applied to the main decorating Writer class.
 * 
 * @author Vasco
 *
 */
public class DecoratedWriterCenter implements MainDecoratingInterface {
	
	/**
	 * The max text width.
	 */
	private final int MAX_TEXT_WITH = 64;

	/**
	 * Centre the text within a default 64 string long.
	 */
	@Override
	public String decorate(String text) { 
		int textLengh = text.length();
		int spaceLeft = MAX_TEXT_WITH - textLengh;
		if ( spaceLeft > 0 ) {
			// Calculate how many spaces each side
			int half = spaceLeft / 2;
			// Prepare the final string
			String finalStr = "";
			// Add left spaces
			for( int i = 0; i < half; i++ ) finalStr += " ";
			// Add the text
			finalStr += text;
			// Add right spaces
			for( int i = 0; i < half; i++ ) finalStr += " ";
			// Assign finalStr back to text
			text = finalStr; 

			// The the amount of spacesLeft is odd, 
			// Int will return a floor, thus we add
			// the odd extra at the end of the text.
			if ( spaceLeft % 2 != 0 ) {
				text += " ";
			}
		}
		return text;
	}
}
