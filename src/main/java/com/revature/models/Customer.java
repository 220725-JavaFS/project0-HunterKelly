package com.revature.models;

public class Customer extends Account{
	
	public int permissions = 2;
	
	public  Customer(String firstName, String lastName, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
	}

	public Customer(int permissions) {
		super();
		this.permissions = permissions;
	}
	
	
	
}