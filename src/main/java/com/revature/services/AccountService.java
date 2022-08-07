package com.revature.services;

import java.util.List;

import com.revature.models.AccountObject;
import com.revature.models.PersonalInfo;

import come.revature.daos.AccountDAO;
import come.revature.daos.AccountDaoImpl;

public class AccountService {
	
	private AccountDAO accountDao = new AccountDaoImpl();
	
	public AccountObject getSingleAccount(int id) {		
		return accountDao.getAccountById(id);
		
	}
	public List<AccountObject> AccountsAssemble(){
		return accountDao.getAllAccounts();
	}
	
	public void recruitCustomer(AccountObject account) {
		accountDao.insertAccount(account);
	}
}
