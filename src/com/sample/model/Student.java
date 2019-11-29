package com.sample.model;

import java.util.LinkedHashMap;

public class Student {
	public String firstName;
	public String lastName;
	public String country;
	public String city;
	public String lanuage;
	public String domain;
	public String[] oprSystem;
	
	
	
	
	private LinkedHashMap<String, String> stateoption;
	private LinkedHashMap<String, String> domianOption;
	
	public Student()
	{
		// populate Conutry code
		stateoption=new LinkedHashMap<>();
		stateoption.put("IND", "India");
		stateoption.put("BR", "Brazil");
		stateoption.put("USA", "America");
		stateoption.put("PAK", "Pakistan");
		// populate Domain code
		domianOption=new LinkedHashMap<>();
		domianOption.put("UI", "Front End");
		domianOption.put("BE", "Back End");
		domianOption.put("MI", "Middle");
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
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getStateoption() {
		return stateoption;
	}

	public String getLanuage() {
		return lanuage;
	}

	public void setLanuage(String lanuage) {
		this.lanuage = lanuage;
	}

	public String[] getOprSystem() {
		return oprSystem;
	}

	public void setOprSystem(String[] oprSystem) {
		this.oprSystem = oprSystem;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public LinkedHashMap<String, String> getDomianOption() {
		return domianOption;
	}
	 
	
	
	
	
}
