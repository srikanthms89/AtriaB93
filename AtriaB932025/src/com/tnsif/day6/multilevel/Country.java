package com.tnsif.day6.multilevel;

public class Country {
	
	private String countryName;
	private String capital;
	
	public Country() {
		super();
	}

	public Country(String countryName, String capital) {
		super();
		this.countryName = countryName;
		this.capital = capital;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", capital=" + capital + "]";
	}
	
	

}
