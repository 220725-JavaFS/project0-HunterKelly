package com.revature.views;
import java.util.Scanner;

import com.revature.models.Admin;
import com.revature.models.Banker;
import com.revature.models.Customer;

public class Main {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		Scanner myObj2 = new Scanner(System.in);
		
		
		
		System.out.println("Welcome to Fakedelity");
		System.out.println("Please login to continue");
		
		System.out.println("Enter Username");
		String userName = myObj.nextLine(); 
		
		
		//I want passwords on its own scanner for now to have better isolation/manipulation.
		System.out.println("Enter Password");
		String password = myObj2.nextLine();
		userName = userName.toLowerCase();
		
		int permission = 3;//placeholder variable delete later!
		
		if(userName.equals("admin") && password.equals("password")) {
			Admin admin1 = new Admin(userName, password);
		}
		else if(userName.equals("banker") && password.equals("password")) {
			Banker banker = new Banker(userName, password);
		}
		else if(userName.equals("customer") && password.equals("password")){
			Customer customer = new Customer("Frankie", "Winterbean", password);
		}
		else {
			System.out.println("Login Failed, please try again.");
			System.exit(0);
		}
		System.out.println("Welcome " + userName);
		
		
		
		
		
		
		//Pseudo code:
		//check username and password(&&) against database
		// run class of permission level 0 = Admin, 1 = Banker, 2 = Customer
		if (permission == 0) {
			//execute admin method/class
			//create admin object
		}
		else if (permission == 1) {
			//execute Banker class/method
			//create Banker Object
		}
		else if (permission == 2) {
			//execute Customer class/method
			//create Customer Object
		}
		
		myObj.close();
		myObj2.close();
	}

}
