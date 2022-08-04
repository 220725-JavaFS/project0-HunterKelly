package come.revature.controller;

import java.util.Scanner;

import com.revature.models.Admin;
import com.revature.models.Banker;
import com.revature.models.Customer;
import com.revature.repositories.Queries;

public class Login {
	int i = 1;
	Scanner myObj = new Scanner(System.in);
	Scanner myObj2 = new Scanner(System.in);
	
	public void TheLogin() {
	System.out.println("Please login to continue");		
	System.out.println("Enter Username");
	String userName = myObj.nextLine(); 		
	
	//I want passwords on its own scanner for now to have better isolation/manipulation.
	System.out.println("Enter Password");
	String Password = myObj2.nextLine();		
		
	if(userName.equals("admin") && Password.equals("password")) {
		Admin admin1 = new Admin();
		admin1.AdMenu();
	}
	else if(userName.equals("banker") && Password.equals("password")) {
		Banker banker = new Banker();
		banker.BankerMenu();
	}
	else { try {
		Queries Login = new Queries();
		Login.Login(userName, Password);
		
		Customer customer = new Customer();
		customer.CustMenu();
		
		//IF Login Fails 3 times, Program Exits
		
	}catch(Exception e) {
		System.out.println("Login Failed, please try again.");
		i= i++;
		if(i < 4) {
		TheLogin();
		}else {
			System.exit(0);
		}
	}
	}
	
	//else {
		//
		//System.exit(0);
	//}
	
}
}
	
