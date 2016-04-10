package labExercises.LongQ05;

public class Meat extends PizzaDecorator {
	
	private Pizza pizza;
	private double price;

	public Meat(Pizza pizza) {
		this.pizza = pizza;
		this.price = 14.25;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc() + ", Meat ("+price+")";
	}

	@Override
	public double getPrice() {
		return pizza.getPrice() + price;
	}

}
