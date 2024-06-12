package com.tnsif.day7.staticc;

public class Base {
	
	//instance variables
	private int a =10;
	
	//static variable 
	private static int b =20;
	
	
	public void display()
	{
		System.out.println("value of a " +a);
		//System.out.println("value of b " +b);
	}
	
	public static void display1()
	{
		System.out.println("value of b " +b);
		
	}

	 static
	 {
		 b= 200;
		
	 }
}
