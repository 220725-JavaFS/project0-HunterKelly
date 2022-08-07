package com.revature.models;

import java.util.Objects;

public class PersonalInfo {
	private String accountType;
	private double checkings;
	private double savings;
	private double dogecoin;
	public PersonalInfo(String accountType, double checkings, double savings, double dogecoin) {
		super();
		this.accountType = accountType;
		this.checkings = checkings;
		this.savings = savings;
		this.dogecoin = dogecoin;
	}
	public PersonalInfo() { }
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getCheckings() {
		return checkings;
	}
	public void setCheckings(double checkings) {
		this.checkings = checkings;
	}
	public double getSavings() {
		return savings;
	}
	public void setSavings(double savings) {
		this.savings = savings;
	}
	public double getDogecoin() {
		return dogecoin;
	}
	public void setDogecoin(double dogecoin) {
		this.dogecoin = dogecoin;
	}
	@Override
	public int hashCode() {
		return Objects.hash(accountType, checkings, dogecoin, savings);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonalInfo other = (PersonalInfo) obj;
		return Objects.equals(accountType, other.accountType)
				&& Double.doubleToLongBits(checkings) == Double.doubleToLongBits(other.checkings)
				&& Double.doubleToLongBits(dogecoin) == Double.doubleToLongBits(other.dogecoin)
				&& Double.doubleToLongBits(savings) == Double.doubleToLongBits(other.savings);
	}
	@Override
	public String toString() {
		return "PersonalInfo [accountType=" + accountType + ", checkings=" + checkings + ", savings=" + savings
				+ ", dogecoin=" + dogecoin + "]";
	}
	
	




}