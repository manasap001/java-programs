package com.xworkz.staticvariablemethodblock;

public class StudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1=new Student("manasa",23,100,"cs");
		std1.displayInformation();
		
		Student std2=new Student("asha",22,101,"ec");
		std2.displayInformation();
		
		Student.setuniversity("VTU");
		
		Student std3=new Student("manu",26,102,"cs");
		std3.displayInformation();
		
		Student std4=new Student("sahana",20,103,"IS");
		std4.displayInformation();

	}

}
