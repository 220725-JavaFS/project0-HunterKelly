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
	String Password = myObj2.nextLine();	
	try {
	//String UserName = set username in database to this variable
	//String ThePassword = set password in database to this variable
		
		
	if(userName.equals("admin") && Password.equals("password")) {
		Admin admin1 = new Admin();
		admin1.AdMenu();
	}
	else if(userName.equals("banker") && Password.equals("password")) {
		Banker banker = new Banker();
		banker.BankerMenu();
	}
	else if(userName.equals(UserName) && Password.equals(ThePassword)){
		Customer customer = new Customer();
		customer.CustMenu();
		
	}
	else {
		System.out.println("Login Failed, please try again.");
		System.exit(0);
	}
	}catch(Exception e) {
		System.out.println("Invalid Username");
	}
}

	
}