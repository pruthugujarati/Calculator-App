package com.miit.calculatorapp.calculatorapp;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AppTest 
{
    @Test
    public void testaddition() {
		App test = new App();
		int result = test.addition(3,4);
		asserEquals(5, result);
	}

	private void asserEquals(int sum, int result) {	
	}



	 @Test
	public void testmultiply() {
		 App test = new App();
		int result = test.multiply(3,4);
		asserEquals1(12, result);
	}

	private void asserEquals1(int mul, int result) {
		
	}



	 @Test
	public void testsubstraction() {
		App test = new App();
		int result = test.substraction(8,5);
		asserEquals2(3, result);
	}

	private void asserEquals2(int sub, int result) {
		}




	@Test
	public void testdivision() {
		App divtest = new App();
		float result = divtest.division(8,4);
		asserEquals3(2, result);
	}

	private void asserEquals3(float div, float result) {	
	}
}
