package com.revature.models;

import java.util.Objects;

public class AccountObject {
	
	
	private int CustomerID;
	private String username;
	private String password;	
	private String email;
	private PersonalInfo personalInfo;
	
	
	
	public AccountObject(int customerID, String username, String password, String email, PersonalInfo personalInfo) {
		super();
		this.CustomerID = customerID;
		this.username = username;
		this.password = password;
		this.email = email;
		this.personalInfo = personalInfo;
	}

	public AccountObject() {
		super();		
	}
	
	public AccountObject(int CustomerID, String username, String password, PersonalInfo personalInfo) {
		super();
		this.username = username;
		this.password = password;
		this.CustomerID = CustomerID;
		this.personalInfo = personalInfo;
	}		

	
	
	public int getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(int customerID) {
		this.CustomerID = customerID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public PersonalInfo getPersonalInfo() {
		return personalInfo;
	}

	public void setPersonalInfo(PersonalInfo personalInfo) {
		this.personalInfo = personalInfo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;		
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		result = prime * result + CustomerID;
		result = prime * result + ((email == null) ? 0 : email.hashCode());		
		result = prime * result + ((personalInfo == null) ? 0 : personalInfo.hashCode());		
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountObject other = (AccountObject) obj;
		return Objects.equals(email, other.email) && Objects.equals(password, other.password)
				&& Objects.equals(personalInfo, other.personalInfo) && Objects.equals(username, other.username);
	}

	@Override
	public String toString() {
		return "AccountObject [username=" + username + ", password=" + password + ", email=" + email + ", personalInfo="
				+ personalInfo + "]";
	}
	
	
	
	

	


	
		
	
	
}
