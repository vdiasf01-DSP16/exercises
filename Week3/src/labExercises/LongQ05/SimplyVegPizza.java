package labExercises.LongQ05;

public class SimplyVegPizza implements Pizza {

	private double price;

	public SimplyVegPizza() {
		this.price = 230;
	}

	@Override
	public String getDesc() {
		return "SimplyVegPizza ("+price+")";
	}

	@Override
	public double getPrice() {
		return price;
	}
}
