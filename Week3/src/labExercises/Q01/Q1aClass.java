package labExercises.Q01;

/**
 * A class can extend only from one abstract class but can implement 
 * multiple interfaces.
 * 
 * @author Vasco
 *
 */
public class Q1aClass extends AbstractA implements InterfaceA, InterfaceB {

	/**
	 * {@inheritDoc}
	 * 
	 * @param xVar
	 */
	Q1aClass(final Integer xVar) {
		super(xVar);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void printInterfaceB() {
		System.out.println("Interface B implemented.");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void printAbstractAAbstract() {
		System.out.println("I am Class forced implementation from abstracted A class on abstract A method");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void printInterfaceA() {
		System.out.println("Interface A implemented. X = " + this.getX());
	}

	/**
	 * Public method overridden from any of the interfaces or abstract classes.
	 */
	public void printX() {
		System.out.println("X = " + this.getX());
	}
	
	/**
	 * Public method overridden from any of the interfaces or abstract classes.
	 * 
	 * This method is not required since the abstract class already supplies the
	 * setX(int) method. This is only to illustrate the it can be done.
	 */
	public void setXValue(final Integer xVar) {
		// Using the already supplied abstract class method.
		this.setX(xVar);
	}

}
