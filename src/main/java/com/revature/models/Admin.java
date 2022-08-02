package com.revature.models;

import java.util.Scanner;

public class Admin extends Account{
	Scanner scan = new Scanner(System.in);
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

	
public void AdMenu() {
		
		System.out.println("Welcome Admin, please choose a number from the following");		
		System.out.println("1. Print out Banker Records");
		System.out.println("2. Print out Customer Records");
		System.out.println("3. CRUD Banker Accounts");
		System.out.println("3. CRUD Customer Accounts");
		String answer = scan.nextLine();
		switch (answer) {		
		
		case "1":
			
			//Print All records with permission level 1	
			break;
			
		case "2": 
			//print out all records in the database with Permission 2
			
			break;
		case "3": 
			//Create Banker Accounts
			
			break;	
		case "4": 
			//Create Customer Accounts
			
			break;
			
		default: System.out.println("Choose a valid number");
		AdMenu();
		}	
		System.out.println("Thank you Mr. Admin");
		}
	
	
}
