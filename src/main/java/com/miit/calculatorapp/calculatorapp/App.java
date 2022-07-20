package com.miit.calculatorapp.calculatorapp;

import java.util.Scanner;

class App1
{

	App1() {}
	
	public static int addition(int x, int y) {
		
		return x + y;
	}

	public static int substraction(int x, int y) {
		
		return x - y;
	}
	
    public static int multiply(int x, int y) {
		
		return x * y;
	}

	public static int division(int x, int y) {
		
		return x / y;
	}

	public static int square(int x, int y) {
		
		return x * x;
	}

	public static int math(int x, int y) {
		return Math.max(x, y);
	}
    
        
		}
	public class App{
		public static void main( String[] args ) {
			int i=0;
			
			while(i<7) {
			System.out.println("Select Performance: ");
			System.out.println("1: Additon ");
			System.out.println("2: Substraction ");
			System.out.println("3: Multipication");
			System.out.println("4: Division ");
			System.out.println("5: Square ");
			System.out.println("6: Find Maximum Number ");
			System.out.println("7: Exit ");
			
			Scanner performance = new Scanner(System.in);
			System.out.println("Enter performance number here:");
			i = performance.nextInt();
			int x = 0, y=0;
			App1 obj = new App1();
			int result=0;
			switch (i) {
			case 1:
				
				Scanner myObj = new Scanner(System.in);
				System.out.println("Enter Value = ");
				x = myObj.nextInt();
				
				System.out.println("Enter another Value = ");
		        y = myObj.nextInt();
		        
		       result= obj.addition(x, y);
		        
				System.out.println("Addition ans is :" + result);
				break;
			
			case 2:
				
				Scanner myObj1 = new Scanner(System.in);
				System.out.println("Enter Value = ");
				x = myObj1.nextInt();
				
				System.out.println("Enter another Value = ");
		        y = myObj1.nextInt();
		        
		        result =obj.substraction(x, y);
		        System.out.println("Substraction ans is :" + result);
				break;
				
			case 3:
				
				
				Scanner myObj2 = new Scanner(System.in);
				System.out.println("Enter Value = ");
				x = myObj2.nextInt();
				
				System.out.println("Enter another Value = ");
		        y = myObj2.nextInt();
		        
		        result = obj.multiply(x, y);
		        System.out.println("Multipication ans is :" + result);
				break;
				
			case 4:
				
				Scanner myObj3 = new Scanner(System.in);
				System.out.println("Enter Value = ");
				x = myObj3.nextInt();
				
				System.out.println("Enter another Value = ");
		        y = myObj3.nextInt();
		        
		        result =obj.division(x, y);
		        System.out.println("Division ans is :" +  result);
				break;
				
	         case 5:
				
				Scanner myObj4 = new Scanner(System.in);
				System.out.println("Enter Value = ");
				x = myObj4.nextInt();
		        
		        result = obj.square(x,x);
		        System.out.println("Square is :" + result);
				break;
				
	         case 6:
	 			
	 			Scanner myObj5 = new Scanner(System.in);
	 			System.out.println("Enter Value = ");
	 			x = myObj5.nextInt();
	 			
	 			System.out.println("Enter another Value = ");
	 	        y = myObj5.nextInt();
	 	        
	 	        result = Math.max(x, y);
	 	        System.out.println("Maximum number is :" + result);
	 			break;
	 			default:
	 				System.out.println("Unvalid entry");
			}
	    }
	}
 }

