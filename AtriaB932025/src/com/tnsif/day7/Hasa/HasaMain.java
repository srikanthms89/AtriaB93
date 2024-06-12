package com.tnsif.day7.Hasa;

public class HasaMain {

	public static void main(String[] args) {

		Address add = new Address("bangalore");
		System.out.println(add);
		
		Person p = new Person("kumar",add);
		
		System.out.println(p);

	}

}
