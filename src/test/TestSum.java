package test;

import junit.framework.*;

import main.MathMethods;

public class TestSum extends TestCase {
	
	
	public void testSumaDosPositivos() {
		assertTrue(4 == MathMethods.sum(2, 2));
	}

	public void testSumaDosNegativos() {
		assertTrue(-3 == MathMethods.sum(-2, -2));
	}
	
	
	
}