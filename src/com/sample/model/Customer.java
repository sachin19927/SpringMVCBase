package com.sample.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.sample.validation.CourceCode;

public class Customer {

	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	private String lastName;
	
	@NotNull(message="is required")
	@Min(value=0,message="must be grater then or equal to zero")
	@Max(value=10,message="must be less then or equal to 10")
	private Integer freePass;
	
	@Pattern(regexp="^[A-Za-z0-9]{5}",message="only 5 char/ digits allowed")
	private String postalCode;
	
	//@CourceCode
	//@CourceCode(value="TOP",message="Must Start with Top")
	@CourceCode(value={"TOPS", "LUV"}, message="must start with TOPS or LUV")
	private String courceCode;

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

	public Integer getFreePass() {
		return freePass;
	}

	public void setFreePass(Integer freePass) {
		this.freePass = freePass;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCourceCode() {
		return courceCode;
	}

	public void setCourceCode(String courceCode) {
		this.courceCode = courceCode;
	}
	
	
	
}
