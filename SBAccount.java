package com.training.ustjava;

public class SBAccount extends Account {

	public float balance=100000;
	//InterestCalculator ic= new InterestCalculator();
	
	public float getbalance() {
		return balance;
	}
	
	public void CalculateInterest(double amount, int duration, String name)
	{
		double rate =0.4;
		double interst= (amount*duration*rate)/100;
		System.out.println("Hi " +name+ " the Savings Account interst for amount "+amount +" is:" +interst);
	}
	
}
	/*public void withdrawMoney(float amountWithdrawn)
	{
		balance=balance- amountWithdrawn;
		System.out.println("Account balance after withdrawing " +amountWithdrawn + "is :" +balance);
	}
	
	public void CalculateInterest()
	{
		this.ic.SavingsAccountInterest(30000, 1);
	}
*/

