package com.sunbeam;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class Library{

	public static void main(String[] args) {
		TreeSet<Book> b = new TreeSet<>();
		b.add(new Book("1", 10.00, "Akash", 2));
		b.add(new Book("2", 21.3 , "Sahil" , 1));
		b.add(new Book("3", 32.42, "Shriniwas" , 3));
		b.add(new Book("4", 43.5, "Piyush" , 4));
		b.add(new Book("3", 43.3, "Somesh" , 2));
		b.add(new Book("6", 23.3, "Sam" , 4));
		Iterator<Book> itr1 = b.descendingIterator();
		Iterator<Book> itr =  b.iterator();
		while(itr1.hasNext()) {
			Book ele = itr1.next();
			System.out.println(ele);
		}
		System.out.println("-------------------------------------------");
		
		
		while(itr.hasNext()) {
			Book ele = itr.next();
			System.out.println(ele);
		}
		 
	}

}