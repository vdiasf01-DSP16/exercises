package lowerbounded;

public class StackTest {
	
	public static void main(String []arg) {
		// String does not extend Number
		// GenericStack<String> gs = new GenericStackImpl<>();

		GenericStack<Double> gs = new GenericStackImpl<>();
		gs.push(1.23);
		System.out.println("Result: "+gs.pop());
	}
}