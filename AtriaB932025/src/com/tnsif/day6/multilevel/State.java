package com.tnsif.day6.multilevel;

public class State extends Country {
	private String lang;
    private String stateName;
	public State() {
		super();
	}
	public State(String countryName, String capital,String lang, String stateName) {
		super(countryName,capital);
		this.lang = lang;
		this.stateName = stateName;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	@Override
	public String toString() {
		return "State [lang=" + lang + ", stateName=" + stateName + ", getCountryName()=" + getCountryName()
				+ ", getCapital()=" + getCapital() + "]";
	}
    
    

}
