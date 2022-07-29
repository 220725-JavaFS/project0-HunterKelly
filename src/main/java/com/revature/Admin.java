package com.revature;

public class Admin {
	public String firstName;
	public String lastName;
	public String password;
	public int permissions = 0;
	
	public  Admin(String firstName, String lastName, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
	}
}
