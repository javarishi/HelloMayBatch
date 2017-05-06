package com.learning.day2;

public class Loops {

	public static void main(String[] args) {
		// while
		int counter = 10;
		int sum = 0;
		// make sure condition turns false somewhere while iteration
		while(counter > 0){
			sum = sum + counter;
			System.out.println("Current value of Counter is:: " + counter);
			counter--;
		}
		System.out.println("Current value of Counter is:: " + counter);
		System.out.println("Sum is:: " + sum);
		
		long multiply = 1;
		counter = 10;
		// Whenever you need to execute block of code prior to condition check
		do{
			multiply = multiply * counter;
			System.out.println("Current value of Counter is:: " + counter);
			counter--;
		}while(counter > 0);
		
		System.out.println("Current value of Counter is:: " + counter);
		System.out.println("Multiplication is :: " + multiply);
		
		
		// for loop for fixed number of iterations
		for(int i=0; i < 10; i++){
			System.out.println("Variable value :: " + i);
		}

		// java 5 for loop - advance for loop 
		int variable = 10;
		int[] variables = {10,20,30,40,50}; // This is an Array Definition
		String[] names = {"Rishi", "Rajesh", null, "Karthik"};
		
		int addArray = 0;
		// prior to Java 5
		System.out.println("Print First value " + variables[0]);
		int length = variables.length;
		
		for(int i=0; i < length; i++){
			addArray = addArray + variables[i];
			System.out.println("Java 4 way Each Value :: " + variables[i]);
		}
		
		
		// advance for loop
		for(int eachValue : variables ){
			addArray = addArray + eachValue;
			System.out.println("Each Value :: " + eachValue);
		}
		System.out.println("Sum ::" + addArray);
		
	}
	
	
}
