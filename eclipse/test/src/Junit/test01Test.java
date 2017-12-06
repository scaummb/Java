package Junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class test01Test {
	private static test01 a = new test01();
	
	@Before
	public void setUp() throws Exception {
		a.clear();
	}

	@Test
	public void testAdd() {
		a.add(2);
		a.add(3);
		assertEquals(5, a.getResult());
	}

	@Test
	public void testSubstract() {
		a.add(10);
		a.substract(2);
		assertEquals(8, a.getResult());
	}
	
	@Ignore("Multiply() Not yet implemented")
	@Test
	public void testMultiply() {
	}

	@Test
	public void testDivide() {
		a.add(8);
		a.divide(2);
		assertEquals(4,a.getResult());
	}

}
