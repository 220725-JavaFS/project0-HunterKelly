package com.revature.models;

public class Admin extends Account{
	public int permissions = 0;
	
	public  Admin(String firstName, String password) {
		super();
		this.firstName = firstName;
		
		this.password = password;
	}
}
