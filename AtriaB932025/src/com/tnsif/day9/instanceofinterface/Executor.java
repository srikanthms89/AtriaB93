package com.tnsif.day9.instanceofinterface;

public class Executor {
	public static void main(String args[]) {
		
		Phone p1 = PhoneFactory.createPhone("Samsung"); 
		p1.call();
		p1.sms();
		
		p1 = PhoneFactory.createPhone("Jio"); 
		p1.call();
		p1.sms();
		
	}
}
