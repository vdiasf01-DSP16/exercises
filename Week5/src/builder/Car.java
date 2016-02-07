package builder;

/**
 * Generic Car class.
 * 
 * @author Vasco
 *
 */
public class Car {
	
	/**
	 * Car attribute for body style.
	 */
	private String bodyStyle; 

	/**
	 * Car attribute for power.
	 */
	private String power; 

	/**
	 * Car attribute for engine.
	 */
	private String engine; 
	
	/**
	 * Car attribute for breaks.
	 */
	private String breaks; 
	
	/**
	 * Car attribute for seats.
	 */
	private String seats; 
	
	/**
	 * Car attribute for windows.
	 */
	private String windows; 
	
	/**
	 * Car attribute for fuel type.
	 */
	private String fuelType; 
	
	/**
	 * Car attribute for car type.
	 */
	private String carType;
	
	/**
	 * Constructor setting the car type.
	 * 
	 * @param carType
	 */
	public Car(String carType) { 
		this.carType = carType;
	}

	/**
	 * Body type car attribute.
	 * 
	 * @return String 
	 */
	public String getBodyStyle() { 
		return bodyStyle; 
	}
	
	/**
	 * Setting the body type car attribute.
	 */
	public void setBodyStyle(String bodyStyle) { 
		this.bodyStyle = bodyStyle;
	}
	
	/**
	 * Power type car attribute.
	 * 
	 * @return String 
	 */
	public String getPower() { 
		return power; 
	}
	
	/**
	 * Setting the power type car attribute.
	 */
	public void setPower(String power) { 
		this.power = power; 
	}
	
	/**
	 * Engine type car attribute.
	 * 
	 * @return String 
	 */
	public String getEngine() { 
		return engine; 
	}
	
	/**
	 * Setting the engine type car attribute.
	 */
	public void setEngine(String engine) { 
		this.engine = engine; 
	}
	
	/**
	 * Breaks type car attribute.
	 * 
	 * @return String 
	 */
	public String getBreaks() { 
		return breaks; 
	}
	
	/**
	 * Setting the breaks type car attribute.
	 */
	public void setBreaks(String breaks) { 
		this.breaks = breaks; 	
	}

	/**
	 * Seats type car attribute.
	 * 
	 * @return String 
	 */
	public String getSeats() { 
		return seats; 
	}

	/**
	 * Setting the seats type car attribute.
	 */
	public void setSeats(String seats) { 
		this.seats = seats; 
	}
	
	/**
	 * Windows type car attribute.
	 * 
	 * @return String 
	 */
	public String getWindows() { 
		return windows; 
	}
	
	/**
	 * Setting the windows type car attribute.
	 */
	public void setWindows(String windows) { 
		this.windows = windows; 
	}
	
	/**
	 * Fuel type car attribute.
	 * 
	 * @return String 
	 */
	public String getFuelType() { 
		return fuelType; 
	}
	
	/**
	 * Setting the fuel type car attribute.
	 */
	public void setFuelType(String fuelType) { 
		this.fuelType = fuelType; 
	}
	
	/**
	 * The Car object STDOUT description.
	 * 
	 * @return String 
	 */
	@Override 
	public String toString() { 
		StringBuilder sb = new StringBuilder(); 
		sb.append("--------------" + carType + "--------------------- \n"); 
		sb.append(" Body: "); 
		sb.append(bodyStyle); 
		sb.append("\n Power: "); 
		sb.append(power); 
		sb.append("\n Engine: "); 
		sb.append(engine); 
		sb.append("\n Breaks: "); 
		sb.append(breaks); 
		sb.append("\n Seats: "); 
		sb.append(seats); 
		sb.append("\n Windows: ");
		sb.append(windows); 
		sb.append("\n Fuel Type: "); 
		sb.append(fuelType);
		return sb.toString();
	}
}
