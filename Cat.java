package com.xworkz.initializationblock;

public class Cat {
	String color;
	String breed;
	int weight;
	{
		System.out.println("initialization block 1");
		color="White";
		breed="Persian";
		
		
	}
	Cat()
	{
		System.out.println("No arg constructor");
	}
	{
		System.out.println("Initialization block");
	}
	Cat(String inColor,String inBreed,int inWeight){
		System.out.println("Parameterized constructor");
		color=inColor;
		breed="inBreed";
	    weight=inWeight;
	}
	{
		System.out.println("Initialization block 3");
		weight=5;
	}
	{
		System.out.println("Initialization block 4");
	}
}
