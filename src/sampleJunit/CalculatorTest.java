package sampleJunit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private Calculator c = new Calculator();

	@Before
	public void setUp() throws Exception {
		c.clear();
	}

	@Test
	public void testAdd() {
		c.add(2);
		c.add(3);
		assertEquals(6, c.getResult());
//		fail("Not yet implemented");
	}

//	@Test
//	public void testSubstract() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testMultiply() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testDivide() {
//		fail("Not yet implemented");
//	}

}
