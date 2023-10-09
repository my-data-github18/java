package com.sunbeaminfo.creditlimit;

import java.util.Scanner;

public class CreditDetails {
	public int accountNumber;
	public int balanceAtBegin;
	public int totalItemCharge;
	public int totalCreditCharges;
	public int allowedCredit;
	int newBalance;
	
	public CreditDetails() {
		int accountNumber = 0;
		int balanceAtBegin = 0;
		int totalItemCharge = 0;
		int totalCreditCharges = 0;
		int allowedCredit = 0;
	
	}
	
	public CreditDetails(int accountNumber, int balanceAtBegin, int totalItemCharge, int totalCreditCharges, int allowedCredit) {
		this.accountNumber = accountNumber ;
		this.balanceAtBegin = balanceAtBegin;
		this.totalItemCharge = totalItemCharge;
		this.totalCreditCharges = totalCreditCharges;
		this.allowedCredit = allowedCredit;
	}
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the account number");
		accountNumber = sc.nextInt();
		System.out.println("ENter the account number");
		balanceAtBegin = sc.nextInt();
		System.out.println("ENter the account number");
		totalCreditCharges = sc.nextInt();
		System.out.println("ENter the account number");
		accountNumber = sc.nextInt();
		System.out.println("ENter the account number");
		accountNumber = sc.nextInt();
		
	}
	
	public void Calculate() {
		this.newBalance = (this.balanceAtBegin + this.totalCreditCharges - this.totalCreditCharges);
		if(this.newBalance > allowedCredit) {
			System.out.println("Credit card limit exceeded");
		}
	}
	
	

}
