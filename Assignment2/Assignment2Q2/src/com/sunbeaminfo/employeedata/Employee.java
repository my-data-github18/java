package com.sunbeaminfo.employeedata;

public class Employee {

	private String firstName;
	private String lastName;
	private double monthlySal;
	
	
	public Employee() {
		this.firstName = "";
		this.lastName = "";
		this.monthlySal = 0;
		
	}


	public Employee(String firstName, String lastName, double monthlySal) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlySal = monthlySal;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public double getMonthlySal() {
		return monthlySal;
	}


	public void setMonthlySal(double monthlySal) {
		if (monthlySal<0) {
			this.monthlySal = 0;
		}
		else {
			this.monthlySal = monthlySal;
		} 
	}
	
	
	
}
