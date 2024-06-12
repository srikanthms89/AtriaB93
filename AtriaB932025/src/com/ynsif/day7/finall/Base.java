package com.ynsif.day7.finall;

public class  Base {
	
	
	private int a =100;
	
	private final int b  = 200;
	
	
	public void display()
	{
		a = 1000;
		System.out.println("value a =" +a);
	}
	public void displayFinal()
	{
		 //b= 2000;
		System.out.println("value b =" +b);
	}
	

}
