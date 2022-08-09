package come.revature.controller;


import java.util.Scanner;

import com.revature.models.AccountObject;
import com.revature.models.PersonalInfo;
import com.revature.services.AccountService;
		
public class CreateAccount {
		
	private Scanner myObj = new Scanner(System.in);
	private AccountService accountService = new AccountService();
	private AccountObject accountObject = new AccountObject();	
	
	public void CreateTheAccount() {			
		
		System.out.println("Welcome new customer! Lets start off by creating a new account.");
		System.out.println("First, we need to collect some basic information.\n");				
		
		System.out.println("Create a Username");
		accountObject.setUsername(myObj.nextLine());
		
		System.out.println("Create a password");
		accountObject.setPassword(myObj.nextLine());		
		
		System.out.println("What is your first name?");	
		accountObject.setFirstname(myObj.nextLine());			
		
		System.out.println("What is your last name?");			 			
		accountObject.setLastname(myObj.nextLine());
		
		System.out.println("How much would you like to deposit into your new account?");
		accountObject.setAccountbalance(Double.parseDouble(myObj.nextLine()));			
		
		System.out.println("What kind of account would you like to open? ");
		System.out.println("1. Checking: 1.5% growth");
		System.out.println("2. Savings: 2% growth");
		System.out.println("3. Dogecoin Investment Account: 5% growth(probably)");
		
		String answer = myObj.nextLine();
		int answerNum = Integer.parseInt(answer);
				
		switch (answerNum) {
			case 1:
				answer = "checkings";
				accountObject.setPersonalInfo(new PersonalInfo());
				accountObject.getPersonalInfo().setAccountType(answer);
				System.out.println("You will gain 1.5% interest annually.");
				break;
				
			case 2:
				answer = "savings";
				accountObject.setPersonalInfo(new PersonalInfo());
				accountObject.getPersonalInfo().setAccountType(answer);
				System.out.println("You will gain 2% interest annually.");
				break;
				
			case 3: 
				answer = "dogecoin";
				accountObject.setPersonalInfo(new PersonalInfo());
				accountObject.getPersonalInfo().setAccountType(answer);
				System.out.println("You will gain 5% interest annually. DISCLAIMER: YOU MAY OR MAY NOT LOSE ALL YOUR MONEY!");
				break;
				
			default: 
				System.out.println("You must type 1, 2, or 3, to select an account type. Restarting Account Creation.");
				CreateTheAccount();
		}							
		System.out.println("Thank you for the information, you may now login to your new account!");			
		accountService.recruitCustomer(accountObject);			
		Login login = new Login();
		login.TheLogin();
	
	}
	
}


