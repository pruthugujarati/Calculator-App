package com.miit.calculatorapp.calculatorapp;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
       int i=0;
		
		while(i<5) {
		System.out.println("Select Performance: ");
		System.out.println("1: Additon ");
		System.out.println("2: Substraction ");
		System.out.println("3: Multipication");
		System.out.println("4: Division ");
		System.out.println("5: Exit ");
		
		Scanner performance = new Scanner(System.in);
		System.out.println("Enter performance number here:");
		i = performance.nextInt();
		
		switch (i) {
		case 1:
			int x, y, sum;
			Scanner myObj = new Scanner(System.in);
			System.out.println("Enter Value");
			x = myObj.nextInt();
			
			System.out.println("Enter another Value");
	        y = myObj.nextInt();
	        
	        sum = x + y;
	        System.out.println("Addition ans is :" + sum);
			break;
		
		case 2:
			int sub;
			Scanner myObj1 = new Scanner(System.in);
			System.out.println("Enter Value");
			x = myObj1.nextInt();
			
			System.out.println("Enter another Value");
	        y = myObj1.nextInt();
	        
	        sub = x - y;
	        System.out.println("Substraction ans is :" + sub);
			break;
			
		case 3:
			int mul;
			Scanner myObj2 = new Scanner(System.in);
			System.out.println("Enter Value");
			x = myObj2.nextInt();
			
			System.out.println("Enter another Value");
	        y = myObj2.nextInt();
	        
	        mul = x * y;
	        System.out.println("Multipication ans is :" + mul);
			break;
			
		case 4:
			float div;
			Scanner myObj3 = new Scanner(System.in);
			System.out.println("Enter Value");
			x = myObj3.nextInt();
			
			System.out.println("Enter another Value");
	        y = myObj3.nextInt();
	        
	        div = x / y;
	        System.out.println("Division ans is :" +  div);
			break;
		}
		}
	}

	public int multiply(int x, int y) {
		
		return x * y;
	}

	public int addition(int x, int y) {
		
		return x + y;
	}

	public int substraction(int x, int y) {
		
		return x - y;
	}

	public float division(int x, int y) {
		
		return x / y;
	}

 }

