package builder;

/**
 * The Sports Car type specifications.
 * 
 * @author Vasco
 *
 */
public class SportsCarBuilder implements CarBuilder {
	
	/**
	 * The Sports car type.
	 */
	private final String carType = CarTypes.SPORTS.toString();
	
	/**
	 * The Sports car.
	 */
	private Car car;

	/**
	 * The default constructor for the Sports Car type.
	 */
	public SportsCarBuilder() {
		car = new Car(carType);
	}

	/**
	 * The build car of type Sport.
	 */
	@Override
	public Car getCar() {
		return car;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getBodyStyle() {
		return "\tExternal dimensions: overall length (inches): 192.3,\n"
	            + "\toverall width (inches): 75.5, overall height (inches): 54.2,\n"
	            + "\twheelbase (inches): 112.3, front track (inches): 63.7,\n"
	            + "\trear track (inches): 64.1 and curb to curb turning circle (feet): 37.7";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getPower() {
		return "323 hp @ 6,800 rpm; 278 ft lb of torque @ 4,800 rpm";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getEngine() {
		return "3.6L V 6 DOHC and variable valve timing";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getBreaks() {
		return "Four-wheel disc brakes: two ventilated. Electronic brake distribution.\n"
				+ "\tStability control";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getSeats() {
		return "Driver sports front seat with one power adjustments manual height,\n"
				+ "\tfront passenger seat sports front seat with one power adjustments";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getWindows() {
		return "Front windows with one-touch on two windows";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getFuelType() {
		return "Petrol 17 MPG city, 28 MPG highway, 20 MPG combined and 380 mi. range";
	}
}