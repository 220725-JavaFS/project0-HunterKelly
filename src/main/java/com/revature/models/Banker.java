package com.revature.models;

import java.util.Scanner;

import com.revature.repositories.Queries;

public class Banker extends Account{
	Scanner scan = new Scanner(System.in);
	public int permissions = 1;
		
	
public void BankerMenu() {
		System.out.println("");
		System.out.println("Welcome Banker, please choose a number from the following");		
		System.out.println("1. Print out Customer Records");
		System.out.println("2. Approve or Deny Customer Applications");
		System.out.println("3. View Denied Applications");
		System.out.println("4. Approve All Good Credit Applications.");
		System.out.println("5. Logout");
		System.out.println("");
		String answer = scan.nextLine();
		
		try {
		switch (answer) {		
		
		case "1":
			//sysout query = SELECT PRIMARY KEY(user_name), Name, AccountBalance FROM TABLE Accounts WHERE Permissions == 2;
				Queries ListAll = new Queries();
				ListAll.getCustomerList();
			BankerMenu();
			
			
		case "2": 
						
						
			System.out.println("Type the Customer user name to Approve or Deny.");							
			String CusApp = scan.nextLine();
			
			Queries GetOne = new Queries();
			GetOne.OneAtATime(CusApp);
			
			
			
			System.out.println("Would you like to Approve or Deny " + CusApp + "?");
			String YesNo = scan.nextLine();
			YesNo = YesNo.toLowerCase();
			if(YesNo.equals("y")) {
				
				GetOne.ApproveOne(CusApp);
							
				System.out.println("You have successfully approved the application, the customer may now login.");
				
			}else if(YesNo.equals("n")) {
				//Change UserNames Permissions to 4
				System.out.println("You have successfully denied the application, the customer will be unable to login");
				
			}else {
				System.out.println("You must enter y or n to approve or deny applications.");
				System.out.println("Restart the Application and Relogin to try again.");
				System.exit(0);
			}
			 
			BankerMenu(); //Restarts Menu
			
		case "3": 
			
			//Query to change permission in database of customer from 4 to 2
			BankerMenu();
		case "4":
			
			Queries approveall = new Queries();
			approveall.ApproveAll();			
			System.out.println("All applications with a credit score over 500 have been approved.");
			BankerMenu();
			
			
		case "5": 
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