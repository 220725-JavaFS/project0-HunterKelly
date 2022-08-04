package come.revature.controller;
import java.sql.SQLException;
import java.util.Scanner;

import com.revature.models.Customer;
import com.revature.repositories.Queries;


		
		public class CreateAccount {

		
		Scanner myObj = new Scanner(System.in);
		
		public void CreateTheAccount() {
			
			System.out.println("Welcome new customer! Lets start off by creating a new account.");
			System.out.println("First, we need to collect some basic information\n");
			
			System.out.println("What is your full name?");
			String Name = myObj.nextLine();
			
			System.out.println("Create a Username");
			String UserName = myObj.nextLine();			
			
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
				Queries AddCustomer = new Queries();
				AddCustomer.CustomerAdd(UserName, Password, Name, Email, PhoneNumber, creditscore);
				
			}else if(Credit.equals("n")) {
				Credit = "false";
				boolean creditscore = Boolean.parseBoolean(Credit);
				Queries AddCustomer = new Queries();
				AddCustomer.CustomerAdd(UserName, Password, Name, Email, PhoneNumber, creditscore);
			}	
			
			System.out.println("Thank you for the information, a Banker will approve or deny your application asap.");
			
		
		}
		
	}


