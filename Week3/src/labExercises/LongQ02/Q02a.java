package labExercises.LongQ02;
/**
 * How could we use the synchronized keyword to the
 * getInstance() method to operate correctly.
 * 
 * @author Vasco
 *
 */
public class Q02a {
	
	/**
	 * The unique instance.
	 */
	private static IamUnique instance;
	
	/**
	 * Private constructor.
	 */
	private Q02a() {
		Q02a.instance = new IamUnique();
	}

	/**
	 * The public method to return one instance.
	 * Thread safe by the use of synchronized.
	 * 
	 * @return Q02Unique
	 */
	public static synchronized IamUnique getInstance() {
		if ( Q02a.instance == null ) {
			Q02a.instance = new IamUnique();
		}
		return instance;
	}
}
