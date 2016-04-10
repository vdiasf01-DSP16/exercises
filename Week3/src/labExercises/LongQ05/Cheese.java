package labExercises.LongQ05;

public class Cheese extends PizzaDecorator {
	
	private Pizza pizza;
	private double price;

	public Cheese(Pizza pizza) {
		this.pizza = pizza;
		this.price = 20.72;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc() + ", Cheese ("+price+")";
	}

	@Override
	public double getPrice() {
		return pizza.getPrice() + price;
	}

}
