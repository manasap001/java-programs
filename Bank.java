package com.xworkz.methodoverriding;

public class Bank {
	String name;
	String type;
	String address;
	public Bank(String name, String type, String address) {
		super();
		this.name = name;
		this.type = type;
		this.address=address;
	}
	void getrateOfIntrest()
	{
		System.out.println("rate of intrest is:5%");
	}
	void getMinimumBalance()
	{
		System.out.println("minimum balance is of:5000");
	}

}


