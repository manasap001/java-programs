package com.xworkz.abstraction;

public class ElectricCar extends Car {
	@Override
	void indicator()
	{
		System.out.println("indicator shows an change of direction");
	}

	@Override
	void horn() {
		System.out.println("horn to warn");
		
	}

}
