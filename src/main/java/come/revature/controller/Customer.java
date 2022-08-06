package come.revature.controller;

import java.util.Scanner;

import com.revature.models.AccountObject;
import com.revature.services.AccountService;
import com.revature.services.Queries;

public class Customer {
	Scanner scan = new Scanner(System.in);
	public int Permissions;
	public String FirstName;
	public String LastName;
	public float AccountBalance;
	public boolean Credit;
	double TotalFunds = 0.00;
	Queries CustomerQueries = new Queries();	
	private AccountService accountService = new AccountService();
	

	public void CustMenu() {
		System.out.println("");		
		System.out.println("Welcome " + FirstName + ", please choose a number from the following");	
		System.out.println("1. Check Account Balance");
		System.out.println("2. Add funds to account");
		System.out.println("3. Withdraw funds");
		System.out.println("4. Change password");
		System.out.println("5. Logout");
		System.out.println("");
		String answer = scan.nextLine();		
		int answerNum = Integer.parseInt(answer);
		
			try {
				switch (answerNum) {		
					case 1:									
						CustomerQueries.CheckBalance();									
						CustMenu();
						
					case 2:										
			
						System.out.println("How much money would you like to add?");
						String AddFunds = scan.nextLine();
						double Funds = Integer.parseInt(AddFunds);											
						CustomerQueries.AddFunds(Funds);										
						CustMenu();
			
					case 3: 
						System.out.println("How many dollars would you like to take out?");
						String SubtractFunds = scan.nextLine();
						int SubFunds = Integer.parseInt(SubtractFunds);	
						
						if(SubFunds > TotalFunds) {
							System.out.println("You do not have enough Funds for this transaction.");
							
							CustMenu();
						}else {
							TotalFunds = TotalFunds - SubFunds;
							System.out.println("");
							System.out.println("You have " + TotalFunds + " in your account.");
			
							//subtract funds from "money" column.
			
							CustMenu();
						}
						
					case 4:			
						System.out.println("Enter new password");
						String newPassword = scan.nextLine();
			
						//Update password FROM TABLE accounts == newPassword;
			
					case 5:			
						System.out.println("Thank you for using Fakedelity, have a nice day!");
						System.exit(0);
			
					default: 
						System.out.println("Choose a valid number");
						CustMenu();
				}	
			}catch(Exception e) {
				System.out.println("You must type in a number");
				CustMenu();
			}
	}
	
	

	
	
	
	
}