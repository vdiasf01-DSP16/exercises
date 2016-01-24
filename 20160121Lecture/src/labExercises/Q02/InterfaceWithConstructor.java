package labExercises.Q02;

/**
 * Example of an Interface attempting to declare a constructor.
 * 
 * @author Vasco
 *
 */
public interface InterfaceWithConstructor {
	
	/**
	 * Attempting to create a constructor.
	 * 
	 * @param number
	 */
	default InterfaceWithConstructor(Integer number) {
		// This gives a compiler error expecting a returning identifier.
		System.out.println("Got number: " + number);
	}
}
