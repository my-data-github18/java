package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MaxString {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Hello my name is Akash");
		list1.add("I live in Jejuri");
		list1.add("H");
		
	class Max implements Comparator<String> {
		
	@Override
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}
	}
	Max m1 = new Max();
	System.out.println(Collections.max(list1, m1));
	}

}
