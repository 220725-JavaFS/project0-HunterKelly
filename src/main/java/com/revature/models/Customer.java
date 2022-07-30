package com.revature.models;

public class Customer extends Account{
	
	public int permissions = 2;
	
	public Customer(String firstName, String lastName, String password) {
		super(firstName, password);
		// TODO Auto-generated constructor stub
	}

	public int getPermissions() {
		return permissions;
	}

	public void setPermissions(int permissions) {
		this.permissions = permissions;
	}

	
	
	
	

	
	
	
	
}