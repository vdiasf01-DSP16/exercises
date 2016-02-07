package labExercises.Q01;

/**
 * Interface example.
 * 
 * @author Vasco
 *
 */
public interface InterfaceA {
	/**
	 * InterfaceA variable.
	 */
	Integer INTERFACE_A = 15;
	
	/**
	 * Default method must be implemented here.
	 * It can be overridden by the implementing class.
	 */
	default void printDefauleInterfaceA() {
		System.out.println("I am Interface A default implementation.");
	};
	
	/**
	 * Declared method cannot be implemented here but it has to be
	 * implemented by the implementing class.
	 */
	void printInterfaceA();
}
