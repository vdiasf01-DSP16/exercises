package bridge;

/**
 * The BigWheel car.
 * 
 * @author Vasco
 *
 */
public class BigWheel extends Car {

	/**
	 * The Label
	 */
	private String bigWheel;
	
	/**
	 * Constructor requiring the product to assemble.
	 * 
	 * @param product Product 
	 * @param bigWheel String
	 */
	public BigWheel(Product product, String bigWheel) {
		super(product);
		this.bigWheel = bigWheel;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void assemble() {
		System.out.println("Modifying product "+product + " according to " +bigWheel);
		System.out.println("Assembling "+product + " for " +bigWheel);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void printDetails() {
		System.out.println("Car: " + bigWheel + ", Product: " + product);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	void produceProduct() {
		System.out.println("Producing " + product);
	}
}
