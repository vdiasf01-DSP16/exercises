package labExercises.Q11;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

/**
 * Main class.
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
	@SuppressWarnings("resource")
	private void callMain() {
		Writer out = new PrintWriter(System.out);
		out = new DecoratedWriterWrap(out);
		out = new DecoratedWriterCenter(out);

		try {
			out.write("Hello World 123456sfsfsdfsd");
			out.flush();
			out.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
//		out.wrap();
	}

}
