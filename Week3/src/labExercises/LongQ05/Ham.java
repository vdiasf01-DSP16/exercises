package labExercises.LongQ05;

public class Ham extends PizzaDecorator {
	
	private Pizza pizza;
	private double price;

	public Ham(Pizza pizza) {
		this.pizza = pizza;
		this.price = 18.12;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc() + ", Ham ("+price+")";
	}

	@Override
	public double getPrice() {
		return pizza.getPrice() + price;
	}

}
