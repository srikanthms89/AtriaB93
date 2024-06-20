package com.tnsif.day9.markerinterface;

public class MarkerInterfaceDemo {

	public static void main(String[] args) {
		Student s=new Student(101,"Neha",12000,"C++");
		System.out.println(s);
		if (s instanceof Registrable )
			System.out.println("Student is registered for the course");
		else
			System.out.println("Student is not registered for the course");
			

	}

}