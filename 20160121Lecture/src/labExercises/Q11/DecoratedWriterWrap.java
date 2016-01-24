package labExercises.Q11;

import java.io.PrintWriter;
import java.io.Writer;

/**
 * Wrapper decoration to be applied to the main decorating Writer class.
 * 
 * @author Vasco
 *
 */
public class DecoratedWriterWrap extends MainDecoratingWriter implements Decorate {
	
	/**
	 * Constructor
	 * 
	 * @param out
	 */
	public DecoratedWriterWrap(Writer out) {
		super(new PrintWriter(out));
		super.appendDecoration(this);
	}

	/**
	 * Wrap the text to 15 char.
	 */
	@Override
	public void decorate() { 
		System.out.println("Decorate text: '"+text+"' - Wrap.");
		if ( text != null && text.length() > 15 ) {
			super.text = this.text.substring(0, 15);
		}
		System.out.println("Decorated: '"+text+"' - Wrap.");
	}
}
