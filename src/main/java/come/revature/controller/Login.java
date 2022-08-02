package come.revature.controller;

import java.util.Scanner;

import com.revature.models.Admin;
import com.revature.models.Banker;
import com.revature.models.Customer;

public class Login {
	
	Scanner myObj = new Scanner(System.in);
	Scanner myObj2 = new Scanner(System.in);
	
	public void TheLogin() {
	System.out.println("Please login to continue");		
	System.out.println("Enter Username");
	String userName = myObj.nextLine(); 		
	
	//I want passwords on its own scanner for now to have better isolation/manipulation.
	System.out.println("Enter Password");
	String password = myObj2.nextLine();
	userName = userName.toLowerCase();
	
	//This will be re-done into Database referencing	
	if(userName.equals("admin") && password.equals("password")) {
		Admin admin1 = new Admin(userName, password);
		admin1.AdMenu();
	}
	else if(userName.equals("banker") && password.equals("password")) {
		Banker banker = new Banker(userName, password);
	}
	else if(userName.equals("customer") && password.equals("password")){
		Customer customer = new Customer("Frankie", "Winterbean", password);
		customer.CustMenu();
		
	}
	else {
		System.out.println("Login Failed, please try again.");
		System.exit(0);
	}
}

	
}