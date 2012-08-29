package org.tkassembled.examples.maven;

import org.junit.Assert;
import org.junit.Test;

public class ArithmeticTestCase {

	@Test
	public void testAddition() {
		Assert.assertEquals("Failed to do pretty basic addition.",
				2, 1 + 1);
	}
	
	@Test
	public void testSubtraction() {
		Assert.assertEquals("Failed to do pretty basic subtraction.", 
				1, 2 - 1);
	}
	
	@Test
	public void testMultiplication() {
		Assert.assertEquals("Failed to do pretty basic multiplication.", 
				4, 2 * 2);
	}
	
	@Test
	public void testDivision() {
		Assert.assertEquals("Failed to do pretty basic division.", 
				2, 4 / 2);
	}
}
