package labExercises.LongQ05;

public class RomaTomatoes extends PizzaDecorator {
	
	private Pizza pizza;
	private double price;

	public RomaTomatoes(Pizza pizza) {
		this.pizza = pizza;
		this.price = 5.20;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc() + ", Roma Tomatoes ("+price+")";
	}

	@Override
	public double getPrice() {
		return pizza.getPrice() + price;
	}

}
