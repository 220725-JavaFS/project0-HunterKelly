package come.revature.controller;

import java.util.Scanner;

import com.revature.services.CreateAccount;
import com.revature.services.Login;
import com.revature.services.Queries;



//Welcome! Notes: 
//Admin login is admin and password
//Banker login is banker and password
//An example customer login is THanks and password

public class Main {
	
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);		
		
		System.out.println("Welcome to Fakedelity");
		System.out.println("");
		System.out.println("1. Login");
		System.out.println("2. Create new account");
		
		String NewCus = myObj.nextLine();
		NewCus = NewCus.toLowerCase();
		
		switch (NewCus) {
		
			case "1": 
				CreateAccount Theaccount = new CreateAccount();
				Theaccount.CreateTheAccount();
				break; 
			
			case "2":
				Login DotheLogin = new Login();
				DotheLogin.TheLogin();
				break;
		
			default:
			System.out.println("You must enter 1 or 2. Restart the Application and try again.");
		}
		//Close Scanner, uncomment later.
		//myObj.close();		
	}

}
