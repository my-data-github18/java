package com.sunbeam;

public class Tester {

	public static void main(String[] args) {
		Emp[] arr = new Emp[3];
		arr[0] = new Clerk(21);
		arr[1] = new Manager(100,34);
		arr[2] = new Labour(12,21);
		
		double TotalInce = Emp.calcTotalIncome(arr);
		System.out.println(TotalInce);
	}

}
