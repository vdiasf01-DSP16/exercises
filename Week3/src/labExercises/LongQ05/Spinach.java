package labExercises.LongQ05;

public class Spinach extends PizzaDecorator {
	
	private Pizza pizza;
	private double price;

	public Spinach(Pizza pizza) {
		this.pizza = pizza;
		this.price = 7.92;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc() + ", Spinach ("+price+")";
	}

	@Override
	public double getPrice() {
		return pizza.getPrice() + price;
	}

}
