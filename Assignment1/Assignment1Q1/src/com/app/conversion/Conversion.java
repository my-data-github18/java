package com.app.conversion;

import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		System.out.println("given number is :" + num);
		System.out.println("binary equivalent is : " + Integer.toBinaryString(num));
		System.out.println("octal equivalent is : " + Integer.toOctalString(num));
		System.out.println("Hexadecimal equivalent is : " + Integer.toHexString(num));
		
	}

}
