package com.revature.services;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.revature.models.AccountObject;

import come.revature.controller.Customer;
import come.revature.daos.AccountDAO;
import come.revature.daos.AccountDaoImpl;


		
		public class CreateAccount {
		
		Scanner myObj = new Scanner(System.in);
//		CustomerInfo customerInfo = new CustomerInfo();
//		MoneyInfo moneyInfo = new MoneyInfo();
		AccountObject accountObject = new AccountObject();
		public void CreateTheAccount() {
			
			System.out.println("Welcome new customer! Lets start off by creating a new account.");
			System.out.println("First, we need to collect some basic information.\n");
			
			System.out.println("What is your first name?");			
			//customerInfo.setFirstName(myObj.nextLine());
			
			System.out.println("What is your last name?");
			//customerInfo.setLastName(myObj.nextLine());
			
			System.out.println("Create a Username");
			String NewUserName = myObj.nextLine();
			//customerInfo.setUserName(NewUserName);		
			//moneyInfo.setUserName(NewUserName);	
			accountObject.setUsername(NewUserName);
			
			//*********Check Database for Username duplicates**********
			//AccountDAO aDao = new AccountDaoImpl();
			//List<AccountObject> list = aDao.getAllAccounts();
			//AccountObject AllUserName = aDao.getAccountByName("user_name");
					
			//Loop to check list for duplicates
//			for(int i=0; i<AllUserName.length; i++) {				
//			
//				if (UserName.equals(AllUserName[i])) {
//					System.out.println("That username is already taken. Try a different Username.");
//					System.exit(0);
//				}
//			}				
			//***********************************************************
			System.out.println("What is your email address?");
			String Email = myObj.nextLine();
			
			System.out.println("What is your phone number?");
			String PhoneNumber = myObj.nextLine();
			
			System.out.println("Create a password");
			String Password = myObj.nextLine();
			
			System.out.println("Do you have a credit score of over 500? Y or N?");
			String Credit = myObj.nextLine();
			Credit = Credit.toLowerCase();			
					
		
			if(Credit.equals("y")) {
				Credit = "true";
				boolean creditscore = Boolean.parseBoolean(Credit);					
				
			}else if(Credit.equals("n")) {
				Credit = "false";
				boolean creditscore = Boolean.parseBoolean(Credit);					
			}	
			else {
				System.out.println("You must enter Y or N to finish application. Please try again.");
				System.exit(0);
			}
			
			//CALL INSERT CONNECTION METHOD
			System.out.println("Thank you for the information, a Banker will approve or deny your application asap.");
			
		
		}
		
	}


