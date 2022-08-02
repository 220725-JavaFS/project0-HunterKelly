package com.revature.models;

import java.util.Objects;

public class Account {
	public String firstName;
	public String lastName;
	public String password;
	
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Account(String firstName, String password) {
		super();
		this.firstName = firstName;
		
		this.password = password;
	}
		
	@Override
	public int hashCode() {
		return Objects.hash(firstName, password);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(password, other.password);
	}
	@Override
	public String toString() {
		return "Account [firstName=" + firstName + ", lastName=" + lastName + ", password=" + password + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
