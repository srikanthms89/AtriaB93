package com.tnsif.day3;
//student Entity
public class Student {
	
	//Data members
	
	private String name;
	private String usn;
	private long mob;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsn() {
		return usn;
	}
	public void setUsn(String usn) {
		this.usn = usn;
	}
	public long getMob() {
		return mob;
	}
	public void setMob(long mob) {
		this.mob = mob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", usn=" + usn + ", mob=" + mob + ", address=" + address + "]";
	}
	
	
	

}
