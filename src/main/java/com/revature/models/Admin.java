package com.revature.models;

public class Admin extends Account{
	
	public int permissions = 0;
	
	public Admin(String firstName, String password) {
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
