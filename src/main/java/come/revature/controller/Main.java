package come.revature.controller;

import java.util.Scanner;

//Welcome! Notes: 
//Admin login is Admin and password
//Banker login is Banker and password
//An example customer login is HKelly and password

public class Main {
	
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);			
		System.out.println("*************************************");
		System.out.println("");
		System.out.println("Welcome to Fakedelity");
		System.out.println("");
		System.out.println("1. Login");
		System.out.println("2. Create a new bankaccount and login");
		System.out.println("");
		System.out.println("*************************************");
		String NewCus = myObj.nextLine();		
		switch (NewCus) {		
			case "1": 
				Login DotheLogin = new Login();
				DotheLogin.TheLogin();
				break;
			
			case "2":
				CreateAccount Theaccount = new CreateAccount();
				Theaccount.CreateTheAccount();
				break;				
		
			default:
			System.out.println("You must enter 1 or 2. Restart the Application and try again.");
			System.exit(0);
		}
		//Close Scanner, uncomment later.
		myObj.close();		
	}

}
