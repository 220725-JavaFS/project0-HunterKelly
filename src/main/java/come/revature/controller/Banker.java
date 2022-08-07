package come.revature.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.revature.models.AccountObject;
import com.revature.services.AccountService;
import com.revature.services.Queries;

import come.revature.daos.AccountDAO;
import come.revature.daos.AccountDaoImpl;


public class Banker{	
	
	Scanner scan = new Scanner(System.in);		
	private AccountService accountService = new AccountService();
	
	public void BankerMenu() {
		System.out.println("");
		System.out.println("Welcome Banker, please choose a number from the following");		
		System.out.println("1. Print out all Customer Records");
		System.out.println("2. Search Customer Records");
		System.out.println("3. Change Customer Account Type");		
		System.out.println("4. Logout");
		System.out.println("");
		String answer = scan.nextLine();
		
		try {
			switch (answer) {		
		
			case "1":		
				List<AccountObject> list = accountService.AccountsAssemble();
				System.out.println("Here are all of the customer records: ");
				for(AccountObject a:list) {
					System.out.println(a);
				}
				BankerMenu();
				
			case "2": 						
				System.out.println("Type the Customer id to view information.");							
				String CusApp = scan.nextLine();					
				int answerNum = 0;
				try {
					 answerNum = Integer.parseInt(CusApp);
				}catch(NumberFormatException e) {
					System.out.println("That is not a valid id, please try again");						
				}
				AccountDAO aDao = new AccountDaoImpl();
				AccountObject account = aDao.getAccountById(answerNum);
				System.out.println("Here is your customer: \n" + account );				
				BankerMenu(); 	
			
			case "3": 
				
				System.out.println("Type the Customer id of the Customer you wish to change.");							
				String CusApp2 = scan.nextLine();					
				int answerNum2 = 0;
				try {
					 answerNum2 = Integer.parseInt(CusApp2);
				}catch(NumberFormatException e) {
					System.out.println("That is not a valid id, please try again");						
				}
				AccountDAO aDao2 = new AccountDaoImpl();
				AccountObject account2 = aDao2.getAccountById(answerNum2);
				System.out.println("Here is your customer: \n" + account2 );
				
				System.out.println("What type of Account will the Customer change into?");
				System.out.println("1. Checkings");
				System.out.println("2. Savings");
				System.out.println("3. Dogecoin");
				String YesNo = scan.nextLine();
							
				if(YesNo.equals("1")) {			
									//sql prepared statement to change into checking 			
					System.out.println("You have successfully changed the Customers Account into a Checkings Account.");
				
				}else if(YesNo.equals("2")) {					
					System.out.println("You have successfully changed the Customers Account into a Savings Account.");
				
				}else if(YesNo.equals("3")) {					
					System.out.println("You have successfully changed the Customers Account into a Dogecoin Account.");					
					
				}else {
					System.out.println("You must type a number to change Account types..");
					System.out.println("Restart the Application and Relogin to try again.");
					System.exit(0);
				}			 	
							
				BankerMenu();					
										
			case "4": 
				System.out.println("Thank you for using Fakedelity, have a nice day!");
				System.exit(0);						
			
			default: System.out.println("Choose a valid number");
				BankerMenu();
			}			
		
		}catch(Exception e) {
			System.out.println("You must type in a number");
			BankerMenu();
			
		}		
	}
	
	
	
}