package com.revature.models;

import java.util.Scanner;

import com.revature.repositories.Queries;

import come.revature.controller.CreateAccount;

public class Admin extends Account{
	Scanner scan = new Scanner(System.in);
	public int permissions = 0;
	
	

	public int getPermissions() {
		return permissions;
	}

	public void setPermissions(int permissions) {
		this.permissions = permissions;
	}

	
public void AdMenu() {
		System.out.println("");
		System.out.println("Welcome Admin, please choose a number from the following");		
		System.out.println("1. Print All Customer Accounts");
		System.out.println("2. Create A Customer Account");
		System.out.println("3. Delete A Customer Account");
		System.out.println("4. Logout");
		System.out.println("");
		String answer = scan.nextLine();
		switch (answer) {		
		
		case "1":
			Queries ListAll = new Queries();
			ListAll.getCustomerList();
				
			AdMenu();
			
		case "2": 
			CreateAccount Theaccount = new CreateAccount();
			Theaccount.CreateTheAccount();
			
			
			
			
			AdMenu();
		case "3": 
			
			System.out.println("Type the Customer user name to Delete.");
			String Deleted = scan.nextLine();
			
			//SQL method DeleteCustomerList();
			
			
			AdMenu();
		case "4": 
			System.out.println("Thank you Admin, have a nice day!");
			System.exit(0);			
			
		default: System.out.println("Choose a valid number");
		AdMenu();
		}	
		
		}
	
	
}
