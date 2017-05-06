package com.learning.day2;

public class BreakTest {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++){
			if(i==5){
				System.out.println("Going to Execute Break");
				break;
			}
			System.out.println(i);
		}
		System.out.println("After Loop Statement");
		
		

		for(int i=0; i<10; i++){
			if(i%2 == 0){
				System.out.println("No Business Logic Execution for this value");
				continue;
			}
			System.out.println(i);
		}
		
	}

	
	
}
