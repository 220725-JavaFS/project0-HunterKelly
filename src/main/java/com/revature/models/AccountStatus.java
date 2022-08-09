package com.revature.models;

import java.util.Objects;

public class AccountStatus {
	private String email;
	private boolean accountstatus;
	
	
	public AccountStatus(String email, boolean accountstatus) {
		super();
		this.email = email;
		this.accountstatus = accountstatus;
	}	
	
	public AccountStatus() {
		super();	
	}	
	
	public String getEmail() {
		return email;
	}	
	
	public void setEmail(String email) {
		this.email = email;
	}	
	
	public boolean isAccountstatus() {
		return accountstatus;
	}	
	
	public void setAccountstatus(boolean accountstatus) {
		this.accountstatus = accountstatus;
	}	
	
	@Override
	public int hashCode() {
		return Objects.hash(accountstatus, email);
	}	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountStatus other = (AccountStatus) obj;
		return accountstatus == other.accountstatus && Objects.equals(email, other.email);
	}	
	
	@Override
	public String toString() {
		return "AccountStatus [email=" + email + ", accountstatus=" + accountstatus + "]";
	}
}
