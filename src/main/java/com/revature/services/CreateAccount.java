package com.revature.services;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.revature.models.AccountObject;
import com.revature.models.PersonalInfo;

import come.revature.controller.Customer;
import come.revature.daos.AccountDAO;
import come.revature.daos.AccountDaoImpl;


		
		public class CreateAccount {
		
		Scanner myObj = new Scanner(System.in);
		private AccountService accountService = new AccountService();		
		public void CreateTheAccount() {
			
			System.out.println("Welcome new customer! Lets start off by creating a new account.");
			System.out.println("First, we need to collect some basic information.\n");
			AccountObject accountObject = new AccountObject();
			
			
			
			System.out.println("Create a Username");
			accountObject.setUsername(myObj.nextLine());
			
			System.out.println("Create a password");
			accountObject.setPassword(myObj.nextLine());			
			
			accountObject.setPersonalInfo(new PersonalInfo());
			System.out.println("What is your first name?");	
			accountObject.setFirstname(myObj.nextLine());
			//accountObject.getPersonalInfo().setFirstName(answer);
			//personalInfo.setFirstName(answer);
			
			System.out.println("What is your last name?");			 			
			accountObject.setLastname(myObj.nextLine());
			
			System.out.println("How much would you like to deposit into your new account?");
			accountObject.setAccountbalance(Double.parseDouble(myObj.nextLine()));
					
					
			
			System.out.println("What kind of account would you like to open? ");
			System.out.println("1. Checking: 1.5% growth");
			System.out.println("2. Savings: 2% growth");
			System.out.println("3. Dogecoin Investment Account: 5% growth");
			
			String answer = myObj.nextLine();
			int answerNum = Integer.parseInt(answer);
					
				switch (answerNum) {
				case 1:
					answer = "checkings";
					accountObject.setPersonalInfo(new PersonalInfo());
					accountObject.getPersonalInfo().setAccountType(answer);
					break;
				case 2:
					answer = "savings";
					accountObject.setPersonalInfo(new PersonalInfo());
					accountObject.getPersonalInfo().setAccountType(answer);
					break;
				case 3: 
					answer = "dogecoin";
					accountObject.setPersonalInfo(new PersonalInfo());
					accountObject.getPersonalInfo().setAccountType(answer);
					break;
				}
										
				
			System.out.println("Thank you for the information, a Banker will approve or deny your application asap.");			
			
			accountService.recruitCustomer(accountObject);			
			
		
		}
		
	}


