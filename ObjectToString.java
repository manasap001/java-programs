package com.xworkz.collections;

public class ObjectToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree ref=new Tree("baniyan","banian",15);
		String str=ref.toString();
		System.out.println(str);//FullyQualifiedClassName@HexaDecimalNum
		//System.out.println(ref);
	}

}
