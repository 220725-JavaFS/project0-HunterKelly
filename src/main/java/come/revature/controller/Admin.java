package come.revature.controller;

import java.util.List;
import java.util.Scanner;

import com.revature.models.AccountObject;
import com.revature.services.AccountService;
import com.revature.services.CreateAccount;
import com.revature.services.Queries;

import come.revature.daos.AccountDAO;
import come.revature.daos.AccountDaoImpl;


public class Admin {
	
	Scanner scan = new Scanner(System.in);			
	private AccountService accountService = new AccountService();
	
	
	
	public void AdMenu() {
		System.out.println("");
		System.out.println("Welcome Admin, please choose a number from the following");		
		System.out.println("1. Print All Customer Accounts");
		System.out.println("2. Create A Customer Account");
		System.out.println("3. Delete A Customer Account");
		System.out.println("4. Login as Banker");
		System.out.println("5. Logout");
		System.out.println("");
		String answer = scan.nextLine();
		switch (answer) {		
		
			case "1":				
				List<AccountObject> list = accountService.AccountsAssemble();
				System.out.println("Here are all of the customer records: ");
				for(AccountObject a:list) {
					System.out.println(a);
				}
				break;
				
				
			
			case "2": 
				CreateAccount Theaccount = new CreateAccount();
				Theaccount.CreateTheAccount();			
				break;
			
			case "3": 			
				System.out.println("Type the Customer ID to Delete.");
				String DeleteThis = scan.nextLine();
				int Deletethis = Integer.parseInt(DeleteThis);
				AccountDAO aDao2 = new AccountDaoImpl();
				AccountObject account2 = aDao2.getAccountById(Deletethis);						
				System.out.println(account2 + " " + "\n has been removed from the database.");
				aDao2.deleteAccount(Deletethis);
				
				break;
			case "4":
				Banker bankerlogin = new Banker();
				bankerlogin.BankerMenu();
				break;
				
			case "5": 
				System.out.println("Thank you Admin, have a nice day!");
				System.exit(0);			
			
			default: 
				System.out.println("Choose a valid number");
				break;
			}	
			AdMenu();
		}
	
	
}
