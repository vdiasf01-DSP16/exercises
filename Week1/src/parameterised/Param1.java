package parameterised;

public class Param1 {
	public <T> T get(T x) {
		return x;
	}

	public static void main(String []arg) {
		Param1 p1 = new Param1();
		System.out.println("Result: "+p1.get(654.08));
	}
}