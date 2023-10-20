package com.sunbeam;

import java.util.Scanner;
@FunctionalInterface
interface Arithmetic {
	double calc(double a, double b);

}

public class Calculater {
	static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: " + result);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int choice = 0;
		do {
			System.out.println("---------Calculator--------------");
			System.out.println("Enter 1 for Addition");
			System.out.println("Enter 2 for Substraction");
			System.out.println("Enter 3 for Multiplication");
			System.out.println("Enter 4 for Division");
			System.out.println("Enter 0 to exit");

			choice = sc.nextInt();
			System.out.println("Enter first number");
			double num1 = sc.nextDouble();
			System.out.println("Enter second number");
			double num2 = sc.nextDouble();

			switch (choice) {
			case 1: {

				calculate(num1, num2, (a, b) -> a + b);
			}
				break;

			case 2:
				calculate(num1, num2, (a, b) -> a - b);
				break;
			case 3:
				calculate(num1, num2, (a, b) -> a * b);
				break;
			case 4:
				calculate(num1, num2, (a, b) -> a / b);
				break;
			case 0:
				System.exit(0);
				break;
			default :
				System.out.println("wrong input");
				break;
			}
		} while (choice != 0);
	System.out.println("good bye");
	}
}
