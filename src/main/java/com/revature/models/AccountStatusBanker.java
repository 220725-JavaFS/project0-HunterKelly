package com.revature.models;

import java.util.Objects;

public class AccountStatusBanker {
	
String phonenumber;
boolean isBanker;


public AccountStatusBanker(String phonenumber, boolean isBanker) {
	super();
	this.phonenumber = phonenumber;
	this.isBanker = isBanker;
}
public AccountStatusBanker() {
	super();	
}
public String getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}
public boolean isBanker() {
	return isBanker;
}
public void setBanker(boolean isBanker) {
	this.isBanker = isBanker;
}
@Override
public int hashCode() {
	return Objects.hash(isBanker, phonenumber);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	AccountStatusBanker other = (AccountStatusBanker) obj;
	return isBanker == other.isBanker && Objects.equals(phonenumber, other.phonenumber);
}
@Override
public String toString() {
	return "AccountStatusBanker [phonenumber=" + phonenumber + ", isBanker=" + isBanker + "]";
}






}
