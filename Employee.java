package com.xworkz.methodoverriding;

public class Employee {
	int empid;
	String name;
	double salary;
	public Employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	void getSalary()
	{
		System.out.println("salary:25000.00");
	}
	void attendingMeeting()
	{
		System.out.println(" ");
	}

}



