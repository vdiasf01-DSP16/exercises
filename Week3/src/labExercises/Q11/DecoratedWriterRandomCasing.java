package labExercises.Q11;

/**
 * Wrapper decoration to be applied to the main decorating Writer class.
 * 
 * @author Vasco
 *
 */
public class DecoratedWriterRandomCasing implements MainDecoratingInterface {

	/**
	 * Random Casing.
	 */
	@Override
	public String decorate(String text) { 
		String finalStr = "";
		for( int i = 0; i < text.length(); i++ ) {
			String charStr = "" + text.charAt(i);
			if ( Math.random() > 0.5 ) { 
				finalStr += charStr.toLowerCase();
			}
			else {
				finalStr += charStr.toUpperCase();
			}
		}
		return finalStr;
	}

}
