package com.revature.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



//*******All of the SQL Database Interaction Methods and Connections are stored here******

public class Queries {
	private final String url = "jdbc:postgresql://assoc220725db.cekyyol8wngg.us-east-2.rds.amazonaws.com/postgre";
    private final String user = "postgres";
    private final String password = "bleedorange";
    
        
    
   public static String getFirstName(String UserName){
	   String FirstName = "";
	   // FirstName = Firstname from database where username = UserName
	   return FirstName;
   }
    
   public static String getLastName(String UserName){
	   String LastName = "";
	   // FirstName = Firstname from database where username = UserName
	   return LastName;
   }
    
    //*********Get AllUsernames into Array*******
    public static String[] Allusername() {
    	String[] allUserNames = new String[100];    	
    	//allUserNames[] = Query All UserNames add to AllUserNames array   	
    	return allUserNames;    	    	
    }       
    
  //**********Create an new Account************
    public void CustomerAdd(String UserName, String Password, String FirstName, String LastName, String Email, String PhoneNumber, boolean CreditScore) {
    	//INSERT new account into database
    }    
    
    //***********Admin Queries**********    
    public String[][] PrintCustomerList() {
    	String[][] AllCustomers = new String[100][5];
		//AllCustomers = QUERY ALL Customers with Perm 2 and add to array 
		
		for(int i = 0; i<AllCustomers.length;++i) {
			System.out.println("");
			System.out.println("***********");
			System.out.println("");
			System.out.println(i+". " +AllCustomers[i]);
			System.out.println("---------------");
			
			for(int j = 0; j<AllCustomers[i].length;j++) {
				System.out.println("Details: "+AllCustomers[j]);
			
			}
		}
    	return AllCustomers;
    }
    
    public void DeleteCustomer(String DeleteThis) {
    	//remove username from database
    }
           
    //***********Banker Queries***********
    
    public void ApproveAll() {
    	//Change permissions of all applications with true value in credit column; set to 2
    }
    
    public void ApproveOne(String UserName) {
    	//Change specific Username's Permissions to 2	
    }
    
    public void OneAtATime(String UserName) {
    	//Query Database for 1 Customer and return all values
    }
    
    public String[][] DeadAccounts() {
    	String[][] AllCustomers = new String[100][5];
    	//AllCustomers = Query Database for All accounts with permission 4 and print to console    	
		 	
		for(int i = 0; i<AllCustomers.length;++i) {
			System.out.println("");
			System.out.println("***********");
			System.out.println("");
			System.out.println(i+". " +AllCustomers[i]);
			System.out.println("---------------");
			
			for(int j = 0; j<AllCustomers[i].length;j++) {
				System.out.println("Details: "+AllCustomers[j]);
			
			}
		}
    	return AllCustomers;
    	
    }
        
    //*******Customer Queries**********
    
    public double CheckBalance() {
    	
    	double CurrentBalance = 0.00;    	   	    	    	 
    	//CurrentBalance = Query Database for account balance 
    	
    	return CurrentBalance;
    }
    
    public void AddFunds(double Funds) {
    	
    }
    
    public void SubtractFunds(double SubtractFunds) {
    	
    }
    
    public void ChangePassword(String NewPassword) {
    	
    }
}
