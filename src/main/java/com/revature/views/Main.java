package com.revature.views;


import java.util.Scanner;

import com.revature.models.Admin;
import com.revature.models.Banker;
import com.revature.models.Customer;

import come.revature.controller.CreateAccount;
import come.revature.controller.Login;


public class Main {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		
		
		
		System.out.println("Welcome to Fakedelity");
		System.out.println("");
		System.out.println("Are you a new customer? Y or N?");
		
		String NewCus = myObj.nextLine();
		NewCus = NewCus.toLowerCase();
		
		switch (NewCus) {
		case "y": 
			CreateAccount Theaccount = new CreateAccount();
			Theaccount.CreateTheAccount();
			//break; commenting this out to allow the next case to activate
			
		case "n":
		Login DotheLogin = new Login();
		DotheLogin.TheLogin();
				
		}		
		//Close Scanner, uncomment later.
		//myObj.close();
		
		
		
	}

}
