package com.sunbeaminfo.store;

import java.util.Scanner;

public class Invoice {
	
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double itemPrice;
	
public Invoice() {
		
		this.partNumber = "";
		this.partDescription = "";
		this.quantity = 0;
		this.itemPrice = 0;
}
	
	public Invoice(String partNumber, String partDescription, int quantity, double itemPrice) {
		
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		if (quantity > 0) 
		this.quantity = quantity;
		if (itemPrice > 0) 
		this.itemPrice = itemPrice;
	}

//	public String getPartNumber() {
//		return partNumber;
//	}
//
//	public void setPartNumber(String partNumber) {
//		this.partNumber = partNumber;
//	}
//
//	public String getPartDescription() {
//		return partDescription;
//	}
//
//	public void setPartDescription(String partDescription) {
//		this.partDescription = partDescription;
//	}
//
//	public int getQuantity() {
//		return quantity;
//	}
//
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
//
//	public double getItemPrice() {
//		return itemPrice;
//	}
//
//	public void setItemPrice(double itemPrice) {
//		this.itemPrice = itemPrice;
//	}
	void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter part number");
		partNumber = sc.next();
		System.out.println("Enter part description");
		partDescription = sc.next();
		System.out.println("Enter part quantity");
		quantity = sc.nextInt();
		System.out.println("Enter item price");
		itemPrice = sc.nextDouble();
	}
	
	public double totalInvoice() {
		return this.quantity * this.itemPrice;
	}
	
	
}
