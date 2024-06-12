package com.tnsif.day7.isa;

public class Manager extends Employee {
	
	private int noEmp;

	public Manager() {
		super();
	}

	public Manager(String name, String dept,int noEmp) {
		super(name,dept);
		this.noEmp = noEmp;
	}

	public int getNoEmp() {
		return noEmp;
	}

	public void setNoEmp(int noEmp) {
		this.noEmp = noEmp;
	}

	@Override
	public String toString() {
		return "Manager [noEmp=" + noEmp + ", getName()=" + getName() + ", getDept()=" + getDept() + "]";
	}
	
	

}
