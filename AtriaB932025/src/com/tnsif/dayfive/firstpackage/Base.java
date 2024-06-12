package com.tnsif.dayfive.firstpackage;

public class Base {

	 //Default,public ,private and protected variables
	
	int defaultvar= 10;
	public int publicvar=20;
	private int privatevar=30;
	protected int protectedvar=40;
	
	 //Default,public ,private and protected methods
	
	void varDefault()
	{
		System.out.println("Default method");
		System.out.println("Default variable " +defaultvar);
	}
	
	public void varPublic()
	{
		System.out.println("Public method");
		System.out.println("Public variable " +publicvar);
	}
	
	private void varPrivate()
	{
		System.out.println("Private method");
		System.out.println("Private variable " +privatevar);
	}
	
	protected void varProtecetd()
	{
		System.out.println("Proteceted method");
		System.out.println("Proteceted variable " +protectedvar);
	}
}
