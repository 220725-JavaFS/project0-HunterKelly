package com.revature.models;

public class Banker extends Account{
	
	public int permissions = 1;
	
	public  Banker(String firstName, String password) {
		super();
		this.firstName = firstName;		
		this.password = password;
	}
}
