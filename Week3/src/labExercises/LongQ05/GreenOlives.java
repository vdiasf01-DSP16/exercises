package labExercises.LongQ05;

public class GreenOlives extends PizzaDecorator {
	
	private Pizza pizza;
	private double price;

	public GreenOlives(Pizza pizza) {
		this.pizza = pizza;
		this.price = 5.47;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc() + ", Green Olives ("+price+")";
	}

	@Override
	public double getPrice() {
		return pizza.getPrice() + price;
	}

}
