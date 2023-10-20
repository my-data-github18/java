package com.sunbeam;


import java.util.Iterator;
import java.util.Scanner;

@FunctionalInterface
interface Check<T> {
	
	boolean compare(T x, T y);
}
public class CountNumber1 {
	
	
	static  <T> int countIf(T[] arr, T key, Check<T> c) {
		int cnt = 0;
		for(T ele: arr) {
			if(c.compare(ele, key))
				cnt++;
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {
		
		Double [] arr = {4.4, 7.7, 9.9, 2.2, 5.5, 6.6};
		System.out.println("Enter key:");
		Double key = new Scanner(System.in).nextDouble();
		int cnt = countIf(arr, key, (e,k)->e.equals(k));
		System.out.println(cnt);
		
	}
	
}
