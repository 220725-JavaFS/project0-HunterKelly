package com.revature.views;


import java.util.Scanner;

import com.revature.models.Admin;
import com.revature.models.Banker;
import com.revature.models.Customer;
import com.revature.repositories.Queries;

import come.revature.controller.CreateAccount;
import come.revature.controller.Login;

//Welcome! Notes: 
//Account permissions levels:
//Admin = 0, Banker = 1, Customers = 2, Applications = 3 , DENIED Applications = 4 (dead accounts)
public class Main {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		Queries app = new Queries();
        
		
		
		
		System.out.println("Welcome to Fakedelity");
		System.out.println("");
		System.out.println("Are you a new customer? Y or N?");
		
		String NewCus = myObj.nextLine();
		NewCus = NewCus.toLowerCase();
		try {
		switch (NewCus) {
		case "y": 
			CreateAccount Theaccount = new CreateAccount();
			Theaccount.CreateTheAccount();
			break; 
			
		case "n":
		Login DotheLogin = new Login();
		DotheLogin.TheLogin();
		}	
		}catch(Exception e) {
			System.out.println("You must type Y or N. Please restart the application.");
			System.exit(0);
		}
		
		
		//Close Scanner, uncomment later.
		//myObj.close();
		
		
		
	}

}
