package com.revature.models;

import java.util.Scanner;

public class Banker extends Account{
	Scanner scan = new Scanner(System.in);
	public int permissions = 1;
		
	
public void BankerMenu() {
		System.out.println("");
		System.out.println("Welcome Banker, please choose a number from the following");		
		System.out.println("1. Print out Customer Records");
		System.out.println("2. Approve or Deny Customer Applications");
		System.out.println("3. View Denied Applications");
		System.out.println("4. Logout");
		System.out.println("");
		String answer = scan.nextLine();
		
		try {
		switch (answer) {		
		
		case "1":
			//sysout query = SELECT PRIMARY KEY(user_name), Name, AccountBalance FROM TABLE Accounts WHERE Permissions == 2;
									
			BankerMenu();
			
			
		case "2": 
						
			//sysout query  = SELECT Primary Key(UserName),Name, Credit FROM TABLE Accounts 
			//				  			WHERE Permissions == 3;
			
			System.out.println("Type the Customer user name to Approve or Deny.");
							
			String CusApp = scan.nextLine();
			//String SelectedCustomer = SELECT Name FROM TABLE Accounts WHERE username.equals(CusApp); 			
			//System.out.println("Would you like to Approve or Deny " + SelectedCustomer + "? Y or N.");
			
			String YesNo = scan.nextLine();
			YesNo = YesNo.toLowerCase();
			if(YesNo.equals("y")) {
				//UPDATE Permissions = 2 FROM TABLE Accounts WHERE username = SelectedCustomer				
				System.out.println("You have successfully approved the application, the customer may now login.");
				
			}else if(YesNo.equals("n")) {
				//UPDATE Permissions = 4 FROM TABLE Accounts WHERE username = SelectedCustomer
				System.out.println("You have successfully denied the application, the customer will be unable to login");
				
			}else {
				System.out.println("You must enter y or n to approve or deny applications.");
				System.out.println("Restart the Application and Relogin to try again.");
				System.exit(0);
			}
			 
			BankerMenu(); //Restarts Menu
			
		case "3": 
			//create array of all customers with permission level 4
			//String SeeAll = SELECT PRIMARY KEY, FirstName, LastName, Account Balance FROM TABLE Accounts 
			//				  WHERE Permissions == 2;
			
			//print array of arrays
			//option to change permission in database of customer from 4 to 2
			BankerMenu();
				
		case "4": 
			System.out.println("Thank you for using Fakedelity, have a nice day!");
			System.exit(0);
						
			
		default: System.out.println("Choose a valid number");
		BankerMenu();
	}			
		
	}
		catch(Exception e) {
			System.out.println("You must type in a number");
			BankerMenu();
			
		}

		
		
	}
}