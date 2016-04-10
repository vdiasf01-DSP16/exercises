package labExercises.LongQ01;
/**
 * Overriding the factory method to return
 * an instance of a ConcreteProduct Product
 * type.
 * 
 * @author Vasco
 *
 */
public class ConcreteCreator extends Creator {
	/**
	 * {@inheritDoc}
	 */
	@Override
	public Product create() {
		return new ConcreteProduct();
	}
}
