package com.revature.models;



public class PersonalInfo {
	private String Email;
	private String FirstName;
	private String LastName;	
	private String PhoneNumber;
	private double AccountBalance;
	private Boolean Credit;
	
	
	public PersonalInfo(String email, String firstName, String lastName, String phoneNumber, double accountBalance,
			Boolean credit) {
		super();
		this.Email = email;
		this.FirstName = firstName;
		this.LastName = lastName;
		this.PhoneNumber = phoneNumber;
		this.AccountBalance = accountBalance;
		this.Credit = credit;
	}
	public PersonalInfo() { }
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		this.LastName = lastName;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.PhoneNumber = phoneNumber;
	}
	public double getAccountBalance() {
		return AccountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.AccountBalance = accountBalance;
	}
	public Boolean getCredit() {
		return Credit;
	}
	public void setCredit(Boolean credit) {
		this.Credit = credit;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;		
		int a = (int) Math.round(AccountBalance);
		result = prime * result + a; //AccountBalance but as an int for hashcode
		result = prime * result + ((Email == null) ? 0 : Email.hashCode());
		result = prime * result + ((FirstName == null) ? 0 : Email.hashCode());
		result = prime * result + ((LastName == null) ? 0 : Email.hashCode());
		result = prime * result + ((PhoneNumber == null) ? 0 : Email.hashCode());
		result = prime * result + ((Credit == null) ? 0 : Email.hashCode());
		return result;
		
		
		
		
		
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
		if (Email == null) {
			if (other.Email != null)
				return false;
		} else if (!Email.equals(other.Email))
			return false;
		if (FirstName == null) {
			if (other.FirstName != null)
				return false;
		} else if (!FirstName.equals(other.FirstName))
			return false;
		if (LastName == null) {
			if (other.LastName != null)
				return false;
		} else if (!LastName.equals(other.LastName))
			return false;
		if (PhoneNumber == null) {
			if (other.PhoneNumber != null)
				return false;
		} else if (!PhoneNumber.equals(other.PhoneNumber))
			return false;
		if (AccountBalance != other.AccountBalance)
			return false;
		return true;
	}
		
		
		
		
		
	@Override
	public String toString() {
		return "PersonalInfo [Email=" + Email + ", FirstName=" + FirstName + ", LastName=" + LastName + ", PhoneNumber="
				+ PhoneNumber + ", AccountBalance=" + AccountBalance + ", Credit=" + Credit + "]";
	}
	
	
	
	
	
	
}
