package com.sunbeaminfo.employeedata;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		System.out.println("Enter firts name for e1: ");
		e1.setFirstName(sc.next());
		System.out.println("Enter last name for e1: ");
		e1.setLastName(sc.next());
		System.out.println("Enter monthly sal for e1: ");
		e1.setMonthlySal(sc.nextDouble());
		
		System.out.println("Enter firts name for e2: ");
		e2.setFirstName(sc.next());
		System.out.println("Enter last name for e2: ");
		e2.setLastName(sc.next());
		System.out.println("Enter monthly sal for e2: ");
		e2.setMonthlySal(sc.nextDouble());
		
		System.out.println("yearly sal of for "+ e1.getFirstName() + " " + e1.getLastName() + " is " + (e1.getMonthlySal() * 12));
		
		System.out.println("yearly sal after 10% inceriment is " + ((e1.getMonthlySal() * 12) +((e1.getMonthlySal() * 12)*0.12)));
		
		System.out.println("yearly sal of for "+ e2.getFirstName() + " " + e2.getLastName() + " is " + (e2.getMonthlySal() * 12));
		
		System.out.println("yearly sal after 10% inceriment is " + ((e2.getMonthlySal() * 12) +((e2.getMonthlySal() * 12)*0.12)));
	}

}