package bridge;

/**
 * The Motoren car.
 * 
 * @author Vasco
 *
 */
public class Motoren extends Car {

	/**
	 * The label.
	 */
	private String motoren;
	
	/**
	 * The constructor.
	 * 
	 * @param product
	 * @param motoren
	 */
	public Motoren(Product product, String motoren) {
		super(product);
		this.motoren = motoren;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void assemble() {
		System.out.println("Modifying product "+product + " according to " +motoren);
		System.out.println("Assembling "+product + " for " +motoren);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void printDetails() {
		System.out.println("Car: " + motoren + ", Product: " + product);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	void produceProduct() {
		System.out.println("Producing " + product);
	}
}
