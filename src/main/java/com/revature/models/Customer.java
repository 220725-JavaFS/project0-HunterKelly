package com.revature.models;

import java.util.Scanner;

import com.revature.repositories.Queries;
import com.revature.views.Main;

public class Customer extends Account{
	Scanner scan = new Scanner(System.in);
	public int Permissions;
	public String Name;
	public float AccountBalance;
	public boolean Credit;
	double TotalFunds = 0.00;
	
	public int getPermissions() {
		return Permissions;
	}

	public void setPermissions(int Permissions) {
		this.Permissions = Permissions;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	

	public float getAccountBalance() {
		return AccountBalance;
	}

	public void setAccountBalance(float accountBalance) {
		AccountBalance = accountBalance;
	}

	public boolean isCredit() {
		return Credit;
	}

	public void setCredit(boolean credit) {
		Credit = credit;
	}

	public void CustMenu() {
		System.out.println("");		
		System.out.println("Welcome " + Name + ", please choose a number from the following");	
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
			
			Queries CheckBal = new Queries();
			CheckBal.CheckBalance();
									
			CustMenu();
		case 2:
			
			Queries AddMoney = new Queries();			
			double CurrentBalance = AddMoney.CheckBalance();
			
			System.out.println("How many dollars would you like to add?");
			String AddFunds = scan.nextLine();
			double Funds = Integer.parseInt(AddFunds);
			
			TotalFunds = TotalFunds + CurrentBalance;			
			TotalFunds = TotalFunds + Funds;			
			
			AddMoney.AddFunds(TotalFunds);
			
			System.out.println("");
			System.out.println("You have " + TotalFunds + " in your account.");					
			
			CustMenu();
			
		case 3: 
			System.out.println("How many dollars would you like to take out?");
			String SubtractFunds = scan.nextLine();
			int SubFunds = Integer.parseInt(SubtractFunds);	
			if(SubFunds > TotalFunds) {
				System.out.println("You do not have enough Funds for this transaction.");
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