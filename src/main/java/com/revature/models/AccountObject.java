package com.revature.models;

import java.util.Objects;

import com.revature.services.CustomerInfo;
import com.revature.services.MoneyInfo;

public class AccountObject {
	private String username;
	private String password;	
	private int permissions;
	private CustomerInfo AllCustomerInfo;
	private MoneyInfo AllMoneyInfo;
	
	
	


	public AccountObject(String username, String password, int permissions, CustomerInfo allCustomerInfo,
			MoneyInfo allMoneyInfo) {
		super();
		this.username = username;
		this.password = password;
		this.permissions = permissions;
		AllCustomerInfo = allCustomerInfo;
		AllMoneyInfo = allMoneyInfo;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public int getPermissions() {
		return permissions;
	}


	public void setPermissions(int permissions) {
		this.permissions = permissions;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public CustomerInfo getAllCustomerInfo() {
		return AllCustomerInfo;
	}


	public void setAllCustomerInfo(CustomerInfo allCustomerInfo) {
		AllCustomerInfo = allCustomerInfo;
	}


	public MoneyInfo getAllMoneyInfo() {
		return AllMoneyInfo;
	}


	public void setAllMoneyInfo(MoneyInfo allMoneyInfo) {
		AllMoneyInfo = allMoneyInfo;
	}


	public AccountObject() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public int hashCode() {
		return Objects.hash(AllCustomerInfo, AllMoneyInfo, password, username);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountObject other = (AccountObject) obj;
		return Objects.equals(AllCustomerInfo, other.AllCustomerInfo)
				&& Objects.equals(AllMoneyInfo, other.AllMoneyInfo) && Objects.equals(password, other.password)
				&& Objects.equals(username, other.username);
	}


	@Override
	public String toString() {
		return "AccountObject [username=" + username + ", password=" + password + ", AllCustomerInfo=" + AllCustomerInfo
				+ ", AllMoneyInfo=" + AllMoneyInfo + "]";
	}
		
	
	
}
