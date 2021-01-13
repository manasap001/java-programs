package com.xworkz.methodoverriding;

public class StateBankOfIndia extends Bank{
	String loan;
	public StateBankOfIndia(String name,String type,String address)
	{
		super(name,type,address);
		this.loan=loan;
	
		
	}
	void getRateOfIntrest()
	{
		System.out.println("rate of intrest is:6");
		
	}
	void getMinimuBalance()
	{
		System.out.println("minimum balance is of:6000");
	}

}

