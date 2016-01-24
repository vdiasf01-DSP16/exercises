package labExercises.Q09;

/**
 * The Interface Implementation.
 * 
 * @author Vasco
 *
 */
public class InterfaceImplementation implements AnInterface {

	/**
	 * The String name stored.
	 */
	private String name;
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

}
