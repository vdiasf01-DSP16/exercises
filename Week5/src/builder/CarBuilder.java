package builder;

/**
 * The Car builder interface.
 * 
 * @author Vasco
 *
 */
public interface CarBuilder {

	/**
	 * The built car.
	 * 
	 * @return
	 */
	public Car getCar();

	/**
	 * Body type car attribute.
	 * 
	 * @return String 
	 */
	public String getBodyStyle();

	/**
	 * Power type car attribute.
	 * 
	 * @return String 
	 */
	public String getPower();

	/**
	 * Engine type car attribute.
	 * 
	 * @return String 
	 */
	public String getEngine();

	/**
	 * Breaks type car attribute.
	 * 
	 * @return String 
	 */
	public String getBreaks();

	/**
	 * Seats type car attribute.
	 * 
	 * @return String 
	 */
	public String getSeats();

	/**
	 * Windows type car attribute.
	 * 
	 * @return String 
	 */
	public String setWindows();

	/**
	 * Fuel type car attribute.
	 * 
	 * @return String 
	 */
	public String setFuelType();
	
}
