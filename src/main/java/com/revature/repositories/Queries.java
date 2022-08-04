package com.revature.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//*******All of the SQL Database Interaction Methods and Connections are stored here******

public class Queries {
	private final String url = "jdbc:postgresql://assoc220725db.cekyyol8wngg.us-east-2.rds.amazonaws.com/postgre";
    private final String user = "postgres";
    private final String password = "bleedorange";

        
    
   //**********Create an new Account************
    public void CustomerAdd(String UserName, String Password, String Name, String Email, String PhoneNumber, boolean CreditScore) {
    	//INSERT new account into database
    }
    
    public static String[] username() {
    	String[] allUserNames = new String[100];
    	
    	//Query All UserNames add to AllUserNames array   	
    	
    	return allUserNames;
    	
    }
    
  //*********Login***********
    public void Login(String UserName, String password) {
    	
    }
    
    
    //***********Admin/Banker Queries**********
    
    public void getCustomerList() {
    	//Query database to get all users with permissions 2 and display to console
    }
       
    
    //***********Banker Only Queries***********
    
    public void ApproveAll() {
    	//Change permissions of all applications with true value in credit column; set to 2
    }
    
    public void ApproveOne(String UserName) {
    	//Change Usernames Permissions to 2	
    }
    
    public void OneAtATime(String UserName) {
    	//Query Database for 1 Customer
    }
    
    public void DeadAccounts() {
    	//Query Database for All accounts with permission 4 and display to console
    }
    
    
    //*******Customer Queries**********
    
    public double CheckBalance() {
    	//Query Database for account balance
    	double CurrentBalance = 0.00;
    	
    	
    	
    	
    	return CurrentBalance;
    }
    
    public void AddFunds(double Funds) {
    	
    }
    
    public void SubtractFunds(double SubtractFunds) {
    	
    }
    
    public void ChangePassword(String NewPassword) {
    	
    }
}
