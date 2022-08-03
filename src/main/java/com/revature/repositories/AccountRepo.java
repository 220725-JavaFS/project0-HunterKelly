package com.revature.repositories;

import com.revature.models.Account;

public class AccountRepo {

private static Account[] accounts = new Account[5];
	
	public void Accountadopter(Account account) {
		for(int i=0; i<accounts.length; ++i) {
			if(accounts[i]==null) {
				accounts[i]=account;
				return;
			}
		}
	}
	
	public Account getAccountByName(String name) {
		for(Account a:accounts) {
			if(a.getUserName().equals(name)) {
				return a;
			}
		}
		return null;
	}
}
