package builder;

/**
 * The Sedan Car type specifications.
 * 
 * @author Vasco
 *
 */
public class SedanCarBuilder implements CarBuilder {
	
	/**
	 * The Sedan car type.
	 */
	private final String carType = CarTypes.SEDAN.toString();
	
	/**
	 * The Car
	 */
	private Car car;

	/**
	 * The default constructor for the Sedan Car type.
	 */
	public SedanCarBuilder() {
		car = new Car(carType);
	}

	/**
	 * The built car of type Sedan.
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
		return "\tExternal dimensions: overall length (inches): 202.9,\n"
			    + "\toverall width (inches): 76.2, overall height (inches): 60.7,\n"
			    + "\twheelbase (inches): 112.9, front track (inches): 65.3,\n"
			    + "\trear track (inches): 65.5 and curb to curb turning circle (feet): 39.5";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getPower() {
		return "285 hp @ 6,500 rpm; 253 ft lb of torque @ 4,000 rpm";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getEngine() {
		return "3.5L Duramax V 6 DOHC";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getBreaks() {
		return "Four-wheel disc brakes: two ventilated. Electronic brake distribution";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getSeats() {
		return "Front seat centre armrest.Rear seat centre armrest.Split-folding rear seats";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getWindows() {
		return "Laminated side windows.Fixed rear window with defroste";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getFuelType() {
		return "Diesel 19 MPG city, 29 MPG highway, 23 MPG combined and 437 mi. range";
	}
}