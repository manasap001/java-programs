package com.xworkz.collections.list;
import java.util.Comparator;

public class SortByPrice implements Comparator<Library> {

	@Override
	public int compare(Library o1, Library o2) {
		// TODO Auto-generated method stub
		return o1.getPrice().compareTo(o2.getPrice());
	}
	

}
