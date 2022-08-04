package com.revature.services;

import java.util.Objects;

public class CustomerInfo {

	private String FirstName;
	private String LastName;
	private String Email;
	private String PhoneNumber;
	
	
	public CustomerInfo(String firstName, String lastName, String email, String phoneNumber) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		PhoneNumber = phoneNumber;
	}


	public CustomerInfo() {
		super();		
	}


	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public String getPhoneNumber() {
		return PhoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}


	@Override
	public int hashCode() {
		return Objects.hash(Email, FirstName, LastName, PhoneNumber);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerInfo other = (CustomerInfo) obj;
		return Objects.equals(Email, other.Email) && Objects.equals(FirstName, other.FirstName)
				&& Objects.equals(LastName, other.LastName) && Objects.equals(PhoneNumber, other.PhoneNumber);
	}


	@Override
	public String toString() {
		return "CustomerInfo [FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email + ", PhoneNumber="
				+ PhoneNumber + "]";
	}
	
}
