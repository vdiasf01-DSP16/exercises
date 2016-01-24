package labExercises.Q09;

/**
 * Main class for testing the two commonly used Java methods
 * that return a new Object.
 * 
 * @author Vasco
 *
 */
public class MainReflection {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		MainReflection main = new MainReflection();
		main.callMain();
	}

	/**
	 * The Main execution.
	 */
	private void callMain() {

		Class<?> c = null;
		try {
			c = Class.forName("labExercises.Q09.InterfaceImplementation");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		AnInterface inter = null;
		try {
			inter = (AnInterface) c.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		inter.setName("My name is Earl");

		System.out.println("Name injected into the new Object is: '" + inter.getName() + "'");
	}
}
