package app;

import static org.junit.Assert.*;

import org.junit.Test;

public class BasicAppTest {

	@Test
	public void AdditionTest() {
		BasicApp AddTest = new BasicApp();
		int result = AddTest.addition(20, 10);
		assertEquals(30, result);
	}
	
	@Test
	public void SubtractionTest() {
		BasicApp AddTest = new BasicApp();
		int result = AddTest.subtraction(20, 10);
		assertEquals(10, result);
	}
	
	@Test
	public void MultiplicationTest() {
		BasicApp AddTest = new BasicApp();
		int result = AddTest.multiplication(20, 10);
		assertEquals(200, result);
	}

}
