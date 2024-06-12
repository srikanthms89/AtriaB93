package com.tnsif.day6.singlelevel;
//Parent class
public class Citizen {
	
	private String name;
	private String country;
	
	public Citizen() {
		super();
	}

	public Citizen(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Citizen [name=" + name + ", country=" + country + "]";
	}
	
	

}
