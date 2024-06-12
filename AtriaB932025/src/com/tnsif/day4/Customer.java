package com.tnsif.day4;

public class Customer {
	private String name;
	private String address;
	private int id;
	
	public Customer() {

     System.out.println("Default constructor");
	}

	public Customer(String name, String address, int id) {
	      System.out.println("Parametrized constructor");
		this.name = name;
		this.address = address;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", id=" + id + "]";
	}
	
	

}
