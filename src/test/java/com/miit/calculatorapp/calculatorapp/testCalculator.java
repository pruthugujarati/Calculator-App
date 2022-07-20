package com.miit.calculatorapp.calculatorapp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testCalculator {
	@Test
	
	public void testadd() {
		App1 cal = new App1();
		assertEquals(9, cal.addition(5, 4));
	}

   @Test
	
	public void testsub() {
	   App1 cal = new App1();
		assertEquals(1, cal.substraction(5, 4));
	}
   
   @Test

    public void testmul() {
	   App1 cal = new App1();
	assertEquals(20, cal.multiply(5,4));
}
   
   @Test

   public void testdiv() {
	   App1 cal = new App1();
	assertEquals(4, cal.division(12, 3));
}
   @Test
   
   public void testsquare() {
	   App1 cal = new App1();
	   assertEquals(25, cal.square(5, 5));
   }
   
   @Test
   public void testmath() {
	   App1 cal = new App1();
	   assertEquals(7, cal.math(7, 5));
   }
}
 