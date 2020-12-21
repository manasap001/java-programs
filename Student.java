package com.xworkz.staticvariablemethodblock;

public class Student {
	String name;
	int age;
     int usn;
	String branch;
	static String university;
	Student()
	{
		System.out.println("no arg constructor");
		
	}
	Student(String inName,int inAge,int inUSN,String inBranch)
	{
		name=inName;
		age=inAge;
		usn=inUSN;
		branch=inBranch;
		}
	static void setuniversity(String University)
	{
		university="VTU";
	}
	void displayInformation()
	{
		System.out.println("name="+name+"age="+age+"branch="+branch+"university="+university);
	}

}
