package bridge;

/**
 * Central Locking product.
 * 
 * @author Vasco
 *
 */
public class CentralLocking implements Product {
	
	/**
	 * The label.
	 */
	private String centralLocking;

	/**
	 * Constructor.
	 * 
	 * @param centralLocking
	 */
	public CentralLocking(String centralLocking) {
		this.centralLocking = centralLocking;
	}

	@Override
	public String toString() {
		return centralLocking;
	}
}
