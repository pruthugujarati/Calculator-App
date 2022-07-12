package com.miit.calculatorapp.calculatorapp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testCalculator {
	@Test
	
	public void testadd() {
		assertEquals(9, 5+4);
	}

   @Test
	
	public void testsub() {
		assertEquals(1, 5-4);
	}
   
   @Test

    public void testmul() {
	assertEquals(20, 5*4);
}
   
   @Test

   public void testdiv() {
	assertEquals(3, 12/4);
}
}
 