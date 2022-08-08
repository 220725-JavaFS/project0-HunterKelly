package come.revature.controller;

import java.util.Scanner;

import com.revature.models.AccountObject;

import come.revature.daos.AccountDAO;
import come.revature.daos.AccountDaoImpl;

public class Login {
	int i = 0;
	boolean success = false;	
	Scanner myObj = new Scanner(System.in);
	Scanner myObj2 = new Scanner(System.in);
	AccountDAO aDao = new AccountDaoImpl();
	
	public void TheLogin() {
		System.out.println("Please login to continue");		
		System.out.println("Enter Username");
		String userName ="'"+ myObj.nextLine() + "'"; 		
		
		System.out.println("Enter Password");
		String Password = myObj2.nextLine();		//I want passwords on its own scanner for now to have better isolation/manipulation.
		
		
		 if( userName != null && Password != null) {				
			System.out.println(".....Loading Account Info......");
		
			AccountDAO aDao = new AccountDaoImpl();
			AccountObject account = aDao.getAccountbyUserName(userName);			
			if(account.getPhonenumber()!= null ) {
				Admin admin1 = new Admin();
				admin1.AdMenu();
			}
			
			else if(account.getEmail() != null ) {				
				Banker banker = new Banker();
				banker.BankerMenu();					
				
			}else if(account.getUsername() != null) {				
				Customer customer = new Customer();		
				customer.CustMenu(account.getCustomerID());		
				
			}else{
				if (i<3) {
				System.out.println("Incorrect Username or Password");
				i++;
				TheLogin();				
				}else {
					System.out.println("You have failed 3 times. Bruteforce detected. This program will self destruct immediately");
					System.exit(0);
				}
			}
		}			
	}	
}
	
	
	
	

	
