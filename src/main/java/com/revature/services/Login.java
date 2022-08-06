package com.revature.services;

import java.util.Scanner;

import come.revature.controller.Admin;
import come.revature.controller.Banker;
import come.revature.controller.Customer;

public class Login {
	int i = 1;
	boolean CheckUserName = false;
	Queries Login = new Queries();
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
		else if(!CheckUserName) {				
		
			String[] LoginCheck = Queries.Allusername();		
		
			for(int i=0; i<LoginCheck.length; i++) {				
		
				if (userName.equals(LoginCheck[i])) {				
				Customer customer = new Customer();
				customer.CustMenu();
				}
			}
		}		
		else {
				System.out.println("Login Failed, please try again.");
				System.exit(0);
				
			}
		}	
	}
	
	
	
	

	
