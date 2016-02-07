package labExercises.Q11;

import java.io.PrintWriter;

/**
 * Main class example for the decorator.
 * Please note that the decoration order matters.
 * The wrap can be configured for different sizes. 
 * Wrap of size 15 is the default as per the exercise request.
 * 
 * @author Vasco
 *
 */
public class Main {

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Main main = new Main();
		main.callMain();
	}

	/**
	 * The Main call
	 */
	private void callMain() {
		MainDecoratingWriter decoratedOut = new MainDecoratingWriter(new PrintWriter(System.out));
		decoratedOut.appendDecoration(new DecoratedWriterRandomCasing());
        decoratedOut.appendDecoration(new DecoratedWriterWrap(150));
		decoratedOut.appendDecoration(new DecoratedWriterCenter());

		decoratedOut.write("Hello World, this is a decorator example text.");
		decoratedOut.flush();
		decoratedOut.close();
		decoratedOut.reset();
	}

}
