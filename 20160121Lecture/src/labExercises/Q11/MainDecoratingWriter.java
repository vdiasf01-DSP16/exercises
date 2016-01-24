package labExercises.Q11;

import java.io.PrintWriter;
import java.io.Writer;
import java.util.LinkedList;
import java.util.List;

/**
 * The main abstract decorator class other decorators will extend.
 * 
 * This only extends PrintWriter class and overrides some of the 
 * methods to allow the decoration to happen.
 * 
 * @author Vasco
 *
 */
public abstract class MainDecoratingWriter extends PrintWriter implements Decorate {

	/**
	 * List of all the requested decorations.
	 */
	protected List<MainDecoratingWriter> list = new LinkedList<>();
	
	/**
	 * The actual test to be sent.
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
	 * Append a new Decoration to the final process.
	 * 
	 * @param decoration
	 */
	public void appendDecoration(MainDecoratingWriter decoration) {
		list.add(decoration);
	}
	
	/**
	 * Overriding the write to not write until 
	 * all decorations have happened.
	 */
	@Override
	public void write( String text ) {
		this.text = text;
	}

	/**
	 * Overriding the flush, using the internal text set 
	 * with all decorations made to it.
	 */
	@Override
	public void flush() { 
		for( MainDecoratingWriter mdw : list ) {
			mdw.decorate();
		}
		System.out.println("Decorations applied. Text: '" + text + "'");
//		super.write(text);
//	    super.flush();
	}
}
