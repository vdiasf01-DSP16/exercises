package parameterised;

public class Param2<T> {
	public T get(T x) {
		return x;
	}

	public static void main(String []arg) {
		Param2<String> p1 = new Param2<>();
		System.out.println("Result: "+p1.get("654.08"));
	}
}