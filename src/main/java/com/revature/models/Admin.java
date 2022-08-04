package com.revature.models;

import java.util.Scanner;

import com.revature.repositories.Queries;
import com.revature.services.CreateAccount;
import com.revature.services.ShowAllCustomers;

public class Admin extends Account{
	Scanner scan = new Scanner(System.in);
	
	Queries AdminQueries = new Queries();	
	
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
				AdminQueries.PrintCustomerList();				
				AdMenu();
			
			case "2": 
				CreateAccount Theaccount = new CreateAccount();
				Theaccount.CreateTheAccount();			
				AdMenu();
			
			case "3": 			
				System.out.println("Type the Customer user name to Delete.");
				String DeleteThis = scan.nextLine();
				String FirstName = AdminQueries.getFirstName(DeleteThis);
				String LastName = AdminQueries.getLastName(DeleteThis);
				AdminQueries.DeleteCustomer(DeleteThis);
				System.out.println(FirstName + " " + LastName + "has been removed from the database.");
				AdMenu();
				
			case "4": 
				System.out.println("Thank you Admin, have a nice day!");
				System.exit(0);			
			
			default: 
				System.out.println("Choose a valid number");
				AdMenu();
			}	
		
		}
	
	
}
