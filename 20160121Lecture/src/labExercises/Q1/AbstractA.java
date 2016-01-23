package labExercises.Q1;
/**
 * Abstract class example.
 * 
 * @author Vasco
 *
 */
public abstract class AbstractA {
	/**
	 * Private X given to all classes that extend this abstract class,
	 * but only accessible through any implementation done on this abstract
	 * class.
	 */
	private Integer xVar;
	
	/**
	 * Constructor.
	 * 
	 * @param xVar
	 */
	AbstractA(final Integer xVar) {
		this.xVar = xVar;
	}
	
	/**
	 * This method is always available to any class that 
	 * extends this abstract class.
	 * It can also be overridden by any class extending this one.
	 */
	public void printAbstractA() {
		System.out.println("I am abstract class A");
	}
	
	/**
	 * This method must be implemented by any class that extends
	 * this abstract class.
	 * 
	 * Implementation cannot be done on this class.
	 */
	public abstract void printAbstractAAbstract();
	
	/**
	 * The X value made available.
	 * 
	 * @return Interger
	 */
	public Integer getX() {
		return xVar;
	}

	/**
	 * Allowing to set X with another value.
	 * 
	 */
	protected void setX(final Integer xVar) {
		this.xVar = xVar;
	}
}
