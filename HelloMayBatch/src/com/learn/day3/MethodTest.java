package com.learn.day3;

import com.learning.Employee;

public class MethodTest {

	
	public String getName(int rollNo, String standarad){
		// Here you will write method logic
		String  name = null;
		if(rollNo == 1 && standarad.equals("First")){
			name = "David";
		}
		
		return name;
	}
	
	public String getName(int studentId){
		// Here you will write method logic
		String  name = null;
		if(studentId == 1){
			name = "David";
		}
		
		return name;
	}
	
	public Employee getEmployee(int empId){
		// to fetch from DB
		Employee emp = new Employee();
		emp.setFirstName("RISHI");
		
		return emp;
	}
}
