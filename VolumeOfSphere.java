package com.xworkz.memorymanagement;

public class VolumeOfSphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VolumeOfSphere volume=new VolumeOfSphere();
		double result=volume.volumeOfSphere(3,3);
		System.out.println(+result);
		

	}
	double volumeOfSphere(int radius1,int radius2)
	{
		double volumesphere;
		double pi=findPi();
		System.out.println(+pi);
		volumesphere=4/3*pi*radius1*radius2;
		return volumesphere;
	}
	double findPi()
	{
		double pi=22.00/7.00;
		return pi;
	}
	
		
	}


