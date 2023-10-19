package com.sunbeam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Library {

	public static void main(String[] args) {
		Set<Book>  b = new HashSet<>();
		b.add(new Book("1", 10.00, "Akash", 2));
		b.add(new Book("5", 21.3 , "Sahil" , 1));
		b.add(new Book("3", 32.42, "Shriniwas" , 3));
		b.add(new Book("3", 43.5, "Piyush" , 4));
		b.add(new Book("4", 43.3, "Somesh" , 2));
		b.add(new Book("2", 23.3, "Sam" , 4));
		
		Iterator<Book> itr =  b.iterator();
		while(itr.hasNext()) {
			Book ele = itr.next();
			System.out.println(ele);
		}
		 
		 

}
}
