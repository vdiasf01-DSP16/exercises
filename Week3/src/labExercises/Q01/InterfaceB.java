package labExercises.Q01;

/**
 * Interface example.
 * 
 * @author Vasco
 *
 */
public interface InterfaceB {
	
	/**
	 * Default method must be implemented here.
	 * It can be overridden by the implementing class.
	 */
	default void printDefauleInterfaceB() {
		System.out.println("I am Interface B default implementation.");
	};
	
	/**
	 * Declared method cannot be implemented here but it has to be
	 * implemented by the implementing class.
	 */
	void printInterfaceB();
}
