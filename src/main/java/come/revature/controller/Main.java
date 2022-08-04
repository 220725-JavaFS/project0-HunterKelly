package come.revature.controller;

import java.util.Scanner;
import com.revature.repositories.Queries;
import com.revature.services.CreateAccount;
import com.revature.services.Login;



//Welcome! Notes: 
//Account permissions levels:
//Admin = 0, Banker = 1, Customers = 2, Applications = 3 , DENIED Applications = 4 (dead accounts)
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
				break; 
			
			case "n":
				Login DotheLogin = new Login();
				DotheLogin.TheLogin();
		
			default:
			System.out.println("You must enter Y or N. Restart the Application and try again.");
		}
		//Close Scanner, uncomment later.
		//myObj.close();		
	}

}
