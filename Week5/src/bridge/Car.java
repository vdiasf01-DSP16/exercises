package bridge;

/**
 * Car abstract class which allows the decoupling from 
 * the Product interface.
 * 
 * @author Vasco
 *
 */
public abstract class Car {
	
	/**
	 * The Product interface.
	 */
	protected Product product;

	/**
	 * Constructor.
	 * 
	 * @param product
	 */
	public Car(Product product) {
		this.product = product;
	}

	/**
	 * Producing the given product.
	 */
	abstract void produceProduct();

	/**
	 * Assembling the car.
	 */
	abstract void assemble();

	/**
	 * Displaying the details.
	 */
	abstract void printDetails();
}
