package com.tnsif.day6.hierarchical;

public class Employee extends Person {

	private String dept;
	private int sal;
	public Employee() {
		super();
	}
	public Employee(String dept, int sal) {
		super();
		this.dept = dept;
		this.sal = sal;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [dept=" + dept + ", sal=" + sal + ", getName()=" + getName() + ", getGender()=" + getGender()
				+ "]";
	}
	
	
}
