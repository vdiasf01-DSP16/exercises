package builder;

/**
 * Car Director to build cars to specifications.
 * 
 * @author Vasco
 *
 */
public class CarDirector {

	/**
	 * Current CarBuilder instance.
	 */
	private CarBuilder carBuilder;

	/**
	 * Constructor accepting a CarBuilder type 
	 * to be used when building a car.
	 * 
	 * @param carBuilder
	 */
	public CarDirector(CarBuilder carBuilder) {
		this.carBuilder = carBuilder;
	}
	
	/**
	 * Builds the car according to given specifications
	 * supplied by the underlying classes.
	 */
	public void build() {
		Car car = carBuilder.getCar();
		car.setBodyStyle(carBuilder.getBodyStyle());
		car.setPower(carBuilder.getPower());
		car.setEngine(carBuilder.getEngine());
		car.setBreaks(carBuilder.getBreaks());
		car.setSeats(carBuilder.getSeats());
		car.setWindows(carBuilder.getWindows());
		car.setFuelType(carBuilder.getFuelType());
	}
}
