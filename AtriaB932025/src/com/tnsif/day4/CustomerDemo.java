package com.tnsif.day4;

public class CustomerDemo {

	public static void main(String[] args) {

		Customer   cus = new Customer();   //Default constructor
		cus.setName("kumar");
		cus.setId(100);
		cus.setAddress("bangalore");
		
		System.out.println(cus);
		
		Customer cus1 = new Customer("puneeth","Bangalore",200);
		
		System.out.println(cus1);

	}

}