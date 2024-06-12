package com.tnsif.day6.hierarchical;

public class Manager extends Person {
	
	private int empno;

	public Manager() {
		super();
	}

	public Manager(String name, String gender,int empno) {
		super(name,gender);
		this.empno = empno;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	@Override
	public String toString() {
		return "Manager [empno=" + empno + ", getName()=" + getName() + ", getGender()=" + getGender() + "]";
	}
	
	

}
