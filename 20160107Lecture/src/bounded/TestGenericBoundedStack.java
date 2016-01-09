package bounded;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestGenericBoundedStack {
	/**
	 * The Object handler to test with.
	 */
	private StackNumber<Integer> genObj;
	
	/**
	 * The expected Integercto be returned.
	 */
	private Integer EXPECTED_INTEGER = 1234;
	
	/**
	 * Prepare the test by initialising all requirements.
	 */
	@Before
	public void before() {
		this.genObj = new StackNumberImpl<Integer>();
		this.genObj.push(EXPECTED_INTEGER);
	}
	
	/**
	 * Check if the pop returns the expected object.
	 */
	@Test
	public void testingPop() {
		Integer found = genObj.pop();
		assertEquals(EXPECTED_INTEGER, found);
	}

	/**
	 * Check if push new element, the second pop 
	 * returns the expected object.
	 */
	@Test
	public void testingPop2() {
		genObj.push(2323);
		Integer foundInt = genObj.pop();
		Integer found = genObj.pop();
		assertTrue(2323 == foundInt);
		assertEquals(EXPECTED_INTEGER, found);
	}
	
	/**
	 * Check empty stack.
	 */
	@Test
	public void testingEmptyStack() {
		genObj.pop();
		assertTrue(genObj.isEmpty());
	}
	
	/**
	 * Check not empty stack.
	 */
	@Test
	public void testingNotEmptyStack() {
		assertFalse(genObj.isEmpty());
	}
	
	/**
	 * Check exception when pop from empty stack.
	 */
	@Test(expected=IllegalStateException.class)
	public void testingExceptionOnEmptyStack() {
		genObj.pop();
		genObj.pop();
	}
	
	
}
