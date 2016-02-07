package labExercises.Q11;

import java.io.PrintWriter;
import java.io.Writer;
import java.util.LinkedList;
import java.util.List;

/**
 * The main class extending the PrintWriter and will execute all 
 * the requested decorations appended.
 * 
 * PrintWriter write and flush is overridden such that we carry 
 * the supplied text available to apply the decorations in the
 * order these were given.
 * 
 * @author Vasco
 *
 */
public class MainDecoratingWriter extends PrintWriter {

	/**
	 * List of all the requested decorations.
	 */
	protected List<MainDecoratingInterface> list = new LinkedList<>();
	
	/**
	 * The actual test to be sent out.
	 */
	protected String text = "";
	
	/**
	 * Constructor expecting a Writer.
	 * 
	 * @param out
	 */
	public MainDecoratingWriter(Writer out) {
		super(new PrintWriter(out));
	}

	/**
	 * Overriding the write to not write until 
	 * all decorations have happened.
	 */
	@Override
	public void write( String text ) {
		this.text += text;
	}

	/**
	 * Append supplied decoration to the list of all decorations.
	 * 
	 * @param MainDecoratingInterface decoration
	 */
	public void appendDecoration(MainDecoratingInterface decoration) {
		list.add(decoration);
	}

	/**
	 * Overriding the flush, using the internal text set 
	 * with all decorations made to it.
	 */
	@Override
	public void flush() { 
		for( MainDecoratingInterface mdw : list ) {
			text = mdw.decorate(text);
		}
		super.write(text);
	    super.flush();
	}
	
	/**
	 * Resets the appended list of decorations.
	 */
	public void reset() {
		list = new LinkedList<>();
	}
}
