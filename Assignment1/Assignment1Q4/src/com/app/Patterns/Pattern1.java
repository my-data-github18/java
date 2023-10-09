package com.app.Patterns;

public class Pattern1 {

	public static void main(String[] args) {
		
		int n = 5;
		int c = 0;
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=i+c; k++) {
				System.out.print("*");
				}
			c++;
			
			System.out.println();
		}
		
		
		
	}
	

}
