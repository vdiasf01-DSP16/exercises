package labExercises.Q1;

public class Q1aMain {

	public static void main(String[] args) {
		final Q1aClass q1a = new Q1aClass(25);
		q1a.printAbstractA();
		q1a.printInterfaceA();
		q1a.printInterfaceB();
		q1a.printAbstractAAbstract();
		q1a.setX(10);
		q1a.printX();
		q1a.setXValue(InterfaceA.INTERFACE_A);
		q1a.printX();

	}
}
