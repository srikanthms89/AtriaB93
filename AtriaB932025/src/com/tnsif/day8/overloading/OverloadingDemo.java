package com.tnsif.day8.overloading;

public class OverloadingDemo {

	public static void main(String[] args) {

System.out.println("....................constructor overloading..................");
		Point p = new Point();
		System.out.println( p);
		
		Point p1 = new Point(4.5f);
		System.out.println( p1);
		
		Point p2 = new Point(4.5f,7.6f);
		System.out.println( p2);
		
		
		Point p3 = new Point(5.6f,6.7f,8.8f);
		System.out.println( p3);
		
		
		System.out.println(".....................Method overloading................");
		
		System.out.println(Addition.addition(10, 20));
		System.out.println(Addition.addition(5.5f,8));
		System.out.println(Addition.addition(100,10.f));
		System.out.println(Addition.addition("Atria", "cse"));
	}
	

}
