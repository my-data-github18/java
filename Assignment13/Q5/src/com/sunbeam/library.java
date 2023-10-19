package com.sunbeam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class library {

	public static void main(String[] args) {
		Map<String,Book> map = new HashMap<>();
		
		Book b = new Book();
		Scanner sc = new Scanner(System.in);
		
		map.put(b.getIsbn(), b);
		String isbn = sc.Next();
		Book f = map.get(isbn)
		

	}

}
