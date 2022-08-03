package come.revature.controller;
import java.util.Scanner;


		
		public class CreateAccount {

		
		Scanner myObj = new Scanner(System.in);
		
		public void CreateTheAccount() {
			System.out.println("What is your first name?");
			String FirstName = myObj.nextLine();
			
			System.out.println("What is your last name?");
			String LastName = myObj.nextLine();
			
			System.out.println("Create a password");
			String password = myObj.nextLine();
			
			System.out.println("Do you have a credit score of over 500? Y or N?");
			String Credit = myObj.nextLine();
			
			//Create NEW ACCOUNT WITH DEFAULT PERM OF 3,
			System.out.println("Thank you for the information, a Banker will approve or deny your application");
			
		}
		
	}


