package builder;

/**
 * The Sports Car type specifications.
 * 
 * @author Vasco
 *
 */
public class SportsCarBuilder implements CarBuilder {
	
	/**
	 * The Sports car.
	 */
	private Car car;

	/**
	 * The default constructor for the Sports Car type.
	 */
	public SportsCarBuilder() {
		this.car = new Car(CarTypes.SPORTS.toString());
		this.car.setBodyStyle(
            "\tExternal dimensions: overall length (inches): 192.3,\n"
            + "\toverall width (inches): 75.5, overall height (inches): 54.2,\n"
            + "\twheelbase (inches): 112.3, front track (inches): 63.7,\n"
            + "\trear track (inches): 64.1 and curb to curb turning circle (feet): 37.7");
		this.car.setPower("323 hp @ 6,800 rpm; 278 ft lb of torque @ 4,800 rpm");
		this.car.setEngine("3.6L V 6 DOHC and variable valve timing");
		this.car.setBreaks("Four-wheel disc brakes: two ventilated. Electronic brake distribution.\n"
				+ "\tStability control");
		this.car.setSeats("Driver sports front seat with one power adjustments manual height,\n"
				+ "\tfront passenger seat sports front seat with one power adjustments");
		this.car.setWindows("Front windows with one-touch on two windows");
		this.car.setFuelType("Petrol 17 MPG city, 28 MPG highway, 20 MPG combined and 380 mi. range");
	}

	/**
	 * The build car of type Sedan.
	 */
	@Override
	public Car getCar() {
		return car;
	}
}