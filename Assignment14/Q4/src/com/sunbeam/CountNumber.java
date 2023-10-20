package com.sunbeam;

import java.util.Iterator;

@FunctionalInterface
interface Check<T> {
	
	boolean compare(T x, T y);
}
public class CountNumber {
	
	
	static  <T> int countIf(T[] arr, T key, Check<T> c) {
		int cnt = 0;
		for(T ele: arr) {
			if(c.compare(ele, key))
				cnt++;
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {
		
		Integer [] arr = {44, 77, 99, 22, 55, 66};
		Integer key = 50;
		int cnt = countIf(arr, key, (x,y)-> x > y);
		System.out.println("Count = " + cnt); // 4 (because 4 elements in array are greater than given key i.e. 50)
	}
}
