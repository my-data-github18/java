package com.app.date;
import java.util.Scanner;

public class Date {
   int day;
   int month;
   int year;

public Date() {
	this(0,0,0);
	
}
public Date(int day, int month, int year) {
	super();
	this.day = day;
	this.month = month;
	this.year = year;
}


public void accept() {
	 Scanner sc =new Scanner(System.in);
	
	System.out.println("enter date :");
	day=sc.nextInt();
	System.out.println("enter date :");
	month=sc.nextInt();
	System.out.println("enter date :");
    year=sc.nextInt();
}

public void display() {
	System.out.println("Date  :"+this.day+"/"+this.month+"/"+this.year);
	
}
   
   
}