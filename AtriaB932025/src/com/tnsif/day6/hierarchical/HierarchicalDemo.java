package com.tnsif.day6.hierarchical;

public class HierarchicalDemo {

	public static void main(String[] args) {

		Person   p = new Person("kumar","Male");
		System.out.println(".........................Person details...................");
		System.out.println(p);
		
		Person p1;
		
		p1 = new Student("puneeth","male","Atria",100.0f);
		if(p1 instanceof Person)
			System.out.println("........Student details are..........");
		System.out.println(p1);
		
		p1 = new Manager("harish","male",200);
		if(p1 instanceof Person)
			System.out.println("........Manger details are..........");
		System.out.println(p1);
		
	}

}
