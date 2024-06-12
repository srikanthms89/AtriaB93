package com.tnsif.day6.hierarchical;

public class Student extends Person {
	
	private String college;
	private float marks;
	public Student() {
		super();
	}
	public Student(String name, String gender,String college, float marks) {
		super(name,gender);
		this.college = college;
		this.marks = marks;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [college=" + college + ", marks=" + marks + ", getName()=" + getName() + ", getGender()="
				+ getGender() + "]";
	}
	
	

}
