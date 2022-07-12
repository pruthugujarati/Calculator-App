package com.miit.calculatorapp.calculatorapp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AppTest 
{
	
	@Test
	public void testAdd() {
		int value1 = 3;
		int value2 = 3;
		double result1 = value1 + value2;
		assertTrue(result1 == 6);
	}
	
	@Test
	public void testSub() {
		int value1 = 3;
		int value2 = 3;
		double result2 = value1 - value2;
		assertTrue(result2 == 0);		
	}
	
	@Test
	public void testMul() {
		int value1 = 3;
		int value2 = 4;
		double result3 = value1 * value2;
		assertTrue(result3 == 12);		
	}
	@Test
	public void testDiv() {
		int value1 = 12;
		int value2 = 3;
		double result4 = value1 / value2;
		assertTrue(result4 == 4);		
	}
}
