package com.learning;

import java.util.Date;

public class Employee {
	// instance variable
	int empId = 0;
	String firstName = "Name";
	String lastName = "LastName";
	int salary ;
	Date joiningDate;
	String thisMayBeValidVariableName; // Camel Case
	// Class Variables - Value belongs to Class
	static String companyName = "WalMart Inc";
	
	public static void main(String[] args){
		// Variable defined Inside Method - Local Variable / method variables
		String localVariable = "100"; 
		// I have to use this value locally within the method
		Employee mital = new Employee();
		mital.empId = 100;
		mital.firstName = "Mitalkumar";
		mital.lastName = "Mehta";
		mital.salary = 120000;
				
		Employee.companyName = "Best Buy Inc";
		
		System.out.println(mital.empId + " " + mital.firstName + " " + mital.lastName + " " + mital.salary + "   " + Employee.companyName);
		
		Employee anjali = new Employee();
		anjali.empId = 200;
		anjali.firstName = "Anjali";
		anjali.lastName = "Bharad";
		anjali.salary = 130000;
		
		System.out.println(anjali.empId + " " + anjali.firstName + " " + anjali.lastName + " " + anjali.salary + "  " + Employee.companyName);
	}
	
	
	

}
