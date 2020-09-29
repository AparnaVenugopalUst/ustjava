package com.training.account;

import com.training.ustjava.*;

public class Withdrawal {

	public static void main(String args[]){
		Account account =new Account();
		account.CalculateInterest("Aparna");

		SBAccount sb= new SBAccount();
		//sb.withdrawMoney(5000);
		sb.CalculateInterest(50000,1, "Aparna");

		FDAccount fd= new FDAccount();
		//fd.updateautoRenewal();
		fd.CalculateInterest(10000,1);
		
		/*CurrentAccount ca= new CurrentAccount();
		ca.CheckOverDraft();
		
		LoanAccount la= new LoanAccount();
		la.CalculateEmi(200000);*/
	

	}

} 


