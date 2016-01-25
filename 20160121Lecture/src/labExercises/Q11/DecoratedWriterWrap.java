package labExercises.Q11;

/**
 * Wrapper decoration to be applied to the main decorating Writer class.
 * 
 * @author Vasco
 *
 */
public class DecoratedWriterWrap implements MainDecoratingInterface {

	/**
	 * The wrap size to be used on the given text.
	 */
	private final int wrapSize;

	/**
	 * Default constructor applying size 15.
	 */
	public DecoratedWriterWrap() {
		this.wrapSize = 15;
	}

	/**
	 * Constructor accepting a size length.
	 * 
	 * @param wrapAt
	 */
	public DecoratedWriterWrap(int wrapAt) {
		this.wrapSize = wrapAt;
	}

	/**
	 * Cut the text off to 15 characters only.
	 */
	@Override
	public String decorate(String text) { 
		if ( text != null && text.length() > wrapSize ) {
			text = text.substring(0, wrapSize);
		}
		return text;
	}

}
