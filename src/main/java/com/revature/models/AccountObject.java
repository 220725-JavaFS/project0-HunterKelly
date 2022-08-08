package com.revature.models;

import java.util.Objects;

public class AccountObject {
	
	
	private int CustomerID;
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private double accountbalance;
	private String email;
	private String phonenumber;
	private PersonalInfo personalInfo;
	
	
	
	
	public AccountObject(int customerID, String username, String password, String firstname, String lastname,
			double accountbalance, String email, String phonenumber, PersonalInfo personalInfo) {
		super();
		CustomerID = customerID;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.accountbalance = accountbalance;
		this.email = email;
		this.phonenumber = phonenumber;
		this.personalInfo = personalInfo;
	}

	public AccountObject() {
		super();
		
	}
	
	
	public AccountObject(String username, String password, String firstname, String lastname, double accountbalance,
			String email, String phonenumber, PersonalInfo personalInfo) {
		super();
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.accountbalance = accountbalance;
		this.email = email;
		this.phonenumber = phonenumber;
		this.personalInfo = personalInfo;
	}

	public int getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(int customerID) {
		CustomerID = customerID;
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
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public double getAccountbalance() {
		return accountbalance;
	}
	public void setAccountbalance(double accountbalance) {
		this.accountbalance = accountbalance;
	}
	
	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
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
		return Objects.hash(CustomerID, accountbalance, email, firstname, lastname, password, personalInfo, phonenumber,
				username);
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
		return CustomerID == other.CustomerID
				&& Double.doubleToLongBits(accountbalance) == Double.doubleToLongBits(other.accountbalance)
				&& Objects.equals(email, other.email) && Objects.equals(firstname, other.firstname)
				&& Objects.equals(lastname, other.lastname) && Objects.equals(password, other.password)
				&& Objects.equals(personalInfo, other.personalInfo) && Objects.equals(phonenumber, other.phonenumber)
				&& Objects.equals(username, other.username);
	}

	@Override
	public String toString() {
		return "AccountObject [CustomerID=" + CustomerID + ", username=" + username + ", password=" + password
				+ ", firstname=" + firstname + ", lastname=" + lastname + ", accountbalance=" + accountbalance
				+ ", email=" + email + ", phonenumber=" + phonenumber + ", personalInfo=" + personalInfo + "]";
	}
	
	
	
	
	
	
	
	

	


	
		
	
	
}
