package generics;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestGenericStack {
	/**
	 * The Object handler to test with.
	 */
	private GenericStack<Object> genObj;
	
	/**
	 * The expected object to be returned.
	 */
	private Object EXPECTED_OBJECT = "This is a test";
	
	/**
	 * Prepare the test by initialising all requirements.
	 */
	@Before
	public void before() {
		this.genObj = new GenericStackImpl<Object>();
		this.genObj.push(EXPECTED_OBJECT);
	}
	
	/**
	 * Check if the pop returns the expected object.
	 */
	@Test
	public void testingPop() {
		Object found = genObj.pop();
		assertEquals(EXPECTED_OBJECT, found);
	}

	/**
	 * Check if push new element, the second pop 
	 * returns the expected object.
	 */
	@Test
	public void testingPop2() {
		genObj.push(23);
		Integer foundInt = (Integer)genObj.pop();
		Object found = genObj.pop();
		assertTrue(23 == foundInt);
		assertEquals(EXPECTED_OBJECT, found);
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
