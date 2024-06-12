package com.tnsif.day8.overriding;

public class OverridingDemo {

	public static void main(String[] args) {

		RBI rbi = new SBI();
		
		System.out.println(rbi.getRateofInterest());
		
		RBI r;
		
		r = new ICICI();
		if(r instanceof ICICI)
			System.out.println(r.getRateofInterest());
		
		r = new Canara();
		if(r instanceof Canara)
			System.out.println(r.getRateofInterest());
		

	}

}
