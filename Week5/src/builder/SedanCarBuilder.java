package builder;

/**
 * The Sedan Car type specifications.
 * 
 * @author Vasco
 *
 */
public class SedanCarBuilder implements CarBuilder {
	
	/**
	 * The Sedan car.
	 */
	private Car car;

	/**
	 * The default constructor for the Sedan Car type.
	 */
	public SedanCarBuilder() {
		this.car = new Car(CarTypes.SEDAN.toString());
		this.car.setBodyStyle(
            "\tExternal dimensions: overall length (inches): 202.9,\n"
		    + "\toverall width (inches): 76.2, overall height (inches): 60.7,\n"
		    + "\twheelbase (inches): 112.9, front track (inches): 65.3,\n"
		    + "\trear track (inches): 65.5 and curb to curb turning circle (feet): 39.5");
		this.car.setPower("285 hp @ 6,500 rpm; 253 ft lb of torque @ 4,000 rpm");
		this.car.setEngine("3.5L Duramax V 6 DOHC");
		this.car.setBreaks("Four-wheel disc brakes: two ventilated. Electronic brake distribution");
		this.car.setSeats("Front seat centre armrest.Rear seat centre armrest.Split-folding rear seats");
		this.car.setWindows("Laminated side windows.Fixed rear window with defroste");
		this.car.setFuelType("Diesel 19 MPG city, 29 MPG highway, 23 MPG combined and 437 mi. range");
	}

	/**
	 * The built car of type Sedan.
	 */
	@Override
	public Car getCar() {
		return car;
	}
	public String getThis() {
		return "this";
	}
}