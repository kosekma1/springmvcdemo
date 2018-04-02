package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;


public class Student {

	private String firstName;	
	private String lastName;

	private String country;
	private String favoriteLanguage;

	private String[] operatingSystems;
	
	//private LinkedHashMap<String, String> countryOptions;

	public Student() {

    /*	countryOptions = new LinkedHashMap<>();

		// populate country options: used ISO country code
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		*/
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) { // on submit, Spring will call student.setOperatingSystems(...)
		this.operatingSystems = operatingSystems;
	}

	/*public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}*/

	
}
