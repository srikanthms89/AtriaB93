package com.tnsif.day3;

import java.util.Scanner;

public class StudentDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name,usn,add;
		long mob;
		System.out.println("Enter name");
		name= sc.next();
		System.out.println("Enter usn");
		usn = sc.next();
		System.out.println("enter mob");
		mob= sc.nextLong();
		sc.nextLine();
		System.out.println("Enter address");
		add=sc.nextLine();
		
		Student obj = new Student();
		obj.setAddress(add);
		obj.setName(name);
		obj.setUsn(usn);
		obj.setMob(mob);
		
		System.out.println(obj);
		
		
		
		
	}

}
