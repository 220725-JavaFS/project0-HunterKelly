package com.revature.services;

import java.util.Objects;

public class MoneyInfo {
	boolean Credit;
	double AccountBalance;
	
	public MoneyInfo(boolean credit, double accountBalance) {
		super();
		Credit = credit;
		AccountBalance = accountBalance;
	}

	public MoneyInfo() {
		super();		
	}

	public boolean isCredit() {
		return Credit;
	}

	public void setCredit(boolean credit) {
		Credit = credit;
	}

	public double getAccountBalance() {
		return AccountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		AccountBalance = accountBalance;
	}

	@Override
	public int hashCode() {
		return Objects.hash(AccountBalance, Credit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MoneyInfo other = (MoneyInfo) obj;
		return Double.doubleToLongBits(AccountBalance) == Double.doubleToLongBits(other.AccountBalance)
				&& Credit == other.Credit;
	}

	@Override
	public String toString() {
		return "MoneyInfo [Credit=" + Credit + ", AccountBalance=" + AccountBalance + "]";
	}
	
	
	
}
