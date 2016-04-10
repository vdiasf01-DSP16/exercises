package labExercises.LongQ01;
/**
 * 
 * Declares the factory method that will return
 * an object type Product.
 * 
 * @author Vasco
 *
 */
public class Creator {
	/**
	 * Creating a new Product
	 * 
	 * @return Product
	 */
	public Product create() { 
		return new ConcreteProduct(); 
	}
}
