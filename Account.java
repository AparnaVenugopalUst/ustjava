package com.training.ustjava;


public class Account {

	private int accountnumber;
	private String holdername;
	private float balance=100000;

	public int getaccountnumber() {
		return accountnumber;
	}
	public void setaccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getholdernamee() {
		return holdername;
	}
	public void setholdername(String holdername) {
		this.holdername = holdername;
	}
	
	public void CalculateInterest(String name)
	{
		System.out.println("Hi " +name+ " this is inside Base Class");
	}

}