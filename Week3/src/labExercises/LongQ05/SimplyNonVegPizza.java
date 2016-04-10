package labExercises.LongQ05;

public class SimplyNonVegPizza implements Pizza {

	private double price;

	public SimplyNonVegPizza() {
		this.price = 350;
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
