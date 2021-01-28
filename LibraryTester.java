package com.xworkz.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;


public class LibraryTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib1=new Library("cs","os",600.00);
		Library lib2=new Library("ec","network",850.00);
		Library lib3=new Library("cs","java",620.00);
		Library lib4=new Library("IS","software testing",450.00);
		ArrayList<Library> library=new ArrayList<Library>();
		library.add(lib1);
		library.add(lib2);
		library.add(lib3);
		library.add(lib4);
		System.out.println("sort based on book price:");
		SortByPrice sortByPrice =new SortByPrice();
		Collections.sort(library,sortByPrice);
		System.out.println(library); 
		
		System.out.println("sort based on book name:");
		SortByBookName sortByBookName =new SortByBookName();
		Collections.sort(library,sortByBookName);
		System.out.println(library); 
		
		//Traverse using ListIterator:
		ListIterator<Library> libItr=library.listIterator();
		System.out.println("list in forward direction");
		while(libItr.hasNext()) {
			System.out.println("index is"+libItr.nextIndex());
			Library l=libItr.next();
			System.out.println(l);
			if(l.getPrice()==650.00) {
				library.add(new Library("cs","python",500.00));
				//library.set(e);
			}
			
		}
		System.out.println("list in reverse direction");
		while(libItr.hasPrevious()) {
			System.out.println("index is"+libItr.previousIndex());
			Library l=libItr.previous();
			System.out.println(l);
			
		}
		
		
		

		
		
		
				
		
		

	}

}
