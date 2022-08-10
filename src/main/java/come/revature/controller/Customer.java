package come.revature.controller;

import java.util.Scanner;

import com.revature.models.AccountObject;

import come.revature.daos.AccountDAO;
import come.revature.daos.AccountDaoImpl;

public class Customer {
	Scanner scan = new Scanner(System.in);		

	public void CustMenu(int id) {
		int CusID = id;
		AccountDAO aDao = new AccountDaoImpl();
		AccountObject account = aDao.getAccountById(id);
		
		System.out.println("");		
		System.out.println("Welcome " + account.getFirstname() + ", please choose a number from the following");	
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
					double accountbalance = account.getAccountbalance();	
					System.out.println("******************************************");
					System.out.println("");
					System.out.println("*  You have $" + accountbalance + " in your account. *");
					System.out.println("");
					System.out.println("******************************************");
					break;
						
				case 2:			
					System.out.println("How much money would you like to add?");
					String AddFunds = scan.nextLine();
					try{
						double Funds = Double.parseDouble(AddFunds);
						if (Funds <0) {
							System.out.println("You must enter a positive number");
							break;
						}
						double accountbalance2 = account.getAccountbalance();
						accountbalance2 = accountbalance2 + Funds;
						aDao.updateAccountBalance(accountbalance2, CusID);
						
						System.out.println("******************************************");
						System.out.println("");
						System.out.println("*  You now have $" + accountbalance2 + " in your account. *");
						System.out.println("");
						System.out.println("******************************************");
					}catch (Exception e) {
						System.out.println("Invalid number, you must enter numbers only");
						break;
					}
					break;								
		
				case 3: 
					System.out.println("How many dollars would you like to take out?");
					String SubtractFunds = scan.nextLine();
					
					try{
						double Funds2 = Double.parseDouble(SubtractFunds);	
						double accountbalance3 = account.getAccountbalance();							
						
						if(Funds2 > accountbalance3){
							System.out.println("You do not have enough Funds for this transaction.");							
							
						}else{
							accountbalance3 = accountbalance3 - Funds2;
							aDao.updateAccountBalance(accountbalance3, CusID);
							AccountObject account22 = aDao.getAccountById(id);
							System.out.println("******************************************");
							System.out.println("");
							System.out.println("*  You now have $" + account22.getAccountbalance() + " in your account. *");
							System.out.println("");
							System.out.println("******************************************");								
						}
					}catch(Exception e) {
						System.out.println("Invalid number, you must enter numbers only");
						break;
					}
					break;
					
				case 4:			
					System.out.println("Enter new password");
					String newPassword = "'"+scan.nextLine()+"'";
					
					aDao.updatePassword(newPassword, CusID);
					break;
					
				case 5:			
					System.out.println("Thank you for using Fakedelity, have a nice day!");
					Login login = new Login();
					login.TheLogin();
		
				default: 
					System.out.println("Choose a valid number");
					break;
			}	
			CustMenu(CusID);
		}catch(Exception e) {
				System.out.println("You must type in a number");
				CustMenu(CusID);
		}
	}	
}



