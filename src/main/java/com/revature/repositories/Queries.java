package com.revature.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//All of the SQL Database Interaction Methods and Connections are stored here

public class Queries {
	private final String url = "jdbc:postgresql://assoc220725db.cekyyol8wngg.us-east-2.rds.amazonaws.com/postgre";
    private final String user = "postgres";
    private final String password = "bleedorange";

   
    public void getCustomerList() {
    	//SQL COMMAND to get all users with permissions 2 and display to console
    }
    
    public void CustomerAdd(String UserName, String Name, String password, boolean CreditScore) {
    	//INSERT new account into database
    }
    
    public void ApproveAll() {
    	//Change permissions of all applications with true value in credit column; set to 2
    }
    
    public void ApproveOne(String UserName) {
    	//Change Usernames Permissions to 2	
    }
    
    public void OneAtATime(String UserName) {
    	//Query Database for 1 Customer
    }
}
