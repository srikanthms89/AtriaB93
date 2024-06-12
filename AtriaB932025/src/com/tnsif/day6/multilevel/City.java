package com.tnsif.day6.multilevel;

public class City extends State {
	
	private float area;

	public City() {
		super();
	}

	public City(String countryName, String capital,String lang, String stateName,float area) {
		super(countryName,capital,lang,stateName);
		this.area = area;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "City [area=" + area + ", getLang()=" + getLang() + ", getStateName()=" + getStateName()
				+ ", getCountryName()=" + getCountryName() + ", getCapital()=" + getCapital() + "]";
	}
	
	
	

}
