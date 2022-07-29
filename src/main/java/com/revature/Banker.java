package com.revature;

public class Banker {
	public String firstName;
	public String lastName;
	public String password;
	public int permissions = 1;
	
	public  Banker(String firstName, String lastName, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
	}
}
