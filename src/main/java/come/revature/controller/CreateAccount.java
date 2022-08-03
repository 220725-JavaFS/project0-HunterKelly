package come.revature.controller;
import java.util.Scanner;


		
		public class CreateAccount {

		
		Scanner myObj = new Scanner(System.in);
		
		public void CreateTheAccount() {
			System.out.println("What is your name?");
			String Name = myObj.nextLine();
			
			System.out.println("Type in a Username");
			String UserName = myObj.nextLine();			
			
			
			System.out.println("Create a password");
			String password = myObj.nextLine();
			
			System.out.println("Do you have a credit score of over 500? Y or N?");
			String Credit = myObj.nextLine();
			Credit = Credit.toLowerCase();			
					
		
			if(Credit.equals("y")) {
				Credit = "true";
				boolean creditscore = Boolean.parseBoolean(Credit);
				
				try {
					//INSERT INTO TABLE Account (UserName, Name, CREDIT TRUE, AccountBalance)
				}catch(Exception e) {
					System.out.println("That Username is already taken");
				}
				
			} else if(Credit.equals("n")) {
				Credit = "false";
				boolean creditscore = Boolean.parseBoolean(Credit);
				try {
					//INSERT INTO Account TABLE(firstname, lastname, CREDIT FALSE)
				}catch(Exception e) {
					System.out.println("That Username is already taken");
				}
			}			
						
			System.out.println("Thank you for the information, a Banker will approve or deny your application asap.");
			
		
		}
		
	}


