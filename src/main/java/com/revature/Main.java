package com.revature;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Welcome to Fakedelity");
		System.out.println("Please login to continue");
		
		System.out.println("Enter Username");
		String userName = myObj.nextLine(); //Reads user input
		
		System.out.println("Enter Password");
		String password = myObj.nextLine();
		
		int permission = 3;//placeholder variable
		
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
	}

}
