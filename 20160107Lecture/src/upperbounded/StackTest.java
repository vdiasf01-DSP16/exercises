package upperbounded;

public class StackTest {
	/**
	 * Lower-bounded: A super B => A contains B
	 * 
	 * Upper-bounded: A extends B => B contains A
	 * 
	 * @param arg
	 */
	public static void main(String []arg) {
		// LOWER-BOUND
		// sourceStack.popOut(< ? super T > targetStack);
		// targetStack must be a superclass of sourceStack.
		// If target is Number, then source can be anything under Number
		// If target is specific like Integer, then source can only be Integer.
		
		// popOut: All our elements are to be popped into target stack.
		GenericStack<Number> sourceStackLower = new GenericStackImpl<>();
		sourceStackLower.push(123);
		sourceStackLower.push(13);

		GenericStack<Number> targetStackLower = new GenericStackImpl<>();
		sourceStackLower.popOut(targetStackLower);
		System.out.println("Result: " + targetStackLower.pop());
		System.out.println("Result: " + targetStackLower.pop());


		// UPPER-BOUND
		// targetStack.popIn(< ? extends T > sourceTarget);
		// sourceStack must extend targetStack.
		// If source is Number, then target can be anything under Number
		// If source is specific like Integer, then target can be Integer or Number.

		// popIn: All supplied stack elements are to be popped into our stack.
		GenericStack<Integer> sourceStackUpper = new GenericStackImpl<>();
		sourceStackUpper.push(123);
		sourceStackUpper.push(13);
		
		GenericStack<Number> targetStackUpper = new GenericStackImpl<>();
		targetStackUpper.popIn(sourceStackUpper);
		System.out.println("Result: " + targetStackUpper.pop());
		System.out.println("Result: " + targetStackUpper.pop());

		// IN SUMMARY
		// Lower-bound is when we are bounded by the target.
		// Upper-bound is when the target is bounded by us.
	}
}