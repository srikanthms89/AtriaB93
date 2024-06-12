package com.tnsif.day6.singlelevel;

public class Student extends Citizen {
	
	private int id;
	private String college;
	
	public Student() {
		super();
	}

	public Student(String name, String country,int id, String college) {
		super(name,country);
		
		this.id = id;
		this.college = college;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", college=" + college + ", getName()=" + getName() + ", getCountry()="
				+ getCountry() + "]";
	}
	
	
	
	

}
