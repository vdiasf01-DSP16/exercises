package bridge;

/**
 * The gear locking product.
 * 
 * @author Vasco
 *
 */
public class GearLocking implements Product {

	/**
	 * The label.
	 */
	private String gearLocking;

	/**
	 * Constructor.
	 * 
	 * @param gearLocking
	 */
	public GearLocking(String gearLocking) {
		this.gearLocking = gearLocking;
	}

	@Override
	public String toString() {
		return gearLocking;
	}	
}
