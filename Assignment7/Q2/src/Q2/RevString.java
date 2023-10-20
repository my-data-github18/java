package Q2;

import java.util.Scanner;

public class RevString {
	public static void main(String[] args) {
		String revStr;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String to Reverse: ");
		revStr = sc.next();
		StringBuilder sb = new StringBuilder(revStr);
		sb.reverse();
		System.out.println("The reversed string is: " + sb);
	}


}