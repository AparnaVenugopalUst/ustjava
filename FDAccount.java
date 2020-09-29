package com.training.ustjava;


public class FDAccount extends Account {  //implements Renewable

	//public int tenure=10;
	//InterestCalculator ic= new InterestCalculator();
	
	public void CalculateInterest(float amount, float duration)
	{
		double rate =0.7;
		double interst= (amount*duration*rate)/100;
		System.out.println("Fixed Accout interst for amount " +amount + " is:" +interst);
	}
	
}

	/*public void updateautoRenewal()
	{

		boolean check = (tenure>5)?true:false;
		System.out.println("FD Account need auto renewal: " +check);

	}*/

	/*public void CalculateInterest()
	{
		this.ic.FixedAccountInterest(30000, 1);
	}

	public void autorenewable(int tenure)
	{
		String maturitydate= "31/10/2020";
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date md= new Date();
		try {
			md = formatter.parse(maturitydate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Date today = Calendar.getInstance().getTime();

		System.out.println(md);
		System.out.println(today);
		boolean check = (tenure>5)?true:false;
		System.out.println("FD Account need auto renewal: " +check);
		if(check && (md.before(today)|| md.equals(today)))
		{
			System.out.println("Auto renewal done");
			
		}
		else
			System.out.println("Auto renewal not done");

	}

}*/
