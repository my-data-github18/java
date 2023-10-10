package com.sunbeaminfo.store;

public class Tester {

	public static void main(String[] args) {
	
		
	
	Invoice i1 = new Invoice("screw", "for need", 2, 20);
	i1.accept();
	double totalBill = i1.totalInvoice();
	System.out.println("total bill is " + totalBill);
	}

}
