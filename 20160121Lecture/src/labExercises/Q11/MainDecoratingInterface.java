package labExercises.Q11;

/**
 * The main decorating abstract class solely in charge of one thing:
 * - decorate the supplied text with whatever decoration is required
 * 
 * @author Vasco
 *
 */
public interface MainDecoratingInterface  {

	/**
	 * The method that will apply the decoration to the supplied text
	 * and return the decorated text.
	 * 
	 * @param text
	 * @return String
	 */
	public String decorate(String text);
}
