package com.revature.services;

import java.util.Scanner;

import come.revature.controller.Admin;
import come.revature.controller.Banker;
import come.revature.controller.Customer;

public class Login {
	int i = 1;
	boolean CheckUserName = false;	
	Scanner myObj = new Scanner(System.in);
	Scanner myObj2 = new Scanner(System.in);
	
	public void TheLogin() {
		System.out.println("Please login to continue");		
		System.out.println("Enter Username");
		String userName = myObj.nextLine(); 
		
	
		//I want passwords on its own scanner for now to have better isolation/manipulation.
		System.out.println("Enter Password");
		String Password = myObj2.nextLine();		
		
		if(userName.equals("admin") && Password.equals("password")) {
			Admin admin1 = new Admin();
			admin1.AdMenu();
		}
		else if(userName.equals("banker") && Password.equals("password")) {
		Banker banker = new Banker();
		banker.BankerMenu();
		}
		else if( userName != "admin") {				
		System.out.println("CustomerLogin enabled");
			//checks username against database then creates Customer Menu if success;		
		
		 //if not success then login failed system exit
		//System.out.println("Login Failed, please try again.");
		//System.exit(0);
		}		
		
		}	
	}
	
	
	
	

	
