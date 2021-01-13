package com.xworkz.methodoverriding;

public class Developer extends Employee {
	int workingHours;

	public Developer(int empid,String name,Double salary)
	{
		super(empid,name,salary);
		this. workingHours= workingHours;
	
		
	}
	void getSalary()
	{
		System.out.println("salary:25000.00");
		
	}
	void attendingMeeting()
	{
		System.out.println("------");
	}

}


