package com.tnsif.day2;

public class TypecastingDemo {

	public static void main(String[] args) {
		
		//Implicit type conversion
		int a =20;
		double d= a;
		System.out.println(d);
		
		char c= 'A';
		int aa = c;
		System.out.println(aa);
		
		//explicit type conversion
		double dd = 454646474.88;
		int aaa = (int) dd;
		System.out.println(aaa);
		
		int aaaa = 10000;
		short ss = (short)aaaa;
		System.out.println(ss);
		
		long l = 919008401136l;
		int ll = (int)l;
		System.out.println(ll);
	}

}